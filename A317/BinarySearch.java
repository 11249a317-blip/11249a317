Aim:To write a Java program to search for an element in an array using the Binary Search technique.import java.util.Scanner;
Algorithm
1.Start.
2.Read the number of elements n.
3.Read the elements of the array.
4.Read the element x to be searched.
5.Set first = 0 and last = n - 1.
6.Repeat while first <= last:
7.Calculate mid = (first + last) / 2.
8.If a[mid] > x, set last = mid - 1.
9.If a[mid] < x, set first = mid + 1.
10.Otherwise, the element is found. Set flag = 1 and stop searching.
11.If flag == 0, display "element not found".
12.Otherwise, display "element found".
13.Stop.
class BinarySearch
{
public static void main(String ar[])
{ int i,mid,first,last,x,n,flag=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of elements:");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter elements of array:");
for(i=0;i<n;++i)
a[i]=sc.nextInt();
System.out.println("Enter element to search:");
x=sc.nextInt();
first=0;
last=n-1;
while(first<=last)
{
mid=(first+last)/2;
if(a[mid]>x)
last=mid-1;
else
if(a[mid]<x)
first=mid+1;
else
{
flag=1;
System.out.println("element found");
break;
}
}

if(flag==0)
System.out.println("element notfound");
}
}
Sample Output

Input:

Enter number of elements:
5
Enter elements of array:
10 20 30 40 50
Enter element to search:
30
Output:
element found 
  Another Output

If the searched element is 25:

Enter number of elements:
5
Enter elements of array:
10 20 30 40 50
Enter element to search:
25
element notfound
  Result:Thus, the Java program to search an element in an array using Binary Search was executed successfully.
