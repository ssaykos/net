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
	JPanel pan_nth, pan_sth;//���ʰ� ����
	ImageIcon icon;
	List<JButton> btns;
	
	
	public LottoUI() {
		// TODO Auto-generated constructor stub
		init();// ������ �ҽ��� �Ϻη� ������ �޼ҵ�� ó���ؼ�.. 
		//���� �� ��ġ�� ���� ���� ȣ��ν� ����� �����ϵ��� �ϴ� ��
		// �ڹٽ�ũ��Ʈ������ ȣ�̽�Ʈ ���� ���
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
		String imgPath="C:\\Users\\�����PM\\git\\net\\net\\src\\net\\swing\\lotto\\";
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
//		btn= new JButton("�ζǹ�ȣ ����ϱ�");
//		pan_nth.add(btn);
//		super.add(pan_nth);
//		super.add(pan_sth);
//		for (int i = 0; i < 6; i++) {
//			pan_sth.add(icon.)
//		}
		
	}
	public void init() {
		
		setTitle("�ζǹ�ȣ ������");
		
		lotto= new Lotto();// ������ ����ϴ� Ŭ������ �ζǸ� �����ڿ� ����
		btns = new ArrayList<JButton>();
		/*
		 	���� �г� , �����г� ���� �� �����ӿ� ���̰�..
		 	��ư���� �̺�Ʈ�� �Ҵ� �ϴµ�..
		 	btn.addActionListenner(this);
		 	���� �гο� ��ư ���̱�..
		 	���� �гο� BorderLayout ���� ���ʿ� ��ġ�ϵ��� �ϰ�
		 	���� �г��� ���ʿ� ��ġ
		 	�����ӻ����� 1200x300�̰� x,y��ǥ���� 300,400..
		 	�����ӻ����� Ȯ�� �Ұ� �� ���弼��.
		 */
		setSize(1200, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(300, 400);
				
		setResizable(false);
		setVisible(true);
		btn= new JButton("�ζǹ�ȣ ����ϱ�");
		pan_nth=new JPanel();
		pan_sth= new JPanel();
		
		btn.addActionListener(this);
		/*
		 	ActionListener �� �������̽��� ���� ���� actionPerformed(this) �� �����ε� �� ���� ���ٴ�.this
		 */
		
		super.setLayout(new BorderLayout());
		
		pan_nth.add(btn);
		
		super.add(pan_nth,BorderLayout.NORTH);
		super.add(pan_sth, BorderLayout.SOUTH);
	}
}
