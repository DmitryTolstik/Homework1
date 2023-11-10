package main.java.com.tolstik.homework2;

public class Task1 {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        double m1 = Double.parseDouble(args[2]);
        double m2 = Double.parseDouble(args[3]);

        double result = 4 * (Math.pow(Math.PI, 2)) * ((Math.pow(a, 3)) / ((Math.pow(b, 2)) * (m2 + m1)));

        System.out.println(result);
    }
}
