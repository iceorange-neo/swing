package swing.study.button;

import javax.swing.*;
import java.awt.*;

public class JButtonTest01 {

    public static void main(String[] args){

        JFrame jf = new JFrame("JFrame");
        jf.setBounds(600, 600, 500, 500);
        jf.setLayout(new FlowLayout());
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton jb = new JButton("按钮");
        // 按钮是否可用
        jb.setEnabled(true);
        // 设置边界
        jb.setBorderPainted(true);
        jf.add(jb);


    }

}
