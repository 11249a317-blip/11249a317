Aim:
To write a Java program to check whether a given year is a leap year or not.

Algorithm:
1.Start the program.
2.Import the Scanner class.
3.Create a Scanner object to get the year as input from the user.
4.Check whether the year is divisible by 400. If yes, it is a leap year.
5.Otherwise, check whether the year is divisible by 100. If yes, it is not a leap year.
6.Otherwise, check whether the year is divisible by 4. If yes, it is a leap year.
7.If none of these conditions is satisfied, it is not a leap year.
8.Display the result.
9.Stop the program.
import java.util.Scanner;
public class LeapYear
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
System.out.print("Enter any year:");
int year = s.nextInt();
boolean flag = false;
if(year % 400 == 0)
{
flag = true;
}
else if (year % 100 == 0)
{
flag = false;
}
else if(year % 4 == 0)
{
flag = true;
}
else
{
flag = false;
}
if(flag)
{
System.out.println("Year "+year+" is a Leap Year");
}
else
{
System.out.println("Year "+year+" is not a Leap Year");
}
}
}
Output:
Sample Output 1:
Enter any year: 2024
Year 2024 is a Leap Year
Sample Output 2:
text
Enter any year: 2023
Year 2023 is not a Leap Year
Result:
Thus, the Java program to check whether a given year is a leap year or not was executed successfully.
