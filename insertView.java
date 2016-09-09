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
		
		
	}



}

