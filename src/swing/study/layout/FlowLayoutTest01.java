package swing.study.layout;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutTest01 {

    public static void main(String[] args){

        JFrame jf = new JFrame("布局测试");
        jf.setLayout(new FlowLayout(FlowLayout.LEFT));
        jf.setBounds(400, 300, 400, 200);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton jb1 = new JButton("A");
        JButton jb2 = new JButton("B");
        JButton jb3 = new JButton("C");
        JButton jb4 = new JButton("D");
        JButton jb5 = new JButton("E");

        jf.add(jb1);
        jf.add(jb2);
        jf.add(jb3);
        jf.add(jb4);
        jf.add(jb5);

    }

}
