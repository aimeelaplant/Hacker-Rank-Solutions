# https://www.hackerrank.com/challenges/balanced-brackets
#!/bin/python

import sys
from collections import deque

def is_balanced(string):
    d = deque()
    for char in string:
        if char == "{" or char == "(" or char == "[":
            d.appendleft(char)
            continue
        elif char == "}":
            if len(d) == 0 or d[0] != "{":
                return "NO"
            d.popleft()
            continue
        elif char == ")":
            if len(d) == 0 or d[0] != "(":
                return "NO"
            d.popleft()
            continue
        elif char == "]":
            if len(d) == 0 or d[0] != "[":
                return "NO"
            d.popleft()
            continue
    return "YES" if len(d) == 0 else "NO"

t = int(raw_input().strip())
for a0 in xrange(t):
    s = raw_input().strip()
    print is_balanced(s)
