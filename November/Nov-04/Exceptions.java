import java.util.Scanner;

class Exceptions{
    public static void main(String[] args) {
        int n = 0;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a value: ");
            int x = 90;
            int y = sc.nextInt();
            try {
                int z = x / y;
                System.out.println(z);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        
            n++;
            if (n > 3) {
                sc.close();
                break;
            }
        }
        System.out.println("***********");
        
        try {
            
            int k = 45 / 0;
            // int s = "Alexa" * 45;
            System.out.println(k);
            // System.out.println(s);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}