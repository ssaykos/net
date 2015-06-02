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
		 * [1] 컴포넌트 생성
		 */
		Frame frame = new Frame("메모장");
		frame.setSize(500, 300);
		Toolkit tool= Toolkit.getDefaultToolkit(); // 툴킷 객체 생성.  = new 가 아닌 메소드 리턴방식으로 객체를 생성시킴
		Dimension dim = tool.getScreenSize();//화면 크기
		
		MenuBar menuBar = new MenuBar();
		Menu menuFile = new Menu("File");//메뉴에 File이라고 나타남
		MenuItem itemNew= new MenuItem("New");
		MenuItem ItemOpen = new MenuItem("Open");
		Menu subMenu = new Menu("Others");
		MenuItem itemExit = new MenuItem("Exit");
		MenuItem subMenuPrint = new MenuItem("Print");
		MenuItem subMEnuPreview = new MenuItem("Preview");
		MenuItem subMenuSetup = new MenuItem("PrintSetup");
		/*
		 	 컴포넌트 조립
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
		 * [2]컴포넌트의 구체화
		 */
		frame.setLocation(dim.width/2-250  , dim.height/2-150);
		//전체화면에서 3분기점에 두도록 하는 것
		//특정 사이즈를 정하는 것보다 위처럼 디멘션을 사용하면 보여지는 화면에 따라 
		//동적으로 무조건 화면이 크든 작든 중앙 부근에 위치 하게 됨.
		frame.setVisible(true);
	}
}
