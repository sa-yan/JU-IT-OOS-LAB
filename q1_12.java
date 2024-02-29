class Students{
    String name;
    int roll;
    String subjects[];

    Students(String name, int roll){
        this.name = name;
        this.roll=roll;
        subjects = new String[5];

        subjects[0]="OOS";
        subjects[1]="CN";
        subjects[2]="SE";
        subjects[3]="MATH";
        subjects[4]="GGM";
    }

    String[] getSubjects(){
        return subjects;
    }
}

class TabulationSheet{
    int roll;
    int marks[];

    TabulationSheet(){
        this.marks=new int[5];
    }

    void add(int roll, int marks[]){
        this.roll=roll;
        this.marks=marks;
    }
}

class MarksSheet{
    String name;
    int marks[];
    String subjects[];

    MarksSheet(Students students){
        this.marks=new int[5];
        this.subjects = students.getSubjects();
    }

    void add(String name, int marksArray[]){
        this.name = name;
        this.marks = marksArray;
    }

    void showMarks(){
        System.out.println("Name : "+this.name);
        for (int i=0;i<5;i++){
            System.out.println(subjects[i]+" : "+marks[i]);
        }
        System.out.println("");
}

}

class q1_12{
    public static void main(String[] args) {
        Students s1 = new Students("JOHN", 1128);
        Students s2 = new Students("HARRY", 1127);
        Students s3 = new Students("MARLIN", 1126);

        TabulationSheet t1 = new TabulationSheet();
        TabulationSheet t2 = new TabulationSheet();
        TabulationSheet t3 = new TabulationSheet();
        TabulationSheet t4 = new TabulationSheet();
        TabulationSheet t5 = new TabulationSheet();

        t1.add(1, new int[]{67,34,56,44,78});
        t2.add(1, new int[]{89,98,54,77,90});
        t3.add(1, new int[]{23,56,67,44,98});
        t4.add(1, new int[]{55,34,56,80,78});
        t5.add(1, new int[]{67,90,44,99,89});

        MarksSheet m1 = new MarksSheet(s1);
        MarksSheet m2 = new MarksSheet(s2);
        MarksSheet m3 = new MarksSheet(s3);

        m1.add("John", new int[]{90,98,88,68,90});
        m2.add("Harry", new int[]{99,98,95,96,100});
        m3.add("Marlin", new int[]{90,85,90,95,93});

        m1.showMarks();
        m2.showMarks();
        m3.showMarks();

    }
}