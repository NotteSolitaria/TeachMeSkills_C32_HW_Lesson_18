package com.teachmeskills.lesson_18.task_1.arrayfortask;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayForTask {
    public static List<Integer> integerList() {

        List<Integer> integerList = new ArrayList<>();

        Random random = new Random();

        int sizeOfArray = random.nextInt(1, 20);

        for (int i = 0; i < sizeOfArray; i++) {
            integerList.add(random.nextInt(1, 10));
        }

        return integerList;
    }
}
