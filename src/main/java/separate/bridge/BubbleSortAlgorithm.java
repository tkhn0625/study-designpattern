package separate.bridge;

public class BubbleSortAlgorithm extends SortAlgorithmImpl {
    int[] array;

    public BubbleSortAlgorithm(int[] tempArray){
        this.array = tempArray;
    }

    @Override
    public void rawSort() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    // 入れ替え
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    @Override
    public void rawPrint() {
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                System.out.print(" ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
