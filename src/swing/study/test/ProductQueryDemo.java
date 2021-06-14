package swing.study.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

/**
 * @author neo
 * @date 2021/6/14 10:06
 */
public class ProductQueryDemo extends JFrame implements ActionListener {
    JPanel panel = new JPanel();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();

    JButton first = new JButton("第一"),
            next = new JButton("下一"),
            prior = new JButton("前一"),
            last = new JButton("最后"),
            insert = new JButton("插入"),
            delete = new JButton("删除"),
            update = new JButton("修改");

    // 单行文本框
    JTextField jft1 = new JTextField(10),
            jft2 = new JTextField(30),
            jft3 = new JTextField(20),
            jft4 = new JTextField(10),
            jft5 = new JTextField(10);

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public ProductQueryDemo() {
        super("Product Operation");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/db";
            String user = "root";
            String password = "090311";
            conn = DriverManager.getConnection(url, user, password);

            // 放置其他panel的panel
            panel.setLayout(new GridLayout(3, 1, 10, 10));

            // panel1 放置商品号和商品名
            panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
            panel1.add(new JLabel("商品号："));
            panel1.add(jft1);
            panel1.add(new JLabel("商品名："));
            panel1.add(jft2);

            // panel2 放置品牌和价格
            panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
            panel2.add(new JLabel("品牌："));
            panel2.add(jft3);
            panel2.add(new JLabel("价格："));
            panel2.add(jft4);

            // panel3 放置库存量
            panel3.setLayout(new FlowLayout(FlowLayout.LEFT));
            panel3.add(new JLabel("库存量："));
            panel3.add(jft5);

            panel.add(panel1);
            panel.add(panel2);
            panel.add(panel3);

            panel4.setLayout(new FlowLayout(FlowLayout.LEFT));
            panel4.add(first);
            panel4.add(prior);
            panel4.add(next);
            panel4.add(last);
            panel4.add(insert);
            panel4.add(delete);
            panel4.add(update);

            add(panel, BorderLayout.SOUTH);
            ps = conn.prepareStatement("SELECT * from products");
            rs = ps.executeQuery();
            rs.first();
            jft1.setText(rs.getString(1));
            jft2.setText(rs.getString(2));
            jft3.setText(rs.getString(3));
            jft4.setText(rs.getString(4));
            jft5.setText(rs.getString(5));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        first.addActionListener(this);
        next.addActionListener(this);
        prior.addActionListener(this);
        last.addActionListener(this);
        insert.addActionListener(this);
        delete.addActionListener(this);
        update.addActionListener(this);
        setSize(450, 200);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == first) {
                rs.first();
                reset();
            } else if (e.getSource() == next) {
                rs.next();
                reset();
            } else if (e.getSource() == prior) {
                rs.previous();
                reset();
            } else if (e.getSource() == last) {
                rs.last();
                reset();
            } else if (e.getSource() == insert) {
                rs.moveToInsertRow();
                insert();
            } else if (e.getSource() == update) {
                update();
            } else if (e.getSource() == delete) {
                rs.deleteRow();
            }
        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }

    private void reset() {
        try {
            jft1.setText(rs.getString(1));
            jft2.setText(rs.getString(2));
            jft3.setText(rs.getString(3));
            jft4.setText(rs.getString(4));
            jft5.setText(rs.getString(5));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void insert() {

    }

    private void update() {
        try {
            String productId = jft1.getText();
            String pname = jft2.getText();
            String brand = jft3.getText();
            double price = Double.valueOf(jft4.getText());
            int stock = Integer.valueOf(jft5.getText());
            rs.updateString(1, productId);
            rs.updateString(2, pname);
            rs.updateString(3, brand);
            rs.updateDouble(4, Double.valueOf(price));
            rs.updateInt(5, Integer.valueOf(stock));
            rs.updateRow();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        new ProductQueryDemo();
    }
}