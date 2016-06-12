/**
 * A classe gerencia a cancela, o display e recebe as informações.
 * Ela também envia um alerta, caso haja um defeito no sistema ou infração com o carro
 */

public class Toll {
	private boolean barrierStatus = false;
	private double tollPrice;

	private Car car = new Car();
	private Display display;
    private DetranDBController data = new DetranDBController(car.getLicensePlate());
    private TollDBController tollData = new TollDBController();
    private ControlCenter controlCenter = new ControlCenter();

	public Toll (double tollPrice) {
		this.tollPrice = tollPrice;
	}
	
	//Verifica se o carro possui o computador com saldo disponivel
	public boolean verifyCarComputer() {
		if (car.hasComputer() && car.useSmartCard(this.tollPrice)) {
			System.out.println("Carro possui computador de bordo e saldo suficiente.");
			return true;
		} else {
			return false;
		}
	}
	
	// Caso o carro esteja liberado, a cancela é aberta
	public void manageBarrier() {
		try {
			if (paymentIsReceived()) {
				this.barrierStatus = true;
				System.out.println("Cancela aberta.");
			} else {
				this.barrierStatus = false;
				System.out.println("Cancela fechada.");
			}
		} catch (Exception exception) {
			controlCenter.defectDetected();
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
