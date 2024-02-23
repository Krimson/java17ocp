package lab.bjes.arrays;

public class MultidimensionalArrayLab {
    static int table[][] = new int[3][5]; // C-style array declaration accepted

    static int multi3[][][] = new int[4][2][0];

    public MultidimensionalArrayLab() {
        printTable();
        printSum();
        printProduct();
    }


    private void printTable() {
        System.out.println("--- Multidimensional Array - Print array structure");

        System.out.println("Printing table structure of int table[][] = new int[5][3];");
        for(int x = 0; x < table.length; x++) {
            StringBuilder stringBuilder = new StringBuilder();
            for(int y = 0; y < table[x].length; y++) {
                stringBuilder.append(x).append(",").append(y).append("\t\t");
            }
            System.out.println(stringBuilder);
        }
    }
    private static void printSum() {
        System.out.println("--- Multidimensional Array - Print array content sum");

        System.out.println("Creating multi demon array: var array = new int[3][5], setting all values to the sum of of the row and column numbers");

        var array = new int[3][5];

        for(var x = 0; x < array.length; x++) {
            for(var y = 0; y < array[x].length; y++) {
                array[x][y] = x+y;
                System.out.println("x: " + x + ", y: " + y + ". Sum: " + array[x][y]);
            }
        }
    }

    private void printProduct() {
        System.out.println("--- Multidimensional Array - Print cell product");

        int [] [] multi = new int[3][4];
        System.out.println("--- Printing cell product of array: int [] [] multi = new int[3][4]");

        for(var x = 0; x < multi.length; x++) {
            for(var y = 0; y < multi[x].length; y++) {
                multi[x][y] = x * y;
                System.out.println(x + " * " + y + " = " + multi[x][y]);
            }
        }

    }
}
