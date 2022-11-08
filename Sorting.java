package sorting;

import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        sorting.sorting();
    }

    private void sorting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value:");
        String val = scanner.nextLine();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < val.length(); i++) {
            if (hashMap.containsKey(val.charAt(i))) {
                hashMap.put(val.charAt(i), hashMap.get(val.charAt(i)) + 1);
            } else {
                hashMap.put(val.charAt(i), 1);
            }
        }
        System.out.println(hashMap);
        Set<Map.Entry<Character, Integer>> set = hashMap.entrySet();
        String str = "";
        for (Map.Entry<Character, Integer> map : set) {
            if (map.getValue() != 1) {
                str += map.getKey() + "" + map.getValue();
            } else {
                str += map.getKey();
            }
        }
        System.out.println(str);
    }
}
