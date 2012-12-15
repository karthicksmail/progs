class CorruptedLine
  attr_accessor :line, :line_no
  
  def initialize(line, line_no)
    @line = line
    @line_no = line_no
  end
  
  def to_s
    "#{line_no}\t|#{line}"
  end
end

def validate_file(filename)
  corrupted_lines = []
  
  puts "Validating file: #{filename}"
  line_no = 0
  File.open(filename, 'r') do |file|
    file.each_line do |line|
      line_no = line_no + 1
      #puts "string: #{line}"
      is_corrupted = true
      elements = line.split('=')
      
      if elements.length == 2
        key = elements[0].strip
        value = elements[1].strip
        
        re = /^\-?[0-9]+(,[0-9]{3})*(\.[0-9]+)?$/
        if value =~ re
          is_corrupted = false
          #puts "key:#{key} value:#{value}"
        end
        
      end
      
      if is_corrupted
        #puts "Corrupted String"
        corrupted_lines << CorruptedLine.new(line, line_no)
      end
    end
  end
  
  puts "Done.\n#{corrupted_lines.length} corrupted lines found:"
  puts "Line No\t|Content"
  puts corrupted_lines
end

if $0 == __FILE__
  filename = 'sdc.txt'
  
  if ARGV.length >= 1
    filename = ARGV[0]
  end
  validate_file(filename)
end
