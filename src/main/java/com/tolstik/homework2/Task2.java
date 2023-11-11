package main.java.com.tolstik.homework2;

public class Task2 {
    public static void main(String[] args) {

        int algorithmId = Integer.parseInt(args[0]);
        int loopType = Integer.parseInt(args[1]);
        int num = Integer.parseInt(args[2]);

        if (algorithmId == 1) {
            if (loopType == 1) {
                printFibonacciSequanceUsingWhileLoop(num);
            }
            if (loopType == 2) {
                printFibonacciSequanceUsingDoWhileLoop(num);
            }
            if (loopType == 3) {
                printFibonacciSequanceUsingForLoop(num);
            }
        }
        if (algorithmId == 2) {
            if (loopType == 1) {
                calculateFactorialUsingWhileLoop(num);
            }
            if (loopType == 2) {
                calculateFactorialUsingDoWhileLoop(num);
            }
            if (loopType == 3) {
                calculateFactorialUsingForLoop(num);
            }
        }

    }

    static void printFibonacciSequanceUsingWhileLoop(int num) {
        int numFebonacci1 = 0;
        int numFebonacci2 = 1;
        int i = 1;
        while (i <= num) {
            System.out.print(numFebonacci1 + " ");
            int sum = numFebonacci1 + numFebonacci2;
            numFebonacci1 = numFebonacci2;
            numFebonacci2 = sum;
            i++;
        }
    }

    static void printFibonacciSequanceUsingDoWhileLoop(int num) {
        int numFebonacci1 = 0;
        int numFebonacci2 = 1;
        int i = 1;
        do {
            System.out.print(numFebonacci1 + " ");
            int sum = numFebonacci1 + numFebonacci2;
            numFebonacci1 = numFebonacci2;
            numFebonacci2 = sum;
            i++;
        } while (i <= num);
    }

    static void printFibonacciSequanceUsingForLoop(int num) {

        int previousValue = 0;
        int currentValue = 1;
        if (num > 0) {
            System.out.print(0 + " ");
            for (int i = 1; i < num; i++) {
                System.out.print(currentValue + " ");
                int temp = previousValue;
                previousValue = currentValue;
                currentValue += temp;
            }
        } else {
            System.out.println(" num value is wrong");
        }
    }

    static void calculateFactorialUsingWhileLoop(int num) {
        int factorialNumberOnt = 1;
        int i = 1;

        if (num == 0) {
            System.out.println(0);
        } else {

            while (i <= num) {
                factorialNumberOnt = factorialNumberOnt * i;
                i++;
            }

            System.out.println(factorialNumberOnt);
        }
    }

    static void calculateFactorialUsingDoWhileLoop(int num) {
        int factorialNumberOne = 1;
        int i = 1;

        if (num == 0) {
            System.out.println(0);
        } else {
            do {
                factorialNumberOne = factorialNumberOne * i;
                i++;
            } while (i <= num);
            System.out.println(factorialNumberOne);
        }
    }

    static void calculateFactorialUsingForLoop(int num) {
        int factorialNumOne = 1;
        if (num == 0) {
            System.out.println(0);
        } else {
            for (int i = 1; i <= num; i++) {
                factorialNumOne = factorialNumOne * i;
            }
            System.out.println(factorialNumOne);
        }
    }

}





