/**
 * Java 1. Homework 3
 * @author Oleg
 * @version 24.01.21
 */
import java.until.Arrays;

class JavaHomework3
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        initialValue();
    }
    static void invertArray() {
        int[] arr = { 0, 1, 1, 0, 0, 1 };
        for (int i = 0; i < arr.length; i++){
            if (arr[i]=0) {
                arr[i]+1
            } else {
                arr[i]-1
            }
        System.out.println (Arrays.toString (arr))
    }
    static void fillArray() {
        int[] arr = new int[100];
        for (int i = 1; i < arr.length; i++) {
        System.out.println (Arrays.toString (arr));
    }
    static void changeArray() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *=2;
            }
        }
        System.out.println (Arrays.toString (arr));
    }
    static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - i -1] = 1;
        }
        System.out.println (Arrays.toString (arr[i]));
    }
    static void initialValue(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill (arr, initialValue);
        return arr;
    }