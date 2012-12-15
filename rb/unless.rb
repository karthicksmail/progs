temperature = 76

unless temperature > 65 || temperature < 85
	puts "Picnic time!"
else
	puts "Sorry! No picnic today."
end

puts "Too hot!" if temperature > 85
puts "Too Cold!" unless temperature > 65
