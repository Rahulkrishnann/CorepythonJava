def check_first_and_last(numbers):
    if len(numbers) < 1:
        return False
    
    if numbers[0] == numbers[-1]:
        return True
    else:
        return False

my_list = [5, 10, 15, 20, 5]
result = check_first_and_last(my_list)
print(result)