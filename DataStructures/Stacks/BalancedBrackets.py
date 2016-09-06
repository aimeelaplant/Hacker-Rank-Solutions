# https://www.hackerrank.com/challenges/balanced-brackets
#!/bin/python

import sys

def is_balanced(string):
    # make key-value dict for parentheses
    parens = {"(":")", "{":"}", "[":"]"}
    stack = []
    # iterate over each string in the string
    for s in string:
        # check if s is in opening brackets
        if s in parens.keys():
            # get the corresponding closing bracket we need
            c = parens.get(s)
            # append the closing bracket to the stack
            stack.append(c)
        # check if s is in closing brackets
        elif s in parens.values():
            # if stack is empty or s doesn't equal the popped value (would be a closing bracket) from the stack
            if not stack or s != stack.pop():
                # it's not balanced
                return False
    # we popped the closing bracket we added so it should be empty if its balanced
    if not stack: return True

t = int(raw_input().strip())
for a0 in xrange(t):
    s = raw_input().strip()
    print "YES" if is_balanced(s) else "NO"
