print "What is your name? "
name = gets.chomp
print "What is your age? "
age = gets.chomp

puts name + " was born in " + (2010 - age.to_i).to_s
