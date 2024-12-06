name = "";
recent_menstrual_date;
last_menstrual_month;
last_menstrual_year;

while get_correct_Date(recent_menstrual_date, last_menstrual_month, last_menstrual_year): 
	return "What is your name?"

	recent_menstrual_date = input("Enter the first date of your last menstrual cycle: ")
	last_menstrual_month = input("Enter the month of your last menstrual cycle: ")
	last_menstrual_year = input("Enter the year of your last menstrual cycle: ")

	if !get_correct_Date(recent_menstrual_date, last_menstrual_month, last_menstrual_year):
		return "Invalid date, Kindly enter the correct date"
		
	
	print(f"Hello {name}, Welcome to MyFlowApp, Here is the summary of your Menstrual cycle:  ")
	print("Your Period flow dates ( 5 Days)")
	current_date = recent_menstrual_date
	current_month = last_menstrual_month
	current_year = last_menstrual_year

	for count in range(0, 6):
		print(f"Day %d: %02d-%02d-%d\n", (number + 1), current_date, current_month, current_year)

		next_date = addToDays(current_date, current_month, current_year, 1)
		current_date = next_date[0]
		current_month = next_date[1]
		current_year = next_date[2]

	
	ovulation_start = add_to_days(current_date, current_month, current_year, 12)
	ovulation_end = add_to_days(current_date, current_month, current_year, 16)
	
	print("Ovulation period")
	print(f"Start: %02d-%02d-%d\n", {ovulation_start[0]}, {ovulation_start[1]}, {ovulation_start[2]})
	print(f"End: %02d-%02d-%d\n", {ovulation_end[0]}, {ovulation_end[1]}, {ovulation_end[2]})

	next_period = add_to_days(current_date, current_month, current_year, 28 + (int)(Math.random() * 3))
	
	print("Your Next period will be on ...")
	print(f"Perdicted Date: %02d-%02d-%d\n", {next_period[0]}, {next_period[1]}, {next_period[2]})
	

	def get_correct_Date(recent_menstrual_date, last_menstrual_month, last_menstrual_year):
		if recent_menstrual_date < 1 or recent_menstrual_date > get_days_in_a_month(last_menstrual_year, recent_menstrual_date): return false;
		if last_menstrual_month < 1 or last_menstrual_month > 12: return false
		if last_menstrual_year < 1900 or last_menstrual_year > 2100: return false
	return true
	

	def get_days_in_a_month(int lastMenstrualYear, recent_menstrual_date):
		match recent_menstrual_date:
			case 2: 
				return get_leap_year(last_menstrual_year) ? 29 : 28
			case 9: case 4: case 6: case 11:
				return 30
			case _:
				return 31


	def get_leap_year(last_menstrual_year):
		return last_menstrual_year % 4 == 0 && last_menstrual_year % 100 != 0


	def add_to_days(recent_menstrual_date, last_menstrual_month, last_menstrual_year, days_to_add):
		total_days_in_a_month = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 ]
		if get_leap_year(last_menstrual_year):
		total_days_in_a_month[1] = 29
		
		for index in days_to_add:
			recent_menstrual_date += 1
			if recent_menstrual_date > total_days_in_a_month (last_menstrual_month - 1): 
				recent_menstrual_date = 1
				last_menstrual_month += 1
			
				iflast_menstrual_month > 12: last_menstrual_year += 1
					if printLeapYear(last_menstrual_year):
						total_days_in_a_month[1] = 29
				
		return [recent_menstrual_date, last_menstrual_month, last_menstrual_year] 
	