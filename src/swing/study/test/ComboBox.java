package swing.study.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * @author neo
 * @date 2021/6/14 9:51
 */
public class ComboBox extends JFrame implements ItemListener {

    JPanel panel = new JPanel();
    JComboBox<String> os = new JComboBox<>();
    JComboBox<String> browser = new JComboBox<>();

    JTextArea jta = new JTextArea(4, 20);
    JScrollPane jsp = new JScrollPane(jta);

    public ComboBox(){
        super("ComboBox");
        os.addItem("Windows");
        os.addItem("Linux");
        os.addItem("MacOS");

        browser.addItem("Internet Explore");
        browser.addItem("Mosaic");
        panel.add(os);
        panel.add(browser);
        add(panel, BorderLayout.PAGE_START);
        add(jsp, BorderLayout.CENTER);

        os.addItemListener(this);
        browser.addItemListener(this);

        this.setSize(350, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e){
        String s1 = "操作系统：";
        String s2 = "浏览器";
        s1 = s1 + os.getSelectedItem() + "\n";
        s2 = s2 + browser.getSelectedItem();
        jta.setText(s1 + s2);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
           public void run(){
               new ComboBox();
           }
        });
    }
}
