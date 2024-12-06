package com.teachmeskills.lesson_18.task_1.methods;

import java.util.List;

public class MethodsForTask {
    public static void removeDub(List<Integer> inputList) {

        System.out.println(inputList.stream()
                .distinct()
                .toList());
    }

    public static void displayInRange(List<Integer> inputList) {

        System.out.println(inputList.stream()
                .filter(i -> i > 6 && i < 18 && i % 2 == 0)
                .toList());
    }

    public static void multipleElem(List<Integer> inputList) {

        System.out.println(inputList.stream()
                .map(i -> i * 2)
                .toList());
    }

    public static void sortingElem(List<Integer> inputList) {

        System.out.println(inputList.stream()
                .sorted()
                .limit(4)
                .toList());
    }

    public static void outputSize(List<Integer> inputList) {

        System.out.println(inputList.size());
    }

    public static void avOfArray(List<Integer> inputList) {

        System.out.println(inputList.stream()
                .mapToInt(Integer::intValue)
                .average());
    }

}
