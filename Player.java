public class Player {

		// ATTRIBUTES
		private int player1Position;
		private int player2Position;
		private int player1Color;
		private int player2Color;
		private int dice = 0; //RECENT DICE

		
		//CONSTRUCTOR
		public Player() {

		}

		//GETTERS
		public int getp1Position(){ 
		    return player1Position;
		}
		public int getp2Position(){
		    return player2Position;
		}
		public int getPlayer1Color(){ 
		    return player1Color;
		}
		public int getPlayer2Color(){ 
		    return player2Color;
		}
		public int getPlayerDice(){
		    return dice;
		}

		//SETTERS
		public void setP1Position(int p1Roll){
		    dice = p1Roll;
		    player1Position += p1Roll;
		}
		public void setP2Position(int p2Roll){
		    dice = p2Roll;
		    player2Position += p2Roll;
		}
		public void setPlayer1Color(int color){
		    this.player1Color = color;
		}
		public void setPlayer2Color(int color){
		    this.player2Color = color;
		}
		public void setDice(int dice) {
			this.dice = dice;
		}
		
		//RESET DICE
		public void resetDice(){
			dice = 0;
		}
		
		//RESET PLAYER POSITION
		public void resetPlayerPosition(){
			player1Position = 0;
			player2Position = 0;
		}
		
		//FOR BATO MINUS THE POSITION OF PLAYER
		public void getBack(int player, int dice) {
			this.dice = dice;
			if (player == 1) {
				player1Position -= dice;
			}else if (player == 2){
			    player2Position -= dice;
			}
		}
		
		//RESET All
		public void resetAllPlayer() {
			player1Position = 0;
			player2Position = 0;
			player1Color = 0;
			player2Color = 0;
			dice = 0;
		}


}


