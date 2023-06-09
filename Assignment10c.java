class Assignment10c {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        }
        catch (NullPointerException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("NullPointerException occur");
        }
    }
}