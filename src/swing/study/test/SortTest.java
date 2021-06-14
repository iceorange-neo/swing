package swing.study.test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author neo
 * @date 2021/6/14 11:34
 */
public class SortTest {
    public static void main(String[] args) {
        String[] animals = {"dog", "tiger", "cat"};
        System.out.println("初始顺序：" + Arrays.toString(animals));

        Arrays.sort(animals, (str1, str2) -> (-str1.compareTo(str2)));

        System.out.println("排序后的结果：" + Arrays.toString(animals));

    }
}
