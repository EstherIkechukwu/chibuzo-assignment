def get_print_phone_book_menu():
	print("""
PhoneBook Menu:
1. Add contact.
2. Remove contact.
3. Find contact by phone number.
4. Find contact by first name.
5. Find contact by last name.
6. Edit contact.
	""")

	menu = int(input(">"))
	match menu:	
		case 1: add_contact()
		case 2: remove_contact()
		case 3: find_contact_by_phone_number()
		case 4: find_contact_by_first_name()
		case 5: find_contact_by_last_name()
		case 6: edit_contact()


def add_contact():
	first_name = input("Enter first name: ")
	first_names.append(first_name)

	last_name = input("Enter last name: ")
	last_names.append(last_name)

	phone_number = input("Enter phone number: ")	
	phone_numbers.append(phone_number)

	email = input("Enter your email address: ")
	mails.append(email)
	print("Contact saved!")
	get_print_phone_book_menu()


def remove_contact():
	name = input("Enter the name you want to remove: ")
	if name in first_names:
		index = first_names.index(name)

		first_names.pop(index)
		last_names.pop(index)
		phone_numbers.pop(index)
		mails.pop(index)
		print("contact deleted.....")
		get_print_phone_book_menu()

	else:
		print("contact does not exist")
		remove_contact()


def find_contact_by_phone_number():
	number = input("Enter the number you want to find: ")
	if number in phone_numbers:
		index = phone_numbers.index(number)
		print(f"first_name: {first_names[index]}\nlast_name: {last_names[index]}\nphone_number: {phone_numbers[index]}\nemail: {mails[index]}")
		get_print_phone_book_menu()
	else:
		print("contact does not exist")
		get_print_phone_book_menu()


def find_contact_by_first_name():
	first = input("Enter the first name of the person you want to find: ")
	if first in first_names:
		index = first_names.index(first)
		print(f"first_name: {first_names[index]}\nlast_name: {last_names[index]}\nphone_number: {phone_numbers[index]}\nemail: {mails[index]}")
		get_print_phone_book_menu()
	else:
		print("contact does not exist")
		get_print_phone_book_menu()


def find_contact_by_last_name():
	last = input("Enter the last name of the person you want to find: ")
	if last in last_names:
		index = last_names.index(last)
		print(f"first_name: {first_names[index]}\nlast_name: {last_names[index]}\nphone_number: {phone_numbers[index]}\nemail: {mails[index]}")
		get_print_phone_book_menu()
	else:
		print("contact does not exist")
		get_print_phone_book_menu()


def edit_contact():
	edit_name = input("Input the name: ")
	if edit_name in first_names:
		index = first_names(edit_name)
	
		new_first_name = input("Enter new first name: ")
		first_names[index] = new_first_name

		new_last_name = input("Enter new last name: ")
		last_names[index] = new_last_name
	
		new_contact = input("Enter new phone number: ")
		phone_numbers[index] = new_contact

		new_email_address = input("Enter new email addresss: ")
		mails[index] = new_email_address
		get_print_phone_book_menu()
	else:
		print("contact does not exist")
		get_print_phone_book_menu()


		
first_names = []
last_names = []
mails = []
phone_numbers = []
get_print_phone_book_menu()