package com.teachmeskills.lesson_18.task_2;

import com.teachmeskills.lesson_18.task_2.arrayfortask.Students;
import com.teachmeskills.lesson_18.task_2.methods.MethodsForTask;

/**
 * Create an ArrayList class collection with the values of the names of all students in the group
 * Using Streams:
 * - Select all names that start with any letter entered from the console (regardless of upper/lower case)
 * - Sort and return the first element of the collection.
 */

public class ApplicationRunner {
    public static void main(String[] args) {

        MethodsForTask.methodForChecking(Students.listOfStudents());

        MethodsForTask.methodForSorting(Students.listOfStudents());

    }
}
