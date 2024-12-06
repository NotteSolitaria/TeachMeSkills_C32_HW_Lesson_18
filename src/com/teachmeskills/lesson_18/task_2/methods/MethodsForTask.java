package com.teachmeskills.lesson_18.task_2.methods;

import java.util.List;
import java.util.Scanner;

public class MethodsForTask {
    public static void methodForChecking(List<String> inputList) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter letter for check: ");

        String letterForCheck = scanner.nextLine().toLowerCase();

        System.out.println(inputList.stream()
                .filter(i -> i.toLowerCase().startsWith(letterForCheck))
                .toList());
    }

    public static void methodForSorting(List<String> inputList) {

        System.out.println(inputList.stream()
                .sorted()
                .findFirst());
    }
}
