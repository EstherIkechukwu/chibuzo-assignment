graph = "**"

counter = 0
while (counter <= 5):
    asterisks = int(input("Enter number: "))
    if asterisks > 0 and asterisks <= 30:
        graph <= str(asterisks * "*")
        graph = graph + '\n'
        counter = counter + 1
        print(graph)
    else:
        print('outta Range')

