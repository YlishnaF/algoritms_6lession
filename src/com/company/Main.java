package com.company;

import java.util.Arrays;
import java.util.Random;
// 6.1 Древрвидная структура в царстве растений и животных
public class Main{
    public static void main(String[] args) {
        Tree tree = new Tree();
        long start = System.nanoTime();
        tree.insert(new Person("Gosha", 7,33));
        tree.insert(new Person("Masha", 3, 31));
        tree.insert(new Person("Dasha",4, 28));
        tree.insert(new Person("Rim", 9, 38));

        tree.max().display();
        tree.min().display();

        tree.find(9).display();
        tree.delete(7);
        tree.displayTree();

        System.out.println("Время выполнения методов " + (System.nanoTime() - start));

        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        long start1 = System.nanoTime();
        HeapSort hs = new HeapSort();
        hs.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Время сортировки кучи " + (System.nanoTime()-start1));
                


    }

}
