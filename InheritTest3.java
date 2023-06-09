class IRoom {
    int length;
    int breadth;
    IRoom (int x, int y) {
        length = x;
        breadth = y;
    }
    int area () {
        return (length * breadth);
    }
}
class IBedRoom extends IRoom {
    int height;
    IBedRoom (int x, int y, int z) {
        super(x, y);
        height = z;
    }
    int volume () {
        return (length * breadth * height);
    }
}
class IBRoom extends IRoom {
    int width;
    IBRoom (int x, int y, int k) {
        super(x, y);
        width = k;
    }
    int Evolume () {
        return (length * breadth * width);
    }
}
class InheritTest3 {
    public static void main(String[] args) {
        IBedRoom room1 = new IBedRoom(14, 12, 10);
        IBedRoom room2 = new IBedRoom(15, 10, 4);
        IBRoom room3 = new IBRoom(15, 10, 2);
        System.out.println("Area1 = "+room1.area());
        System.out.println("Volume1 = "+room1.volume());
        System.out.println("Area2 = "+room2.area());
        System.out.println("Volume2 = "+room2.volume());
        System.out.println("Area3 = "+room3.area());
        System.out.println("Volume3 = "+room3.Evolume());
    }
}