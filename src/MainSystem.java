/**
 * Sistema de pedagio
 */
public class MainSystem {
    public static void main(String[] args) {
        // TODO instantiate tolls
    	double tollPrice = 5.00;
    	
    	Toll toll = new Toll(tollPrice);
  
    	toll.manageBarrier();
    }
    
}
