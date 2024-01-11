def extract_digits_in_reverse_order(number):
    num_str = str(number)[::-1]
    
    for digit in num_str:
        print(digit, end=' ')

num = 7536
extract_digits_in_reverse_order(num)