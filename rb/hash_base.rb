friend = {
	"first name" => "Jeffrey",
	"last name"  => "Biggs",
	"address"    => "34 Airport Rd",  
	"city"       => "Toronto",
	"province"   => "Ontario"
}

friend.each do |key, value| 
	puts key + " => " + value 
end
