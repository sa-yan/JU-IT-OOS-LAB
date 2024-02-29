/*
 * Create a base class “Automobile”. An Automobile contains data members ‘make’, ‘type’,‘maxSpeed’, ‘price’, ‘mileage’, ‘registrationNumber’ etc. with their reader/writer methods. Now
create two sub-classes “Track” and “Car”. Track has data members ‘capacity’, ‘hoodType’,
‘noOfWheels’ etc. Car has data members ‘noOfDoors’, ‘seatingCapacity’ and their reader/writer
methods. Create a main() function to demonstrate this.
 */


 class Automobile{
    String make;
    String type;
    int maxSpeed;
    double price;
    int registrationNumber;

    Automobile(){
        make="";
        type="";
        maxSpeed=200;
        price=0;
        registrationNumber=0;
    }

    Automobile(String make, String type, int maxSpeed, double price, int registrationNumber){
        this.make = make;
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    void print(){
        
    }
 }