import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Study1104 extends JFrame {

    JLabel idLabel = new JLabel("LoginID:");
    JLabel pwLabel = new JLabel("PassWD:");
    JTextField id = new JTextField(10);
    JPasswordField passwd = new JPasswordField(10);
    JButton loginBtn = new JButton("�⼮üũ");
    JCheckBox survey1 = new JCheckBox("���ͳ�");
    JCheckBox survey2 = new JCheckBox("�Ź�");
    JCheckBox survey3 = new JCheckBox("����");
    JCheckBox survey4 = new JCheckBox("��Ÿ");
    JLabel output = new JLabel();
    BtnActionListener event1 = new BtnActionListener(output);

    Study1104() {
        setSize(400, 300);
        setVisible(true);
        Container ct = getContentPane();
        ct.setLayout(new FlowLayout());
        ct.add(idLabel);
        ct.add(id);
        ct.add(loginBtn);
        ct.add(pwLabel);
        ct.add(passwd);
        ct.add(survey1);
        ct.add(survey2);
        ct.add(survey3);
        ct.add(survey4);
        ct.add(output);
        loginBtn.addActionListener(event1);
    }

    public static void main(String[] args) {
        Study1104 login = new Study1104();
        login.setTitle("ȸ������");
        // login.setSize(400, 300);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // login.setVisible(true);
    }

}

class BtnActionListener implements ActionListener {
    String output;
    JLabel popup;

    BtnActionListener(JLabel y) {
        output = "��� ������ ID�Դϴ�.";
        popup = y;
    }

    public void actionPerformed(ActionEvent ae) {
        popup.setText(output);
        popup.setVisible(true);

    }
}