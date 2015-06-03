package net.swing;

import java.awt.BorderLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class LottoUI extends JFrame implements ActionListener{
	Lotto lotto;
	JButton btn;
	JPanel pan_nth, pan_sth;//북쪽과 남쪽
	ImageIcon icon;
	List<JButton> btns;
	
	
	public LottoUI() {
		// TODO Auto-generated constructor stub
		init();// 복잡한 소스를 하부로 보내고 메소드로 처리해서.. 
		//선언 된 위치에 관계 없이 호출로써 기능을 수행하도록 하는 것
		// 자바스크립트에서는 호이스트 같은 계념
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(btns.size()==0){
			makeBtns();
		}
		lotto.setLotto();
		showLotto();
		
	}
	
	public ImageIcon getIcon(int a) {
		String imgPath="C:\\Users\\취업반PM\\git\\net\\net\\src\\net\\swing\\lotto\\";
		imgPath+=lotto.getLotto(a);
		imgPath+=".gif";
		return new ImageIcon(imgPath);
	}
	
	private void showLotto() {
		// TODO Auto-generated method stub
//		JButton tmp=null;
//		for (int i = 0; i < 6; i++) {
//			tmp= new JButton(icon=this.getIcon(i));
//			pan_sth.add(btn);
//		}
//		super.add(pan_sth, BorderLayout.SOUTH);
		for (int i = 0; i < 6; i++) {
			btns.get(i).setIcon(getIcon(i));
		}
	}
	private void makeBtns() {
		// TODO Auto-generated method stub
		JButton tmp= null;
		for (int i = 0; i < 6; i++) {
			tmp= new JButton();
			btns.add(tmp);
			pan_sth.add(tmp);
		}
//		btn= new JButton("로또번호 출력하기");
//		pan_nth.add(btn);
//		super.add(pan_nth);
//		super.add(pan_sth);
//		for (int i = 0; i < 6; i++) {
//			pan_sth.add(icon.)
//		}
		
	}
	public void init() {
		
		setTitle("로또번호 생성기");
		
		lotto= new Lotto();// 로직을 담당하는 클래스인 로또를 생성자에 붙임
		btns = new ArrayList<JButton>();
		/*
		 	북쪽 패널 , 남쪽패널 생성 후 프레임에 붙이고..
		 	버튼에는 이벤트를 할당 하는데..
		 	btn.addActionListenner(this);
		 	북쪽 패널에 버튼 붙이기..
		 	북쪽 패널에 BorderLayout 에서 북쪽에 배치하도록 하고
		 	남쪽 패널은 남쪽에 배치
		 	프레임사이즈 1200x300이고 x,y좌표값은 300,400..
		 	프레임사이즈 확장 불가 로 만드세요.
		 */
		setSize(1200, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(300, 400);
				
		setResizable(false);
		setVisible(true);
		btn= new JButton("로또번호 출력하기");
		pan_nth=new JPanel();
		pan_sth= new JPanel();
		
		btn.addActionListener(this);
		/*
		 	ActionListener 의 인터페이스로 임플 받은 actionPerformed(this) 의 오버로딩 된 것을 쓰겟다.this
		 */
		
		super.setLayout(new BorderLayout());
		
		pan_nth.add(btn);
		
		super.add(pan_nth,BorderLayout.NORTH);
		super.add(pan_sth, BorderLayout.SOUTH);
	}
}
