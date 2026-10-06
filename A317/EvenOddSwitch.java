Aim:To write a Java program to check whether a given number is even or odd using a switch statement.import java.util.*;
Algorithm
1.Start the program.
2.Import the Scanner class.
3.Declare an integer variable n.
4.Read the number from the user.
5.Calculate n % 2.
6.Use a switch statement:
7.If the remainder is 0, display "This number is even".
8.If the remainder is 1, display "This number is odd".
9.Stop the program.
  class EvenOddSwitch
{
public static void main(String args[])
{
int n,i;
Scanner s = new Scanner(System.in);
n = s.nextInt();
switch(n%2)
{
case 0 :
System.out.println("This number is even");
break;
case 1 :
System.out.println("This number is odd");
break;
}
}
}
Output

Example 1:

Enter a number:
10
This number is even

Example 2:

Enter a number:
7
This number is odd
  Result:Thus, the Java program successfully checks whether the given number is even or odd using a switch statement.
