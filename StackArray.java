class StackArray{
    int[] stack;
    int top;
    int rear;
    int capacity;
    int size;

    StackArray(int capacity){
        this.capacity = capacity;
        size = 0;
        stack = new int[capacity];
    }

    public void push(int value){
        if(size == capacity){
            System.out.println("Stack overflow");
            return;
        }

        stack[size] = value;
        size++;
    }

    public void display(){
        if(size == 0){
            System.out.println("Stack is empty");
            return;
        }
        for(int i = size - 1; i >= 0; i--){
            System.out.println("top :- " + stack[i]);
        }
    }
}