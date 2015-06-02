package net.awt.listener;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class windowListenerDemo {
	public static void main(String[] args) {
			/*
			 * [1] ������Ʈ ����
			 */
			Frame frame = new Frame("�޸���");
			frame.setSize(500, 300);
			Toolkit tool= Toolkit.getDefaultToolkit(); // ��Ŷ ��ü ����.  = new �� �ƴ� �޼ҵ� ���Ϲ������ ��ü�� ������Ŵ
			Dimension dim = tool.getScreenSize();//ȭ�� ũ��
			/*
			 * [2]������Ʈ�� ��üȭ
			 */
			frame.setLocation(dim.width/2-250  , dim.height/2-150);
			//��üȭ�鿡�� 3�б����� �ε��� �ϴ� ��
			//Ư�� ����� ���ϴ� �ͺ��� ��ó�� ������ ����ϸ� �������� ȭ�鿡 ���� 
			//�������� ������ ȭ���� ũ�� �۵� �߾� �αٿ� ��ġ �ϰ� ��.
			frame.addWindowListener(new EventHandler());
			//�̺�Ʈ�� ���ս�Ŵ
			frame.setVisible(true);
	}
}
class EventHandler implements WindowListener{

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		//������ �ݱ� ��ư�� Ŭ�������� ȣ��
		e.getWindow().setVisible(false);
		e.getWindow().dispose();
		System.exit(0);//0�� �ǹ̴� ���� �� ��� ���� 0���� ��ȯ �ϴ°��� �ƴұ� ���� �Ѵ�.
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
