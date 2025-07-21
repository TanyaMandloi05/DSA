public class LinkedList{
    public static class Node{
        int data;
        Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        //step1 = create new node
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        // step 2 - newNode next = head
        newNode.next = head; // Link

        //step 3 - head = newNode
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
            if(head == null ){
              head = tail = newNode;
              return;
            }
            // step 2 - tail ke next ko point krna h towards = newNode
            tail.next = newNode;

            // step 3 - newNode = tail
            tail = newNode;
        }
        public void addMid(int idx, int data){
            if(idx == 0){
                addFirst(data);
                return;
            }
            Node newNode = new Node(data);
            size++;
            Node temp = head;
            int i = 0 ;
            while(i < idx-1){
               temp = temp.next;
               i++; 
            }
            
            // i = idx-1 , temp -> prev
            newNode.next = temp.next;
            temp.next = newNode;
        }


    public void print(){
        Node temp = head;
        if(head == null){
            System.out.print("LL is empty");
        }
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst(){
        if(size == 0){
            System.out.print("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int  removeLast(){
        if(size == 0){
            System.out.print("ll is empty");
        } else if(size == 1){
         int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
         }
        int val = tail.data;
        prev.next = null;
        prev = tail;
        size--;
        return val;

    }

    public int iterativeSearch(int key){
    Node temp = head;
    int idx = 0;

    while(temp != null){
        if(temp.data == key){
            return idx;
        } 
            temp = temp.next;
            idx++;
        
    }
    return -1;
    }

    public static int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
        
    }

    public int recSearch(int key){
        return helper(head, key);
    }
    
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthFromEnd(int n){
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        if(n == sz){
            head = head.next; // remove first
            return;
        }
        
        int i = 1;
        int itoFind = sz - n;
        Node prev = head;
        while(i < itoFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean palindrome(){
        if(head == null || head.next == null){
            return true;
        }
        //find mid
        Node mid = findMid(head);

        // reverse 2nd half
        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        //check right palindrome with left palindrome..
        while(right != null){
          if(right.data != left.data){
            return false;
        }
         right = right.next;
         left = left.next;
        }
        return true;
    }

    public static void main(String args[]){
    LinkedList ll = new LinkedList();
   
    // ll.addFirst(2);
    // ll.addFirst(1);
    // ll.addLast(4);
    // ll.addLast(5);
    // ll.addMid(2,3);
    // ll.print();
    // System.out.println(ll.size);
    // ll.removeFirst();
    // ll.print();
    // System.out.println(ll.size);
    // ll.removeLast();
    // ll.print();
    // System.out.println(ll.size);
    // System.out.println(ll.iterativeSearch(15));
    // System.out.println(ll.recSearch(3));
    // System.out.print(ll.recSearch(10));
    // ll.reverse();
    // ll.print();
    // ll.deleteNthFromEnd(3);
    // ll.print();

    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(1);
    // ll.addLast(1);
    ll.print();
    System.out.println(ll.palindrome());
 }
}