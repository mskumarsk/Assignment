package sorting;

import java.util.LinkedList;
import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        Order order = new Order();
        order.order();
    }

    private void order() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the value:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        LinkedList<Integer> linkedList = new LinkedList<>();
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 7) {
                cnt++;
            } else {
                linkedList.add(arr[i]);
            }
        }
        for (int j = 0; j < cnt; j++) {
            linkedList.add(7);
        }
        System.out.println(linkedList);
    }
}
