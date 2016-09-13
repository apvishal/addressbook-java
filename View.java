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
		tabs.addTab("Delete", new DeleteTab("This is the tab used to delete items from the database"));
		mainFrame.add(tabs);
		mainFrame.setVisible(true);
		
	}

//	public static void main(String args[]){
//		initFrame();
//	}
}

class DeleteTab extends JPanel{
	public DeleteTab(String str){
		JLabel deleteLabel = new JLabel(str);
		add(deleteLabel);
	}
}




