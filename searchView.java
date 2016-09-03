import java.awt.*;
import javax.swing.*;
class searchView extends JPanel{
/*	class SearchTab()*/{
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
