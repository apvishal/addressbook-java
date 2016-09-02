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
		tabs.addTab("Search", new SearchTab());
		tabs.addTab("Insert", new InsertTab("This is the insert tab!"));
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


class InsertTab extends JPanel{
	public InsertTab(String str){
		JLabel insertLabel = new JLabel(str);
		add(insertLabel);
	}
}


class SearchTab extends JPanel{
	public SearchTab(){
		//give this panel a border)
 		this.setBorder(BorderFactory.createMatteBorder(10,10,10,10, Color.BLUE));

		//set the group layout
		GroupLayout gl = new GroupLayout(this);
		this.setLayout(gl);
		gl.setAutoCreateGaps(true);

		//create labels..		
		JLabel searchLabel = new JLabel("Search by...");
		JLabel nameLabel = new JLabel("Name: ");
		JLabel addressLabel = new JLabel("Address: ");
		JLabel phoneLabel = new JLabel("Phone Number: ");

		//create text fields...
		JTextField nameField = new JTextField(20);
		JTextField addressField = new JTextField(20);
		JTextField phoneField = new JTextField(20);


		gl.setHorizontalGroup(gl.createSequentialGroup()
			.addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(searchLabel)
				.addComponent(nameLabel)
				.addComponent(addressLabel)
				.addComponent(phoneLabel))		
			.addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(nameField)
				.addComponent(addressField)
				.addComponent(phoneField))
);

		gl.setVerticalGroup(gl.createSequentialGroup()
				.addComponent(searchLabel)
			.addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
				.addComponent(nameLabel)
				.addComponent(nameField))
			.addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
				.addComponent(addressLabel)
				.addComponent(addressField))
			.addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
				.addComponent(phoneLabel)
				.addComponent(phoneField))

);

	

	}
}

