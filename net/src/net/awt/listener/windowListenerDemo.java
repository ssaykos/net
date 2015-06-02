package net.awt.listener;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class windowListenerDemo {
	public static void main(String[] args) {
			/*
			 * [1] 컴포넌트 생성
			 */
			Frame frame = new Frame("메모장");
			frame.setSize(500, 300);
			Toolkit tool= Toolkit.getDefaultToolkit(); // 툴킷 객체 생성.  = new 가 아닌 메소드 리턴방식으로 객체를 생성시킴
			Dimension dim = tool.getScreenSize();//화면 크기
			/*
			 * [2]컴포넌트의 구체화
			 */
			frame.setLocation(dim.width/2-250  , dim.height/2-150);
			//전체화면에서 3분기점에 두도록 하는 것
			//특정 사이즈를 정하는 것보다 위처럼 디멘션을 사용하면 보여지는 화면에 따라 
			//동적으로 무조건 화면이 크든 작든 중앙 부근에 위치 하게 됨.
			frame.addWindowListener(new EventHandler());
			//이벤트를 결합시킴
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
		//윈도우 닫기 버튼을 클릭했을때 호출
		e.getWindow().setVisible(false);
		e.getWindow().dispose();
		System.exit(0);//0의 의미는 종료 즉 모든 값을 0으로 반환 하는것이 아닐까 생각 한다.
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
