require "watir"

server_name = "stage2qa310"
button_mill = "http://xilabs.paypal.com/~jeharrell/ButtonMill/?server=" + server_name
business_account = "ksundarajan-Stage2QA310-DE-20090108093153612016184@paypal.com"

ie = Watir::IE.new
ie.goto button_mill

ie.text_field(:name, "business").set business_account
ie.button(:value, "Checkout").click

puts " Expected Result:"
puts "  A Paypal account overview page with 'Logging in' should be displayed."

ie.link(:name, "new_user_button.x").click

