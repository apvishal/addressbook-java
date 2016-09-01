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
		tabs.addTab("Delete", new DeleteTab("This is the tab used to delete items from the database"));
		mainFrame.add(tabs);
		
	}

	public static void main(String args[]){
		initFrame();
	}
}

class DeleteTab extends JPanel{
	public DeleteTab(String str){
		JLabel deleteLabel = new JLabel(str);
		add(deleteLabel);
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

