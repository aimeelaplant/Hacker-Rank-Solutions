# https://www.hackerrank.com/challenges/making-anagrams
from collections import Counter

# put the string into the counter
counts = Counter(raw_input())
# subtract the second string from the first string
counts.subtract(raw_input())

s = 0
for x in counts.values():
    s += abs(x)

print s
