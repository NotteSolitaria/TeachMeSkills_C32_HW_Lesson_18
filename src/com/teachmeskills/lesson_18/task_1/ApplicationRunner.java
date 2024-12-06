package com.teachmeskills.lesson_18.task_1;

import com.teachmeskills.lesson_18.task_1.arrayfortask.ArrayForTask;
import com.teachmeskills.lesson_18.task_1.methods.MethodsForTask;

/**
 * Create a collection of the ArrayList class and fill it with random elements of the Integer type.
 * Using Streams:
 * - Remove duplicates
 * - Display all even elements in the range from 7 to 17 (inclusive)
 * - Multiply each element by 2
 * - Sort and display the first 4 elements
 * - Display the number of elements in the stream
 * - Display the arithmetic mean of all numbers in the stream
 */

public class ApplicationRunner {
    public static void main(String[] args) {

        MethodsForTask.removeDub(ArrayForTask.integerList());
        MethodsForTask.displayInRange(ArrayForTask.integerList());
        MethodsForTask.multipleElem(ArrayForTask.integerList());
        MethodsForTask.sortingElem(ArrayForTask.integerList());
        MethodsForTask.outputSize(ArrayForTask.integerList());
        MethodsForTask.avOfArray(ArrayForTask.integerList());
    }
}
