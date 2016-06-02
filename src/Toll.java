
public class Toll {
	private String barrierStatus = "close";
	private float toolPrice;
	
	private Carro car = new Carro();
	private SmartCard smartCard = new SmartCard();
	private Display display = new Display(this.toolPrice, this.smartCard.getSaldo());
	// ??????
	private Camera camera = new Camera;
	
	//Verifica se o carro possui o computador com saldo disponivel
	public Boolean verifyCarComputer() {
		if (car.hasComputer && smartCard.getSaldo() >= this.toolPrice) {
			return true;
		} else {
			return false;
		}
	}
	
	// Caso o carro esteja liberado, a cancela é aberta
	public void manageBarrier() {
		if (paymentIsReceived()) {
			this.barrierStatus = "open";
			System.out.println("Cancela aberta.\n");
		} else {
			this.barrierStatus = "close";
			System.out.println("Cancela continua fechada.\n");
		}
	}
	
	// Checa se o carro possui o computador ou se o pagamento foi efetivado
	public Boolean paymentIsReceived() {
		if (verifyCarComputer()) {
			return true;
		} else {
			Boolean paymentIsMade = display.getPayment();
			return paymentIsMade;
		}
	}
	
	public void verifyLicensePlate() {
		camera.getCarsLicensePlate();
		
		// Connect to DB?
	}
}
