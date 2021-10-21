package Task10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RightNumber {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        addIntToArray();
    }

    public static void addIntToArray() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Choose length for array (number only)");
        int[] arrayInt = null;
        try {
            int arrayLength = scn.nextInt();
            arrayInt = new int[arrayLength];
            for (int j = 0; j < arrayInt.length; j++) {
                arrayInt[j] = scn.nextInt();
            }
        } catch (NegativeArraySizeException e) {
            System.out.println("Error -An array can not be a negative. " + e.getMessage());
            // throw new WeAllLikeDoException("Error - An array can not be a negative. "+ e.getMessage(),1); - Тогда в сигнатуры методов надо довавить throws WeAllLikeDoException,
            // но вариант с болееприятным выводом, и продолжением программы более приемлимо.
        } catch (InputMismatchException e) {
            System.out.println("Error -An integer array can not contain any charettes. " + e.getMessage());
            //throw new WeAllLikeDoException("An integer array can not contain any charettes. " + e.getMessage(),2);
        } finally {
            System.out.println("Try again!!");
            start();
        }
        showIntArray(arrayInt);
    }

    public static void showIntArray(int[] arrayInt) {
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + "  ");
        }
        System.exit(0);
    }

}

