package net.awt.textField;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Toolkit;

public class TextFieldDemo {

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
		Label labId = new Label(" ID :");
		labId.setBounds(50, 50, 30, 10);
		Label labPwd = new Label( " password :" );
		labPwd.setBounds(50, 65, 100	, 10);
		
		TextField txtId = new TextField(10);
		txtId.setBounds(85, 50, 100, 10);
		TextField txtPwd = new TextField(10);
		txtPwd.setBounds(150, 65, 100, 10);
		txtPwd.setEchoChar('*');// ���ΰ� charŸ���̶� �Ǳ� ���� ��..
		
		//frame.setLayout(new FlowLayout());
		frame.setLayout(null);
		frame.add(labId);
		frame.add(txtId);
		frame.add(labPwd);
		frame.add(txtPwd);
		
		frame.setLocation(dim.width/2-250  , dim.height/2-150);
		//��üȭ�鿡�� 3�б����� �ε��� �ϴ� ��
		//Ư�� ����� ���ϴ� �ͺ��� ��ó�� ������ ����ϸ� �������� ȭ�鿡 ���� 
		//�������� ������ ȭ���� ũ�� �۵� �߾� �αٿ� ��ġ �ϰ� ��.
		frame.setVisible(true);
	}
}
