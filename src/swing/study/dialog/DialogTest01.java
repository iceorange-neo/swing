package swing.study.dialog;

import javax.swing.*;

public class DialogTest01 {

    public static void main(String[] args) {
        JFrame jf = new JFrame("SecondJFrame!");
        jf.setBounds(500, 500, 500, 500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JDialog jd = new JDialog(jf, "SecondJFrame's jDialog");
        jd.setBounds(500, 500, 200, 200);
        jd.setVisible(true);
        jd.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);  // 隐藏当前窗口，释放所占有的资源
    }

}
