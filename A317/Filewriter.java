Aim:To write a Java program using FileWriter to write the uppercase English alphabets A to Z into a file named sample2.txt.import java.io.*;
Algorithm
1.Start the program.
2.Create a FileWriter object for sample2.txt.
3.Initialize the character value i with ASCII value 65 (A).
4.Repeat the loop while i < 91.
5.Write each character into the file using fw.write(i).
6.Increment i by 1.
7.Close the file using fw.close().
8.If an exception occurs, display the exception message.
9.Stop the program.
class Filewriter
{
public static void main(String[]args)
{
try
{
FileWriter fw= new
FileWriter("sample2.txt"); 
for(char i=65;i<91;i++)
{
fw.write(i);
}
fw.close();
}
catch(Exception e)
{
System.out.println("Exception :"+e);
}
}
}
Output:
The program does not display the alphabets on the console. It writes them into sample2.txt.
Content of sample2.txt:
ABCDEFGHIJKLMNOPQRSTUVWXYZ
Result:Thus, the Java program successfully writes the uppercase alphabets A to Z into the file sample2.txt using FileWriter.
