class StackLL{
    Node top;
    
    StackLL(){
        top = null;
    }

    boolean isEmpty(){
        return top == null;
    }

    public void push(int value){    
        Node node = new Node(value);
        node.next = top;
        top = node;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack isEmpty");
            return -1;
        }

        int topvalue = top.data;
        top = top.next; 
        return topvalue;  
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return ;
        }
        Node current = top;
        System.out.println(" \nStack elements \n");
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("null");

    }
}