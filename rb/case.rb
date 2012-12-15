print "Enter Command: "
command = gets.chomp
#command = $_
#command = "Stop"

case command
when "Go"
	puts "Going"
when "Wait"
	puts "Waiting"
when "Turn"
	puts "Turning"
when "Stop"
	puts "Stopping"
else
	puts "I can't understand it"
end
