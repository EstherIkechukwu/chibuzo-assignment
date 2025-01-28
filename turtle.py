
def turtle_graphics(commands):
    floor = [[0] * 20 for _ in range(20)]

    x, y = 10, 10
    pen_down = False
    direction = "E" 

    directions = ["N", "E", "S", "W"]

    def display_floor():
        for row in floor:
            print("".join("*" if cell == 1 else " " for cell in row))

    for command in commands:
        if command == 1:
            pen_down = False
        elif command == 2:
            pen_down = True
        elif command == 3:
            direction = directions[(directions.index(direction) + 1) % 4]
        elif command == 4:
            direction = directions[(directions.index(direction) - 1) % 4]
        elif isinstance(command, tuple) and command[0] == 5:
            steps = command[1]
            for _ in range(steps):
                if direction == "N":
                    x = max(0, x - 1)
                elif direction == "E":
                    y = min(19, y + 1) 
                elif direction == "S":
                    x = min(19, x + 1) 
                elif direction == "W":
                    y = max(0, y - 1)

                if pen_down:
                    floor[x][y] = 1
        elif command == 6:
            display_floor()
        elif command == 9:
            break

commands = [
    2,         
    (5, 12), 
    3,          
    (5, 12),
    3,        
    (5, 12),    
    3,        
    (5, 12),   
    1,    
    6,         
    9        
]

turtle_graphics(commands)
