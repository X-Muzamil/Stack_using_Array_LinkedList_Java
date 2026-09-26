class Main{
    public static void main(String args[]){
        StackArray ss = new StackArray(10);
        ss.push(40);
        ss.push(50);
        ss.push(60);
        ss.push(70);
        ss.push(80);
        ss.push(90);
        ss.push(100);
        ss.push(200);
        ss.push(800);
        ss.push(801);
        ss.display();

        System.out.println("POP implement 1");
        ss.pop();
        ss.display();
        System.out.println("POP implement 2");
        ss.pop();
        ss.display();
        System.out.println("POP implement 3");
        ss.pop();
        ss.display();

        ss.peek();
        System.out.println("isEmpty :- " + ss.isEmpty());
        System.out.println("isFull :- " + ss.isFull());
        ss.size();
    }
}