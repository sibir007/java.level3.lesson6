package ru.geekbrains.java.level3;

public class Task1 {
    public int[] met(int[] arr) {
        if (noFour(arr)){
            throw new RuntimeException();
        }
        int sizeFinalArray = fourthNumber(arr);
        if (sizeFinalArray == 0) {
            return new int[0];
        }
        int[] finalArray = new int[sizeFinalArray];
        int j = sizeFinalArray -1;
        for (int i = arr.length -1; i >= arr.length - sizeFinalArray; i--) {
            finalArray[j] = arr[i];
            j--;
        }
        return finalArray;
    }

    /**
     * принимает целочисленный массив
     * возвращает true если есть 4, false если нет
     * @param arr
     * @return
     */
    private boolean noFour(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 4) {
                return false;
            }
        }
        return true;
    }

    /**
     * принимает целочисленный массив
     * возвращает колличество элементав с конца массива до 4
     * @param arr
     * @return
     */
    private int fourthNumber(int[] arr) {
        int num = 0;
        for (int i = arr.length - 1; i >= 0; i--){
            if (arr[i] == 4) {
                break;
            }
            num++;
        }
        return num;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = {3, 5, 4, 4, 3, 3, 1};
        int[] arr3 = {1, 1, 1, 1, 3};
        int[] arr4 = {1, 2, 3, 4};
        int[] arr5 = {4, 2, 3, 1, 1, 1, 1};

        Task1 met = new Task1();
        arrPrint(met.met(arr1));
        arrPrint(met.met(arr2));
//        arrPrint(met.met(arr3));
        arrPrint(met.met(arr4));
        arrPrint(met.met(arr5));
    }
    private static void arrPrint(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
