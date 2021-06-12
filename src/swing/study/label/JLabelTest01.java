package swing.study.label;

import javax.swing.*;

public class JLabelTest01 {

    public static void main(String[] args){
        JFrame jf = new JFrame("JFrame");
        jf.setBounds(500, 500, 500, 500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel jlb = new JLabel("First label", SwingConstants.LEFT);  // SwingConstants
        jf.add(jlb);
    }
}
