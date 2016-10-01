//package abjava;

import java.awt.*;
import javax.swing.*;


public class View{

	public static JFrame 		mainFrame;
	public static JTabbedPane 	tabs;

	public static void initFrame(){
		mainFrame = new JFrame("Address Book Proggie");
		mainFrame.setSize(800,400);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		tabs = new JTabbedPane();
//		tabs.addTab("Insert", new insertView());
		tabs.addTab("Search", new searchView());
//		tabs.addTab("Delete", new deleteView());
		mainFrame.add(tabs);
		mainFrame.setVisible(true);
		
	}

}





