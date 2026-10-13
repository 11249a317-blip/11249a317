Aim:
To write a Java program to find the sum, largest number, and smallest number in a given array.
Algorithm:
1.Start the program.
2.Initialize an integer array with the given elements.
3.Initialize sum = 0, min = a[0], and max = a[0].
4.Traverse the array using a for loop.
5.If the current element is greater than max, update max.
6.If the current element is smaller than min, update min.
7.Add each array element to sum.
8.Display the sum, largest number, and smallest number.
9.Stop the program.
public class LargestSmallest
{
public static void main(String[] args)
{
int a[] = new int[] { 23, 34, 13, 64, 72, 90, 10, 15, 9, 27 };
int sum = 0;
int min = a[0];
int max = a[0];
for (int i = 1; i < a.length; i++)
{
if (a[i] > max)
{
max = a[i];
}
if (a[i] < min)
{
min = a[i];
}
sum = sum + a[i];
}
System.out.println("The sum is : " + sum);
System.out.println("Largest Number in a given array is : " + max);
System.out.println("Smallest Number in a given array is : " + min);
}
}
 Output:
The sum is : 357
Largest Number in a given array is : 90
Smallest Number in a given array is : 9
Result:Thus, the Java program to calculate the sum, largest number, and smallest number in a given array was executed successfully.
