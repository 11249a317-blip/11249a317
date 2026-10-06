Aim:To write a Java program using packages to perform addition, subtraction, multiplication, and division of two numbers.
Algorithm:
1.Start the program.
2.Import the required packages: add, sub, mul, and div.
3.Create objects of the classes Add, Sub, Mul, and Div.
4.Call addop(20,10) to perform addition.
5.Call subop(20,10) to perform subtraction.
6.Call mulop(20,10) to perform multiplication.
7.Call divop(20,10) to perform division.
8.Display the results.
9.Stop the program.

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
output:
Addition = 30
Subtraction = 10
Multiplication = 200
Division = 2
Result:Thus, the Java program successfully performs addition, subtraction, multiplication, and division using packages.  
