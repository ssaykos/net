package net.socket;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingChatClient extends JFrame implements ActionListener,Runnable{
	JPanel cardPane, connetionPane, chatPane;
	JLabel msg;
	JButton btnConnect, btnSend, btnExit;
	JTextField txtServer, txtName, txtInput;
	JTextArea txtList;
	CardLayout card;
	
	String ipTxt;
	Socket socket;
	final int PORT= 7500;
	PrintWriter pw = null;
	BufferedReader in = null;
	OutputStream os = null;
	
	
	public SwingChatClient() {
		// TODO Auto-generated constructor stub
		super("채팅: 클라이언트");
		connetPane();//메소드는 동사를 사용하고 속성은 명사를 사용한다.
		//card...
		cardPane=new JPanel();
		cardPane.setLayout(new CardLayout());
		//레이아웃 매니저중 카드 레이아웃은 텝과 비슷한 기능을 한다.ㅇ
		cardPane.add(connetionPane," 접속창");
		cardPane.add(chatPane,"채팅창");
		cardPane.add(cardPane,"접속중");
		add(cardPane);
		setBounds(200, 200, 400, 400);
		
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		btnConnect.addActionListener(this);
		btnExit.addActionListener(this);
		btnSend.addActionListener(this);
		txtInput.addActionListener(this);
	}
	
	private void connetPane() {
		// TODO Auto-generated method stub
		connetionPane= new JPanel();
		JPanel panel = new JPanel();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		msg = new JLabel("IP와 대화명을 입력하세요");
		msg.setFont(new Font("굴림체", Font.BOLD, 15));
		msg.setForeground(Color.MAGENTA);
		
		JLabel lb1 = new JLabel("서버 ip:");
		txtServer = new JTextField("127.0.0.1",15);
		/*127.0.0.1은 본인 로컬 호스트 아이피 를 가리킴 */
		panel1.add(lb1);
		
		JLabel lb2 = new JLabel("대화명:");
		txtServer = new JTextField("GUJS",15);
		panel1.add(lb2);
		panel2.add(txtServer);
		
		panel.add(panel1);
		panel.add(panel2);
		panel.add(msg);
		
		btnConnect= new JButton(" 연 결 ");
		connetionPane.setBorder(BorderFactory.createTitledBorder("다중 채팅 화면"));
		connetionPane.setLayout(new BorderLayout());
		connetionPane.add(btnConnect,"South");
		
		
	}
	public void ChatPane() {
		chatPane = new JPanel();
		JPanel panel = new JPanel();
		txtList = new JTextArea();
		txtInput = new JTextField("",20);//텍스트 필드를 비워두고 20글자 입력칸 생성.
		btnSend = new JButton("전송");
		btnExit = new JButton("종료");
		panel.setBorder(BorderFactory.createTitledBorder("대화하기=="));
		chatPane.setBorder(BorderFactory.createTitledBorder("채팅내용"));
		panel.add(txtInput);
		panel.add(btnSend);
		panel.add(btnExit);
		
		chatPane.setLayout( new BorderLayout());
		chatPane.add(txtList , "Center");
		chatPane.add(panel,"South");
		
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object obj = e.getSource();
		if(obj == btnConnect ){
			card.show(cardPane, "채팅창");
			ipTxt =txtServer.getText();
			/*
			 * 해당 클래스인 SwingChatClient 이 Runnable을 구현한 
			 */
			Thread thr = new Thread(this);
			thr.start();
		}
		if(obj == btnSend){
			send();
		}
		if(obj==txtInput){
			send();
		}
		if(obj == btnExit){
			System.exit(0);
		}
	}

	private void send() {
		// TODO Auto-generated method stub
		String text= txtInput.getText();
		txtList.append(text+"\n");//줄바꿈
		txtInput.setText("");//인풋창의 글자를 지우고 초기화
		txtInput.requestFocus();//입력창에 글자가 없으면 커서만 깜빡이는 상태
		pw.println(text);//pw는 PringWriter 의 객체로 화면에 글자를 뿌려라.
		pw.flush();//flush()물내림이란 뜻으로 pw에게 가지고 있는 데이터를 전부 삭제 하라는 말
	}
	
	
}
