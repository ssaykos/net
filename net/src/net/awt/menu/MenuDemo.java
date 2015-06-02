package net.awt.menu;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Toolkit;


public class MenuDemo {
	public static void main(String[] args) {
		/*
		 * [1] ������Ʈ ����
		 */
		Frame frame = new Frame("�޸���");
		frame.setSize(500, 300);
		Toolkit tool= Toolkit.getDefaultToolkit(); // ��Ŷ ��ü ����.  = new �� �ƴ� �޼ҵ� ���Ϲ������ ��ü�� ������Ŵ
		Dimension dim = tool.getScreenSize();//ȭ�� ũ��
		
		MenuBar menuBar = new MenuBar();
		Menu menuFile = new Menu("File");//�޴��� File�̶�� ��Ÿ��
		MenuItem itemNew= new MenuItem("New");
		MenuItem ItemOpen = new MenuItem("Open");
		Menu subMenu = new Menu("Others");
		MenuItem itemExit = new MenuItem("Exit");
		MenuItem subMenuPrint = new MenuItem("Print");
		MenuItem subMEnuPreview = new MenuItem("Preview");
		MenuItem subMenuSetup = new MenuItem("PrintSetup");
		/*
		 	 ������Ʈ ����
		 */
		subMenu.add(subMenuPrint);
		subMenu.add(subMEnuPreview);
		subMenu.add(subMenuSetup);
		
		Menu menuEdit = new Menu("Edit");
		Menu menuView = new Menu("View");
		Menu menuHelp = new Menu("Help");
		
		menuFile.add(itemNew);
		menuFile.add(ItemOpen);
		menuFile.add(subMenu);
		menuFile.addSeparator();
		
		menuBar.add(menuFile);
		menuBar.add(menuEdit);
		menuBar.add(menuView);
		menuBar.setHelpMenu(menuHelp);
		
		frame.setMenuBar(menuBar);
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
