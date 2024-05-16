import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//https://youtu.be/dfhmTyRTCSQ?si=qaupua4KuoFc_BSc 4:23
public class Calculator implements ActionListener {
    JFrame frame;
    JTextField textField;
    JButton[] numberButtons=new JButton[10];
    JButton[] functionButtons=new JButton[8];
    JButton addButton,sumButton,MultButton,divButton;
    JButton decButton,equalButton,delButton,clrButton;
    JPanel panel;

    Calculator() {
    }

    public static void main(String[] args) {
        Calculator calc=new Calculator();
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }


}