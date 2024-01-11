numbers = [45, 75, 120, 180, 200, 300, 550, 1000]

for num in numbers:
    if num % 5 == 0 and num <= 150:
        print(num)
    if num > 500:
        break