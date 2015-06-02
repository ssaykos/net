package net.awt.textArea;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.Toolkit;

public class TextAreaDemo {
	public static void main(String[] args) {
		/*
		 * [1] ������Ʈ ����
		 */
		Frame frame = new Frame("�޸���");
		frame.setSize(500, 300);
		Toolkit tool= Toolkit.getDefaultToolkit(); // ��Ŷ ��ü ����.  = new �� �ƴ� �޼ҵ� ���Ϲ������ ��ü�� ������Ŵ
		Dimension dim = tool.getScreenSize();//ȭ�� ũ��
		
		TextArea area = new TextArea("���� �Է� : ", 10, 50);
		area.selectAll();// �Է��� ���� ��ü ����
		
		frame.setLayout(new FlowLayout());
		frame.add(area);
		/*
		 * [2]������Ʈ�� ��üȭ
		 */
		frame.setLocation(dim.width/2-250  , dim.height/2-150);
		//��üȭ�鿡�� 3�б����� �ε��� �ϴ� ��
		//Ư�� ����� ���ϴ� �ͺ��� ��ó�� ������ ����ϸ� �������� ȭ�鿡 ���� 
		//�������� ������ ȭ���� ũ�� �۵� �߾� �αٿ� ��ġ �ϰ� ��.
		frame.setVisible(true);
	}
}
