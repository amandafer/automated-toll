/*
 * Conecta a database do Detran e recebe as informacoes do veiculo
 */
public class DetranDBController {
	private String licensePlate;
	
	public DetranDBController(String licensePLate) {
		this.licensePlate = licensePlate;
	}
	
	public String requestCarInformation() {
		String info = "";
		
		return info;
	}
	
	public String requestOwnerInformation() {
		String info = "";
		
		return info;
	}
	
	public void sendAlert() {
		
	}
	
	public boolean checkLicensePlate() {
		// TODO:
		return true;
	}
}
