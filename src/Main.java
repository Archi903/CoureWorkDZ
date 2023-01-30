import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите текст");
        Scanner key = new Scanner(System.in);
        String words = key.nextLine();
        String[] list = words.split(" ");
        Map<String, Integer> unique = new TreeMap<>();
        for (String word : list) {
            if (!unique.containsKey(word)) {
                unique.put(word, 1);
            } else {
                unique.put(word, unique.get(word) + 1);
            }
        }
        System.out.println("В тексте " + unique.size() + " слов \nТоп 10:" );
        List<Map.Entry<String, Integer>> last = unique.entrySet().stream().sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue())).collect(Collectors.toList());
        for (Map.Entry<String, Integer> stringIntegerEntry : last) {
            System.out.println(stringIntegerEntry);
        }
    }
    }
