import java.awt.*;
import javax.swing.*;
public class CheckBoxEx extends JFrame {
	public CheckBoxEx(){
		setTitle("üũ�ڽ� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon one = new ImageIcon("images/1.jpg");
		ImageIcon selectone = new ImageIcon("images/2.jpg");
		
		JCheckBox apple = new JCheckBox("���");
		JCheckBox cherry = new JCheckBox("��",true);
		JCheckBox one1 = new JCheckBox("��!",one);
		
		one1.setBorderPainted(true);
		one1.setSelectedIcon(selectone);
		c.add(apple);
		c.add(cherry);
		c.add(one1);
		
		setSize(250,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new CheckBoxEx();

	}

}
