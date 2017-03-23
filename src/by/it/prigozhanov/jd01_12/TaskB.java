package by.it.prigozhanov.jd01_12;

import java.util.*;
import java.util.regex.Pattern;

/**
 * Created by v-omf on 3/20/2017.
 *
 * @author v-omf
 */
public class TaskB {

    void runB1() {
        System.out.println("------------------------Задание В1 -------------------------------\n");
        String[] wordArr = Text.Description.split("[^a-zA-Z]+");
        Set<String> set = new HashSet<>();
        for (int i = 0; i < wordArr.length; i++) {
            set.add(wordArr[i]);
        }
        System.out.println(set);
        System.out.println();
    }


    void runB2() {
        System.out.println("------------------------Задание В2 -------------------------------\n");
        String[] wordArr = Text.Description.split("[^a-zA-Z]+");
        Map<String, Integer> map = new HashMap<>();
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        int counter = 1;
        for (int i = 0; i < wordArr.length; i++) {
            if (map.containsKey(wordArr[i])) {
                counter += map.get(wordArr[i]);
                map.put(wordArr[i], counter);
            } else map.put(wordArr[i], 1);
            counter=1;
        }
        System.out.println(map);
        System.out.println();
    }


    void processArray() {
        System.out.println("------------------------Задание В3 ArrayList -------------------------------\n");
        List<Integer> list = new ArrayList<>();
        int n = 100000;
        Date date = new Date();
        for (int i = 0; i < n; i++) {
            list.add(i + 1);
        }


        while (list.size() > 1) {
            Iterator<Integer> it = list.iterator();
            int a = 1;
            while (it.hasNext()) {
                it.next();
                if (a % 2 == 0) {
                    it.remove();
                }
                a++;
            }
        }
        Date newDate = new Date();
        long currentTime = newDate.getTime() - date.getTime();
        System.out.printf("ArrayList\nОбъектов добавлено: %d\nОбъектов удалено: %d\nВремени прошло: %d ms\n", n, n - 1, currentTime);
        System.out.println();
    }


    void processLinked() {
        System.out.println("------------------------Задание В1 LinkedList-------------------------------\n");
        List<Integer> list = new LinkedList<>();
        int n = 100000;
        Date date = new Date();
        for (int i = 0; i < n; i++) {
            list.add(i + 1);
        }


        while (list.size() > 1) {
            Iterator<Integer> it = list.iterator();
            int a = 1;
            while (it.hasNext()) {
                it.next();
                if (a % 2 == 0) {
                    it.remove();
                }
                a++;
            }
        }
        Date newDate = new Date();
        long currentTime = newDate.getTime() - date.getTime();
        System.out.printf("LinkedList\nОбъектов добавлено: %d\nОбъектов удалено: %d\nВремени прошло: %d ms\n", n, n - 1, currentTime);
        System.out.println();
    }
}
