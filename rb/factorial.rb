fact = 1

print "Enter a number: "
num = gets.chomp.to_i
count = num

count.times do
	fact *= num
	num = num - 1
end

puts "The factorial of " + count.to_s + " is " + fact.to_s

