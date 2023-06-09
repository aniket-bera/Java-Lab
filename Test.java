class Student {
    String name, sem;
    int id;
    Student (String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("Name: "+name+"\nID: "+id);
    }
    Student (int id, String name, String sem) {
        this.id = id;
        this.name = name;
        this.sem = sem;
        System.out.println("ID: "+id+"\nName: "+name+"\nSem: "+sem);
    }
}
class Test {
    public static void main(String[] args) {
        System.out.println(new Student("Monish", 72).equals(new Student("Saikat", 73)));
        new Student(74, "Aniket", "5th");
        new Student(75, "Dona", "5th");
    }
}