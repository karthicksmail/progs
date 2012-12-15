print "Enter the number: " 
given_num = gets.chomp.to_f
num = 2

while num <= given_num do
	num *= 2
end

num/=2

puts "The highest power of 2 less than " + given_num.to_s + " is " + num.to_s
