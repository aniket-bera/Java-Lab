class Stringmain {
    public static void main(String[] args) {
        StringBuffer str =  new StringBuffer("Object Language");
        System.out.println("Original String: "+str);
        System.out.println("Length of String: "+str.length());
        for (int i = 0; i < str.length(); i++) {
            int p = i + 1;
            System.out.println("Character at position: "+p+" is "+str.charAt(i));
        }
        //inserting a String at middle
        String aString = new String(str.toString());
        int pos = aString.indexOf("Language");
        str.insert(pos, "Oriented ");
        System.out.println("Modified String: "+str);
        //modified character
        str.setCharAt(6, '-');
        System.out.println("String now: "+str);
        //appending String at end
        str.append(" improve security");
        System.out.println("Allocated String: "+str);
    }
}