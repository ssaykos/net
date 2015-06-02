package net.awt.Label;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;

public class LabelDemo {
	public static void main(String[] args) {
		/*
		 * [1] 컴포넌트 생성
		 */
		Frame frame = new Frame("메모장");
		frame.setSize(500, 300);
		Toolkit tool= Toolkit.getDefaultToolkit(); // 툴킷 객체 생성.  = new 가 아닌 메소드 리턴방식으로 객체를 생성시킴
		Dimension dim = tool.getScreenSize();//화면 크기
		Label labId = new Label(" ID :");
		labId.setBounds(50, 50, 30, 10);
		Label labPwd = new Label( " password :" );
		labPwd.setBounds(50, 65, 100	, 10);
//		frame.setLayout(new FlowLayout());
		frame.setLayout(null);
		//LayoutManager 중에서 FlowLayout을 사용.
		frame.add(labId);
		frame.add(labPwd);
		
		/*
		 * [2]컴포넌트의 구체화
		 */
		frame.setLocation(dim.width/2-250  , dim.height/2-150);
		//전체화면에서 3분기점에 두도록 하는 것
		//특정 사이즈를 정하는 것보다 위처럼 디멘션을 사용하면 보여지는 화면에 따라 
		//동적으로 무조건 화면이 크든 작든 중앙 부근에 위치 하게 됨.
		frame.setVisible(true);
	}
}
