Aim:To write a Java program to find the largest among three integers entered by the user.

Algorithm:
1.Start the program.
2.Declare three integer variables x, y, and z.
3.Read three integers from the user.
4.Check whether x is greater than both y and z.
5.If true, display that the first number is the largest.
6.Otherwise, check whether y is greater than both x and z.
7.If true, display that the second number is the largest.
8.Otherwise, check whether z is greater than both x and y.
9.If true, display that the third number is the largest.
10.If none of the conditions is true, display that the numbers are not distinct.
11.Stop the program.import java.util.Scanner;
class LargestOfThreeNumbers
public static void main(String args[])
{
int x, y, z;
System.out.println("Enter three integers");
{
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
Example 1:
text
Enter three integers
10
20
15
Second number is largest.
Example 2:
text
Enter three integers
30
20
10
First number is largest.
Example 3:
text
Enter three integers
10
20
30
Third number is largest.
Example 4:
text
Enter three integers
10
10
20
The numbers are not distinct.  
Result:Thus, the Java program to find the largest among three integers was written and executed successfully.
  
