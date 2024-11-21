// package August.Aug-17;

public class ZerosAndOnes {
    public static void main(String[] arg) {
        int arr[] = {1, 0, 1, 1, 0, 0, 1, 1, 0, 1};
        System.out.print("Initial array: ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            if (arr[i] == 0 & arr[j] == 1) {
                int dum = arr[i];
                arr[i] = arr[j];
                arr[j] = dum;
                i += 1;
                j -= 1;
            } else if (arr[i] == 1 & arr[j] == 0) {
                i += 1;
                j -= 1;
            } else if (arr[i] == 1 & arr[j] == 1) {
                i += 1;
            }
        }
        System.out.println();
        System.out.print("Arranged array: ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }
}
