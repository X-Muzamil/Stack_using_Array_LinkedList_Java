class LinkedList{
    Node top;
    Node rear;

    boolean isEmpty(){
        return top == null && rear == null;
    }

    public void push(int value){
        Node node = new Node(value);
        node.next = top;
        top = node;
    }

    
}