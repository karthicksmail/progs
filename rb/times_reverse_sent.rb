print "Enter a sentence: "
sent = gets.chomp

print "Enter the number of times to print: "
num_times = gets.chomp

num_times.to_i.times do
	puts sent.reverse
end
