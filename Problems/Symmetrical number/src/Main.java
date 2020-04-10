import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int temp;
        boolean answer = true;
        Random rand = new Random();

        // Generate random integers in range 0 to 999
        int rand_int1 = rand.nextInt(1000);

        while (number != 0) {

            temp = number % 10;
            number /= 10;

            if (temp != (number%10)) {
                answer = false;

            }
            else {
                answer = true;

            }

        }
        if(answer){
            System.out.println("1");
        }
        else{
            System.out.println(rand_int1);
        }


        // put your code here
    }
}