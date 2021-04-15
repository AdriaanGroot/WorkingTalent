class CountE {

    public static void main(String[] args) {

        String teststr = "regenen";
        char testchar = 'e';
        int count = 0;
        for (int c = 0; c < teststr.length(); c++) {
            if (testchar ==  teststr.charAt(c)){
                count++;
            }
        }
        System.out.println(count);
    }

}