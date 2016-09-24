import java.awt.*;;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class deleteView extends JPanel{
	//create a label
	private JLabel 	prompt = new JLabel("Select the directory you would like to delete");
	
	//create a JcomboBox
	private static JComboBox<DefaultComboBoxModel> cBox = new JComboBox<DefaultComboBoxModel>();
	private static DefaultComboBoxModel cbModel = (DefaultComboBoxModel)cBox.getModel();

	//create a JButton
	private JButton selectButton = new JButton("Select");

	//our button options to use with JOptionPane when requesting to delete and entry
	private Object[] buttonOptions = {"Confirm", "Abort"};

	public deleteView(){
		this.setBorder(BorderFactory.createMatteBorder(10,10,10,10, Color.ORANGE));

		refresh_model();
	
		selectButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//perform operation...
				//System.out.println(cbModel.getSelectedItem().toString());
				int result = JOptionPane.showOptionDialog(null, "Are you sure you want to"
				+ " delete the following option below?\n\n" + cbModel.getSelectedItem().toString(), 
				"Confirm Delete", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null,
				buttonOptions, buttonOptions[1]);


			}
		});

		this.add(prompt);
		this.add(cBox);				
		this.add(selectButton);
	}


	public static void refresh_model(){
		cbModel = dataBaseControl.get_model();

		cBox.setModel(cbModel);
	}
}

