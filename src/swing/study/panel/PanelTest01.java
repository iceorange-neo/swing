package swing.study.panel;

import javax.swing.*;
import java.awt.*;

public class PanelTest01 {

    public static void main(String[] args) {
        JFrame jf = new JFrame("JFrame");
        jf.setVisible(true);
        jf.setBounds(500, 500, 500, 500);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton jb1 = new JButton("按钮1");
        JButton jb2 = new JButton("按钮2");
        // 可以传递一个布局
        JPanel jp = new JPanel(new FlowLayout());
        jp.add(jb1);
        jp.add(jb2);
        jf.add(jp);
    }

}
