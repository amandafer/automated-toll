
public class Toll {
	private String barrierStatus = "close";
	private double tollPrice;

	private Car car = new Car();
	private SmartCard smartCard = new SmartCard();
	private Camera camera = new Camera(); 

	public Toll (double tollPrice) {
		this.tollPrice = 5.00;
	}
	
	private Display display = new Display(this.tollPrice, smartCard.getBalance());
	
	//Verifica se o carro possui o computador com saldo disponivel
	public boolean verifyCarComputer() {
		if (car.hasComputer() && car.useSmartCard(this.tollPrice)) {
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
	public boolean paymentIsReceived() {
		if (verifyCarComputer()) {
			return true;
		} else {
			Boolean paymentIsMade = display.getPayment();
			return paymentIsMade;
		}
	}
	
	public void verifyLicensePlate() {
		camera.getLicense();
		
		// Connect to DB?
	}
}
