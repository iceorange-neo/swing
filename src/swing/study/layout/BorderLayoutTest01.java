package swing.study.layout;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutTest01 {

    public static void main(String[] args) {

        JFrame jf = new JFrame("边界布局");
        jf.setLayout(new BorderLayout());
        jf.setVisible(true);
        jf.setBounds(400, 300, 200, 100);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton jd1 = new JButton("北部");
        JButton jd2 = new JButton("东部");
        JButton jd3 = new JButton("南部");
        JButton jd4 = new JButton("西部");
        JButton jd5 = new JButton("中部");

        jf.add(jd1, BorderLayout.NORTH);
        jf.add(jd2, BorderLayout.EAST);
        jf.add(jd3, BorderLayout.SOUTH);
        jf.add(jd4, BorderLayout.WEST);
        jf.add(jd5, BorderLayout.CENTER);

    }

}
