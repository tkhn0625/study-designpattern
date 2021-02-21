package separate.bridge;

import java.util.Random;

public class Main {
    public static void main(String[] args){

        Random r = new Random();
        final int[] array = new int[100];
            for(int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(1000);
        }
        Sort bubbleSort = new Sort(new BubbleSortAlgorithm(array));
        System.out.println(bubbleSort.getSortAlgorithm().getClass().getName());
        bubbleSort.print();
        bubbleSort.sort();
        bubbleSort.print();

        Sort shellSort = new Sort(new ShellSortAlgorithm(array));
        System.out.println(shellSort.getSortAlgorithm().getClass().getName());
        shellSort.print();
        shellSort.sort();
        shellSort.print();
    }
}
