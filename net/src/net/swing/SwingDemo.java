package net.swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/*
 	
 */
public class SwingDemo {
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		
	}
}
class MyFrame extends JFrame{
	
	public MyFrame() {
		// TODO Auto-generated constructor stub
		setSize(600, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//������ â �ݱ� �̺�Ʈ ����
		setTitle("JEE(MVC ��)");
		Toolkit toolkit  = Toolkit.getDefaultToolkit();//��Ŷ ��ü ����
		Dimension dim = toolkit.getScreenSize();//ȭ�� ũ�� ���
		
		/*	�г� ��ü ����	 */
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();

		/* �г� ���󺯰� */
		panel.setBackground(Color.GREEN);
		panelA.setBackground(Color.BLUE);
		panelB.setBackground(Color.YELLOW);
		
		/*	�󺧰�ü ���� �г�A�� �� �߰�	*/
		JLabel label = new JLabel("JEE(MVC ��)");
		panel.add(label);
		
		/*	��ư ��ü ���� 	*/
		JButton button1 = new JButton("Model:�����ڹ�");
		JButton button2 = new JButton("View:JSP");
		JButton button3 = new JButton("Controller:����");
		JButton button4 = new JButton("(+)Database:����Ŭ");
		
		/*	�гο� ��ư�� �߰�	*/
		panelB.add(button1);
		panelB.add(button2);
		panelB.add(button3);
		panelB.add(button4);
		
		/*�г� �� �г� A�� �г� B�� ���*/
		panel.add(panelA);
		panel.add(panelB);
		
		add(panel);
		setLocation(dim.width/2, dim.height/2);
		
		setVisible(true);
	}
	
}
