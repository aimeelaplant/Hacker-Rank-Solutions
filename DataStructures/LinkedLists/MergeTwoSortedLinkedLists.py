# https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists
"""
 Merge two linked lists
 head could be None as well for empty list
 Node is defined as
 
 class Node(object):
 
   def __init__(self, data=None, next_node=None):
       self.data = data
       self.next = next_node

 return back the head of the linked list in the below method.
"""
def MergeLists(headA, headB):
    if headA is None: return headB
    if headB is None: return headA
    head = LinkedList(-1)
    current = head
    while headA is not None and headB is not None:
        if headA.data <= headB.data:
            # append l1's current node
            current.next = headA
            headA = headA.next
            current = current.next
        else:
            current.next = headB
            headB = headB.next
            current = current.next
    if headA is not None:
        # extend the remaning nodes
        current.next = headA
    else:
        current.next = headB
    head = head.next
    return head
