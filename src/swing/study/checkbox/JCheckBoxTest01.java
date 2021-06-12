package swing.study.checkbox;

import javax.swing.*;
import java.awt.*;

public class JCheckBoxTest01 {

    public static void main(String[] args){

        JFrame jf = new JFrame("JFrame");
        jf.setBounds(500, 500, 500, 500);
        jf.setLayout(new FlowLayout());
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JCheckBox game = new JCheckBox("game");
        JCheckBox music = new JCheckBox("music", true);
        JCheckBox football = new JCheckBox("football");

        jf.add(game);
        jf.add(music);
        jf.add(football);

    }


}
