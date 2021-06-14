package swing.study.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * @author neo
 * @date 2021/6/14 9:08
 */
public class RadioCheckBox extends JFrame implements ItemListener {

    JPanel panelCheck = new JPanel();   // 承载checkbox的panel
    JPanel panelRadio = new JPanel();   // 承载radio的panel

    JRadioButton apple = new JRadioButton("苹果");
    JRadioButton orange = new JRadioButton("橘子");
    JRadioButton banana = new JRadioButton("香蕉");

    ButtonGroup fruitBtnGroup = new ButtonGroup();

    JCheckBox literature = new JCheckBox("文学");
    JCheckBox art = new JCheckBox("艺术");
    JCheckBox sport = new JCheckBox("体育");

    JTextArea inters = new JTextArea(3, 20);
    JScrollPane jsp = new JScrollPane(inters);

    public RadioCheckBox(){
        super("RadioCheckBox");
        fruitBtnGroup.add(apple);
        fruitBtnGroup.add(orange);
        fruitBtnGroup.add(banana);

        panelCheck.add(apple);
        panelCheck.add(orange);
        panelCheck.add(banana);

        panelRadio.add(literature);
        panelRadio.add(art);
        panelRadio.add(sport);
        add(panelRadio, BorderLayout.PAGE_START);   // 显示页面首
        add(panelCheck, BorderLayout.CENTER);
        add(jsp, BorderLayout.PAGE_END);

        literature.addItemListener(this);
        art.addItemListener(this);
        sport.addItemListener(this);
        apple.addItemListener(this);
        orange.addItemListener(this);
        banana.addItemListener(this);

        setSize(300, 180);
//        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e){
        String s1 = "你最喜欢的水果是：";
        String s2 = "你的爱好包括：";
        if(apple.isSelected()){
            s1 = s1 + apple.getText() + "\n";
        }
        if(orange.isSelected()){
            s1 = s1 + orange.getText() + "\n";
        }
        if(banana.isSelected()){
            s1 = s1 + banana.getText() + "\n";
        }
        if(literature.isSelected()){
            s2 = s2 + literature.getText() + "\n";
        }
        if(art.isSelected()){
            s2 = s2 + art.getText() + "\n";
        }
        if(sport.isSelected()){
            s2 = s2 + sport.getText() + "\n";
        }
        inters.setText(s1 + s2);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                new RadioCheckBox();
            }
        });
    }




}
