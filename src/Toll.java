
public class Toll {
	private String barrierStatus = "close";
	private double tollPrice;

	private Car car = new Car();
	private Display display;
    private DetranDBController data = new DetranDBController(car.getLicensePlate());
    private TollDBController tollData = new TollDBController();

	public Toll (double tollPrice) {
		this.tollPrice = tollPrice;
	}
	
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
			display = new Display(this.tollPrice);
			Boolean paymentIsMade = display.getPayment();
			return paymentIsMade;
		}
	}
	
	public void verifyLicensePlate() {
		boolean legal = data.checkLicensePlate();
		
		if(!legal) {
			data.sendAlert();
		}
	}
	
	public void sendCarInfo() {
		tollData.saveCarInfo(car.getInfo());
	}
}
