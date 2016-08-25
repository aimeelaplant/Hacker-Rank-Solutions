# https://www.hackerrank.com/challenges/compare-two-linked-lists
#Body
"""
 Compare two linked list
 head could be None as well for empty list
 Node is defined as
 
 class Node(object):
 
   def __init__(self, data=None, next_node=None):
       self.data = data
       self.next = next_node

 return back the head of the linked list in the below method.
"""

def CompareLists(headA, headB):
    current_a = headA
    current_b = headB
    while current_a and current_b:
        if current_a.data != current_b.data:
            return 0
        else:
            current_a = current_a.next
            current_b = current_b.next
    # need to check this in case current_a !=  current_b since we are running the while-loop for both lists
    if current_a != current_b:
        return 0
    return 1
