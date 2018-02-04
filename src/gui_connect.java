import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class gui_connect extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnConnect;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					gui_connect frame = new gui_connect();
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
	public gui_connect() {
		initComponents();
		createEvents();
	}

	private void createEvents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 220, 125);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setResizable(false);
		contentPane.setLayout(null);

		JLabel lblIpAddress = new JLabel("IP Address:");
		lblIpAddress.setBounds(5, 10, 70, 10);
		contentPane.add(lblIpAddress);

		JLabel lblPort = new JLabel("Port:");
		lblPort.setBounds(5, 40, 60, 10);
		contentPane.add(lblPort);

		textField = new JTextField();
		textField.setBounds(81, 2, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(81, 32, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		btnConnect = new JButton("Connect");
		btnConnect.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Add code for action here
			}
		});
		btnConnect.setBounds(43, 68, 117, 29);
		contentPane.add(btnConnect);
	}

	private void initComponents() {

	}
}