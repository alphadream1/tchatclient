package monPackage;

public class Controler {

	// Donnée
	private MessageBean msg;
	// IHM
	private MessagerieIHM ihm;

	// --------------------
	// Constructeur
	// ------------------------
	public Controler() {
		super();
		msg = new MessageBean();
	}

	// -------------------
	// Methodes
	// -----------------

	public void clicBtnEnvoyer(String message) {
		msg.setContenu(message);
		setMsg(msg);
	}

	public void clicBtnRefresh() {

	}

	// -------------------
	// Getter & Setter
	// -------------------

	public MessageBean getMsg() {
		return msg;
	}

	public void setMsg(MessageBean msg) {
		this.msg = msg;
	}

	public MessagerieIHM getIhm() {
		return ihm;
	}

	public void setIhm(MessagerieIHM ihm) {
		this.ihm = ihm;
	}

}
