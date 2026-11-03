Aim:
To write a Java Applet program to demonstrate the BorderLayout manager by arranging buttons and a text area in five different regions: North, South, East, West and Center.
Algorithm:
1. Start the program.
2. Import the required AWT, Applet, IO and Util packages.
3. Create a class named insertdemo that extends the Applet class.
4. Define the init() method.
5. Set the background color to cyan.
6. Set the layout manager to BorderLayout.
7. Add buttons to the North, South, East and West regions.
8. Add a TextArea to the Center region.
9. Define the getInsets() method to provide a 10-pixel margin on all sides.
10. Display the applet using the BorderLayout manager.
11. Stop the program.
program:
import java.awt.*;
import java.applet.*;
import java.io.*;
import java.util.*;
/*
<applet code="insertdemo" width=400 height=200>
</applet>
*/
public class insertdemo extends Applet
{
    public void init()
    {
        setBackground(Color.cyan);
        setLayout(new BorderLayout());
        add(new Button("this is cross the top"), BorderLayout.NORTH);
        add(new Button("the footer messsage migth go here"), BorderLayout.SOUTH);
        add(new Button("RIGHT"), BorderLayout.EAST);
        add(new Button("LEFT"), BorderLayout.WEST);
        String msg = "the reasonable man adapts\n\n";
        add(new TextArea(msg), BorderLayout.CENTER);
    }

    public Insets getInsets()
    {
        return new Insets(10, 10, 10, 10);
    }
}
Output:









- North: Button – "this is cross the top"
- South: Button – "the footer messsage migth go here"
- East: Button – "RIGHT"
- West: Button – "LEFT"
- Center: TextArea containing "the reasonable man adapts"
Result:

Thus, the Java Applet program to demonstrate the BorderLayout manager was successfully executed and the components were arranged in five different regions.
