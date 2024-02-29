class Complex{
int real, complex;
Complex(){
real=0;
complex=0;
}
Complex(int real){
this.real=real;
complex=0;
}

Complex(int real,int complex){
this.real=real;
this.complex=complex;
}

void display(){
System.out.println(real+" + "+complex+"i");
}

Complex sum(Complex c1, Complex c2){
Complex temp = new Complex();
temp.real=c1.real+c2.real;
temp.complex=c1.complex+c2.complex;
return temp;
}

Complex product(Complex c1, Complex c2){
Complex temp = new Complex();
temp.real=c1.real*c2.real - c1.complex*c2.complex;
temp.complex=c1.real*c2.complex+c1.complex*c2.real;
return temp;
}

public static void main(String[] args) {
    Complex num1 = new Complex(3,2);
    Complex num2 = new Complex(4,-2);

    Complex sum = num1.sum(num1, num2);
    Complex prod = num1.product(num1, num2);

    System.out.println("SUM: ");
    sum.display();

    System.out.println("PRODUCT: ");
    prod.display();
}

}