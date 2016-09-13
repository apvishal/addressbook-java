import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class deleteView extends JPanel{
	//create a label
	private JLabel 	prompt = new JLabel("Select the directory you would like to delete");

	//create a JcomboBox
	private JComboBox<String> cBox = new JComboBox<String>();

	//create a JButton
	private JButton selectButton = new JButton("Select");

	public deleteView(){
		this.setBorder(BorderFactory.createMatteBorder(10,10,10,10, Color.ORANGE));

		cBox.addItem("Select a Directory");

		this.add(prompt);
		this.add(cBox);				

	}
}

