import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();

        if(a%2==0){
            a=a/2;
        }
        else{
            a=(a+1)/2;
        }
        if(b%2==0){
            b=b/2;
        }
        else{
            b=(b+1)/2;
        }
        if(c%2==0){
            c=c/2;
        }
        else{
            c=(c+1)/2;
        }
        int d=a+b+c;

         
        
    }
}
