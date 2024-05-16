import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//https://youtu.be/dfhmTyRTCSQ?si=qaupua4KuoFc_BSc 4:23
public class Calculator implements ActionListener {
    JFrame frame;
    JTextField textField;
    JButton[] numberButtons=new JButton[10];
    JButton[] functionButtons=new JButton[8];
    JButton addButton,subButton,mulButton,divButton;
    JButton decButton,equButton,delButton,clrButton;
    JPanel panel;
    Font myFont=new Font("Ink Free", Font.BOLD,30);
    double num1=0,num2=0,result=0;
    char operator;


    Calculator() {
        frame=new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,550);
        frame.setLayout(null);
        textField=new JTextField();
        textField.setBounds(50,25,300,50);
        textField.setFont(myFont);

        addButton=new JButton("+");
        subButton=new JButton("-");
        mulButton=new JButton("*");
        divButton=new JButton("/");
        decButton=new JButton(".");
        equButton=new JButton("=");
        delButton=new JButton("Delete");
        clrButton=new JButton("CLR");

        functionButtons[0]=addButton;
        functionButtons[1]=subButton;
        functionButtons[3]=mulButton;
        functionButtons[4]=divButton;
        functionButtons[5]=decButton;
        functionButtons[6]=equButton;
        functionButtons[7]=clrButton;

        for(int i=0;i<8;i++)
        {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
        }
        for(int i=0;i<10;i++)
        {
           numberButtons[i]=new JButton(String.valueOf(i));
           numberButtons[i].addActionListener(this);
           numberButtons[i].setFont(myFont);
           numberButtons[i].setFocusable(false);
        }
        delButton.setBounds(50,430,145,50);
        clrButton.setBounds(205,430,145,50);
        frame.add(delButton);
        frame.add(clrButton);





        frame.add(textField);
        textField.setEditable(false);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Calculator calc=new Calculator();
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }


}