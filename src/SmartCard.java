/**
 * Classe para modelar a entidade smart-card
 * @author AlbertoPassini
 */
public class SmartCard 
{
    /* Atributo da classe */
    private Double saldo;
    
    /* Métodos construtores */
    public SmartCard(){}

    public SmartCard(Double saldo) 
    {
        this.saldo = saldo;
    }
    
    /* Getters and setters */
    public Double getSaldo() 
    {
        return saldo;
    }

    public void setSaldo(Double saldo) 
    {
        this.saldo = saldo;
    }
    
    //Método para creditar um valor no smart-card e retornar o saldo atualizado
    public String credita(Double valor)
    {
        saldo = saldo + valor;
        
        return "Saldo Atual: " + saldo;
    }
    
    //Método para debitar um valor no smart-card e retornar o saldo atualizado
    public String debita(Double valor)
    {
        //Só debita se tiver saldo suficiente
        if((saldo-valor)>=0)
        {
            saldo = saldo - valor;
            
            return "Saldo Atual: " + saldo;
        }
        else
        {
            return "Você não possui saldo suficiente.";
        }
    }
}
