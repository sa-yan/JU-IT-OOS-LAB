class Employee{
    String name;
    int id;
    double salary;     
    String address;
    public Employee(String name, int id, double salary, String address){
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.address = address;
    }

    public Employee(){
        this.name = "";
        this.id = 0;
        this.salary = 0;
        this.address = "";
    }
    
}

class Dept{
    String name, location;
    int capacity, index;
    Employee employees[];

    Dept(int capacity, String name, String location){
        this.capacity=capacity;
        this.name=name;
        this.location=location;
        this.index=0;
        employees = new Employee[capacity];
    }

    void add(Employee emp){
        employees[index]=emp;
        index++;
    }

    void remove(int id){
        int i=0;
        while(i<index){
           if(employees[i].id == id){
              break;
           }
           i++;
        }
        while(i<index){
           employees[i]=employees[i+1];
           i++;
        }
        employees[i] = new Employee();
        index--;
     }

float expenditure(){
float sum = 0;
for (int i = 0; i < index ; i++) {
 sum+=employees[i].salary * 12;
}
 return sum;
}

public static void main(String[] args) {
    Dept d = new Dept(10,"Information Technology","Salt Lake Sector 3");

    Employee emp1 = new Employee("Sayan",1128,12000, "Bankura");
    Employee emp2 = new Employee("Anindya",1126,16000, "Bankura");
    Employee emp3= new Employee("Adil",1127,12000, "Bankura");
    Employee emp4 = new Employee("Asim",1136,12000, "Bankura");
    Employee emp5 = new Employee("Siddhant",1134,12000, "Bankura");

    d.add(emp1);
    d.add(emp2);
    d.add(emp3);
    d.add(emp4);
    d.add(emp5);

    System.out.println("Total Expenditure: ");
    System.out.println(d.expenditure());

}

}


