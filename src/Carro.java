/**
 * Classe para modelar a entidade Carro
 * @author AlbertoPassini
 */
public class Carro  {
    /* Atributos da classe */
    private String placa;
    private String chassi;
    private String situacao;
    private String descricaoSituacao;
    private Motorista motorista;
    private Computador computador;

    /* Metodos construtores */
    public Carro(){}

    //Construtor para carro com computador de bordo acoplado
    public Carro(String placa, String chassi, String situacao, String descricaoSituacao, Motorista motorista, Computador computador) 
    {
        this.placa = placa;
        this.chassi = chassi;
        this.situacao = situacao;
        this.descricaoSituacao = descricaoSituacao;
        this.motorista = motorista;
        this.computador = computador;
    }

    //Construtur para carro sem computador de bordo acoplado
    public Carro(String placa, String chassi, String situacao, String descricaoSituacao, Motorista motorista) 
    {
        this.placa = placa;
        this.chassi = chassi;
        this.situacao = situacao;
        this.descricaoSituacao = descricaoSituacao;
        this.motorista = motorista;
    }
    
    /* Métodos getter e setter, para acesso aos atributos da classe */
    public String getPlaca() 
    {
        return placa;
    }

    public void setPlaca(String placa) 
    {
        this.placa = placa;
    }

    public String getChassi() 
    {
        return chassi;
    }

    public void setChassi(String chassi) 
    {
        this.chassi = chassi;
    }

    public String getSituacao() 
    {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getDescricaoSituacao() 
    {
        return descricaoSituacao;
    }

    public void setDescricaoSituacao(String descricaoSituacao) 
    {
        this.descricaoSituacao = descricaoSituacao;
    }

    public Motorista getMotorista() 
    {
        return motorista;
    }

    public void setMotorista(Motorista motorista) 
    {
        this.motorista = motorista;
    }

    public Computador getComputador() 
    {
        return computador;
    }

    public void setComputador(Computador computador)
    {
        this.computador = computador;
    }
    
    //Metodo para verificar se o automóvel possui computador ou não
    private String verificaComputador()
    {
        if(computador!=null)
        {
            return "Possui.";
        }
        else
        {
            return "Não Possui.";
        }
    }
    
    //Método toString customizado para retornar uma string com as informações do carro quando necessário
    @Override
    public String toString() 
    {
        return "Placa: "+ getPlaca()
                +"\nChassi: " + getChassi()
                +"\nSituacao: " + getSituacao()
                +"\nDescricao: " + getDescricaoSituacao()
                +"\nNome do proprietario: " + getMotorista().getNome()
                +"\nCPF do proprietario: " + getMotorista().getCPF()
                +"\nCarteira de habilitação: " + getMotorista().getCNH()
                +"\nComputador de bordo" + verificaComputador();
    }
}
