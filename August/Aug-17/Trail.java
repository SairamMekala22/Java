public class Trail {
    public static void main(String[] arg) {
        int s[] = new int[10];

        System.out.print("S = ");
        int k[] = {1, 2, 3 ,4, 5, 6, 7, 8, 9, 10};
        System.out.print("Sum of two arrays: ");
        for (int i = 0; i < s.length; i++) {
            s[i] = 3;

            s[i] = s[i] + k[i];

            System.out.print(s[i] + " ");
        }
        System.out.println();
        
    }
}
