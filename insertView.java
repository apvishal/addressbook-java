package abjava;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class insertView extends JPanel{
	
	//labels
	private JLabel prompt = new JLabel("Input all Fields");
	private JLabel fnLabel = new JLabel("First:");
	private JLabel lnLabel = new JLabel("Last:");
	private JLabel streetLabel = new JLabel("Street");
	private JLabel cityLabel = new JLabel("City");
	private JLabel stateLabel = new JLabel("State");
	private JLabel zipLabel = new JLabel("Zip");
	private JLabel phoneLabel = new JLabel("Phone: ");
	
	//textFields
	private JTextField fnField = new JTextField(10);
	private JTextField lnField = new JTextField(10);
	private JTextField streetField = new JTextField(20);
	private JTextField cityField = new JTextField(10);
	private JTextField stateField = new JTextField(20);
	private JTextField zipField = new JTextField(10);
	private JTextField phoneField = new JTextField(10);
	
	//buttons
	private JButton inputButton = new JButton("Input");
	private JButton clearButton = new JButton("Clear");
	
	public insertView(){
		this.setBorder(BorderFactory.createMatteBorder(5,5,5,5, Color.PINK));
		
		final GroupLayout gl = new GroupLayout(this);
		this.setLayout(gl);
		gl.setAutoCreateGaps(true);
		
		gl.setHorizontalGroup(gl.createSequentialGroup()
				.addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(fnLabel)
						.addComponent(streetLabel)
						.addComponent(stateLabel)
						.addComponent(phoneLabel))
				.addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(prompt)
					.addGroup(gl.createSequentialGroup()
							.addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
									.addComponent(fnField)
									.addComponent(streetField)
									.addComponent(stateField)
									.addComponent(phoneField)
									.addComponent(inputButton))
							.addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
									.addComponent(lnLabel)
									.addComponent(cityLabel)
									.addComponent(zipLabel))
							.addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
									.addComponent(lnField)
									.addComponent(cityField)
									.addComponent(zipField)
									.addComponent(clearButton))))
		);
		
		gl.setVerticalGroup(gl.createSequentialGroup()
				.addComponent(prompt)
					.addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addGroup(gl.createSequentialGroup()
									.addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(fnLabel)
										.addComponent(fnField)
										.addComponent(lnLabel)
										.addComponent(lnField))
									.addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
											.addComponent(streetLabel)
											.addComponent(streetField)
											.addComponent(cityLabel)
											.addComponent(cityField))
									.addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
											.addComponent(stateLabel)
											.addComponent(stateField)
											.addComponent(zipLabel)
											.addComponent(zipField))
									.addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
											.addComponent(inputButton)
											.addComponent(clearButton))))
											
	);
		
							
		
		
	}



}

