#!/usr/bin/env ruby

class Node
	attr_accessor :data, :next_node

	def initialize(data)
		@data = data
		@next_node = nil
	end
end

n1 = Node.new(10)
n2 = Node.new(20)
n1.next_node = n2

puts n1.data
puts n2.data
puts n1.next_node.data

