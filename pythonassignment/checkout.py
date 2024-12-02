def display_questions(name, items_bought, items_number, items_price):
    if type(name) is not str or type(items_bought) is not list or type(items_number) is not list or type(items_price) is not list:
        raise TypeError("inavlid input")
        
    item_name = input("what did the user buy\n ")
    items_bought.append(item_name)
    
    item_amount = int(input("How many peices\n "))
    items_number.append(item_amount)
    
    price = float(input("how much per unit\n "))
    items_price.append(price)
    
    options = input("add more items?\n ")
    if options.lower() == "yes":
        display_question_again(name, items_bought, items_number, items_price)
    else:
        cashier = input("what is your name?\n> ")
        discount = float(input("how much discount he get?\n> "))
        displayCustomerInvoice(name, cashier,  items_bought, items_number, items_price, discount)
        
        
def display_question_again(name, items_bought, items_number, items_price):
    display_questions(name, items_bought, items_number, items_price)
    
def displayCustomerInvoice(name, cashier, items_bought, items_number, items_price, discount):
    print("""
SEMICOLON STORES
MAIN BRANCH
LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
TEL: 03293828343
DATE: 18-DEC-22 8:48:11PM
      """);
    print(f"Cashier: {cashier}\nCustomer Name: {name}");
    print("======================================================");
    print("ITEM\tQTY\tPRICE\tTOTAL");
    display_items(name, cashier, items_bought, items_number, items_price, discount)
    
      
      
def display_items(name, cashier, items_bought, items_number, items_price, discount):
    sub_total = 0
    discount_one = discount / 100
    print("======================================================");
    for index in range(len(items_bought)):
        print(f"{items_bought[index]}\t{items_number[index]}\t{items_price[index]}")
        sub_total += items_price[index] * items_number[index]
    print("------------------------------------------------------------")
    print(f"sub total: {sub_total}")
    print(f"discount:  {sub_total * discount_one}")
    print(f"vat @ 17.50:  {sub_total * (17.50 / 100)}")
    print("======================================================");
    print(f"bill total: {((sub_total - (sub_total * discount_one)) + (sub_total * (17.50 / 100)))}")
    print("------------------------------------------------------------")
    print(f"this is not a receipt kindly pay {((sub_total - (sub_total * discount_one)) + (sub_total * (17.50 / 100)))}")
    options = float(input("how much did the customer give you\n>"))
    if options > ((sub_total - (sub_total * discount_one)) + (sub_total * (17.50 / 100))):
        print("""
SEMICOLON STORES
MAIN BRANCH
LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
TEL: 03293828343
DATE: 18-DEC-22 8:48:11PM
      """);
        print(f"Cashier: {cashier}\nCustomer Name: {name}")
        print("======================================================");
        print("ITEM\tQTY\tPRICE\tTOTAL")
        sub_total = 0
        discount_one = discount / 100
        print("======================================================");
        for index in range(len(items_bought)):
            print(f"{items_bought[index]}\t{items_number[index]}\t{items_price[index]}")
            sub_total += items_price[index] * items_number[index]
        print("------------------------------------------------------------")
        print(f"sub total: {sub_total}")
        print(f"discount:  {sub_total * discount_one}")
        print(f"vat @ 17.50:  {sub_total * (17.50 / 100)}")
        print("======================================================");
        print(f"bill total: {((sub_total - (sub_total * discount_one)) + (sub_total * (17.50 / 100)))}")
        print(f"amount paid: {options}")
        print(f"balance: {options - ((sub_total - (sub_total * discount_one)) + (sub_total * (17.50 / 100)))}")
        print("------------------------------------------------------------")
        

    else:
        print("amount too low")
    
    
#items_bought = []
#items_number = []
#items_price = []
#name = input("what is the customer name?\n> ")
#display_questions(name, items_bought, items_number, items_price)
        
    
