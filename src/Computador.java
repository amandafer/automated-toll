/**
 * Classe para modelar a entidade computador de bordo
 * @author AlbertoPassini
 */
public class Computador 
{
    private SmartCard smartCard;
    
    public Computador(){}
    
    public Computador(SmartCard smartCard) 
    {
        this.smartCard = smartCard;
    }

    public void setSmartCard(SmartCard smartCard) {
        this.smartCard = smartCard;
    }
    
    public Double pegaSaldo()
    {
        return smartCard.getSaldo();
    }
}
