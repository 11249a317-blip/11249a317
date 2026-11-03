Aim:
To write a Java Applet program to demonstrate the CardLayout manager and display different buttons one at a time when clicked.
Algorithm:
1. Start the program.
2. Import the required packages such as java.io, java.awt, java.applet and java.awt.event.
3. Create an applet class named carddemo that implements ActionListener.
4. Declare four button variables, a Panel and a CardLayout object.
5. Create a Panel in the init() method.
6. Set the layout of the Panel to CardLayout.
7. Create three buttons and add them to the Panel with different card names.
8. Register ActionListener for each button.
9. Define the actionPerformed() method.
10. Use buttonCardLayout.next(buttonPanel) to display the next button whenever a button is clicked.
11. Stop the program.
program:
import java.io.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="carddemo" width=250 height=150>
</applet>
*/

public class carddemo extends Applet implements ActionListener
{
    Button b1,b2,b3,b4;
    Panel buttonPanel;
    CardLayout buttonCardLayout;
    public void init()
    {
        buttonPanel = new Panel();
        add(buttonPanel);
        buttonCardLayout = new CardLayout();
        buttonPanel.setLayout(buttonCardLayout);
        b1 = new Button("first Button");
        b1.addActionListener(this);
        buttonPanel.add(b1,"first Button");
        b2 = new Button("second Button");
        b2.addActionListener(this);
        buttonPanel.add(b2,"second Button");
        b3 = new Button("third button");
        b3.addActionListener(this);
        buttonPanel.add(b3,"third Button");
    }
    public void actionPerformed(ActionEvent e)
    {
        buttonCardLayout.next(buttonPanel);
    }
}
Output:
Initially, the applet displays:
[first Button]
[second Button]
[third button]
Result:
Thus, the Java Applet program to demonstrate the CardLayout manager was executed successfully.
