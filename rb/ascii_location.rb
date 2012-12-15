print "Enter a character: "
symbol = gets.chomp

if (symbol < "0")
	puts "Before 0"
elsif (symbol > "9" && symbol < "A")
	puts "Between 9 and A"
elsif (symbol > "Z" && symbol < "a")
	puts "Between Z and a"
elsif (symbol > "z")
	puts "After z"
else
	puts "Unknown error"
end
