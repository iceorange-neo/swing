package swing.study.test;

import java.util.*;

/**
 * @author neo
 * @date 2021/6/14 11:45
 */
public class WordsMain {
    public static void main(String[] args) {
        String text = "Good morning. Have a good class. " + "Have a good visit. Have fun!";
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        String[] words = text.split("[ \n\t\r.,;:!?(){}]");
        for (int i = 0; i < words.length; i++) {
            String key = words[i].toLowerCase();
            if (words[i].length() > 1) {
                // 没有这样的单词
                if (map.get(key) == null) {
                    map.put(key, 1);
                } else {
                    int value = map.get(key).intValue();
                    value++;
                    map.put(key, value);
                }
            }
        }
            /*
                map.entrySet()得到的是一个映射关系的set集合  key-value
             */
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());//将map.entrySet()转换成list

        Collections.sort(list, (o1, o2) -> o1.getValue() - o2.getValue());

        for(Map.Entry<String, Integer> sortMap : list){
            System.out.println(sortMap.getKey() + ":" + sortMap.getValue());
        }

    }

}
