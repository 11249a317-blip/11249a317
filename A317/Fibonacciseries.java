Aim:To write a Java program to generate and display the Fibonacci series up to n terms using a method.import java.util.Scanner;
Algorithm
1.Start the program.
2.Import the Scanner class.
3.Read the value of n from the user.
4.Call the Fibonacci(n) method.
5.If n = 0, print 0.
6.If n = 1, print 0 1.
7.Otherwise, initialize a = 0 and b = 1.
8.Print the first two Fibonacci numbers: 0 1.
9.Use a for loop to calculate the next terms:
nextnumber = a + b
Print nextnumber.
Set a = b and b = nextnumber.
10.Repeat until n terms are printed.
11.Stop.
     public class Fibonacciseries {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the value of n:");
         int n = sc.nextInt();
         Fibonacci(n);
}
public static void Fibonacci(int n){
    if (n == 0) {
        System.out.println("0");
    } else if (n == 1) {
        System.out.println("0 1");
    } else {
        System.out.println("0 1");
        int a = 0;
        int b = 1;
        for (int i = 1; i < n - 1; i++) {
          int nextnumber = a + b;
          System.out.print(nextnumber+ " ");
          a = b;
          b = nextnumber;
       }
    }
  }
}
Output
Sample Input:
Enter the value of n: 7
Sample Output:
0 1
1 2 3 5 8
So, the Fibonacci series for 7 terms is:
0 1 1 2 3 5 8
Result:Thus, the Java program to generate the Fibonacci series using a method was successfully executed.     
