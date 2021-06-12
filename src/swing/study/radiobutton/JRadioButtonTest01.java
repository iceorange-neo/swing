package swing.study.radiobutton;

import javax.swing.*;
import java.awt.*;

public class JRadioButtonTest01 {

    public static void main(String[] args){

        JFrame jf = new JFrame("JFrame");
        jf.setBounds(500, 500, 500, 500);
        jf.setVisible(true);
        jf.setLayout(new FlowLayout()); // 流布局
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JRadioButton jdb1 = new JRadioButton("男");
        JRadioButton jdb2 = new JRadioButton("女");
        ButtonGroup gender = new ButtonGroup();
        gender.add(jdb1);
        gender.add(jdb2);

        jf.add(jdb1);
        jf.add(jdb2);
    }
}
