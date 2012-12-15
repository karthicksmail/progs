def s(x)
  input = x
  if x < 0
    x = -x
  end
  answer = 0
  while x > 0
    mod = x % 10
    answer = answer + mod * mod
    x = x / 10
  end
  #puts "S(#{input})=#{answer}" 
  answer
end

def find(input)
  results = []
  r = input
  while !results.include?(r)
    results << r
    r = s(r)
  end
  puts r
  #puts "Answer is #{r}"
end

if $0 == __FILE__
  input = 39
  
  if ARGV.length >= 1
    input = ARGV[0].to_i
  end
  
  find(input)
end
