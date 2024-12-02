condition = True

while condition:
    number1 = int(input("Enter the first number: "))
    number2 = int(input("Enter the second number: "))

    sum = number1 + number2
    print(sum)

    choice = int(input("do you want to perform the operation again? if yes press 1, if no press 0 "))
   
    if choice == 1:
        condition = true
    else if choice == 0:
        condition = False
    else:
        print("invalid")