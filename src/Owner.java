/**
 * Classe para modelar a entidade Motorista
 * @author AlbertoPassini
 */
public class Owner 
{
    /* Atributos da classe */
    private String info, CPF, CNH, nome;
    
    public Owner(String info) {
        this.info = info;
    }
    
    /* Esses metodos irao destrinchar as informacoes pegas e separa-las */
    public String getCPF()  {
        return CPF;
    }

    public String getCNH() {
        return CNH;
    }

    public String getNome() {
        return nome;
    }
}
