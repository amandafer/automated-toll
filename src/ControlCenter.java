/**
 * Esta classe comunica a um funcionario um defeito encontrado no sistema
 */

public class ControlCenter {
	private CreateManageAuthorizedStaff staff;
	private TollDBController tollData = new TollDBController();
	
	// Conecta ao banco de dados e retorna o gerente que se encontra no estabelecimento
	public void getManager() {
		throw new UnsupportedOperationException("Not supported yet.");
	}
	
	// Um erro foi notificado e o funcionario deverá verificá-lo
	public void defectDetected() {
		System.out.println("Um defeito foi encontrado");
		getManager();
	}
}
