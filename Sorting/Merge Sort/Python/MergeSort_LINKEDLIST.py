# Definition for singly-linked list.
class Node:
    def __init__(self, val):
        self.val = val
        self.next = None
        
class LinkedList: 
    def __init__(self): 
        self.head = None
      
    # push new value to linked list 
    # using append method 
    def append(self, new_value): 
          
        # Allocate new node 
        new_node = Node(new_value) 
          
        # if head is None, initialize it to new node 
        if self.head is None: 
            self.head = new_node 
            return
        curr_node = self.head 
        while curr_node.next is not None: 
            curr_node = curr_node.next
              
        # Append the new node at the end 
        # of the linked list 
        curr_node.next = new_node 

    # Merge Sort Starts here
    '''
    4->2->1->3
    
    1->2->3->4
    
    merge sort - recursive
    
    1. find the middle linkedlist 
    2. divide it into 2 linkedlist and sort each 
    3. merge the linkedlist in the right order 
    
    base case:
        if not head or not head.next -> head
        
    reducing the input size 
       reducing by half (dividing the linkedlist into 2)
       using a slow and a fast pointers
       
              4     ->    2     ->    1       ->      3    -> 8
                                     ^
                                   slow 
                                                              ^
                                                           fast    
                        ^
                       pre
                          
                    prev.next = None 
                    
                    first half: head to prev
                    second half: slow to fast 
            
       1 -> 4 -> 3
                   ^
       
       3 -> 5 -> 8 
            ^
       
       --
    0 ->  1 -> 3 -> 4 -> 3 -> 5 -> 8 
                                   ^
     Time complexity: O(n log n)
     Space complexity: O(log n)
    '''
    def sortList(self, head):
        def merge(left, right):
            dummy = Node(0)
            curr = dummy 
            while left and right:
                if left.val < right.val:
                    curr.next = left
                    left = left.next
                else:
                    curr.next = right
                    right = right.next
                curr = curr.next
                    
            curr.next = left or right 
            
            return dummy.next
        
        if not head or not head.next:
            return head
        
        pre, slow, fast = None, head, head
        while fast and fast.next:
            pre, slow, fast = slow, slow.next, fast.next.next
            
        pre.next = None 
        left = self.sortList(head)
        right = self.sortList(slow)
        
        return merge(left, right)

# Function to print
def printList(head): 
    if head is None: 
        print(' ') 
        return
    curr_node = head 
    while curr_node: 
        print(curr_node.val, end = " ") 
        curr_node = curr_node.next
    print(' ') 

# Driver Code    
li = LinkedList()
li.append(15)
li.append(25)
li.append(30)
li.append(10)
li.append(5)
li.append(20)
li.append(3)
li.append(2)
li.head = li.sortList(li.head)
print ("Sorted Linked List is:") 
printList(li.head)
