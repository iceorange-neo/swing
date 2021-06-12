package swing.study.textarea;

import javax.swing.*;
import java.awt.*;

public class JTextAreaTest01 {

    public static void main(String[] args){

        JFrame jf = new JFrame("JFrame");
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLayout(new FlowLayout(FlowLayout.LEFT));
        jf.setBounds(400, 400, 300, 200);

        JLabel message = new JLabel("以下是多行文本框");
        jf.add(message);
        JTextArea jta = new JTextArea(3, 4);
        jta.setLineWrap(true);  // 自动换行
        // xxx.getText()    可以获取任何框中的内容
        jf.add(jta);




    }

}
