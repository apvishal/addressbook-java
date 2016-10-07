import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;

public class searchView extends JFrame implements ActionListener{

	private static JTable table;
	private JScrollPane pane;
	private JTextField searchField = new JTextField("Search Entries...");

	private JButton deleteButton = new JButton("Delete Entry");
	private JButton insertButton = new JButton("Insert Entry");
	private JButton quitButton = new JButton("Quit");

	private Object[] buttonOptions = {"Continue", "ABORT"};
	
	public searchView(){

		this.setTitle("Address Book Proggie");
		this.setSize(800,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		table = new JTable(init_table());
		pane = new JScrollPane(table);
		pane.setPreferredSize(new Dimension(600,400));

		GroupLayout gl = new GroupLayout(this.getContentPane());
		this.setLayout(gl);
		gl.setAutoCreateGaps(true);

		insertButton.setActionCommand("INSERT");
		insertButton.addActionListener(this);

		deleteButton.setActionCommand("DELETE");
		deleteButton.addActionListener(this);

		quitButton.setActionCommand("QUIT");
		quitButton.addActionListener(this);


		gl.setHorizontalGroup(gl.createSequentialGroup()
			.addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(searchField)
				.addComponent(pane)
					.addGroup(gl.createSequentialGroup()
						.addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(insertButton))
						.addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(deleteButton))
						.addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(quitButton))))
		);

		gl.setVerticalGroup(gl.createSequentialGroup()
			.addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
				.addComponent(searchField))
			.addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
				.addComponent(pane))
			.addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
				.addComponent(insertButton)
				.addComponent(deleteButton)
				.addComponent(quitButton))
		);
		
		this.pack();
		this.setVisible(true);

	}

	

	public DefaultTableModel init_table(){
		return dataBaseControl.get_tableModel();
	}
	public static void refresh_model(){
		
		table.setModel(dataBaseControl.get_tableModel());
	}

       public void actionPerformed(ActionEvent evt){
                String command = evt.getActionCommand();
                if(command == "INSERT"){
			insertView insert = new insertView();
                }
                else if(command == "DELETE"){
			String deleteInfo = "";
                	System.out.println(Integer.valueOf((String)table.getValueAt(table.getSelectedRow(), 0)));
			for(int i = 0; i < 3; ++i){
				deleteInfo += table.getValueAt(table.getSelectedRow(), i);
				deleteInfo += " ";
			}

                                if (JOptionPane.showOptionDialog(null, "Are you sure you want to"
                                + " delete the following option below?\n\n" + deleteInfo,
                                "Confirm Delete", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null,
                                buttonOptions, buttonOptions[1]) == JOptionPane.YES_OPTION){
                                        dataBaseControl.deleteEntry(Integer.valueOf((String)table.getValueAt(table.getSelectedRow(), 0)));
                                        refresh_model();
                                }
		}
        }

}

