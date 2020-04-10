import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        boolean b = scanner.nextBoolean();
        String s1 = String.valueOf(b);
        if (b) {
            if (a >= 15 && a <= 25) {
                System.out.println("true");

            } else {
                System.out.println("false");

            }
        }
        else{
            if (a >= 10 && a <= 20) {

                System.out.println("true");

            }
            else {
                System.out.println("false");
            }
        }
    }
}