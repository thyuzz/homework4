package org.example.task1;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Вывести список на экран в перевернутом виде (без массивов и ArrayList)
 * Пример:
 * 1->2->3->4
 * Вывод:
 * 4->3->2->1
 */
public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        LinkedList<Integer> reverseList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            linkedList.add(i);
        }
        scanner.close();
        System.out.println("Вводимая строка: " + linkedList);
        for (int i = 1; i < n; i++) {
            reverseList.addFirst(linkedList.pop());
        }
        System.out.println("Выводимая строка: " + reverseList);
    }
}
