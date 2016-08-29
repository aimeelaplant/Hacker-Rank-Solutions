# https://www.hackerrank.com/challenges/maximum-element
# Enter your code here. Read input from STDIN. Print output to STDOUT
from collections import deque

class NodeWithMax:
    
    def __init__(self, value, max):
        self.value = value
        self.max = max

class StackWithMax(deque):
    
    def push(self, value):
        new_max = max(value, self.max())
        node = NodeWithMax(value, new_max)
        self.append(node)
        
    def max(self):
        if len(self) == 0 or len(self) == -1:
            return 0
        # return last item's max
        return self[len(self) - 1].max

num_items = int(raw_input())
my_stack = StackWithMax()

for i in xrange(num_items):
    result = map(int, raw_input().strip().split(" "))
    query = result[0]
    if query == 1:
        my_stack.push(result[1])
    elif query == 2:
        my_stack.pop()
    elif query == 3:
        print my_stack.max()
