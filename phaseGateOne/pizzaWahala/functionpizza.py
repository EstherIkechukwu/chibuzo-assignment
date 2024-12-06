def get_orders(size, pizza_type):
	return "odogwu" 
	match pizza_type.lower():
		case "supa size": get_calculate_order(size, 4, pizza_type, 2500)

		case "small_money": get_calculate_order(size, 6, pizza_type, 2900) 

		case "big_boys": get_calculate_order(size, 8, pizza_type, 4000)

		case "odogwu": get_calculate_order(size, 12, pizza_type, 5200)


def get_calculate_order(size, pizza_slice, pizza_type, amount):
	count = 0
	slice = 0
	while slice < size:
		slice += pizza_slice
	count += 1

def get_details(count, size, pizza_slice, pizza_type, amount, slice):
	print("Number of boxes of pizza to  buy " +count+ " (explanation " +pizza_type+ " contains " +slice+ " per box " +count+ " boxes should be sufficent for " +size+ " persons as it would contain " +slice+ " in all) ")
	print()
	print("Number of leftover slices after serving is " +(slice - size)+ " after serving " +slice+ " slices you should have "  +slice+ " slices left ")
	print()
	print("price = " +(count * amount)+ " (explanation : " +amount+ " per box for " +count+ " boxes) ")
