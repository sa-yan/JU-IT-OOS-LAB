class PrintNumbers{

int counter =1;
int MAX;

PrintNumbers(int MAX){
this.MAX = MAX;
}

public synchronized void printOddNumber(){

while(counter<MAX){
while(counter%2==0){

try{
        wait();
}catch(Exception e){
        e.printStackTrace();
}
}

System.out.print(counter+" ");
counter++;
notify();

}
}

public synchronized void printEvenNumber(){

while(counter<MAX){
while(counter%2==1){

try{
        wait();
}catch(Exception e){
        e.printStackTrace();
}}

System.out.print(counter+" ");
counter++;
notify();

}
}


}

class Q2{
public static void main(String args[]){

int N=10;
PrintNumbers p = new PrintNumbers(N);

Thread oddThread = new Thread(new Runnable(){
public void run(){
p.printOddNumber();
}
});

Thread evenThread = new Thread(new Runnable(){
public void run(){
p.printEvenNumber();
}
});


oddThread.start();
evenThread.start();

}
}
