# Please, when you update this file, update also http://wiki.openqa.org/display/WTR/Example+Test+Case

#-------------------------------------------------------------#
# Demo : for the Watir controller.
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
$STAGE = "https://www.stage2qa019.paypal.com"

$buyer = {
'1' => 'svadyar-us-buyer@paypal.com',
'2' => 'svadyar-ar-buyer@paypal.com',
'3' => 'svadyar-br-buyer@paypal.com',
'4' => 'svadyar-my-buyer@paypal.com',
'5' => 'svadyar-tw-buyer@paypal.com'
}

$seller = {
'1' => 'svadyar-us-seller@paypal.com',
'2' => 'svadyar-ar-seller@paypal.com',
'3' => 'svadyar-br-seller@paypal.com',
'4' => 'svadyar-my-seller@paypal.com',
'5' => 'svadyar-tw-seller@paypal.com'
}

$currecy_code = {
'ARS' => 'ARS - Argentine Pesos'  ,  
'AUD' => 'AUD - Australian Dollars' ,
'BRL' => 'BRL - Brazilian Real' ,    
'GBP' => 'GBP - British Pounds'  ,   
'CAD' => 'CAD - Canadian Dollars'  , 
'CZK' => 'CZK - Czech Koruny'  ,    
'DKK' => 'DKK - Danish Kroner'    ,  
'EUR' => 'EUR - Euros'          ,    
'HKD' => 'HKD - Hong Kong Dollars'  ,
'HUF' => 'HUF - Hungarian Forints'  ,
'ILS' => 'ILS - Israeli New Shekels',
'JPY' => 'JPY - Japanese Yen'      , 
'MYR' => 'MYR - Malaysian Ringgits' ,
'MXN' => 'MXN - Mexican Pesos'   ,  
'NZD' => 'NZD - New Zealand Dollars',
'NOK' => 'NOK - Norwegian Kroner'   ,
'PHP' => 'PHP - Philippine Pesos'   ,
'PLN' => 'PLN - Polish Zlotych'   ,  
'SGD' => 'SGD - Singapore Dollars'  ,
'SEK' => 'SEK - Swedish Kronor'    , 
'CHF' => 'CHF - Swiss Francs'  ,     
'TWD' => 'TWD - Taiwan New Dollars' ,
'THB' => 'THB - Thai Baht'
}

$rcurrecy_code = {
'ARS' => 'Argentine Pesos'  ,  
'AUD' => 'Australian Dollars' ,
'BRL' => 'Brazilian Real' ,    
'GBP' => 'British Pounds'  ,   
'CAD' => 'Canadian Dollars'  , 
'CZK' => 'Czech Koruny'  ,    
'DKK' => 'Danish Kroner'    ,  
'EUR' => 'Euros'          ,    
'HKD' => 'Hong Kong Dollars'  ,
'HUF' => 'Hungarian Forints'  ,
'ILS' => 'Israeli New Shekels',
'JPY' => 'Japanese Yen'      , 
'MYR' => 'Malaysian Ringgits' ,
'MXN' => 'Mexican Pesos'   ,  
'NZD' => 'New Zealand Dollars',
'NOK' => 'Norwegian Kroner'   ,
'PHP' => 'Philippine Pesos'   ,
'PLN' => 'Polish Zlotych'   ,  
'SGD' => 'Singapore Dollars'  ,
'SEK' => 'Swedish Kronor'    , 
'CHF' => 'Swiss Francs'  ,     
'TWD' => 'Taiwan New Dollars' ,
'THB' => 'Thai Baht'
}

def Login( arg1 = "", arg2 = "New Session")  

  login_name = arg1
  if arg2 == "New Session"
    puts " Go to the Paypal site: " + $STAGE
    $ie.goto $STAGE
  else
    LogOut()
  end
 
  #$ie.link(:text, "Personal").click
 
  
  if login_name == ""
    puts "Login As \n\n 1.Seller \n\n 2.Buyer \n\n 3.Others \n\n Please enter the option :"
    option = gets
    case option.to_i
      when 1 then 
        puts "Login as \n\n 1. US Seller\n\n 2. AR Seller \n\n 3. BR Seller \n\n 4. MY Seller\n\n Please enter the option :"
        country = gets
        country = country.to_i.to_s 
        login_name = $seller[country]
      when 2 then
        puts "Login as \n\n 1. US Buyer\n\n 2. AR Buyer \n\n 3. BR Buyer \n\n 4. MY Buyer\n\n Please enter the option :"
        country = gets
        country = country.to_i.to_s 
        login_name = $buyer[country]
      else
        puts "Enter the login name :"
        login_name = gets
      end    
    end

  puts "Logging in as " + login_name + "..."
  $ie.text_field(:name, "login_email").set login_name 
  $ie.text_field(:name, "login_password").set "11111111"
  $ie.button(:name, "submit.x").click # "btnG" is the name of the Search button
  
  if $ie.text.include? "If this page appears for more than 5 seconds"  
    puts "Successfully Logged in to - PayPal'. "
  else
    puts "Login Failed "
  end
  $ie.wait()
