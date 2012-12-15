range = 1..5
puts "Range 1:"
puts range.to_a

range = 1...5
puts "Range 2:"
puts range.to_a

range = "a".."e"
puts "Range 3:"
puts range.to_a
puts range.min
puts range.max

range = "alpha".."alphe"
puts "Range 4:"
puts range.to_a

range = "aaaaa".."ccccc"
puts "Range 5:"
puts range.to_a
