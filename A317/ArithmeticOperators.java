Aim:To write a Java program to perform arithmetic operations such as addition, subtraction, multiplication, division, and modulus using a menu-driven program.import java.util.Scanner;
Algorithm
1.Start the program.
2.Create a Scanner object to read input from the user.
3.Read two integer numbers x and y.
4.Display the menu of arithmetic operations:
1 – Addition
2 – Subtraction
3 – Multiplication
4 – Division
5 – Modulus
6 – Exit
5.Read the user's choice n.
6.Use a switch statement to perform the selected operation:
If n = 1, calculate x + y.
If n = 2, calculate x - y.
If n = 3, calculate x * y.
If n = 4, calculate x / y.
If n = 5, calculate x % y.
If n = 6, terminate the program.
7.Display the result.
8.Repeat the process until the user chooses Exit.
9.Stop
  public class ArithmeticOperators
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
while(true)
{
System.out.println("");
System.out.println("Enter the two numbers to perform operations ");
System.out.print("Enter the first number : ");
int x = s.nextInt();
System.out.print("Enter the second number : ");
int y = s.nextInt();
System.out.println("Choose the operation you want to perform ");
System.out.println("Choose 1 for ADDITION");
System.out.println("Choose 2 for SUBTRACTION");
System.out.println("Choose 3 for MULTIPLICATION");
System.out.println("Choose 4 for DIVISION");
System.out.println("Choose 5 for MODULUS");
System.out.println("Choose 6 for EXIT");
int n = s.nextInt();
switch(n)
{
case 1:
int add;
add = x + y;
System.out.println("Result : "+add);
break;
case 2:
int sub;
sub = x - y;
System.out.println("Result : "+sub);
break;
case 3:
int mul;
mul = x * y;
System.out.println("Result : "+mul);
break;

case 4:
float div;
div = (float) x / y;
System.out.print("Result : "+div);
break;
case 5:
int mod;
mod = x % y;
System.out.println("Result : "+mod);
break;
case 6:
System.exit(0);
}
}
}
}
Enter the two numbers to perform operations
Enter the first number : 20
Enter the second number : 10

Choose the operation you want to perform
Choose 1 for ADDITION
Choose 2 for SUBTRACTION
Choose 3 for MULTIPLICATION
Choose 4 for DIVISION
Choose 5 for MODULUS
Choose 6 for EXIT

1
Result : 30

Enter the two numbers to perform operations
Enter the first number : 20
Enter the second number : 10

Choose the operation you want to perform
Choose 1 for ADDITION
Choose 2 for SUBTRACTION
Choose 3 for MULTIPLICATION
Choose 4 for DIVISION
Choose 5 for MODULUS
Choose 6 for EXIT

2
Result : 10

Enter the two numbers to perform operations
Enter the first number : 20
Enter the second number : 10

Choose the operation you want to perform
Choose 1 for ADDITION
Choose 2 for SUBTRACTION
Choose 3 for MULTIPLICATION
Choose 4 for DIVISION
Choose 5 for MODULUS
Choose 6 for EXIT

3
Result : 200
  | Operation      | Input  | Result |
| -------------- | ------ | -----: |
| Addition       | 20, 10 |     30 |
| Subtraction    | 20, 10 |     10 |
| Multiplication | 20, 10 |    200 |
| Division       | 20, 10 |    2.0 |
| Modulus        | 20, 10 |      0 |
