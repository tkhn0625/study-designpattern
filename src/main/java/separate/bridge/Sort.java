package separate.bridge;

import lombok.Getter;

public class Sort {
    @Getter
    private final SortAlgorithmImpl sortAlgorithm;

    public Sort(SortAlgorithmImpl impl){
        this.sortAlgorithm= impl;
    }

    public void sort(){sortAlgorithm.rawSort();}

    public void print(){
        sortAlgorithm.rawPrint();
    }
}
