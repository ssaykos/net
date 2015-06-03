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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//윈도우 창 닫기 이벤트 지원
		setTitle("JEE(MVC 모델)");
		Toolkit toolkit  = Toolkit.getDefaultToolkit();//툴킷 객체 생성
		Dimension dim = toolkit.getScreenSize();//화면 크기 계산
		
		/*	패널 객체 생성	 */
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();

		/* 패널 색상변경 */
		panel.setBackground(Color.GREEN);
		panelA.setBackground(Color.BLUE);
		panelB.setBackground(Color.YELLOW);
		
		/*	라벨객체 생성 패널A에 라벨 추가	*/
		JLabel label = new JLabel("JEE(MVC 모델)");
		panel.add(label);
		
		/*	버튼 객체 삽입 	*/
		JButton button1 = new JButton("Model:순수자바");
		JButton button2 = new JButton("View:JSP");
		JButton button3 = new JButton("Controller:서블릿");
		JButton button4 = new JButton("(+)Database:오라클");
		
		/*	패널에 버튼들 추가	*/
		panelB.add(button1);
		panelB.add(button2);
		panelB.add(button3);
		panelB.add(button4);
		
		/*패널 에 패널 A와 패널 B를 담기*/
		panel.add(panelA);
		panel.add(panelB);
		
		add(panel);
		setLocation(dim.width/2, dim.height/2);
		
		setVisible(true);
	}
	
}
