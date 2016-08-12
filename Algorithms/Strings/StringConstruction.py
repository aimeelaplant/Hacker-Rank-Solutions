# https://www.hackerrank.com/challenges/string-construction
#!/bin/python

import sys

n = int(raw_input().strip())
for a0 in xrange(n):
    s = list(raw_input().strip())
    string_set = set(s)
    print len(string_set)
