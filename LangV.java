import java.util.*;
class LangV {
    public static void main(String[] args) {
        Vector list =  new Vector();
        for (int i = 0; i < args.length; i++) {
            list.addElement(args[i]);
        }
        list.insertElementAt("COBOL",2);
        String listArray[] = new String[list.size()];
        list.copyInto(listArray);
        System.out.println("List of language:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(listArray[i]);
        }
    }
}
