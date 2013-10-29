#!/usr/bin/env ruby

require './Node.rb'
require 'pp'

class LinkedList
	attr_accessor :head, :last_elem

	def initialize
		@head = nil
		@last_elem = nil
	end
	
	# Append element at the end
	# Algorithm:
	# Initialize node with data.
	# Set element next_node of new node to nil.
	# if @head is not initialized, then initialize it to node.
	# if @last_elem is not equal to nil, then set the next_node of last_elem to node. This way we append at the end.
	# repoint @last_elem to node. Thus ensuring that last_elem is still pointing to the last element in the list.
	def append_elem(data)
		node = Node.new(data)
		node.next_node = nil
		@head = node if @head == nil
		@last_elem.next_node = node if @last_elem != nil
		@last_elem = node
	end

#	def insert_elem(data)
#		node = Node.new(data)
#		if @head == nil then
#			@head = node
#			node.next_node = @head
#		else
#			node.next_node = @head
#		end
#	end

	# Delete first element with data specified as argument
	# Algorithm:
	# Iterate down the List, starting from the element that head is pointing to.
	# Keep moving another pointer called prev starting at @head
	# If any of the nodes match, then point prev.next_node to curr.next_node
	def delete_elem(data)
		curr = @head
		prev = nil
		while curr != nil do
			prev = curr
			if curr.data == data then
				prev.next_node = curr.next_node
				return true
			end
			curr = curr.next_node
		end
		return false
	end

	def show
		curr = @head
		while curr != nil do
			curr.show
			curr = curr.next_node
		end
		puts
	end
end

