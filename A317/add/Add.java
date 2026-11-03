Aim:
To write a Java program that performs arithmetic operations such as addition, subtraction, multiplication, and division using separate packages.
Algorithm:
1. Start the program.
2. Import the required packages: add, sub, mul, and div.
3. Create objects of the classes Add, Sub, Mul, and Div.
4. Call the addop() method to perform addition of 20 and 10.
5. Call the subop() method to perform subtraction of 20 and 10.
6. Call the mulop() method to perform multiplication of 20 and 10.
7. Call the divop() method to perform division of 20 and 10.
8. Display the results of all four operations.
9. Stop the program.
  program:
import java.util.*;
import add.*;
import sub.*;
import mul.*;
import div.*;
public class ArithDemo
{
public static void main(String args[])
{
Add ad = new Add();
Sub su = new Sub();
Mul mu = new Mul();
Div di = new Div();
ad.addop(20,10);
su.subop(20,10);
mu.mulop(20,10);
di.divop(20,10);
}
}
Output:
Addition: 30
Subtraction: 10
Multiplication: 200
Division: 2
  Result
Thus, the Java program was successfully executed to perform arithmetic operations using separate packages and display their results.
