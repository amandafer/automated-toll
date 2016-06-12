/**
 * Esta classe recebe as informações do hardware que verifica o computador de bordo do carro.
 */

public class CheckCarComputer {
	// TESTING VARIABLES
	private boolean HAS = true;
	// END
	
	private boolean hasComputer = HAS;
	
	// checa se o hardware pode encontrar o computador ou nao
	public void receiveInfo(boolean info) {
		throw new UnsupportedOperationException("Not supported yet.");
	}
	
	public boolean hasComputer() {
		if (this.hasComputer) 
			return true;
		else
			return false;
	}
}
