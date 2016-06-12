/**
 * A classe camera se conecta com a camera posicionada em cada pedagio e, apos processo da imagem, 
 * retorna a placa do carro que ali se encontra.
 */

public class Camera {
	private String carLicense;
	
	// Conecta com a camera externa e recebe a imagem da placa
	public void connectWithCamera() {
		throw new UnsupportedOperationException("Not supported yet.");
	}
	
	// Trata a imagem da placa para que ela possa ser lida como string
	public void processingImage() {
		throw new UnsupportedOperationException("Not supported yet.");
	}
	
	public String getLicense() {
		return this.carLicense;
	}
}
