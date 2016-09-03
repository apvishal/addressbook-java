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
		JLabel firstLabel = new JLabel("F. Name:");
		JLabel lastLabel = new JLabel("L. Name:");
		JLabel addressLabel = new JLabel("Address: ");
		JLabel phoneLabel = new JLabel("Phone Number: ");

		//create text fields...
		JTextField firstField = new JTextField(20);
		JTextField lastField = new JTextField(20);
		JTextField addressField = new JTextField(20);
		JTextField phoneField = new JTextField(20);

		//create buttons
		JButton searchButton = new JButton("Search Info");
		JButton clearButton = new JButton("Clear Fields");

		gl.setHorizontalGroup(gl.createSequentialGroup()
				.addComponent(searchLabel)
			.addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(gl.createSequentialGroup()
					.addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(firstLabel)
						.addComponent(addressLabel))
					.addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(firstField)
						.addComponent(addressField)))
					.addComponent(searchButton))

			.addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(gl.createSequentialGroup()
					.addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(lastLabel)
						.addComponent(phoneLabel))
					.addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(lastField)
						.addComponent(phoneField)))
					.addComponent(clearButton))
);

		gl.setVerticalGroup(gl.createSequentialGroup()
				.addComponent(searchLabel)
			.addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(gl.createSequentialGroup()
					.addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(firstLabel)
						.addComponent(firstField)
						.addComponent(lastLabel)
						.addComponent(lastField))
					.addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(addressLabel)
						.addComponent(addressField)
						.addComponent(phoneLabel)
						.addComponent(phoneField))))

			.addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
				.addComponent(searchButton)
				.addComponent(clearButton))
);

	

	}
}

