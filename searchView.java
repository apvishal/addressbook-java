import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;

public class searchView extends JPanel{

	private JTable table;
	Vector db_columns = new Vector();
	Vector db_data;

	public searchView(){

		table = new JTable(init_table());
		this.add(table);
	}

	public DefaultTableModel init_table(){
		return dataBaseControl.get_tableModel();
	}
	public void refresh_model(){
		
		table.setModel(dataBaseControl.get_tableModel());
	}
}

