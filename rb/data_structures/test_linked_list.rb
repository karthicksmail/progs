#!/usr/bin/env ruby

require './linked_list.rb'
require 'test/unit'
require 'pp'

class TestLinkedList < Test::Unit::TestCase
	def test_append_elem
		link = LinkedList.new
		link.append_elem(Person.new("Karthick", 33))
		link.append_elem(Person.new("Soumiya", 29))
		link.append_elem(Person.new("Darshan", 6)) 

		assert(link.head().data().name(), "Karthick")
		assert(link.head().data().age(), 33.to_s)

		assert(link.head().next_node().data().name(), "Soumiya")
		assert(link.head().next_node().data().age(), 29.to_s)

		assert(link.head().next_node().next_node().data().name(), "Darshan")
		assert(link.head().next_node().next_node().data().age(), 6.to_s)
	end

#	def test_insert_elem
#		link = LinkedList.new
#		link.insert_elem(Person.new("Darshan", 6)) 
#		link.insert_elem(Person.new("Soumiya", 29))
#		link.insert_elem(Person.new("Karthick", 33))
#
#		assert(link.head().data().name(), "Karthick")
#		assert(link.head().data().age(), 33.to_s)
#
#		assert(link.head().next_node().data().name(), "Soumiya")
#		assert(link.head().next_node().data().age(), 29.to_s)
#
#		assert(link.head().next_node().next_node().data().name(), "Darshan")
#		assert(link.head().next_node().next_node().data().age(), 6.to_s)
#	end

	def test_delete_elem
		link = LinkedList.new
		link.append_elem(Person.new("ABC", 3))
		link.append_elem(Person.new("DEF", 9))
		link.append_elem(Person.new("ABC", 5)) 
		link.append_elem(Person.new("GHI", 6)) 

		ret_val = link.delete_elem(Person.new("ABC", 3))
		pp link
#		assert(ret_val, true)
		assert(link.head().next_node().next_node().data().name(), "GHI")
		assert(link.head().next_node().next_node().data().age(), 6.to_s)

		ret_val = link.delete_elem(Person.new("ABC", 5))
#		assert(ret_val, true)
		assert(link.head().next_node().next_node().data().name(), "GHI")
		assert(link.head().next_node().next_node().data().age(), 6.to_s)
	end
end

