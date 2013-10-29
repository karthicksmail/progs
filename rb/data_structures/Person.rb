#!/usr/bin/env ruby
 
class Person
	attr_accessor :name, :age

	def initialize(name = nil, age = nil)
		@name = name
		@age = age
	end

	def show
		print @name + " " + @age.to_s + "\n\t->"
	end

	def ==(other_object)
		(self.name == other_object.name) && (self.age == other_object.age)
	end
end

#n1 = Person.new
#n2 = Person.new("hello", 5)
#p n1
#p n2
