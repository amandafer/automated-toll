/**
 * Classe para modelar a entidade Motorista
 * @author AlbertoPassini
 */
public class Motorista 
{
    /* Atributos da classe */
    private String CPF;
    private String CNH;
    private String nome;
    
    /* Metodos construtores */
    public Motorista(){}
    
    public Motorista(String CPF, String CNH, String nome) 
    {
        this.CPF = CPF;
        this.CNH = CNH;
        this.nome = nome;
    }
    
    /* Métodos getter e setter, para acesso aos atributos da classe */
    public String getCPF() 
    {
        return CPF;
    }

    public void setCPF(String CPF) 
    {
        this.CPF = CPF;
    }

    public String getCNH() 
    {
        return CNH;
    }

    public void setCNH(String CNH) 
    {
        this.CNH = CNH;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }
}
