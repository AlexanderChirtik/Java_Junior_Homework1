package org.example.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AverageEvenNumbers {

    public static void main(String[] args) {

        List<Integer> list = generateList();
        printList(list);
        double average = list.stream().filter(value -> value % 2 == 0).mapToInt(value -> value).average().orElse(0);
        System.out.println(average);
    }

    public static List<Integer> generateList() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < random.nextInt(5,15); i++) {
            int value = random.nextInt(100);
            list.add(value);
        }
        return list;
    }

    public static void printList(List<Integer> list) {
        for (Integer var:list) {
            System.out.print(var + " ");
        }
        System.out.println();
    }
}
