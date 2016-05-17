# Enter your code here. Read input from STDIN. Print output to STDOUT
# https://www.hackerrank.com/challenges/validating-the-phone-number

import re

def is_valid_phone_number(phone_number):
    regex = "^(7|8|9){1}\d{9}$"
    result = re.match(regex, phone_number)
    if result:
        return True
    else:
        return False

num_phone_numbers = int(raw_input())

for phone_number in range(num_phone_numbers):
    if is_valid_phone_number(raw_input()):
        print "YES"
    else:
        print "NO"
