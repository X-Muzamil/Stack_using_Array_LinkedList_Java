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

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }

        int value = top.data;
        top = top.next;

        return value;
    }

    public int peek(){
        return top.data;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return ;
        }

        Node current = top;

        while(current != null){
            System.out.print(current.data +" -> ");
            current = current.next;
        }
        System.out.print("null");

    }
}