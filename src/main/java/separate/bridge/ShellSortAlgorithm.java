package separate.bridge;

public class ShellSortAlgorithm extends SortAlgorithmImpl{
    int[] array;
    public ShellSortAlgorithm(int[] tempArray){
        this.array = tempArray;
    }

    @Override
    public void rawSort() {
        int h = array.length / 2;

        while(h > 0){
            for(int i=h; i < array.length; i++){
                int j = i;
                while(j >= h && array[j - h] > array[j]){
                    int tmp = array[j];
                    array[j] = array[j-h];
                    array[j-h] = tmp;
                    j --;
                }
            }
            h /= 2;
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