end  

def SendMoney(arg1 = "",arg2 = "", arg3 = "", arg4 = "")
  login_name = arg1
  amount = arg2
  currencycode = arg3
  $ie.link(:text, "Send Money").click
  if login_name == ""
    puts "Send Money To \n\n 1. US Buyer\n\n 2. AR Buyer \n\n 3. BR Buyer \n\n 4. MY Buyer 0. Other \n\n Please enter the option :"
    country = gets
    case country.to_i
      when 1..4 then
        login_name = $buyer[country.to_i.to_s]
      else
        puts "Enter the login name :"
        login_name = gets
      end
  end
  
  #TO
   $ie.text_field(:name, "email").set login_name 
  
  #Amount
  
  if amount == ""
    amount = "20"
  end
  $ie.text_field(:name, "amount").set amount
  
  #Currency Code
  if currencycode == ""
    puts "Please enter the currency code"
    currencycode = gets
  end
  $ie.select_list(:name, "amount_ccode").set $currecy_code[currencycode.strip]
    
  #Send Money
  $ie.radio(:id,"PurchaseGoods").set 
  $ie.button(:name,"submit.x").click
  
  if $ie.text.include? "Review your payment and send"
    if (arg4 == "break")
      puts "Check Funding Source "
      gets 
    end
    #Send Money RYP
    $ie.button(:name,"submit-button-00").click
    if $ie.text.include? "The money has been sent!"
        puts "Sending Money To " + login_name + " in " +  currencycode + " - SUCCESS."
    else
        puts "Sending Money To " + login_name + " in " +  currencycode + " - FAILED."
    end  
  else
    puts "Sending Money To " + login_name + " in " +  currencycode + " - FAILED."
  end
  
  #gets 
end

def RequestMoney(arg1 = "", arg2 = "", arg3 = "", arg4 = "")
  $ie.link(:text, "Request Money").click
  login_name = arg1
  amount = arg2
  currencycode = arg3
  recepient = arg4
  
  if login_name == ""
    puts "Request Money To \n\n 1. US Buyer\n\n 2. AR Buyer \n\n 3. BR Buyer \n\n 4. MY Buyer 0. Other \n\n Please enter the option :"
    country = gets
    case country.to_i
      when 1..4 then
        login_name = $buyer[country.to_i.to_s]
      else
        puts "Enter the login name :"
        login_name = gets
      end
  end
    
  #To
  $ie.text_field(:name, "uome_recipients").set login_name
  
  #Request Amount 
  if amount == ""
    amount = "20"
  end
  $ie.text_field(:name, "uome_amount").set amount 
  
  #Currency Code
  if currencycode == ""
    puts "Please enter the currency code"
    currencycode = gets
  end 
  $ie.select_list(:name, "uome_amount_ccode").set $rcurrecy_code[currencycode.strip]
  
  #Request Money
  $ie.radio(:id,"goods").set 
  $ie.button(:name,"submit").click
  
  if $ie.text.include? "Review your request and send"
    $ie.button(:name,"submit.x").click
    if $ie.text.include? "Your money request has been sent!"
        puts "Request Money To " + login_name + " in " +  currencycode + " - SUCCESS."
    else
      puts "Request Money To " + login_name + " in " +  currencycode + " - FAILED."
    end  
  else
    puts "Request Money To " + login_name + " in " +  currencycode + " - FAILED."
  end
  
  if recepient != ""
    LogIn(login_name)
    PayRequest()
    Login(recepient)
  end
  #gets
end

def PayRequest()
  $ie.link(:text, "Account Overview").click
  ie.button(:src, /act_pay/).click
  if $ie.text.include? "Review Your Payment"
    $ie.button(:name,"submit.x").click
    if $ie.text.include? "You paid a money request!"
        puts "Payment Success."
    else
      puts "Payment FAILED."
    end  
  else
    puts "Payment FAILED."
  end  
end

def LogOut()
  $ie.link(:text, "Log Out").click
end

#######################################################################################
##                                                              Main Script                                                                                                                                 ##
#######################################################################################



# open the IE browser
system("cls")
$ie = Watir::IE.new

# print some comments
Login($buyer['1'],"New Session")

#Send Money
system("cls")
puts "US buyer Sending ARS	to BR Seller"
SendMoney($seller['3'], "50" , "ARS")

system("cls")
puts "US buyer Sending MYR	to MY Seller"
SendMoney($seller['4'], "50" , "MYR")


Login($buyer['4'])
system("cls")
puts "MY buyer Sending MYR	to MY Seller"
SendMoney($seller['4'], "50" , "MYR", "break")

Login($buyer['2'])
system("cls")
puts "AR buyer Sending MYR	to US Seller"
SendMoney($seller['1'], "50" , "MYR", "break")

Login($buyer['3'])
system("cls")
puts "BR buyer Sending ARS	to AR Seller"
SendMoney($seller['2'], "50" , "ARS")

Login($buyer['5'])
system("cls")
puts "TW buyer Sending TWD	to US Seller"
SendMoney($seller['1'], "50" , "TWD")

puts "End of test."





