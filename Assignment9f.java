interface Child {
    void display ();
}
class Mother implements Child {
    public void display () {
        System.out.println("I am Mother of Child");
    }
}
class Father implements Child {
    public void display () {
        System.out.println("I am Father of Child");
    }
}
class Assignment9f {
    public static void main(String[] args) {
        Child obj1 = new Mother();
        Child obj2 = new Father();
        obj1.display();
        obj2.display();
    }
}