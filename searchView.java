//package abjava;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class searchView extends JPanel implements ActionListener{
	
	//create labels..		
	private JLabel searchLabel = new JLabel("Search by...");
	private JLabel firstLabel = new JLabel("F. Name:");
	private JLabel lastLabel = new JLabel("L. Name:");
	private JLabel addressLabel = new JLabel("Address: ");
	private JLabel phoneLabel = new JLabel("Phone Number: ");

	//create text fields...
	private JTextField firstField = new JTextField(20);
	private JTextField lastField = new JTextField(20);
	private JTextField addressField = new JTextField(20);
	private JTextField phoneField = new JTextField(20);

	//create buttons
	private JButton searchButton = new JButton("Search Info");
	private JButton clearButton = new JButton("Clear Fields");

	public searchView(){
		//give this panel a border)
 		this.setBorder(BorderFactory.createMatteBorder(10,10,10,10, Color.BLUE));

		//set the group layout
		final GroupLayout gl = new GroupLayout(this);
		this.setLayout(gl);
		gl.setAutoCreateGaps(true);

		//set jbutton actions
		searchButton.setActionCommand("SEARCH");
		searchButton.addActionListener(this);
	
		clearButton.setActionCommand("CLEAR");
		clearButton.addActionListener(this);

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

	public void actionPerformed(ActionEvent evt){
		String command = evt.getActionCommand();
		if (command == "SEARCH"){
			System.out.println("Search command found");
		}
		else{
			firstField.setText("");
			lastField.setText("");
			addressField.setText("");
			phoneField.setText("");
		}
	}	

}
