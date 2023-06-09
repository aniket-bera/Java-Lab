abstract class Number {
    int decN = 255;
    abstract String displayNum ();
}
class HexNum extends Number {
    String displayNum () {
        int temp = decN;
        String str = "";
        while (temp > 0){
            int r = temp % 16;
            switch (r) {
                case 10:str = "A" + str;
                break;
                case 11:str = "B" + str;
                break;
                case 12:str = "C" + str;
                break;
                case 13:str = "D" + str;
                break;
                case 14:str = "E" + str;
                break;
                case 15:str = "F" + str;
                break;
                default:str = r + str;
            }
            temp /= 16;
        }
        return str;
//        return Integer.toHexString(decN);
    }
}
class OctalNum extends Number {
    String displayNum () {
        int temp = decN;
        String str = "";
        while (temp > 0) {
            int r = temp % 8;
            str = r + str;
            temp /= 8;
        }
        return str;
//        return Integer.toOctalString(decN);
    }
}
class Assignment9b {
    public static void main(String[] args) {
        Number hex = new HexNum();
        Number oct = new OctalNum();
        System.out.println("Hexadecimal: "+hex.displayNum());
        System.out.println("Octal: "+oct.displayNum());
    }
}