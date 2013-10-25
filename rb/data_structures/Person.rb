#!/usr/bin/env ruby
 
class Person
	attr_accessor :name, :age

	def initialize(name = nil, age = nil)
		@name = name
		@age = age
	end
end

#n1 = Person.new
#n2 = Person.new("hello", 5)
#p n1
#p n2
