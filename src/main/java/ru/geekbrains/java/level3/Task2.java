package ru.geekbrains.java.level3;

public class Task2 {
    public boolean met(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1) {
                if (arr[i] != 4)
                    return false;
            }
        }
        int countOne = 0;
        int countFour = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                countOne++;
            } else {
                countFour++;
            }
        }
        if (countOne != countFour) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Task2 task2 = new Task2();

        int[] arr1 = {1, 4, 1, 4, 1, 4, 1};
        int[] arr2 = {1, 4, 1, 4, 1, 4, 1, 4};
        int[] arr3 = {1, 1, 1, 4, 4, 4};
        int[] arr4 = {1, 4, 1, 4, 1, 4, 3};

        System.out.println(task2.met(arr1));
        System.out.println(task2.met(arr2));
        System.out.println(task2.met(arr3));
        System.out.println(task2.met(arr4));
    }
}
