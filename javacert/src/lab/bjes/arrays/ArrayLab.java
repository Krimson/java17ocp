package lab.bjes.arrays;

public class ArrayLab {
    public ArrayLab() {
        arrayInit();
    }

    private void arrayInit() {
        System.out.println("--- Arrays - Array initialization");
        //String[] sa = new String[]; NOK - not initialized

        // String[] sa = new String[2] {"1", "2"}; NOK, cannot both specify length of array and use initializer block

        String[] sa = new String[] {"1", "2"}; // OK
        printArray("constructed with 2 values:", sa);

        String[] sa2 = new String[3]; // OK
        sa2[1] = "1";
        printArray("constructed with a size of 3", sa2);


        String sa3[] = new String[] {"1", null};
        printArray("constructed with brackets on variable name", sa3);

        var sa4 = new String[] {"1", "2", "3"};
        printArray("constructed as a var, using 3 values", sa4);
    }

    private void printArray(String constructedHow, String sa[]) {
        System.out.println("Content of string array that was " + constructedHow);
        for(String s : sa) {
            System.out.println(s);
        }
    }
}
