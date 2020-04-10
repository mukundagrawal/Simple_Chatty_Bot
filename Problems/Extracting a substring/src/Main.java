import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int a=sc.nextInt();
        int b=sc.nextInt();
        String s1=s.substring(a,b+1);
        System.out.println(s1);
    }
}