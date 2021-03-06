import java.util.Scanner;

/**
 * Classe que gerencia a forma de pagamento do motorista.
 * É acessada apenas se o carro não possui um computador de bordo com saldo.
 */

public class Display {
	private String paymentMethod;
	private double tollPrice, smartCardBalance;
	private Scanner scan = new Scanner(System.in);
	private SmartCard smartCard = new SmartCard();
	
	public Display(double tollPrice) {
		this.tollPrice = tollPrice;
		this.smartCardBalance = smartCard.getBalance();
	}
	
	public void chooseTypeOfPayment() {
		try {
			System.out.println("Escolha uma forma de pagamento (dinheiro, cartão ou smartcard): \n");
			
			paymentMethod = scan.nextLine().toLowerCase();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	public Boolean getPayment() {
		Boolean paid = false;
		
		while (!paid) {
			chooseTypeOfPayment();
			
			switch(this.paymentMethod) {
				case("dinheiro"):
					System.out.println("Entre com o valor: \n");
					double money = scan.nextFloat();
					double change = money - this.tollPrice;
					System.out.println("Toll price: " + this.tollPrice);
					
					while (change < 0) {
						System.out.println("Faltam R$" + change + " para o pagamento do pedágio.\n");
						money += scan.nextDouble();
						change = money - this.tollPrice;
						
						// TODO: cancelar operacao e receber o dinheiro de volta
					}
					
					if (change > 0) {
						System.out.println("Seu troco é de R$" + change + ". Pagamento realizado.\n");
					} else {
						System.out.println("Pagamento realizado.\n");
					}
					paid = true;
					break;
					
				// Supondo que as transacoes com o cartao funcionem
				case("cartão"):
				case("cartao"):
					Boolean valid = checkCard();
					if (valid)
						paid = true;
					else
						System.out.println("Erro com o cartão. Tente novamente.\n");
					break;
				
				case("smartcard"):
					if (this.smartCardBalance >= this.tollPrice) {
						paid = true;
						System.out.println("Pagamento realizado.\n");
					} else {
						System.out.println("Saldo insuficiente.\n");
					}
				
				default:
					System.out.println("Comando invalido. Pagamento cancelado.\n");
			}
		}
		return paid;
	}
	
	// Check the card with the credit card providers
	public boolean checkCard() {
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
