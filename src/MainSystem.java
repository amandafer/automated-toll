/**
 *
 * @author JCMBBH-74
 */
public class MainSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO instantiate tolls
    	double tollPrice = 5.00;
    	
    	Toll toll = new Toll(tollPrice);
  
    	toll.manageBarrier();
    }
    
}
