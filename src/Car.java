import java.util.Date;

/**
 * Classe para modelar a entidade Carro
 */

public class Car  {
    /* Atributos da classe */
    private String licensePlate, carInfo;
    private boolean hasComputer = false;
    private Date dateTime = new Date();
    
    private DetranDBController data;
    private Owner ownerOfCar;
    private Computer computer = new Computer();
    private Camera camera = new Camera();
    private CheckCarComputer checkCarComputer = new CheckCarComputer();
    
    boolean COMPUTER = true;
    
    /* Metodos construtores */
    public Car() {
    	this.licensePlate = camera.getLicense();
    	this.data = new DetranDBController(this.licensePlate);
    	this.carInfo = data.requestCarInformation();
    	this.ownerOfCar = new Owner(data.requestOwnerInformation());
    }
    
    public String getLicensePlate() {
    	return this.licensePlate;
    }
    
    //Metodo para verificar se o automóvel possui computador ou não
    public boolean hasComputer() {
    	this.hasComputer = checkCarComputer.hasComputer();
    	
        if (hasComputer) {
            return true;
        } else {
            return false;
        }
    }
    
    public Boolean useSmartCard(double toolPrice) {
    	Boolean hasPaid = computer.useSmartCard(toolPrice);
    	return hasPaid;
    }
    

    public String getInfo() {
        return "Placa: "+ getLicensePlate()
        		+ "\nData: " + this.dateTime
                + "\nInformacoes sobre o carro: " + this.carInfo
                + "\nNome do proprietario: " + ownerOfCar.getNome()
                + "\nCPF do proprietario: " + ownerOfCar.getCPF()
                + "\nProprietario CNH: " + ownerOfCar.getCNH()
                + "\nComputador de bordo" + hasComputer();
    }
}
