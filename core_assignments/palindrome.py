def is_palindrome(number):
    num_str = str(number)
    reversed_str = num_str[::-1]
    
    if num_str == reversed_str:
        return True
    else:
        return False

num = int(input())
result = is_palindrome(num)

if result:
    print(f"{num} is a palindrome number.")
else:
    print(f"{num} is not a palindrome number.")