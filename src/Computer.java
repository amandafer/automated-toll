/**
 * Classe para modelar a entidade computador de bordo.
 */

public class Computer {
    private SmartCard smartCard = new SmartCard();
    
    public Boolean useSmartCard(double toolPrice) {
    	Boolean hasBalance = smartCard.debit(toolPrice);
    	return hasBalance;
    }
}
