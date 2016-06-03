/**
 * Classe para modelar a entidade smart-card
 * @author AlbertoPassini
 */
public class SmartCard {
	double BALANCE = 2.00;
	
    /* Atributo da classe */
    private double balance = BALANCE;

    /* Getters and setters */
    public Double getBalance() {
        return this.balance;
    }
    
    //Método para creditar um valor no smart-card e retornar o saldo atualizado
    /*
    public String credita(Double valor) {
        saldo = saldo + valor;
        
        return "Saldo Atual: " + saldo;
    }
    */
    
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
