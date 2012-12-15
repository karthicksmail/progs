names = [["Sam", "Khor"],["Steve", "Chan"],["Ider", "Cheng"],["Sam", "Kwong"]]

puts "Names before sort:"
names.each do |n1, n2|
	puts n1 + " " + n2
end

names.sort do |n1, n2|
	fn_comp = (n1[0] <=> n2[0])
	if fn_comp == 0 then
		n1[1] <=> n2[1]
	end
end

puts "Names after sort:"
names.each do |n1, n2|
	puts n1 + " " + n2
end
