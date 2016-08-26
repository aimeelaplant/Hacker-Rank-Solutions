# https://www.hackerrank.com/challenges/find-the-merge-point-of-two-joined-linked-lists
"""
 Find the node at which both lists merge and return the data of that node.
 head could be None as well for empty list
 Node is defined as
 
 class Node(object):
 
   def __init__(self, data=None, next_node=None):
       self.data = data
       self.next = next_node

"""

def FindMergeNode(headA, headB):
    current_a = headA
    current_b = headB
    # while current_a.data and current_b.data are not the same (we sync them so they are same in the while-loop)
    while current_a.data != current_b.data:
        # if at end of current_a
        if current_a.next is None:
            # make current_a as headB
            current_a = headB
        else:
            # go to next in iteration of current_a
            current_a = current_a.next
        # if at the end of current_b
        if current_b.next is None:
            # make current_b as headA
            current_b = headA
        else:
            # go to next iteration of current_b
            current_b = current_b.next
    # now current_a and current_b are the same...
    # can also return current_b.data since we went through while-loop and made it the same as current_a
    return current_a.data
