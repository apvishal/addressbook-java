//package abjava;

import java.awt.*;
import javax.swing.*;


public class View{

	public static JFrame 		mainFrame;
	public static JTabbedPane 	tabs;

	public static void initFrame(){
		mainFrame = new JFrame("Address Book Proggie");
		mainFrame.setSize(600,300);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		tabs = new JTabbedPane();
		tabs.addTab("Search", new searchView());
		tabs.addTab("Insert", new insertView());
		tabs.addTab("Delete", new deleteView());
		mainFrame.add(tabs);
		mainFrame.setVisible(true);
		
	}

}





