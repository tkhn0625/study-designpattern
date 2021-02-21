package iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("赤","黄","青"));
        Iterator<String> listIterator = list.iterator();

        String a;
        while (listIterator.hasNext()) {
            a = listIterator.next();
            System.out.println(a); //赤 黄 青
        }

        List<String> array = new ArrayList<>(Arrays.asList("赤","黄","青"));
        Iterator<String> arrayIterator = array.iterator();
    }
}
