package ClientGUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTree;
import javax.swing.JList;

public class ReportsGUI extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ReportsGUI dialog = new ReportsGUI();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ReportsGUI() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnNewButton_2 = new JButton("All Reports");
				buttonPane.add(btnNewButton_2);
			}
			{
				JButton btnNewButton_1 = new JButton("Deposit Reports");
				buttonPane.add(btnNewButton_1);
			}
			{
				JButton btnNewButton = new JButton("Withdrawal Reports");
				buttonPane.add(btnNewButton);
			}
		}
		{
			JList list = new JList();
			getContentPane().add(list, BorderLayout.CENTER);
		}
	}

}
