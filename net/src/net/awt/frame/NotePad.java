package net.awt.frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class NotePad extends Frame {
	private TextArea ta = new TextArea();
	private Font font = new Font("�ü�ü", Font.BOLD, 30);
	
	public NotePad() {
		// TODO Auto-generated constructor stub
		ta.setFont(font);
		this.add(ta);
		
		this.setTitle("�޸���");
		this.setBackground(Color.BLACK);
		this.setBounds(100, 100, 600, 500);
		this.setVisible(true);
		
		ExitAdaptar exit = new ExitAdaptar();
		this.addWindowListener(new ExitAdaptar());
		
	}
	public static void main(String[] args) {
		new NotePad();
	}
	class ExitAdaptar  extends WindowAdapter{
		
		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("������ â�� �ݽ��ϴ�.");
			System.exit(1);
		}
	}
}


