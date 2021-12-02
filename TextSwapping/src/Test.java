import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
class GUI implements ActionListener
{
    JFrame f;
    JButton button;
    JTextField text1,text2;
    String temp;
public void actionPerformed(ActionEvent ae)
{
    temp = text1.getText();
    text1.setText(text2.getText());
    text2.setText(temp);
}
    public GUI()
    {
        f = new JFrame();
        button = new JButton("Swap Text");
        text1 = new JTextField("This is first text field");
        text2 = new JTextField("This is second text field");
        
        f.setLayout(new FlowLayout());
        f.add(text1);
        f.add(button);
        f.add(text2);
        
        f.setVisible(true);
        f.setSize(200,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.addActionListener(this);
    }
}
public class Test {

    public static void main(String[] args) 
    {
        new GUI();
    }
    
}
