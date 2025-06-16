class MyLinkedList {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    private Node head;
    private int size;
    public MyLinkedList() {
        head = null;
        size =0;
    }
    
    public int get(int index) {
        if(index<0 || index>=size) return -1;
        Node t = head;
        for(int i=0 ; i<index ; i++){
            t = t.next;
        }
        return t.val;  
    }
    
    public void addAtHead(int val) {
        Node newnode = new Node(val);
        newnode.next = head;
        head = newnode;
        size++;
    }
    
    public void addAtTail(int val) {
        Node newnode = new Node(val);
        if(head==null){
            head = newnode;
        }else{
            Node temp = head;
            while(temp.next !=null){
                temp = temp.next;
            }
            temp.next = newnode;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index > size) return ;
        if(index==0){
            addAtHead(val);
            return;
        }
        Node tt = new Node(val);
        Node curr = head;
        for(int i=0 ; i<index-1 ; i++){
            curr = curr.next;
        }
        tt.next = curr.next;
        curr.next = tt;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size ) return;
        if(index==0){
            head = head.next;
        }else{
            Node curr = head;
            for(int i=0 ; i<index-1 ; i++){
                curr = curr.next;
            }
            curr.next = curr.next.next;
        }
        size--;

    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */