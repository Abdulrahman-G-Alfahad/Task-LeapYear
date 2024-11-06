import java.util.Scanner;

public class Main {

    public static String checkYear(int year){
        if(year%4==0){
            return "It is a Leap Year";
        } else {
            return "It is not a Leap Year";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the year you want to check:");
        int input = scanner.nextInt();
        System.out.println(checkYear(input));
        scanner.close();

    }
}