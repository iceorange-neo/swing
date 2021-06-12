package swing.study.jfram;

import javax.swing.*;

public class JFrameTest01 {
    public static void main(String[] args){
        JFrame jf = new JFrame();
//        jf.setLocation(300, 300);
//        jf.setSize(300, 300);

        jf.setTitle("FirstJFrame!");
        // 也可以使用public void setBounds(x, y, width, height) 设置位置和大小
        jf.setBounds(500, 500, 300, 300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
