Aim:
To write a Java program using a user-defined package div to perform division of two integers and display the result.
Algorithm:
1. Start the program.
2. Declare a package named div and define the class Div.
3. Declare an integer variable res to store the result.
4. Define the method divop(int a, int b) to accept two integers.
5. Divide the first integer by the second integer and store the result in res.
6. Display the division result.
7. Stop the program.
 program:
package div;
public class Div
{
int res;
public void divop(int a,int b)
{
res = a /b;
System.out.println("Div :"+res);
}
}
Output:
Div :2
Result:
Thus, the Java program to perform division using a user-defined package was executed successfully. The division of 20 by 10 gives 2.
