import javax.swing.*;
import java.awt.*;
public class ButtonEx extends JFrame{
	public ButtonEx(){
		setTitle("�̹��� ��ư ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon normalIcon = new ImageIcon("images/3.jpg");
		ImageIcon rolloverIcon = new ImageIcon("images/1.jpg");
		ImageIcon pressedIcon = new ImageIcon("images/2.jpg");
		
		JButton btn = new JButton("call~",normalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		c.add(btn);
		
		setSize(250,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ButtonEx();

	}

}
