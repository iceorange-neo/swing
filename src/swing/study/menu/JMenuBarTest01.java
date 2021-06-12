package swing.study.menu;

import javax.swing.*;
import java.awt.*;

public class JMenuBarTest01 {

    public static void main(String[] args) {

        JFrame jf = new JFrame("JFrame");
        jf.setBounds(500, 500, 200, 100);
        jf.setVisible(true);
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JMenuBar bar = new JMenuBar();
        JMenu menu = new JMenu("菜单一");
        JMenuItem item1 = new JMenuItem("选项一");
        JMenuItem item2 = new JMenuItem("选项二");
        JMenuItem item3 = new JMenuItem("选项三");

        menu.add(item1);
        menu.add(item2);
        menu.add(item3);

        bar.add(menu);

        jf.add(bar);

    }

}
