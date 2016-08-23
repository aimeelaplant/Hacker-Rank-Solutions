# https://www.hackerrank.com/challenges/get-the-value-of-the-node-at-a-specific-position-from-the-tail
#Body
"""
 Get Node data of the Nth Node from the end.
 head could be None as well for empty list
 Node is defined as
 
 class Node(object):
 
   def __init__(self, data=None, next_node=None):
       self.data = data
       self.next = next_node

 return back the node data of the linked list in the below method.
"""

def GetNode(head, position):
    current = head
    prev = None
    while current is not None:
        next = current.next
        current.next = prev
        prev = current
        current = next
    head = prev
    
    counter = 0
    current = head
    while current and counter <= position:
        if counter == position:
            return current.data
        current = current.next
        counter += 1
