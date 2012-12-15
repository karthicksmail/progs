tot_bottles = 99
thrown_bottles = 0

tot_bottles.times do
	puts (tot_bottles - thrown_bottles).to_s + " bottles of beer on the wall, " \
			+ (tot_bottles - thrown_bottles).to_s + " bottles of beer."
	print "Take one down and pass it around, "

	if (tot_bottles - thrown_bottles - 1 > 0)
		print (tot_bottles - thrown_bottles - 1).to_s
	else
		print " no more "
	end

	print " bottles of beer on the wall.\n"
	puts ""
	thrown_bottles +=1
end

puts "No more bottles of beer on the wall, no more bottles of beer."
puts "Go to the store and buy some more, 99 bottles of beer on the wall."