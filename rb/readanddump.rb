  require 'rubygems'
  require 'roo'
  
  HOURLY_RATE = 123.45
  
  oo = Excelx.new("http://iweb3.corp.ebay.com/teamworks/sites/33365/Shared%20Documents/Calendar%20Creation%20Tools/Milestone%20Matrix%202010.xlsx")
  oo.default_sheet = oo.sheets.first4.upto(12) do |line|
	date       = oo.cell(line,'A')
	start_time = oo.cell(line,'B')
	end_time   = oo.cell(line,'C')
	pause      = oo.cell(line,'D')
	sum        = (end_time - start_time) - pause
	comment    = oo.cell(line,'F')
	amount     = sum * HOURLY_RATE
	if date
		puts "#{date}\t#{sum}\t#{amount}\t#{comment}"
	end
 end
