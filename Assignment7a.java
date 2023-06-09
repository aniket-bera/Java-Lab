class Room {
    int width, height, breadth;
    Room (int x, int y, int z) {
        width = x;
        height = y;
        breadth = z;
    }
    int volume () {
        return (width * height * breadth);
    }
}
class Assignment7a {
    public static void main(String[] args) {
        Room r = new Room(2, 5, 3);
        System.out.print("Volume = "+r.volume());
    }
}