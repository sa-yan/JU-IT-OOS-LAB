class Room{
    int height, width, breadth;
    public int volume(){
        return (height*width*breadth);
    }
}

class RoomDemo{
    public static void main(String[] args) {
        Room r1 = new Room();
        Room r2 = new Room();
        Room r3 = new Room();

        r1.breadth=2;
        r1.height=12;
        r1.width=21;

        r2.breadth=1;
        r2.height=2;
        r2.width=34;

        r3.breadth=67;
        r3.height=87;
        r3.width=33;

        System.out.println(r1.volume());
        System.out.println(r2.volume());
        System.out.println(r3.volume());
    }
}