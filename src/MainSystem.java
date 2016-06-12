import java.util.Scanner;

/**
 * Sistema de pedagio
 * Cada pedágio é composto por uma câmera, cancela, display (com máquinas de cartões de crédito e 
 * smart card readers) e um comunicador que verifica se o carro possui computador de bordo.
 */

public class MainSystem {
    private static Scanner scan;

	public static void main(String[] args) {
    	scan = new Scanner(System.in);
    	int numberOfTolls, numberOfAuthorizedStaff;
    	double tollPrice;
    	
    	CreateManageAuthorizedStaff[] arrayOfStaff;
    	Toll[] arrayOfTolls;
    	
    	// Inicializa os pedagios
    	System.out.println("Número de pedágios do estabelecimento: ");
    	numberOfTolls = scan.nextInt();
    	arrayOfTolls = new Toll[numberOfTolls];
    	
    	System.out.println("Valor do pedágio: ");
		tollPrice = scan.nextDouble();
    	
    	for (int i = 0; i < numberOfTolls; i++) {
    		arrayOfTolls[i] = new Toll(tollPrice);
    	}
    	
    	
    	// Inicializa os funcionarios
    	System.out.println("Número de funcionários autorizados: ");
    	numberOfAuthorizedStaff = scan.nextInt();
    	arrayOfStaff = new CreateManageAuthorizedStaff[numberOfAuthorizedStaff];
    	
    	for (int i = 0; i < numberOfAuthorizedStaff; i++) {
    		System.out.println("Nome do funcionário: ");
    		String name = scan.next();
    		System.out.println("Cargo do funcionário: ");
    		String jobTitle = scan.next();
    		System.out.println("ID do funcionário: ");
    		int companyID = scan.nextInt();
    		System.out.println("Login do funcionário: ");
    		String login = scan.next();
    		System.out.println("Password do funcionário:");
    		String password = scan.next();
    		
    		arrayOfStaff[i] = new CreateManageAuthorizedStaff(name, jobTitle, companyID, password, login);
    		arrayOfStaff[i].sendStaffData();
    	}
    	
    	
    	// Gerencia cada pedágio 
    	for (int i = 0; i < numberOfTolls; i++) {
    		arrayOfTolls[i].manageBarrier();
    	}
    }
}
