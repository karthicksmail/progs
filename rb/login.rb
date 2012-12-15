# Please, when you update this file, update also http://wiki.openqa.org/display/WTR/Example+Test+Case

#-------------------------------------------------------------#
# Demo test for the Watir controller.
#
# Purpose: to demonstrate the following Watir functionality:
#   * entering text into a text field,
#   * clicking a button,
#   * checking to see if a page contains text.
# Test will search Google for the "pickaxe" Ruby book.
#-------------------------------------------------------------#

# the Watir controller
require "watir"

# set a variable
test_site = "https://www.stage2sc5351.qa.paypal.com"

# open the IE browser
ie = Watir::IE.new

# print some comments
puts "Beginning of test: Login."

puts " Step 1: go to the test site: " + test_site
ie.goto test_site

puts " Step 2: enter 'rgeetha-us-biz@paypal.com' in the Email Address field."
ie.text_field(:name, "login_email").set "rgeetha-us-biz@paypal.com" 

puts " Step 3: enter password field."
ie.text_field(:name, "login_password").set "11111111"

puts " Step 4: click the 'Log In' button."
ie.button(:name, "submit.x").click # "btnG" is the name of the Search button

puts " Expected Result:"
puts "  A Google page with results should be shown. 'My Account - PayPal' should be high on the list."

puts " Actual Result:"
if ie.text.include? "My Account - PayPal"  
  puts "  Test Passed. Found the test string: 'My Account - PayPal'. Actual Results match Expected Results."
else
  puts "  Test Failed! Could not find: 'My Account - PayPal'." 
end

puts "End of test: Paypal Login."
