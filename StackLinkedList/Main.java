class Main{
    public static void main(String args[]){
        StackLL ll = new StackLL();

        ll.push(5);
        ll.push(10);
        ll.push(15);
        ll.push(20);
        ll.push(25);
        ll.push(30);
        ll.push(35);
        ll.push(40);
        ll.push(45);
        ll.push(50);

        ll.display();

        System.out.println("POP the value " + ll.pop());
        ll.display();
        System.out.println();

        System.out.println("Peek value " + ll.peek());
        
        
    }
}