
public class CheckCarComputer {
	private boolean hasComputer;
	
	// checa se o hardware pode encontrar o computador ou nao
	public void receiveInfo(boolean info) {
		this.hasComputer = info;
	}
	
	public boolean hasComputer() {
		if (hasComputer)
			return true;
		else
			return false;
	}
}
