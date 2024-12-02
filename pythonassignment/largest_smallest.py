condition = True

largest = 0
smallest = 0

while condition:
    number = int(input("Enter a number: "))
    if number > largest:
        largest = number

    elif number < smallest:
        smallest = number

    choice = int(input("do you want to perform the operation again? if yes press 1, if no press 0 "))

    if choice == 1:
        condition = True
    elif choice == 0:
        condition = False
    else:
        print("invalid")


print(f"{largest}")
print(f"{smallest}")
	
