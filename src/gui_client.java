import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class gui_client extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldPublisher;
	private JTextField textFieldYear;
	private JTextField textFieldAuthor;
	private JTextField textFieldTitle;
	private JTextField textFieldIsbn;
	private JTextField textField;
	private JTextField textField_1;
	private JTextArea textAreaOutput;

	public String getPublisher() {
		return textFieldPublisher.getText();
	}

	public int getYear() {
		int year = 0;
		try {
			year = Integer.parseInt(textFieldPublisher.getText());
		} catch (NumberFormatException e) {
			textAreaOutput.setText("please enter a Integer into Year");
		}
		return year;
	}

	public String getAuthor() {
		return textFieldAuthor.getText();
	}

	@Override
	public String getTitle() {
		return textFieldTitle.getText();
	}

	public String getIsbn() {
		return textFieldIsbn.getText();
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					gui_client frame = new gui_client();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public gui_client() {
		initComponents();
		createEvents();
	}

	private void createEvents() {
		// TODO Auto-generated method stub

	}

	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblIsbn = new JLabel("ISBN:");
		lblIsbn.setBounds(6, 24, 61, 16);
		contentPane.add(lblIsbn);

		textFieldPublisher = new JTextField();
		textFieldPublisher.setBounds(73, 131, 130, 26);
		contentPane.add(textFieldPublisher);
		textFieldPublisher.setColumns(10);

		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setBounds(6, 52, 61, 16);
		contentPane.add(lblTitle);

		JLabel lblAuthor = new JLabel("Author:");
		lblAuthor.setBounds(6, 80, 61, 16);
		contentPane.add(lblAuthor);

		JLabel lblYear = new JLabel("Year:");
		lblYear.setBounds(6, 108, 61, 16);
		contentPane.add(lblYear);

		JLabel lblPublisher = new JLabel("Publisher:");
		lblPublisher.setBounds(6, 136, 63, 16);
		contentPane.add(lblPublisher);

		textFieldYear = new JTextField();
		textFieldYear.setBounds(73, 103, 130, 26);
		contentPane.add(textFieldYear);
		textFieldYear.setColumns(10);

		textFieldAuthor = new JTextField();
		textFieldAuthor.setBounds(73, 75, 130, 26);
		contentPane.add(textFieldAuthor);
		textFieldAuthor.setColumns(10);

		textFieldTitle = new JTextField();
		textFieldTitle.setBounds(73, 47, 130, 26);
		contentPane.add(textFieldTitle);
		textFieldTitle.setColumns(10);

		textFieldIsbn = new JTextField();
		textFieldIsbn.setBounds(73, 19, 130, 26);
		contentPane.add(textFieldIsbn);
		textFieldIsbn.setColumns(10);

		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Add code for action here
			}
		});
		btnSubmit.setBounds(6, 160, 200, 29);
		contentPane.add(btnSubmit);

		JButton btnRemove = new JButton("REMOVE");
		btnRemove.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Add code for action here

			}
		});
		btnRemove.setBounds(6, 235, 200, 29);
		contentPane.add(btnRemove);

		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Add code for action here
			}
		});
		btnUpdate.setBounds(6, 185, 200, 29);
		contentPane.add(btnUpdate);

		JButton btnGet = new JButton("GET");
		btnGet.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Add code for action here
			}
		});
		btnGet.setBounds(6, 210, 200, 29);
		contentPane.add(btnGet);

		textAreaOutput = new JTextArea();
		textAreaOutput.setBounds(215, 21, 350, 350);
		textAreaOutput.setEditable(false);
		contentPane.add(textAreaOutput);

		JLabel lblIp = new JLabel("IP:");
		lblIp.setBounds(6, 270, 61, 16);
		contentPane.add(lblIp);

		JLabel lblPort = new JLabel("Port:");
		lblPort.setBounds(6, 298, 61, 16);
		contentPane.add(lblPort);

		textField = new JTextField();
		textField.setBounds(73, 265, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(73, 293, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JButton btnConnect = new JButton("Connect");
		btnConnect.setBounds(6, 330, 85, 29);
		contentPane.add(btnConnect);

		JButton btnDisconnect = new JButton("Disconnect");
		btnDisconnect.setBounds(86, 330, 117, 29);
		contentPane.add(btnDisconnect);
	}
}