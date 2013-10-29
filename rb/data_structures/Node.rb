#!/usr/bin/env ruby

require './Person.rb'

class Node
	attr_accessor :data, :next_node

	def initialize(data, next_node=nil)
		@data = data
		@next_node = next_node
	end

	def show
		@data.show
	end

end

