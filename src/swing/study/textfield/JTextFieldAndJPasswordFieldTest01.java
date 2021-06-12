package swing.study.textfield;

import javax.swing.*;
import java.awt.*;

public class JTextFieldAndJPasswordFieldTest01 {

    public static void main(String[] args){

        JFrame jf = new JFrame("JFrame");
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLayout(new FlowLayout(FlowLayout.LEFT));
        jf.setBounds(500, 500, 500, 500);
        jf.setVisible(true);

        JLabel username = new JLabel("账号：");
        JLabel password = new JLabel("密码：");
        jf.add(username);

        JTextField jtfUsername = new JTextField(" ", 10);
        JPasswordField jftPassword = new JPasswordField(10);
        jftPassword.setEchoChar('*');
        jf.add(jtfUsername);
        jf.add(password);
        jf.add(jftPassword);

    }

}
