import java.util.Random;

public class Dice {
	
	    private Random random = new Random();
	    
	    //Constructor
	    public Dice (){

	    }

	    //Random 6 Sided Dice
	    public int rollDice() {
			  return random.nextInt(6) + 1;
		}
}

