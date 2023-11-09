package main.java.com.tolstik.homework2;

public class homework2_2 {
    public static void main(String[] args) {

        int algoritmId = Integer.parseInt(args[0]);
        int loopType = Integer.parseInt(args[1]);
        int num = Integer.parseInt(args[2]);

        if (algoritmId == 1) {
            if (loopType == 1) {
                febonWhile(num);
            }
            if (loopType == 2) {
                febonDoWhile(num);
            }
            if (loopType == 3) {
                febonFor(num);
            }
        }
        if (algoritmId == 2) {
            if (loopType == 1) {
                factorialWhile(num);
            }
            if (loopType == 2) {
                factorialDoWhile(num);
            }
            if (loopType == 3) {
                factorialFor(num);
            }
        }

    }

    static void febonWhile(int num) {
        int numFebonachi1 = 0;
        int numFebonachi2 = 1;
        int i = 1;
        while (i <= num) {
            System.out.print(numFebonachi1 + " ");
            int sum = numFebonachi1 + numFebonachi2;
            numFebonachi1 = numFebonachi2;
            numFebonachi2 = sum;
            i++;
        }
    }

    static void febonDoWhile(int num) {
        int numFebonachi1 = 0;
        int numFebonachi2 = 1;
        int i = 1;
        do {
            System.out.print(numFebonachi1 + " ");
            int sum = numFebonachi1 + numFebonachi2;
            numFebonachi1 = numFebonachi2;
            numFebonachi2 = sum;
            i++;
        } while (i <= num);
    }

    static void febonFor(int num) {

        if (num == 0) {
            System.out.println("Error");
        } if (num == 1) {
            System.out.println(0);
        } if (num > 1) {
            int[] febonachiArray = new int[num];
            febonachiArray[0] = 0;
            febonachiArray[1] = 1;

            for (int i = 2; i < num; i++) {
                febonachiArray[i] = febonachiArray[i - 1] + febonachiArray[i - 2];
            }
            for (int i = 0; i < num; i++) {
                System.out.print(febonachiArray[i] + " ");
            }
        }
    }

    static void factorialWhile(int num) {
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

    static void factorialDoWhile(int num) {
        int factorialNumberOnt = 1;
        int i = 1;

        if (num == 0) {
            System.out.println(0);
        } else {
            do {
                factorialNumberOnt = factorialNumberOnt * i;
                i++;
            } while (i <= num);
            System.out.println(factorialNumberOnt);
        }
    }

    static void factorialFor(int num) {
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





