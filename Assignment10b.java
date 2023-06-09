class Assignment10b {
    public static void main(String[] args) {
        int [] arr = new int[10];
        try {
            try {
                arr[15] = 10;
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
                throw e;
            }
        }
        catch (ArrayIndexOutOfBoundsException f) {
            System.out.println(f);
        }
    }
}