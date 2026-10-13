Aim:
To write a Java program to demonstrate thread creation and thread priorities using the Thread class.
Algorithm:
1.Start the program.
2.Create three classes, A, B, and C, by extending the Thread class.
3.Override the run() method in each class to display messages and numbers from 1 to 4.
4.Create three thread objects: threadA, threadB, and threadC.
5.Set the priority of threadC to Thread.MAX_PRIORITY (10).
6.Set the priority of threadB to one greater than the default priority of threadA (6).
7.Set the priority of threadA to Thread.MIN_PRIORITY (1).
8.Start all three threads using the start() method.
9.Display the end of the main thread.
10.Stop the program.
import java.io.*;
class A extends Thread
{
public void run()
{
System.out.println("Thread A started");
for(int i=1; i<=4;i++)
{
System.out.println("from thread A i="+i);
}
System.out.println("exit from A");
}
}
class B extends Thread
{
public void run()
{
System.out.println("Thread B started");
for(int j=1;j<=4;j++)
{
System.out.println("from thread B j="+j);
}
System.out.println("exit from B");
}
}
class C extends Thread
{
public void run()
{
System.out.println("thread C started");
for(int k=1;k<=4;k++)
{
System.out.println("thread c ="+k);
}
System.out.println("exit from c");
}
}
class ThreadPriority

{
public static void main(String[]args)
{
A threadA = new A();
B threadB = new B();
C threadC = new C();
threadC.setPriority(Thread.MAX_PRIORITY);
threadB.setPriority(threadA.getPriority()+1);
threadA.setPriority(Thread.MIN_PRIORITY);
System.out.println("start thread A");
threadA.start();
System.out.println("start thread B");
threadB.start();
System.out.println("start thread C");
threadC.start();
System.out.println("end of main thread");
}
}
Output:
start thread A
start thread B
Thread A started
start thread C
Thread B started
thread C started
from thread A i=1
from thread B j=1
thread c =1
from thread A i=2
from thread B j=2
thread c =2
from thread A i=3
from thread B j=3
thread c =3
from thread A i=4
from thread B j=4
thread c =4
exit from A
exit from B
exit from c
end of main thread
Result:
Thus, the Java program to demonstrate thread creation and thread priorities using the Thread class was executed successfully.
