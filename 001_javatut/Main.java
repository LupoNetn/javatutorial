import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Number: ");
        Scanner s = new Scanner(System.in);

        int num = s.nextByte();
        System.out.println(num);

        //implement fizzbuzz
        if (num % 5 == 0 && num % 3 == 0) {
            System.out.print("FizzBuzz");
        } else if(num % 5 == 0) {
            System.out.print("Fizz");
        } else if(num % 3 == 0) {
            System.out.print("Buzz");
        }

        s.close();

        int i = 5;
        while( i < 10) {
            System.out.print(i);
            i++;
        }


    }
}