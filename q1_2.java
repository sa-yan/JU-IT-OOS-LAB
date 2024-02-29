 class Student {
    String name;
    int marks1, marks2, marks3;
    void assignMarks(int marks1, int marks2, int marks3){
        this.marks1=marks1;
        this.marks2=marks2;
        this.marks3=marks3;
    }

    double findAvg(){
        return ((marks1+marks2+marks3)/3);
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Total Marks: "+(marks1+marks2+marks3)+" out of 300");
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.name="Sayan Mondal";
        student.assignMarks(23, 67, 87);
        System.out.println("Average: "+student.findAvg());
        student.display();
    }
}
