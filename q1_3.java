class Stack {
    int size, top;
    int arr[];
    public Stack(int size){
        top=0;
        this.size=size;
        arr = new int[30];
    }

    public void push(int x){
        if(top<size){
            arr[top]=x;
            top++;
        }
    }

    public int pop(){
        if(top>0){
            top--;
            return arr[top];
        }else{
            return -1;
        }
    }

    void show(){
        for(int i=top-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack stack = new Stack(30);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(15);
        stack.push(9);

        stack.show();

        stack.pop();
       stack.pop();
         stack.pop();

        stack.show();
      
    }
}
