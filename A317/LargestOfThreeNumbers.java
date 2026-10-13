
Aim:To write a Java program to find the largest of three integers.
Algorithm:
1.Start the program.
2.Declare three integer variables x, y, and z.
3.Read three integers from the user.
4.If x > y and x > z, print that the first number is largest.
5.Otherwise, if y > x and y > z, print that the second number is largest.
6.Otherwise, if z > x and z > y, print that the third number is largest.
7.Otherwise, print that the numbers are not distinct.
8.Stop the program.
import java.util.Scanner;
class LargestOfThreeNumbers
{
public static void main(String args[])
{
int x, y, z;
System.out.println("Enter three integers");
Scanner in = new Scanner(System.in);
x = in.nextInt();
y = in.nextInt();
z = in.nextInt();
if (x > y && x > z)
System.out.println("First number islargest.");
else if (y > x && y > z)
System.out.println("Second number islargest.");
else if (z > x && z > y)
System.out.println("Third number islargest.");
else
System.out.println("The numbers are not distinct.");
}
}
Output:
Enter three integers
10
20
30
Third number islargest.
 Result
Thus, the Java program to find the largest of three integers was executed successfully. 
