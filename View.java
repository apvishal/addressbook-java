import java.awt.*;
import javax.swing.*;


public class View{

	public static JFrame 		mainFrame;
	public static JTabbedPane 	tabs;

	public static void initFrame(){
		mainFrame = new JFrame("Address Book Proggie");
		mainFrame.setSize(600,300);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);

		tabs = new JTabbedPane();
		tabs.addTab("Search", new SearchTab("This is the search Tab!"));
		tabs.addTab("Insert", new InsertTab("This is the insert tab!"));
		mainFrame.add(tabs);
		
	}

	public static void main(String args[]){
		initFrame();
	}
}

class InsertTab extends JPanel{
	public InsertTab(String str){
		JLabel insertLabel = new JLabel(str);
		add(insertLabel);
	}
}


class SearchTab extends JPanel{
	public SearchTab(String str){
		JLabel searchLabel = new JLabel(str);
		add(searchLabel);
	}
}

