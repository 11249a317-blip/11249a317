Aim:To write a Java program to read and display the contents of a text file using the FileReader class.import java.io.*;
Algorithm
1.Start the program.
2.Create a FileReader object for the file sample2.txt.
3.Read the file character by character using the read() method.
4.Continue reading until read() returns -1, indicating the end of the file.
5.Display each character on the screen.
6.Close the file using the close() method.
7.Handle any exceptions using the catch block.
8.Stop the program.
class Filereader
{
public static void main(String[] args)
{

try
{
FileReader fr=new
FileReader("sample2.txt"); int i;
while((i=fr.read())!=-1)
{
System.out.println((char)i);
}
fr.close();
}
catch(Exception e)
{
System.out.println("Exception:"+e);
}
}
}
Sample Output:
Welcome to Java
File Handling Program
The output will be:
W
e
l
c
o
m
e
 
t
o
 
J
a
v
a

F
i
l
e
 
H
a
n
d
l
i
n
g
 
P
r
o
g
r
a
m  
Result:Thus, the Java program successfully reads and displays the contents of sample2.txt character by character using FileReader.  
