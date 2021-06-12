package swing.study.event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ListenerEventMain {

    public static void main(String[] args) {

        JFrame jf = new JFrame("事件监听测试");
        jf.setVisible(true);
        jf.setLayout(new FlowLayout(FlowLayout.LEFT));
        jf.setBounds(400, 300, 300, 200);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JTextArea area = new JTextArea(3, 5);
        area.setLineWrap(true);
        JButton button = new JButton("点击有惊喜");

        jf.add(area);
        jf.add(button);

        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area.append("MacBook Pro免费送");
            }
        });



    }


}
