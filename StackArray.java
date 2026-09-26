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

    public void pop(){
        if(size == 0){
            System.out.println("Stack is empty");
            return;
        }
        int value;
        value = stack[size - 1];
        size--;
    }

    public void peek(){
        int value;
        value = stack[size - 1];
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        else return false;
    }

    public boolean isFull(){
        if(size == capacity)
            return true;
        else
            return false;
    }

    public void size(){
        System.out.println("Size of the arrayfilled :- " + size);
    }



    public void display(){
        if(size == 0){
            System.out.println("Stack is empty");
            return;
        }
        for(int i = size - 1; i >= 0; i--){
            System.out.println(stack[i]);
        }
    }
}