public class PassingPrimitives {

    public static void main(String[] args) {

        int num1 = 3;
        timesThree(num1);
        System.out.println("Value of num1 in main: " + num1);

        int[] arr = {1, 2, 3, 4};

        addTwo(arr);
        System.out.println("The items in arr in main:");
        printArray(arr);


    }

    public static int timesThree(int num1) {

        num1 *= 3;
        System.out.println("Value of num1 in timesThree: " + num1);
        return num1;
    }

    public static void addTwo(int[] arr) {
        for (int i=0; i < arr.length; i++) {
            arr[i] += 2;
        }

        System.out.println("The items in arr in addTwo:");
        printArray(arr);
    }

    
    public static void printArray(int[] arr) {

        for (int x: arr) {
            System.out.print(x + " " );
        }
        System.out.println();
    }


}
