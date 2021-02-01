import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

public class employe {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					employe window = new employe();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public employe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnNewButton = new JButton("Recherche");
		
		JButton btnAjouter = new JButton("Ajouter");
		
		JButton btnSupprimer = new JButton("Supprimer");
		
		JButton btnModifier = new JButton("Modifier");
		
		JButton btnFermer = new JButton("Fermer");
		
		JButton btnAfficherLesRsultats = new JButton("Afficher les r\u00E9sultats");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 924, GroupLayout.PREFERRED_SIZE)
					.addGap(46)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnFermer, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnModifier, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSupprimer, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAjouter, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAfficherLesRsultats, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(32, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(56, Short.MAX_VALUE)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 444, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(123)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnAfficherLesRsultats, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnAjouter, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnSupprimer, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnModifier, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnFermer, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(105, Short.MAX_VALUE))
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, "", "", null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"ID", "Nom", "Pr\u00E9nom", "Adresse", "E-mail(Perso)", "Tel (Perso)", "Date d'entr\u00E9e", "Department", "E-mail (Travail)", "Tel (Travail)", "Type D'emploi", "Salaire"
			}
		));
		table.getColumnModel().getColumn(4).setPreferredWidth(94);
		table.getColumnModel().getColumn(6).setPreferredWidth(97);
		table.getColumnModel().getColumn(8).setPreferredWidth(95);
		table.getColumnModel().getColumn(9).setPreferredWidth(115);
		table.getColumnModel().getColumn(10).setPreferredWidth(98);
		scrollPane.setViewportView(table);
		frame.getContentPane().setLayout(groupLayout);
	}
}
