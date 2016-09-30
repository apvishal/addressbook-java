import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;

public class searchView extends JPanel{

	private JTable table;
	private JScrollPane pane;
	private JTextField searchField = new JTextField("Search Entries...");

	private JButton deleteButton = new JButton("Delete Entry");
	private JButton inputButton = new JButton("Insert Entry");
	private JButton quitButton = new JButton("Quit");
	
	public searchView(){

		table = new JTable(init_table());
		pane = new JScrollPane(table);
		pane.setPreferredSize(new Dimension(600,400));

		GroupLayout gl = new GroupLayout(this);
		this.setLayout(gl);
		gl.setAutoCreateGaps(true);

		gl.setHorizontalGroup(gl.createSequentialGroup()
			.addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(searchField)
				.addComponent(pane)
			//FIX THIS ERROR
				.addComponent(inputButton)
				.addComponent(deleteButton)
				.addComponent(quitButton))
		);

		gl.setVerticalGroup(gl.createSequentialGroup()
			.addComponent(searchField)
				.addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
					.addComponent(

	}

	public DefaultTableModel init_table(){
		return dataBaseControl.get_tableModel();
	}
	public void refresh_model(){
		
		table.setModel(dataBaseControl.get_tableModel());
	}
}

