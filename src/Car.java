/**
 * Classe para modelar a entidade Carro
 * @author AlbertoPassini
 */

public class Car  {
    /* Atributos da classe */
    private String licensePlate, chassi, situation, descriptionSituation;
    private boolean hasComputer = false;
    private Motorista motorista;
    private Computer computer = new Computer();
    private Camera camera = new Camera();
    private Data data = new Data(this.licensePlate);
    
    boolean COMPUTER = true;
    
    /* Metodos construtores */
    public Car() {
    	this.licensePlate = camera.getLicense();
    	/*
    	this.chassi = data.getChassi();
    	this.situation = data.situation();
    	*/
    }
    
    /* Métodos getter, para acesso aos atributos da classe */
    public String getLicensePlate() {
        return this.licensePlate;
    }

    public String getChassi() {
        return this.chassi;
    }

    public String getSituation() {
        return this.situation;
    }

    public String getDescriptionSituation() {
        return this.descriptionSituation;
    }

    public Motorista getMotorista() {
        return motorista;
    }
    
    //Metodo para verificar se o automóvel possui computador ou não
    public boolean hasComputer() {
    	this.hasComputer = checkCarComputer();
    	
        if (hasComputer) {
        	System.out.println("Car has computer!\n");
            return true;
        } else {
        	System.out.println("Car doesn't have computer!\n");
            return false;
        }
    }
    
    // Comunica com o carro e recebe a informacao
    public boolean checkCarComputer() {
    	return COMPUTER;
    }
    
    public Boolean useSmartCard(double toolPrice) {
    	Boolean hasPaid = computer.useSmartCard(toolPrice);
    	return hasPaid;
    }
    
    //Método toString customizado para retornar uma string com as informações do carro quando necessário
    @Override
    public String toString() {
        return "Placa: "+ getLicensePlate()
                +"\nChassi: " + getChassi()
                +"\nSituacao: " + getSituation()
                +"\nDescricao: " + getDescriptionSituation()
                +"\nNome do proprietario: " + getMotorista().getNome()
                +"\nCPF do proprietario: " + getMotorista().getCPF()
                +"\nCarteira de habilitação: " + getMotorista().getCNH()
                +"\nComputador de bordo" + hasComputer();
    }
}
