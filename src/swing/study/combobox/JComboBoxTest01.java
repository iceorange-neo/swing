package swing.study.combobox;

import javax.swing.*;
import java.awt.*;

public class JComboBoxTest01 {

    public static void main(String[] args){

        // 创建窗口
        JFrame jf = new JFrame("JFrame");
        jf.setBounds(500, 500, 500, 500);
        jf.setVisible(true);
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // 创建JComboBox
        JComboBox comboBox = new JComboBox();
        comboBox.addItem("---请选择---");
        comboBox.addItem("1、北京");
        comboBox.addItem("2、上海");
        comboBox.addItem("3、广州");

        jf.add(comboBox);



    }

}
