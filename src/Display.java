import java.util.Scanner;

public class Display {
	private String paymentMethod;
	private double toolPrice, smartCardBalance;
	private Scanner scan = new Scanner(System.in);
	
	public Display(double toolPrice, double smartCardBalance) {
		this.toolPrice = toolPrice;
		this.smartCardBalance = smartCardBalance;
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
		chooseTypeOfPayment();
		Boolean paid = false;
		
		while (!paid) {
			switch(this.paymentMethod) {
				case("dinheiro"):
					System.out.println("Entre com o valor: \n");
					double money = scan.nextFloat();
					double change = money - this.toolPrice;
					
					while (change < 0) {
						System.out.println("Faltam R$" + change + " para o pagamento do pedágio.\n");
						money = scan.nextFloat();
						change = money - this.toolPrice;
						
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
					Boolean valid = checkCard();
					if (valid)
						paid = true;
					else
						System.out.println("Erro com o cartão. Tente novamente.\n");
					break;
				
				case("smartcard"):
					if (this.smartCardBalance >= this.toolPrice) {
						paid = true;
						System.out.println("Pagamento realizado.\n");
					} else {
						System.out.println("Saldo insuficiente.\n");
					}
				
				default:
					System.out.println("Pagamento cancelado.\n");
					return paid;
			}
		}
		return paid;
	}
	
	// TODO if needed
	public Boolean checkCard() {
		return true;
	}
}
