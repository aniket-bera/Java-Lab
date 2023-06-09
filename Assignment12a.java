import MyPackage.AddData;
class Assignment12a {
    public static void main(String[] args) {
        AddData obj = new AddData();
        System.out.println("5 + 7 = "+ obj.add(5,7));
        System.out.println(("5.555 + 7.777 = "+ obj.add(5.555,7.777)));
        System.out.println("JA + VA = "+ obj.add("JA","VA"));
        System.out.println("Length of 'Programming': "+ obj.show("Programming"));
    }
}