# https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list
"""
 Delete Node at a given position in a linked list
 Node is defined as
 
 class Node(object):
 
   def __init__(self, data=None, next_node=None):
       self.data = data
       self.next = next_node

 return back the head of the linked list in the below method. 
"""

def Delete(head, position):
    counter = 0
    current = head
    prev = None
    while current and counter <= position:
        if counter == position:
            # we're at the head if prev is None
            if prev is None:
                head = current.next
            else:
                prev.next = current.next
        prev = current
        current = current.next
        counter += 1
    return head
