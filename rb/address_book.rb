# Melissa's address
melissa_addr = {
	"street" => "23 St George St.",  
	"city"   => "Silver Spring",
	"state"  => "MD",
	"zip"    => "20465"
}

# Sandy's address
sandy_addr = {
	"street" => "324 Campus Dr.",
	"city"   => "College Park",
	"state"  => "MD",
	"zip" 	 => "23659"
}

# Joe's address
joe_addr = {
	"street" => "43 Main St. W",
	"city"   => "Washington",
	"state"  => "DC",
	"zip"    => "29847"
}

# Joe
joe = {
	"first name" => "Joe",
	"last name"  => "Smith",
	"phone"	     => "(301) 345-9837",
	"address"    => joe_addr,
	"email_addr" => "joe_email@email.com"
}

# Melissa
melissa = {
	"first name" => "Melissa",
	"last name"  => "Adams",
	"phone"      => "(301) 364-8924",  
	"address"    => melissa_addr,
	"email_addr" => "melissa_email@email.com"
}

# Sandy
sandy = {
	"first name" => "Sandy",
	"last name"  => "Koh",
	"phone"      => "(301) 354-2975",
	"address"    => sandy_addr,
	"email_addr" => "sandy_email@email.com"
}

addressbook = [ melissa, joe, sandy ] 

puts melissa
puts joe
puts sandy
