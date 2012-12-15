# the Watir controller
require "watir"

# set a variable
test_site = "https://m2inet.icicibank.co.in/m2iNet/exchangeRate.misc"

# open the IE browser
ie = Watir::IE.new
ie.goto test_site
ie.select_list(:name, "currency").set("Singapore Dollar")
ie.text_field(:name, "amount").set "1"
# ie.button(:name, "submit1").click
ie.image(:name, "submit1").click



