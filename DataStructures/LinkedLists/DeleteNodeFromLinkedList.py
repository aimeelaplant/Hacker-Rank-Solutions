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
    current = head
    if position == 0:
        head = current.next
        return head
    counter = 0
    while current and counter <= position:
        if counter == position - 1:
            temp = current.next
            current.next = temp.next
            return head
        current = current.next
        counter += 1
