AIM:To write a Java program to check whether a given number is an Armstrong number or not.import java.util.Scanner;
ALGORITHM
1.Start the program.
2.Read a number from the user.
3.Store the original number in another variable.
4.Find the number of digits in the given number.
5.Extract each digit using num % 10.
6.Raise each digit to the power of the number of digits and add it to sum.
7.Remove the last digit using num / 10.
8.Repeat steps 5–7 until the number becomes 0.
9.Compare sum with the original number.
10.If both are equal, display "Armstrong number"; otherwise, display "not an Armstrong number".
11.Stop the program.
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num = num / 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }
    }
}
Sample Output 1
Enter a number: 153
153 is an Armstrong number
    Sample Output 2
Enter a number: 123
123 is not an Armstrong number
RESULT:Thus, the Java program to check whether a given number is an Armstrong number or not was successfully executed.    
