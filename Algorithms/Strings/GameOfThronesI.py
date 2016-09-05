# https://www.hackerrank.com/challenges/game-of-thrones
string = raw_input()
 
found = False
# Write the code to find the required palindrome and then assign the variable 'found' a value of True or False
from collections import Counter
c = Counter(string)
num_odd_chars = 0
for w in c:
    # count odd occurrences
    if c[w] % 2 != 0:
        num_odd_chars += 1
    if num_odd_chars > 1:
        break # break out of loop so we aren't counting anymore
if num_odd_chars > 1:
    print("NO")
else:
    print("YES")
