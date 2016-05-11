# Enter your code here. Read input from STDIN. Print output to STDOUT

import re

def validate_email(email):
    result = re.match("^[A-Za-z0-9-_]+@[A-Za-z0-9]+\.[a-z]{1,3}$", email)
    if result:
        return True
    else:
        return False

n = int(raw_input())

emails = []

for i in range(n):
    emails.append(str(raw_input()))

emails = filter(validate_email, emails)
emails.sort()
print emails
