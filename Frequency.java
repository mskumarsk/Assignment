import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        Frequency frequency = new Frequency();
        frequency.frequency();
    }

    private void frequency() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the value:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int[] fre = new int[size];
        for (int i = 0; i < arr.length; i++) {
            int cnt = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    fre[j] = -1;
                    cnt++;
                }
            }
            if (fre[i] != -1) {
                fre[i] = cnt;
            }
        }
        int[] val = new int[size];
        System.arraycopy(fre, 0, val, 0, val.length);
        Arrays.sort(val);
        int[] farr = new int[size];
        int c = 0;
        for (int k = val.length - 1; k >= 0; k--) {
            if (val[k] != 0 && val[k] != -1) {
                for (int l = 0; l < fre.length; l++) {
                    if (val[k] == fre[l]) {
                        for (int m = 0; m < fre[l]; m++) {
                            farr[c++] = arr[l];
                        }
                        fre[l] = 0;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(farr));
    }
}
