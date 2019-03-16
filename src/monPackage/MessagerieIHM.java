package monPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MessagerieIHM {

	JFrame frame;
	private JTextField textFieldMsg;
	private JButton btnRafraichir, btnEnvoyer;
	private JLabel labelMsg1, labelMsg2, labelMsg3, labelMsg4, labelMsg5, labelMsg6, labelMsg7, labelMsg8, labelMsg9,
			labelMsg10;
	private Controler controler;

	// ----------------
	// Constructor
	// ------------------

	public MessagerieIHM() {
		initialize();
	}

	// ------------------------------------------
	// Initialize the contents of the frame.
	// ------------------------------------------

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 391);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		btnRafraichir = new JButton("Rafraichir");
		btnRafraichir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				controler.clicBtnRefresh();
			}
		});
		btnRafraichir.setBounds(335, 270, 89, 23);
		frame.getContentPane().add(btnRafraichir);

		btnEnvoyer = new JButton("envoyer");
		btnEnvoyer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controler.clicBtnEnvoyer(null);
			}
		});
		btnEnvoyer.setBounds(335, 304, 89, 23);
		frame.getContentPane().add(btnEnvoyer);

		textFieldMsg = new JTextField();
		textFieldMsg.setBounds(10, 287, 315, 45);
		frame.getContentPane().add(textFieldMsg);
		textFieldMsg.setColumns(10);

		JLabel labelMsg1 = new JLabel("New label");
		labelMsg1.setBounds(21, 20, 380, 14);
		frame.getContentPane().add(labelMsg1);

		JLabel labelMsg2 = new JLabel("New label");
		labelMsg2.setBounds(21, 45, 380, 14);
		frame.getContentPane().add(labelMsg2);

		JLabel labelMsg3 = new JLabel("New label");
		labelMsg3.setBounds(21, 70, 380, 14);
		frame.getContentPane().add(labelMsg3);

		JLabel labelMsg4 = new JLabel("New label");
		labelMsg4.setBounds(21, 95, 380, 14);
		frame.getContentPane().add(labelMsg4);

		JLabel labelMsg5 = new JLabel("New label");
		labelMsg5.setBounds(21, 120, 380, 14);
		frame.getContentPane().add(labelMsg5);

		JLabel labelMsg6 = new JLabel("New label");
		labelMsg6.setBounds(21, 145, 380, 14);
		frame.getContentPane().add(labelMsg6);

		JLabel labelMsg7 = new JLabel("New label");
		labelMsg7.setBounds(21, 170, 403, 14);
		frame.getContentPane().add(labelMsg7);

		JLabel labelMsg8 = new JLabel("New label");
		labelMsg8.setBounds(21, 195, 403, 14);
		frame.getContentPane().add(labelMsg8);

		JLabel labelMsg9 = new JLabel("New label");
		labelMsg9.setBounds(21, 220, 403, 14);
		frame.getContentPane().add(labelMsg9);

		JLabel labelMsg10 = new JLabel("New label");
		labelMsg10.setBounds(21, 245, 403, 14);
		frame.getContentPane().add(labelMsg10);

	}

	// -----------------------------------------
	// Methode pour mettre à jour les données
	// -----------------------------------------

	public void majUser(String nom) {

	}

	public void majTextField(String message) {
		textFieldMsg.setText(message);

	}

	public void majListeMsg(ArrayList<MessageBean> list) {

	}

	public void updateMsgErr(String err) {

	}

	// -------------------------
	// Getter & Setter
	// -------------------------

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getTextFieldMsg() {
		return textFieldMsg;
	}

	public void setTextFieldMsg(JTextField textFieldMsg) {
		this.textFieldMsg = textFieldMsg;
	}

	public Controler getControler() {
		return controler;
	}

	public void setControler(Controler controler) {
		this.controler = controler;
	}

	public JButton getBtnRafraichir() {
		return btnRafraichir;
	}

	public void setBtnRafraichir(JButton btnRafraichir) {
		this.btnRafraichir = btnRafraichir;
	}

	public JButton getBtnEnvoyer() {
		return btnEnvoyer;
	}

	public void setBtnEnvoyer(JButton btnEnvoyer) {
		this.btnEnvoyer = btnEnvoyer;
	}

	public JLabel getLabelMsg1() {
		return labelMsg1;
	}

	public void setLabelMsg1(JLabel labelMsg1) {
		this.labelMsg1 = labelMsg1;
	}

	public JLabel getLabelMsg2() {
		return labelMsg2;
	}

	public void setLabelMsg2(JLabel labelMsg2) {
		this.labelMsg2 = labelMsg2;
	}

	public JLabel getLabelMsg3() {
		return labelMsg3;
	}

	public void setLabelMsg3(JLabel labelMsg3) {
		this.labelMsg3 = labelMsg3;
	}

	public JLabel getLabelMsg4() {
		return labelMsg4;
	}

	public void setLabelMsg4(JLabel labelMsg4) {
		this.labelMsg4 = labelMsg4;
	}

	public JLabel getLabelMsg5() {
		return labelMsg5;
	}

	public void setLabelMsg5(JLabel labelMsg5) {
		this.labelMsg5 = labelMsg5;
	}

	public JLabel getLabelMsg6() {
		return labelMsg6;
	}

	public void setLabelMsg6(JLabel labelMsg6) {
		this.labelMsg6 = labelMsg6;
	}

	public JLabel getLabelMsg7() {
		return labelMsg7;
	}

	public void setLabelMsg7(JLabel labelMsg7) {
		this.labelMsg7 = labelMsg7;
	}

	public JLabel getLabelMsg8() {
		return labelMsg8;
	}

	public void setLabelMsg8(JLabel labelMsg8) {
		this.labelMsg8 = labelMsg8;
	}

	public JLabel getLabelMsg9() {
		return labelMsg9;
	}

	public void setLabelMsg9(JLabel labelMsg9) {
		this.labelMsg9 = labelMsg9;
	}

	public JLabel getLabelMsg10() {
		return labelMsg10;
	}

	public void setLabelMsg10(JLabel labelMsg10) {
		this.labelMsg10 = labelMsg10;
	}
}
