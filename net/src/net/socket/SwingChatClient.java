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
		super("ä��: Ŭ���̾�Ʈ");
		connetPane();//�޼ҵ�� ���縦 ����ϰ� �Ӽ��� ��縦 ����Ѵ�.
		//card...
		cardPane=new JPanel();
		cardPane.setLayout(new CardLayout());
		//���̾ƿ� �Ŵ����� ī�� ���̾ƿ��� �ܰ� ����� ����� �Ѵ�.��
		cardPane.add(connetionPane," ����â");
		cardPane.add(chatPane,"ä��â");
		cardPane.add(cardPane,"������");
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
		
		msg = new JLabel("IP�� ��ȭ���� �Է��ϼ���");
		msg.setFont(new Font("����ü", Font.BOLD, 15));
		msg.setForeground(Color.MAGENTA);
		
		JLabel lb1 = new JLabel("���� ip:");
		txtServer = new JTextField("127.0.0.1",15);
		/*127.0.0.1�� ���� ���� ȣ��Ʈ ������ �� ����Ŵ */
		panel1.add(lb1);
		
		JLabel lb2 = new JLabel("��ȭ��:");
		txtServer = new JTextField("GUJS",15);
		panel1.add(lb2);
		panel2.add(txtServer);
		
		panel.add(panel1);
		panel.add(panel2);
		panel.add(msg);
		
		btnConnect= new JButton(" �� �� ");
		connetionPane.setBorder(BorderFactory.createTitledBorder("���� ä�� ȭ��"));
		connetionPane.setLayout(new BorderLayout());
		connetionPane.add(btnConnect,"South");
		
		
	}
	public void ChatPane() {
		chatPane = new JPanel();
		JPanel panel = new JPanel();
		txtList = new JTextArea();
		txtInput = new JTextField("",20);//�ؽ�Ʈ �ʵ带 ����ΰ� 20���� �Է�ĭ ����.
		btnSend = new JButton("����");
		btnExit = new JButton("����");
		panel.setBorder(BorderFactory.createTitledBorder("��ȭ�ϱ�=="));
		chatPane.setBorder(BorderFactory.createTitledBorder("ä�ó���"));
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
			card.show(cardPane, "ä��â");
			ipTxt =txtServer.getText();
			/*
			 * �ش� Ŭ������ SwingChatClient �� Runnable�� ������ 
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
		txtList.append(text+"\n");//�ٹٲ�
		txtInput.setText("");//��ǲâ�� ���ڸ� ����� �ʱ�ȭ
		txtInput.requestFocus();//�Է�â�� ���ڰ� ������ Ŀ���� �����̴� ����
		pw.println(text);//pw�� PringWriter �� ��ü�� ȭ�鿡 ���ڸ� �ѷ���.
		pw.flush();//flush()�������̶� ������ pw���� ������ �ִ� �����͸� ���� ���� �϶�� ��
	}
	
	
}
