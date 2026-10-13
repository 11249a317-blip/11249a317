Aim:
To write a Java program to accept the names and marks of six students and display the names and marks of students who scored 60 or above.
Algorithm:
1.Start the program.
2.Declare an integer array marks to store the marks of six students.
3.Declare a string array name to store the students' names.
4.Create a Scanner object to get input from the user.
5.Use a for loop to accept each student's name and marks.
6.Use another for loop to check whether each student's marks are greater than or equal to 60.
7.If the marks are 60 or above, display the student's name and marks.
8.Stop the program.
import java.util.Scanner;
public class MarksAbvsixty
{
public static void main(String args[])
{
int marks[] = new int[6];
int i;
String name[] = new String[30];
Scanner scanner = new Scanner(System.in);

for(i=0; i<6; i++) {
System.out.print("Enter Name of Student and Marks of Subject"+(i+1)+":");
name[i] = scanner.next();
marks[i] = scanner.nextInt();
}
for(i=0; i<6;i++) {
if(marks[i]>=60)
{
System.out.println(name[i] + " " + marks[i]);
}
}
}
}
Output:
Enter Name of Student and Marks of Subject1: Arun 85
Enter Name of Student and Marks of Subject2: Priya 55
Enter Name of Student and Marks of Subject3: Ravi 72
Enter Name of Student and Marks of Subject4: Divya 48
Enter Name of Student and Marks of Subject5: Kiran 90
Enter Name of Student and Marks of Subject6: Meena 60
Arun 85
Ravi 72
Kiran 90
Meena 60
Result:
Thus, the Java program to display the names and marks of students who scored 60 or above was executed successfully.
