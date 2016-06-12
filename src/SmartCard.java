/**
 * Classe para modelar a entidade smart-card.
 */

public class SmartCard {
	// TESTING VARIABLE
	private double BALANCE = 10.0;
	// END
	
    /* Atributo da classe */
    private double balance = BALANCE;

    /* Getters and setters */
    public Double getBalance() {
        return this.balance;
    }
    
    // Lê o saldo do cartão pelo smart card reader
    public void readBalance() {
    	throw new UnsupportedOperationException("Not supported yet.");
    }
    
    //Método para debitar um valor no smart-card e retornar o saldo atualizado
    public boolean debit(double value) {
        //Só debita se tiver saldo suficiente
    	try {
	        if ((balance-value)>=0) {
	            this.balance = this.balance - value;
	            return true;
	            //return "Saldo Atual: " + balance;
	        } else {
	        	return false;
	            //return "Você não possui saldo suficiente.";
	        }
    	} catch (Exception exception) {
    		System.out.println(exception.getStackTrace());
    		return false;
    	}
    }
}
