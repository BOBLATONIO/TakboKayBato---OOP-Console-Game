public class Board extends Design{
	
	//board Player Distance
		public String boardPlayer1Distance;
		public String boardPlayer2Distance;
		
		//Board Message Bottom
		public String messageBoard;
		
		public String p1NameBoardColor, p2NameBoardColor; 
		public String p1RepColor, p2RepColor; 
		
		public int dice = 0;
		
		public final String BATOCOLOR = B_CYAN + "      "+ RESET + B_BLACK;
		
		//Board Winning Score
		public int winningScore = 0;
		
		//boardRound
		public String round; 
		
		//boardDice
		public String diceLayer1, diceLayer2;

		public String p1S, p2S;
		public String p1N, p2N; //done 
		public String plyr2;
		
		
		public Board() {
			
		}
	
	public String   AA1 = "  --  ", AA2 = "  --  ",//1
					AB1 = "  --  ", AB2 = "  --  ",//2
					AC1 = "  --  ", AC2 = "  --  ",//3
					AD1 = "  --  ", AD2 = "  --  ",//4
					AE1 = "  --  ", AE2 = "  --  ",//5
					AF1 = "  --  ", AF2 = "  --  ",//6
					AG1 = "  --  ", AG2 = "  --  ",//7
					AH1 = "  --  ", AH2 = "  --  ",//8
		            AI1 = "  --  ", AI2 = "  --  ",//9
		            AJ1 = "  --  ", AJ2 = "  --  ",//10
		            AK1 = "  --  ", AK2 = "  --  ",//11
		            AL1 = "  --  ", AL2 = "  --  ",//12
		            AM1 = "  --  ", AM2 = "  --  ",//13
		            AN1 = "  --  ", AN2 = "  --  ",//14
		            AO1 = "  --  ", AO2 = "  --  ",//15
		            AP1 = "  --  ", AP2 = "  --  ",//16
		            AQ1 = "  --  ", AQ2 = "  --  ",//17
		            AR1 = "  --  ", AR2 = "  --  ",//18
		            AS1 = "  --  ", AS2 = "  --  ",//19
		            AT1 = "  --  ", AT2 = "  --  ",//20
		            AU1 = "  --  ", AU2 = "  --  ",//21
		            AV1 = "  --  ", AV2 = "  --  ",//22
		            AW1 = "  --  ", AW2 = "  --  ",//23
		            AX1 = "  --  ", AX2 = "  --  ",//24
		            AY1 = "  --  ", AY2 = "  --  ",//25
		            AZ1 = "  --  ", AZ2 = "  --  ",//26
		            BA1 = "  --  ", BA2 = "  --  ",//27
		            BB1 = "  --  ", BB2 = "  --  ",//28
		            BC1 = "  --  ", BC2 = "  --  ",//29
		            BD1 = "  --  ", BD2 = "  --  ",//30
		            BE1 = "  --  ", BE2 = "  --  ",//31
		            BF1 = "  --  ", BF2 = "  --  ",//32
		            BG1 = "  --  ", BG2 = "  --  ",//33
		            BH1 = "  --  ", BH2 = "  --  ",//34
		            BI1 = "  --  ", BI2 = "  --  ",//35
		            BJ1 = "  --  ", BJ2 = "  --  ",//36
		            BK1 = "  --  ", BK2 = "  --  ",//37
		            BL1 = "  --  ", BL2 = "  --  ",//38
		            BM1 = "  --  ", BM2 = "  --  ",//39
		            BN1 = "  --  ", BN2 = "  --  ",//40
		            BO1 = "  --  ", BO2 = "  --  ",//41
		            BP1 = "  --  ", BP2 = "  --  ",//42
		            BQ1 = "  --  ", BQ2 = "  --  ",//43
		            BR1 = "  --  ", BR2 = "  --  ",//44
		            BS1 = "  --  ", BS2 = "  --  ",//45
		            BT1 = "  --  ", BT2 = "  --  ",//46
		            BU1 = "  --  ", BU2 = "  --  ",//47
		            BV1 = "  --  ", BV2 = "  --  ",//48
		            BW1 = "  --  ", BW2 = "  --  ",//49
		            BX1 = "  --  ", BX2 = "  --  ",//50
		            BY1 = "  --  ", BY2 = "  --  ",//51
		            BZ1 = "  --  ", BZ2 = "  --  ",//52
		            CA1 = "  --  ", CA2 = "  --  ",//53
		            CB1 = "  --  ", CB2 = "  --  ",//54
		            CC1 = "  --  ", CC2 = "  --  ",//55
		            CD1 = "  --  ", CD2 = "  --  ",//56
		            CE1 = "  --  ", CE2 = "  --  ",//57
		            CF1 = "  --  ", CF2 = "  --  ",//58
		            CG1 = "  --  ", CG2 = "  --  ",//59
		            CH1 = "  --  ", CH2 = "  --  ",//60
		            CI1 = "  --  ", CI2 = "  --  ",//61
		            CJ1 = "  --  ", CJ2 = "  --  ",//62
		            CK1 = "  --  ", CK2 = "  --  ",//63
		            CL1 = "  --  ", CL2 = "  --  ",//64
		            CM1 = "  --  ", CM2 = "  --  ";//65
	
	
	public void setRecentDice(int recentDice) { //FOR BATO ONLY
		dice = recentDice;
	}
	
	public void printBoard(int player1Position, int player2Position, int recentDice, int gameRound, int p1Score, int p2Score) {//ito yung nagbabago bago
		playerPosition(1, player1Position);
		playerPosition(2, player2Position);
		boardDice(recentDice);
		setGameRound(gameRound);
		setBoardPlayerDistance(player1Position, player2Position);
		setScore(p1Score, p2Score);
		board();
	}
	
	public void board() {
		System.out.println("Please Override Me!");
	}
	
	public void setBoard(int gameMode, int player1Color, int player2Color, int winningScore){ //1BLue 2Yellow 3Purple 4Green 5Orange 6Red
		p1N = "P L A Y E R   1";
		setPlayerColor(1, player1Color); //player1
		setPlayerColor(2, player2Color); //player2
		setWinningScore(winningScore);
		if (gameMode == 1) {//player vs computer
			p2N = "C O M P U T E R";
			plyr2 = "COMPUTER";

		}else if (gameMode == 2) {//player vs player
			p2N = "P L A Y E R   2";
			plyr2 = "PLAYER 2";
		}
	} 
	
	private void setGameRound(int roundNum) {
		switch (roundNum) {
		case 0:
			round = "  ";
			break;
		case 1:
			round = "1 ";
			break;
		case 2:
			round = "2 ";
			break;
		case 3:
			round = "3 ";
			break;
		case 4:
			round = "4 ";
			break;
		case 5:
			round = "5 ";
			break;
		case 6:
			round = "6 ";
			break;
		case 7:
			round = "7 ";
			break;
		case 8:
			round = "8 ";
			break;
		case 9:
			round = "9 ";
			break;
		case 10:
			round = "10";
			break;
		case 11:
			round = "11";
			break;
		case 12:
			round = "12";
			break;
		case 13:
			round = "13";
			break;
		case 14:
			round = "14";
			break;
		case 15:
			round = "15";
			break;
		default:
			break;
		}
	}

	private void boardDice(int recentDice){
		switch (recentDice) {
		case 0:
			diceLayer1 = DICE5;
			diceLayer2 = DICE5;
			break;
		case 1:
			diceLayer1 = DICE4;
			diceLayer2 = DICE5;
			break;
		case 2:
			diceLayer1 = DICE4;
			diceLayer2 = DICE4;
			break;
		case 3:
			diceLayer1 = DICE3;
			diceLayer2 = DICE4;
			break;
		case 4:
			diceLayer1 = DICE3;
			diceLayer2 = DICE3;
			break;
		case 5:
			diceLayer1 = DICE1;
			diceLayer2 = DICE2;
			break;
		case 6:
			diceLayer1 = DICE1;
			diceLayer2 = DICE1; 
			break;
		default:
			break;
		}
	}
	
	private void setScore(int p1Score, int p2Score){
		if (winningScore == 5){
			switch (p1Score) {
			case 0:
				p1S = sc5A0();
				break;
			case 1:
				p1S = sc5A1();
				break;
			case 2:
				p1S = sc5A2();
				break;
			case 3:
				p1S = sc5A3();
				break;
			case 4:
				p1S = sc5A4();
				break;
			case 5:
				p1S = sc5A5();
				break;
			}
			switch (p2Score) {
			case 0:
				p2S = sc5A0();
				break;
			case 1:
				p2S = sc5A1();
				break;
			case 2:
				p2S = sc5A2();
				break;
			case 3:
				p2S = sc5A3();
				break;
			case 4:
				p2S = sc5A4();
				break;
			case 5:
				p2S = sc5A5();
				break;
			}
		}else if (winningScore == 4){
			switch(p1Score){
			case 0:
				p1S = sc4A0();
				break;
			case 1:
				p1S = sc4A1();
				break;
			case 2:
				p1S = sc4A2();
				break;
			case 3:
				p1S = sc4A3();
				break;
			case 4:
				p1S = sc4A4();
				break;
			}
			switch(p2Score){
			case 0:
				p2S = sc4A0();
				break;
			case 1:
				p2S = sc4A1();
				break;
			case 2:
				p2S = sc4A2();
				break;
			case 3:
				p2S = sc4A3();
				break;
			case 4:
				p2S = sc4A4();
				break;
			}
		}else if (winningScore == 3){
			switch(p1Score){
			case 0:
				p1S = sc3A0();
				break;
			case 1:
				p1S = sc3A1();
				break;
			case 2:
				p1S = sc3A2();
				break;
			case 3:
				p1S = sc3A3();
				break;
			}
			switch(p2Score){
			case 0:
				p2S = sc3A0();
				break;
			case 1:
				p2S = sc3A1();
				break;
			case 2:
				p2S = sc3A2();
				break;
			case 3:
				p2S = sc3A3();
				break;
			}
		}else if (winningScore == 2){
			switch(p1Score){
			case 0:
				p1S = sc2A0();
				break;
			case 1:
				p1S = sc2A1();
				break;
			case 2:
				p1S = sc2A2();
				break;
			}
			switch(p2Score){
			case 0:
				p2S = sc2A0();
				break;
			case 1:
				p2S = sc2A1();
				break;
			case 2:
				p2S = sc2A2();
				break;
			}
		}else if (winningScore == 1){
			switch(p1Score){
			case 0:
				p1S = sc1A0();
				break;
			case 1:
				p1S = sc1A1();
				break;
			}
			switch(p2Score){
			case 0:
				p2S = sc1A0();
				break;
			case 1:
				p2S = sc1A1();
				break;
			}
		}
	}
	
	private void setWinningScore(int winningScore) {
		this.winningScore = winningScore;
	}
	
	
	private void setPlayerColor(int playerName, int playerColor) {
		switch(playerName) {
		case 1:
			switch (playerColor) {
			case 1:
				p1NameBoardColor = PBLUE;
				p1RepColor = RESET + B_BLUE + "      " + RESET + B_BLACK;
				break;
			case 2:
				p1NameBoardColor = PYELLOW;
				p1RepColor = RESET + B_YELLOW + "      " + RESET +  B_BLACK;
				break;
			case 3:
				p1NameBoardColor = PPURPLE;
				p1RepColor = RESET + B_PURPLE + "      "+ RESET + B_BLACK;
				break;
			case 4:
				p1NameBoardColor = PGREEN;
				p1RepColor = RESET + B_GREEN + "      "+ RESET + B_BLACK;
				break;
			case 5:
				p1NameBoardColor = PORANGE;
				p1RepColor = RESET + B_ORANGE + "      "+ RESET + B_BLACK;
				break;
			case 6:
				p1NameBoardColor = PRED;
				p1RepColor = RESET + B_RED + "      "+ RESET + B_BLACK;
				break;
			}
		case 2:
			switch (playerColor) {
			case 1:
				p2NameBoardColor = PBLUE;
				p2RepColor = B_BLUE + "      "+ RESET + B_BLACK;
				break;
			case 2:
				p2NameBoardColor = PYELLOW;
				p2RepColor = B_YELLOW + "      "+ RESET + B_BLACK;
				break;
			case 3:
				p2NameBoardColor = PPURPLE;
				p2RepColor = B_PURPLE + "      "+ RESET + B_BLACK;
				break;
			case 4:
				p2NameBoardColor = PGREEN;
				p2RepColor = B_GREEN + "      "+ RESET + B_BLACK;
				break;
			case 5:
				p2NameBoardColor = PORANGE;
				p2RepColor = B_ORANGE + "      "+ RESET + B_BLACK;
				break;
			case 6:
				p2NameBoardColor = PRED;
				p2RepColor = B_RED + "      "+ RESET + B_BLACK;
				break;
			}
		}
	}
	
	
	public void setMessage(int playerMoving, int message){///////////////////////modify Message
		String player = "";
		switch(playerMoving){
		case 1:
			player = " P L A Y E R  1   ";
			break;
		case 2:
			player = " P L A Y E R  2   ";
			break;
		case 3:
			player = "C O M P U T E R   ";
			break;
		}
		switch (message){
		case 0:
			messageBoard = "••••••••••••••••••••••••••••••••••••••••••••••••••• M  O  V  I  N  G ••••••••••••••••••••••••••••••••••••••••••••••••••••••••";
			break;
		case 1:
			messageBoard = "••••••••••••••••••••••••••••••••••••••••••••••••••••• L O A D I N G •••••••••••••••••••••••••••••••••••••••••••••••••••••••••";
			break;
		case 2:
			messageBoard = "•••••••• P L A Y E R   1   :  Y O U R   T U R N ! •••••••• P R E S S    E N T E R     T O     R O L L     D I C E •••••••••••";
			break;
		case 3:
			messageBoard = "•••••••• P L A Y E R   2   :  Y O U R   T U R N ! •••••••• P R E S S    E N T E R     T O     R O L L     D I C E •••••••••••";
			break;
		case 4:
			messageBoard = "••••••••••••••••••••••••••••• P  L  A  Y  E  R    1     R  O  L  L  I  N  G    D  I  C  E •••••••••••••••••••••••••••••••••••";
			break;
		case 5:
			messageBoard = "••••••••••••••••••••••••••••• P  L  A  Y  E  R    2     R  O  L  L  I  N  G    D  I  C  E •••••••••••••••••••••••••••••••••••";
			break;
		case 6:
			messageBoard = "•••••••••••••••••••••••••••••••••••••• C  O   M  P  U  T  E  R       T  U  R  N  ! ••••••••••••••••••••••••••••••••••••••••••";
			break;
		case 7:
			messageBoard = "•••••••••••••••••••••••••••• C  O  M  P  U  T  E  R     R  O  L  L  I  N  G     D  I  C  E ••••••••••••••••••••••••••••••••••";
			break;
		case 9:
			messageBoard = "••••••••• Y O U   I N T E R A C T   W I T H   B A T O       |        B A T O :  I   G E T   Y O U  B A C K ! ! ••••••••••••••";
			break;
		case 10:
			messageBoard = "••••••••••••••••••••••••••••••••• B  A  T  O    R  O  L  L  I  N  G       D  I  C E •••••••••••••••••••••••••••••••••••••••••";
			break;
		case 11:
			messageBoard = "•••••••••••••••••••••••••••••••••• "+ player+"D I S T A N C E    -    "+dice+" ••••••••••••••••••••••••••••••••••••••••••••••";
			break;
		case 12:
			messageBoard = "•••••••••••••••••••••••••••••••••••••• B A T O :  \"H A H A H A H H A H A H A H A\" •••••••••••••••••••••••••••••••••••••••••••";
			break;
		case 13:
			messageBoard = "•••••••••••••••••••••••••••••••• C O M P U T E R    I N T E R A C T    W I T H    B A T O •••••••••••••••••••••••••••••••••••";
			break;
		}
	}
	
	
	private void setBoardPlayerDistance(int player1Position, int player2Position){
		switch(player1Position) {
		case 0:
			boardPlayer1Distance = player1Position + " ";
			break;
		case 1:
			boardPlayer1Distance = player1Position + " ";
			break;
		case 2:
			boardPlayer1Distance = player1Position + " ";
			break;
		case 3:
			boardPlayer1Distance = player1Position + " ";
			break;
		case 4:
			boardPlayer1Distance = player1Position + " ";
			break;
		case 5:
			boardPlayer1Distance = player1Position + " ";
			break;
		case 6:
			boardPlayer1Distance = player1Position + " ";
			break;
		case 7:
			boardPlayer1Distance = player1Position + " ";
			break;
		case 8:
			boardPlayer1Distance = player1Position + " ";
			break;
		case 9:
			boardPlayer1Distance = player1Position + " ";
			break;
		default:
			boardPlayer1Distance = player1Position + "";
			break;
		}
		switch(player2Position){
		case 0:
			boardPlayer2Distance = player2Position + " ";
			break;
		case 1:
			boardPlayer2Distance = player2Position + " ";
			break;
		case 2:
			boardPlayer2Distance = player2Position + " ";
			break;
		case 3:
			boardPlayer2Distance = player2Position + " ";
			break;
		case 4:
			boardPlayer2Distance = player2Position + " ";
			break;
		case 5:
			boardPlayer2Distance = player2Position + " ";
			break;
		case 6:
			boardPlayer2Distance = player2Position + " ";
			break;
		case 7:
			boardPlayer2Distance = player2Position + " ";
			break;
		case 8:
			boardPlayer2Distance = player2Position + " ";
			break;
		case 9:
			boardPlayer2Distance = player2Position + " ";
			break;
		default:
			boardPlayer2Distance = player2Position + "";
			break;
		}
	}
	
	public void playerPosition(int player, int playerPosition) {
		switch (player){
		case 1://player1
			switch (playerPosition) {
			case 1:
				if (AA1 == "  --  " && AA2 == "  --  ") { 
					AA1 = p1RepColor;
					AA2 = p1RepColor;
				} else if (AA1 == p2RepColor && AA2 == p2RepColor) { 
					AA1 = p1RepColor;
					AA2 = p2RepColor;
				} else if (AA1 == "  --  " && AA2 == BATOCOLOR) {  
					AA1 = p1RepColor;
				}
				break;

			case 2:
				if (AB1 == "  --  " && AB2 == "  --  ") { 
					AB1 = p1RepColor;
					AB2 = p1RepColor;
				} else if (AB1 == p2RepColor && AB2 == p2RepColor) { 
					AB1 = p1RepColor;
					AB2 = p2RepColor;
				} else if (AB1 == "  --  " && AB2 == BATOCOLOR) { 
					AB1 = p1RepColor;
				}
				break;

			case 3:
				if (AC1 == "  --  " && AC2 == "  --  ") { 
					AC1 = p1RepColor;
					AC2 = p1RepColor;
				} else if (AC1 == p2RepColor && AC2 == p2RepColor) { 
					AC1 = p1RepColor;
					AC2 = p2RepColor;
				} else if (AC1 == "  --  " && AC2 == BATOCOLOR) { 
					AC1 = p1RepColor;
				}
				break;

			case 4:
				if (AD1 == "  --  " && AD2 == "  --  ") { 
					AD1 = p1RepColor;
					AD2 = p1RepColor;
				} else if (AD1 == p2RepColor && AD2 == p2RepColor) { 
					AD1 = p1RepColor;
					AD2 = p2RepColor;
				} else if (AD1 == "  --  " && AD2 == BATOCOLOR) { 
					AD1 = p1RepColor;
				}
				break;

			case 5:
				if (AE1 == "  --  " && AE2 == "  --  ") { 
					AE1 = p1RepColor;
					AE2 = p1RepColor;
				} else if (AE1 == p2RepColor && AE2 == p2RepColor) { 
					AE1 = p1RepColor;
					AE2 = p2RepColor;
				} else if (AE1 == "  --  " && AE2 == BATOCOLOR) { 
					AE1 = p1RepColor;
				}
				break;

			case 6:
				if (AF1 == "  --  " && AF2 == "  --  ") { 
					AF1 = p1RepColor;
					AF2 = p1RepColor;
				} else if (AF1 == p2RepColor && AF2 == p2RepColor) { 
					AF1 = p1RepColor;
					AF2 = p2RepColor;
				} else if (AF1 == "  --  " && AF2 == BATOCOLOR) { 
					AF1 = p1RepColor;
				}
				break;

			case 7:
				if (AG1 == "  --  " && AG2 == "  --  ") { 
					AG1 = p1RepColor;
					AG2 = p1RepColor;
				} else if (AG1 == p2RepColor && AG2 == p2RepColor) { 
					AG1 = p1RepColor;
					AG2 = p2RepColor;
				} else if (AG1 == "  --  " && AG2 == BATOCOLOR) { 
					AG1 = p1RepColor;
				}
				break;

			case 8:
				if (AH1 == "  --  " && AH2 == "  --  ") { 
					AH1 = p1RepColor;
					AH2 = p1RepColor;
				} else if (AH1 == p2RepColor && AH2 == p2RepColor) { 
					AH1 = p1RepColor;
					AH2 = p2RepColor;
				} else if (AH1 == "  --  " && AH2 == BATOCOLOR) { 
					AH1 = p1RepColor;
				}
				break;

			case 9:
				if (AI1 == "  --  " && AI2 == "  --  ") { 
					AI1 = p1RepColor;
					AI2 = p1RepColor;
				} else if (AI1 == p2RepColor && AI2 == p2RepColor) { 
					AI1 = p1RepColor;
					AI2 = p2RepColor;
				} else if (AI1 == "  --  " && AI2 == BATOCOLOR) { 
					AI1 = p1RepColor;
				}
				break;

			case 10:
				if (AJ1 == "  --  " && AJ2 == "  --  ") { 
					AJ1 = p1RepColor;
					AJ2 = p1RepColor;
				} else if (AJ1 == p2RepColor && AJ2 == p2RepColor) { 
					AJ1 = p1RepColor;
					AJ2 = p2RepColor;
				} else if (AJ1 == "  --  " && AJ2 == BATOCOLOR) { 
					AJ1 = p1RepColor;
				}
				break;
			case 11:
				if (AK1 == "  --  " && AK2 == "  --  ") {
					AK1 = p1RepColor;
					AK2 = p1RepColor;
				} else if (AK1 == p2RepColor && AK2 == p2RepColor) {
					AK1 = p1RepColor;
					AK2 = p2RepColor;
				} else if (AK1 == "  --  " && AK2 == BATOCOLOR) {
					AK1 = p1RepColor;
				}
				break;

			case 12:
				if (AL1 == "  --  " && AL2 == "  --  ") {
					AL1 = p1RepColor;
					AL2 = p1RepColor;
				} else if (AL1 == p2RepColor && AL2 == p2RepColor) {
					AL1 = p1RepColor;
					AL2 = p2RepColor;
				} else if (AL1 == "  --  " && AL2 == BATOCOLOR) {
					AL1 = p1RepColor;
				}
				break;

			case 13:
				if (AM1 == "  --  " && AM2 == "  --  ") {
					AM1 = p1RepColor;
					AM2 = p1RepColor;
				} else if (AM1 == p2RepColor && AM2 == p2RepColor) {
					AM1 = p1RepColor;
					AM2 = p2RepColor;
				} else if (AM1 == "  --  " && AM2 == BATOCOLOR) {
					AM1 = p1RepColor;
				}
				break;

			case 14:
				if (AN1 == "  --  " && AN2 == "  --  ") {
					AN1 = p1RepColor;
					AN2 = p1RepColor;
				} else if (AN1 == p2RepColor && AN2 == p2RepColor) {
					AN1 = p1RepColor;
					AN2 = p2RepColor;
				} else if (AN1 == "  --  " && AN2 == BATOCOLOR) {
					AN1 = p1RepColor;
				}
				break;

			case 15:
				if (AO1 == "  --  " && AO2 == "  --  ") {
					AO1 = p1RepColor;
					AO2 = p1RepColor;
				} else if (AO1 == p2RepColor && AO2 == p2RepColor) {
					AO1 = p1RepColor;
					AO2 = p2RepColor;
				} else if (AO1 == "  --  " && AO2 == BATOCOLOR) {
					AO1 = p1RepColor;
				}
				break;

			case 16:
				if (AP1 == "  --  " && AP2 == "  --  ") {
					AP1 = p1RepColor;
					AP2 = p1RepColor;
				} else if (AP1 == p2RepColor && AP2 == p2RepColor) {
					AP1 = p1RepColor;
					AP2 = p2RepColor;
				} else if (AP1 == "  --  " && AP2 == BATOCOLOR) {
					AP1 = p1RepColor;
				}
				break;

			case 17:
				if (AQ1 == "  --  " && AQ2 == "  --  ") {
					AQ1 = p1RepColor;
					AQ2 = p1RepColor;
				} else if (AQ1 == p2RepColor && AQ2 == p2RepColor) {
					AQ1 = p1RepColor;
					AQ2 = p2RepColor;
				} else if (AQ1 == "  --  " && AQ2 == BATOCOLOR) {
					AQ1 = p1RepColor;
				}
				break;

			case 18:
				if (AR1 == "  --  " && AR2 == "  --  ") {
					AR1 = p1RepColor;
					AR2 = p1RepColor;
				} else if (AR1 == p2RepColor && AR2 == p2RepColor) {
					AR1 = p1RepColor;
					AR2 = p2RepColor;
				} else if (AR1 == "  --  " && AR2 == BATOCOLOR) {
					AR1 = p1RepColor;
				}
				break;

			case 19:
				if (AS1 == "  --  " && AS2 == "  --  ") {
					AS1 = p1RepColor;
					AS2 = p1RepColor;
				} else if (AS1 == p2RepColor && AS2 == p2RepColor) {
					AS1 = p1RepColor;
					AS2 = p2RepColor;
				} else if (AS1 == "  --  " && AS2 == BATOCOLOR) {
					AS1 = p1RepColor;
				}
				break;

			case 20:
				if (AT1 == "  --  " && AT2 == "  --  ") {
					AT1 = p1RepColor;
					AT2 = p1RepColor;
				} else if (AT1 == p2RepColor && AT2 == p2RepColor) {
					AT1 = p1RepColor;
					AT2 = p2RepColor;
				} else if (AT1 == "  --  " && AT2 == BATOCOLOR) {
					AT1 = p1RepColor;
				}
				break;
			case 21:
				if (AU1 == "  --  " && AU2 == "  --  ") {
					AU1 = p1RepColor;
					AU2 = p1RepColor;
				} else if (AU1 == p2RepColor && AU2 == p2RepColor) {
					AU1 = p1RepColor;
					AU2 = p2RepColor;
				} else if (AU1 == "  --  " && AU2 == BATOCOLOR) {
					AU1 = p1RepColor;
				}
				break;

			case 22:
				if (AV1 == "  --  " && AV2 == "  --  ") {
					AV1 = p1RepColor;
					AV2 = p1RepColor;
				} else if (AV1 == p2RepColor && AV2 == p2RepColor) {
					AV1 = p1RepColor;
					AV2 = p2RepColor;
				} else if (AV1 == "  --  " && AV2 == BATOCOLOR) {
					AV1 = p1RepColor;
				}
				break;

			case 23:
				if (AW1 == "  --  " && AW2 == "  --  ") {
					AW1 = p1RepColor;
					AW2 = p1RepColor;
				} else if (AW1 == p2RepColor && AW2 == p2RepColor) {
					AW1 = p1RepColor;
					AW2 = p2RepColor;
				} else if (AW1 == "  --  " && AW2 == BATOCOLOR) {
					AW1 = p1RepColor;
				}
				break;

			case 24:
				if (AX1 == "  --  " && AX2 == "  --  ") {
					AX1 = p1RepColor;
					AX2 = p1RepColor;
				} else if (AX1 == p2RepColor && AX2 == p2RepColor) {
					AX1 = p1RepColor;
					AX2 = p2RepColor;
				} else if (AX1 == "  --  " && AX2 == BATOCOLOR) {
					AX1 = p1RepColor;
				}
				break;

			case 25:
				if (AY1 == "  --  " && AY2 == "  --  ") { 
					AY1 = p1RepColor;
					AY2 = p1RepColor;
				} else if (AY1 == p2RepColor && AY2 == p2RepColor) { 
					AY1 = p1RepColor;
					AY2 = p2RepColor;
				} else if (AY1 == "  --  " && AY2 == BATOCOLOR) { 
					AY1 = p1RepColor;
				}
				break;

			case 26:
				if (AZ1 == "  --  " && AZ2 == "  --  ") { 
					AZ1 = p1RepColor;
					AZ2 = p1RepColor;
				} else if (AZ1 == p2RepColor && AZ2 == p2RepColor) { 
					AZ1 = p1RepColor;
					AZ2 = p2RepColor;
				} else if (AZ1 == "  --  " && AZ2 == BATOCOLOR) { 
					AZ1 = p1RepColor;
				}
				break;

			case 27:
				if (BA1 == "  --  " && BA2 == "  --  ") { 
					BA1 = p1RepColor;
					BA2 = p1RepColor;
				} else if (BA1 == p2RepColor && BA2 == p2RepColor) { 
					BA1 = p1RepColor;
					BA2 = p2RepColor;
				} else if (BA1 == "  --  " && BA2 == BATOCOLOR) { 
					BA1 = p1RepColor;
				}
				break;

			case 28:
				if (BB1 == "  --  " && BB2 == "  --  ") { 
					BB1 = p1RepColor;
					BB2 = p1RepColor;
				} else if (BB1 == p2RepColor && BB2 == p2RepColor) { 
					BB1 = p1RepColor;
					BB2 = p2RepColor;
				} else if (BB1 == "  --  " && BB2 == BATOCOLOR) { 
					BB1 = p1RepColor;
				}
				break;

			case 29:
				if (BC1 == "  --  " && BC2 == "  --  ") { 
					BC1 = p1RepColor;
					BC2 = p1RepColor;
				} else if (BC1 == p2RepColor && BC2 == p2RepColor) { 
					BC1 = p1RepColor;
					BC2 = p2RepColor;
				} else if (BC1 == "  --  " && BC2 == BATOCOLOR) { 
					BC1 = p1RepColor;
				}
				break;

			case 30:
				if (BD1 == "  --  " && BD2 == "  --  ") { 
					BD1 = p1RepColor;
					BD2 = p1RepColor;
				} else if (BD1 == p2RepColor && BD2 == p2RepColor) { 
					BD1 = p1RepColor;
					BD2 = p2RepColor;
				} else if (BD1 == "  --  " && BD2 == BATOCOLOR) { 
					BD1 = p1RepColor;
				}
				break;

			case 31:
				if (BE1 == "  --  " && BE2 == "  --  ") { 
					BE1 = p1RepColor;
					BE2 = p1RepColor;
				} else if (BE1 == p2RepColor && BE2 == p2RepColor) { 
					BE1 = p1RepColor;
					BE2 = p2RepColor;
				} else if (BE1 == "  --  " && BE2 == BATOCOLOR) { 
					BE1 = p1RepColor;
				}
				break;

			case 32:
				if (BF1 == "  --  " && BF2 == "  --  ") { 
					BF1 = p1RepColor;
					BF2 = p1RepColor;
				} else if (BF1 == p2RepColor && BF2 == p2RepColor) { 
					BF1 = p1RepColor;
					BF2 = p2RepColor;
				} else if (BF1 == "  --  " && BF2 == BATOCOLOR) { 
					BF1 = p1RepColor;
				}
				break;

			case 33:
				if (BG1 == "  --  " && BG2 == "  --  ") { 
					BG1 = p1RepColor;
					BG2 = p1RepColor;
				} else if (BG1 == p2RepColor && BG2 == p2RepColor) { 
					BG1 = p1RepColor;
					BG2 = p2RepColor;
				} else if (BG1 == "  --  " && BG2 == BATOCOLOR) { 
					BG1 = p1RepColor;
				}
				break;

			case 34:
				if (BH1 == "  --  " && BH2 == "  --  ") { 
					BH1 = p1RepColor;
					BH2 = p1RepColor;
				} else if (BH1 == p2RepColor && BH2 == p2RepColor) { 
					BH1 = p1RepColor;
					BH2 = p2RepColor;
				} else if (BH1 == "  --  " && BH2 == BATOCOLOR) { 
					BH1 = p1RepColor;
				}
				break;

			case 35:
				if (BI1 == "  --  " && BI2 == "  --  ") { 
					BI1 = p1RepColor;
					BI2 = p1RepColor;
				} else if (BI1 == p2RepColor && BI2 == p2RepColor) { 
					BI1 = p1RepColor;
					BI2 = p2RepColor;
				} else if (BI1 == "  --  " && BI2 == BATOCOLOR) { 
					BI1 = p1RepColor;
				}
				break;

			case 36:
				if (BJ1 == "  --  " && BJ2 == "  --  ") { 
					BJ1 = p1RepColor;
					BJ2 = p1RepColor;
				} else if (BJ1 == p2RepColor && BJ2 == p2RepColor) { 
					BJ1 = p1RepColor;
					BJ2 = p2RepColor;
				} else if (BJ1 == "  --  " && BJ2 == BATOCOLOR) { 
					BJ1 = p1RepColor;
				}
				break;

			case 37:
				if (BK1 == "  --  " && BK2 == "  --  ") { 
					BK1 = p1RepColor;
					BK2 = p1RepColor;
				} else if (BK1 == p2RepColor && BK2 == p2RepColor) { 
					BK1 = p1RepColor;
					BK2 = p2RepColor;
				} else if (BK1 == "  --  " && BK2 == BATOCOLOR) { 
					BK1 = p1RepColor;
				}
				break;

			case 38:
				if (BL1 == "  --  " || BL1 == " "+B_WHITE+" "+B_BLACK+" "+B_WHITE+" "+B_BLACK+" "+B_WHITE+" "+ B_BLACK && BL2 == "  --  " || BL2 == B_WHITE+" "+B_BLACK+" "+B_WHITE+" "+B_BLACK+" "+B_WHITE+" "+B_BLACK+" ") { 
					BL1 = p1RepColor;
					BL2 = p1RepColor;
				} else if (BL1 == p2RepColor && BL2 == p2RepColor) { 
					BL1 = p1RepColor;
					BL2 = p2RepColor;
				} else if (BL1 == "  --  " || BL1 == " "+B_WHITE+" "+B_BLACK+" "+B_WHITE+" "+B_BLACK+" "+B_WHITE+" "+ B_BLACK && BL2 == BATOCOLOR) { 
					BL1 = p1RepColor;
				}
				break;

			case 39:
				if (BM1 == "  --  " && BM2 == "  --  ") { 
					BM1 = p1RepColor;
					BM2 = p1RepColor;
				} else if (BM1 == p2RepColor && BM2 == p2RepColor) { 
					BM1 = p1RepColor;
					BM2 = p2RepColor;
				} else if (BM1 == "  --  " && BM2 == BATOCOLOR) { 
					BM1 = p1RepColor;
				}
				break;

			case 40:
				if (BN1 == "  --  " && BN2 == "  --  ") { 
					BN1 = p1RepColor;
					BN2 = p1RepColor;
				} else if (BN1 == p2RepColor && BN2 == p2RepColor) { 
					BN1 = p1RepColor;
					BN2 = p2RepColor;
				} else if (BN1 == "  --  " && BN2 == BATOCOLOR) { 
					BN1 = p1RepColor;
				}
				break;

			case 41:
				if (BO1 == "  --  " && BO2 == "  --  ") { 
					BO1 = p1RepColor;
					BO2 = p1RepColor;
				} else if (BO1 == p2RepColor && BO2 == p2RepColor) { 
					BO1 = p1RepColor;
					BO2 = p2RepColor;
				} else if (BO1 == "  --  " && BO2 == BATOCOLOR) { 
					BO1 = p1RepColor;
				}
				break;

			case 42:
				if (BP1 == "  --  " && BP2 == "  --  ") { 
					BP1 = p1RepColor;
					BP2 = p1RepColor;
				} else if (BP1 == p2RepColor && BP2 == p2RepColor) { 
					BP1 = p1RepColor;
					BP2 = p2RepColor;
				} else if (BP1 == "  --  " && BP2 == BATOCOLOR) { 
					BP1 = p1RepColor;
				}
				break;

			case 43:
				if (BQ1 == "  --  " && BQ2 == "  --  ") { 
					BQ1 = p1RepColor;
					BQ2 = p1RepColor;
				} else if (BQ1 == p2RepColor && BQ2 == p2RepColor) { 
					BQ1 = p1RepColor;
					BQ2 = p2RepColor;
				} else if (BQ1 == "  --  " && BQ2 == BATOCOLOR) { 
					BQ1 = p1RepColor;
				}
				break;

			case 44:
				if (BR1 == "  --  " && BR2 == "  --  ") { 
					BR1 = p1RepColor;
					BR2 = p1RepColor;
				} else if (BR1 == p2RepColor && BR2 == p2RepColor) { 
					BR1 = p1RepColor;
					BR2 = p2RepColor;
				} else if (BR1 == "  --  " && BR2 == BATOCOLOR) { 
					BR1 = p1RepColor;
				}
				break;

			case 45:
				if (BS1 == "  --  " && BS2 == "  --  ") { 
					BS1 = p1RepColor;
					BS2 = p1RepColor;
				} else if (BS1 == p2RepColor && BS2 == p2RepColor) { 
					BS1 = p1RepColor;
					BS2 = p2RepColor;
				} else if (BS1 == "  --  " && BS2 == BATOCOLOR) { 
					BS1 = p1RepColor;
				}
				break;

			case 46:
				if (BT1 == "  --  " && BT2 == "  --  ") { 
					BT1 = p1RepColor;
					BT2 = p1RepColor;
				} else if (BT1 == p2RepColor && BT2 == p2RepColor) { 
					BT1 = p1RepColor;
					BT2 = p2RepColor;
				} else if (BT1 == "  --  " && BT2 == BATOCOLOR) { 
					BT1 = p1RepColor;
				}
				break;

			case 47:
				if (BU1 == "  --  " && BU2 == "  --  ") { 
					BU1 = p1RepColor;
					BU2 = p1RepColor;
				} else if (BU1 == p2RepColor && BU2 == p2RepColor) { 
					BU1 = p1RepColor;
					BU2 = p2RepColor;
				} else if (BU1 == "  --  " && BU2 == BATOCOLOR) { 
					BU1 = p1RepColor;
				}
				break;

			case 48:
				if (BV1 == "  --  " && BV2 == "  --  ") { 
					BV1 = p1RepColor;
					BV2 = p1RepColor;
				} else if (BV1 == p2RepColor && BV2 == p2RepColor) { 
					BV1 = p1RepColor;
					BV2 = p2RepColor;
				} else if (BV1 == "  --  " && BV2 == BATOCOLOR) { 
					BV1 = p1RepColor;
				}
				break;

			case 49:
				if (BW1 == "  --  " && BW2 == "  --  ") { 
					BW1 = p1RepColor;
					BW2 = p1RepColor;
				} else if (BW1 == p2RepColor && BW2 == p2RepColor) { 
					BW1 = p1RepColor;
					BW2 = p2RepColor;
				} else if (BW1 == "  --  " && BW2 == BATOCOLOR) { 
					BW1 = p1RepColor;
				}
				break;

			case 50:
				if (BX1 == "  --  " && BX2 == "  --  ") { 
					BX1 = p1RepColor;
					BX2 = p1RepColor;
				} else if (BX1 == p2RepColor && BX2 == p2RepColor) { 
					BX1 = p1RepColor;
					BX2 = p2RepColor;
				} else if (BX1 == "  --  " && BX2 == BATOCOLOR) { 
					BX1 = p1RepColor;
				}
				break;

			case 51:
				if (BY1 == "  --  " && BY2 == "  --  ") { 
					BY1 = p1RepColor;
					BY2 = p1RepColor;
				} else if (BY1 == p2RepColor && BY2 == p2RepColor) { 
					BY1 = p1RepColor;
					BY2 = p2RepColor;
				} else if (BY1 == "  --  " && BY2 == BATOCOLOR) { 
					BY1 = p1RepColor;
				}
				break;

			case 52:
				if (BZ1 == "  --  " && BZ2 == "  --  ") { 
					BZ1 = p1RepColor;
					BZ2 = p1RepColor;
				} else if (BZ1 == p2RepColor && BZ2 == p2RepColor) { 
					BZ1 = p1RepColor;
					BZ2 = p2RepColor;
				} else if (BZ1 == "  --  " && BZ2 == BATOCOLOR) { 
					BZ1 = p1RepColor;
				}
				break;

			case 53:
				if (CA1 == "  --  " && CA2 == "  --  ") { 
					CA1 = p1RepColor;
					CA2 = p1RepColor;
				} else if (CA1 == p2RepColor && CA2 == p2RepColor) { 
					CA1 = p1RepColor;
					CA2 = p2RepColor;
				} else if (CA1 == "  --  " && CA2 == BATOCOLOR) { 
					CA1 = p1RepColor;
				}
				break;

			case 54:
				if (CB1 == "  --  " && CB2 == "  --  ") { 
					CB1 = p1RepColor;
					CB2 = p1RepColor;
				} else if (CB1 == p2RepColor && CB2 == p2RepColor) { 
					CB1 = p1RepColor;
					CB2 = p2RepColor;
				} else if (CB1 == "  --  " && CB2 == BATOCOLOR) { 
					CB1 = p1RepColor;
				}
				break;

			case 55:
				if (CC1 == "  --  " && CC2 == "  --  ") { 
					CC1 = p1RepColor;
					CC2 = p1RepColor;
				} else if (CC1 == p2RepColor && CC2 == p2RepColor) { 
					CC1 = p1RepColor;
					CC2 = p2RepColor;
				} else if (CC1 == "  --  " && CC2 == BATOCOLOR) { 
					CC1 = p1RepColor;
				}
				break;

			case 56:
				if (CD1 == "  --  " && CD2 == "  --  ") { 
					CD1 = p1RepColor;
					CD2 = p1RepColor;
				} else if (CD1 == p2RepColor && CD2 == p2RepColor) { 
					CD1 = p1RepColor;
					CD2 = p2RepColor;
				} else if (CD1 == "  --  " && CD2 == BATOCOLOR) { 
					CD1 = p1RepColor;
				}
				break;

			case 57:
				if (CE1 == "  --  " && CE2 == "  --  ") { 
					CE1 = p1RepColor;
					CE2 = p1RepColor;
				} else if (CE1 == p2RepColor && CE2 == p2RepColor) { 
					CE1 = p1RepColor;
					CE2 = p2RepColor;
				} else if (CE1 == "  --  " && CE2 == BATOCOLOR) { 
					CE1 = p1RepColor;
				}
				break;

			case 58:
				if (CF1 == "  --  " && CF2 == "  --  ") { 
					CF1 = p1RepColor;
					CF2 = p1RepColor;
				} else if (CF1 == p2RepColor && CF2 == p2RepColor) { 
					CF1 = p1RepColor;
					CF2 = p2RepColor;
				} else if (CF1 == "  --  " && CF2 == BATOCOLOR) { 
					CF1 = p1RepColor;
				}
				break;

			case 59:
				if (CG1 == "  --  " && CG2 == "  --  ") { 
					CG1 = p1RepColor;
					CG2 = p1RepColor;
				} else if (CG1 == p2RepColor && CG2 == p2RepColor) { 
					CG1 = p1RepColor;
					CG2 = p2RepColor;
				} else if (CG1 == "  --  " && CG2 == BATOCOLOR) { 
					CG1 = p1RepColor;
				}
				break;

			case 60:
				if (CH1 == "  --  " && CH2 == "  --  ") { 
					CH1 = p1RepColor;
					CH2 = p1RepColor;
				} else if (CH1 == p2RepColor && CH2 == p2RepColor) { 
					CH1 = p1RepColor;
					CH2 = p2RepColor;
				} else if (CH1 == "  --  " && CH2 == BATOCOLOR) { 
					CH1 = p1RepColor;
				}
				break;

			case 61:
				if (CI1 == "  --  " && CI2 == "  --  ") { 
					CI1 = p1RepColor;
					CI2 = p1RepColor;
				} else if (CI1 == p2RepColor && CI2 == p2RepColor) { 
					CI1 = p1RepColor;
					CI2 = p2RepColor;
				} else if (CI1 == "  --  " && CI2 == BATOCOLOR) { 
					CI1 = p1RepColor;
				}
				break;

			case 62:
				if (CJ1 == "  --  " && CJ2 == "  --  ") { 
					CJ1 = p1RepColor;
					CJ2 = p1RepColor;
				} else if (CJ1 == p2RepColor && CJ2 == p2RepColor) { 
					CJ1 = p1RepColor;
					CJ2 = p2RepColor;
				} else if (CJ1 == "  --  " && CJ2 == BATOCOLOR) { 
					CJ1 = p1RepColor;
				}
				break;

			case 63:
				if (CK1 == "  --  " && CK2 == "  --  ") { 
					CK1 = p1RepColor;
					CK2 = p1RepColor;
				} else if (CK1 == p2RepColor && CK2 == p2RepColor) { 
					CK1 = p1RepColor;
					CK2 = p2RepColor;
				} else if (CK1 == "  --  " && CK2 == BATOCOLOR) { 
					CK1 = p1RepColor;
				}
				break;

			case 64:
				if (CL1 == "  --  " && CL2 == "  --  ") { 
					CL1 = p1RepColor;
					CL2 = p1RepColor;
				} else if (CL1 == p2RepColor && CL2 == p2RepColor) { 
					CL1 = p1RepColor;
					CL2 = p2RepColor;
				} else if (CL1 == "  --  " && CL2 == BATOCOLOR) { 
					CL1 = p1RepColor;
				}
				break;

			case 65:
				if (CM1 == "  --  " || CM1 == " "+B_WHITE+" "+B_BLACK+" "+B_WHITE+" "+B_BLACK+" "+B_WHITE+" "+ B_BLACK && CM2 == "  --  " || CM2 == B_WHITE+" "+B_BLACK+" "+B_WHITE+" "+B_BLACK+" "+B_WHITE+" "+B_BLACK+" ") { 
					CM1 = p1RepColor;
					CM2 = p1RepColor;
				} else if (CM1 == p2RepColor && CM2 == p2RepColor) { 
					CM1 = p1RepColor;
					CM2 = p2RepColor;
				} else if (CM1 == "  --  " || CM1 == " "+B_WHITE+" "+B_BLACK+" "+B_WHITE+" "+B_BLACK+" "+B_WHITE+" "+ B_BLACK && CM2 == BATOCOLOR) { 
					CM1 = p1RepColor;
				}
				break;
			}
			break;

		case 2: // player 2
			switch (playerPosition) {
			case 1:
				if (AA1 == "  --  " && AA2 == "  --  ") {
					AA1 = p2RepColor;
					AA2 = p2RepColor;
				} else if (AA1 == p1RepColor && AA2 == p1RepColor) {
					AA1 = p1RepColor;
					AA2 = p2RepColor;
				} else if (AA1 == "  --  " && AA2 == BATOCOLOR) {
					AA1 = p2RepColor;
				}
				break;
			case 2:
				if (AB1 == "  --  " && AB2 == "  --  ") {
					AB1 = p2RepColor;
					AB2 = p2RepColor;
				} else if (AB1 == p1RepColor && AA2 == p1RepColor) {
					AB1 = p1RepColor;
					AB2 = p2RepColor;
				} else if (AB1 == "  --  " && AA2 == BATOCOLOR) {
					AB1 = p2RepColor;
				}
				break;
			case 3:
				if (AC1 == "  --  " && AC2 == "  --  ") {
					AC1 = p2RepColor;
					AC2 = p2RepColor;
				} else if (AC1 == p1RepColor && AC2 == p1RepColor) {
					AC1 = p1RepColor;
					AC2 = p2RepColor;
				} else if (AC1 == "  --  " && AC2 == BATOCOLOR) {
					AC1 = p2RepColor;
				}
				break;
			case 4:
				if (AD1 == "  --  " && AD2 == "  --  ") {
					AD1 = p2RepColor;
					AD2 = p2RepColor;
				} else if (AD1 == p1RepColor && AD2 == p1RepColor) {
					AD1 = p1RepColor;
					AD2 = p2RepColor;
				} else if (AD1 == "  --  " && AD2 == BATOCOLOR) {
					AD1 = p2RepColor;
				}
				break;
			case 5:
				if (AE1 == "  --  " && AE2 == "  --  ") {
					AE1 = p2RepColor;
					AE2 = p2RepColor;
				} else if (AE1 == p1RepColor && AE2 == p1RepColor) {
					AE1 = p1RepColor;
					AE2 = p2RepColor;
				} else if (AE1 == "  --  " && AE2 == BATOCOLOR) {
					AE1 = p2RepColor;
				}
				break;
			case 6:
				if (AF1 == "  --  " && AF2 == "  --  ") {
					AF1 = p2RepColor;
					AF2 = p2RepColor;
				} else if (AF1 == p1RepColor && AF2 == p1RepColor) {
					AF1 = p1RepColor;
					AF2 = p2RepColor;
				} else if (AF1 == "  --  " && AF2 == BATOCOLOR) {
					AF1 = p2RepColor;
				}
				break;
			case 7:
				if (AG1 == "  --  " && AG2 == "  --  ") {
					AG1 = p2RepColor;
					AG2 = p2RepColor;
				} else if (AG1 == p1RepColor && AG2 == p1RepColor) {
					AG1 = p1RepColor;
					AG2 = p2RepColor;
				} else if (AG1 == "  --  " && AG2 == BATOCOLOR) {
					AG1 = p2RepColor;
				}
				break;
			case 8:
				if (AH1 == "  --  " && AH2 == "  --  ") {
					AH1 = p2RepColor;
					AH2 = p2RepColor;
				} else if (AH1 == p1RepColor && AH2 == p1RepColor) {
					AH1 = p1RepColor;
					AH2 = p2RepColor;
				} else if (AH1 == "  --  " && AH2 == BATOCOLOR) {
					AH1 = p2RepColor;
				}
				break;
			case 9:
				if (AI1 == "  --  " && AI2 == "  --  ") {
					AI1 = p2RepColor;
					AI2 = p2RepColor;
				} else if (AI1 == p1RepColor && AI2 == p1RepColor) {
					AI1 = p1RepColor;
					AI2 = p2RepColor;
				} else if (AI1 == "  --  " && AI2 == BATOCOLOR) {
					AI1 = p2RepColor;
				}
				break;
			case 10:
				if (AJ1 == "  --  " && AJ2 == "  --  ") {
					AJ1 = p2RepColor;
					AJ2 = p2RepColor;
				} else if (AJ1 == p1RepColor && AJ2 == p1RepColor) {
					AJ1 = p1RepColor;
					AJ2 = p2RepColor;
				} else if (AJ1 == "  --  " && AJ2 == BATOCOLOR) {
					AJ1 = p2RepColor;
				}
				break;
			case 11:
				if (AK1 == "  --  " && AK2 == "  --  ") {
					AK1 = p2RepColor;
					AK2 = p2RepColor;
				} else if (AK1 == p1RepColor && AK2 == p1RepColor) {
					AK1 = p1RepColor;
					AK2 = p2RepColor;
				} else if (AK1 == "  --  " && AK2 == BATOCOLOR) {
					AK1 = p2RepColor;
				}
				break;

			case 12:
				if (AL1 == "  --  " && AL2 == "  --  ") {
					AL1 = p2RepColor;
					AL2 = p2RepColor;
				} else if (AL1 == p1RepColor && AL2 == p1RepColor) {
					AL1 = p1RepColor;
					AL2 = p2RepColor;
				} else if (AL1 == "  --  " && AL2 == BATOCOLOR) {
					AL1 = p2RepColor;
				}
				break;

			case 13:
				if (AM1 == "  --  " && AM2 == "  --  ") {
					AM1 = p2RepColor;
					AM2 = p2RepColor;
				} else if (AM1 == p1RepColor && AM2 == p1RepColor) {
					AM1 = p1RepColor;
					AM2 = p2RepColor;
				} else if (AM1 == "  --  " && AM2 == BATOCOLOR) {
					AM1 = p2RepColor;
				}
				break;

			case 14:
				if (AN1 == "  --  " && AN2 == "  --  ") {
					AN1 = p2RepColor;
					AN2 = p2RepColor;
				} else if (AN1 == p1RepColor && AN2 == p1RepColor) {
					AN1 = p1RepColor;
					AN2 = p2RepColor;
				} else if (AN1 == "  --  " && AN2 == BATOCOLOR) {
					AN1 = p2RepColor;
				}
				break;

			case 15:
				if (AO1 == "  --  " && AO2 == "  --  ") {
					AO1 = p2RepColor;
					AO2 = p2RepColor;
				} else if (AO1 == p1RepColor && AO2 == p1RepColor) {
					AO1 = p1RepColor;
					AO2 = p2RepColor;
				} else if (AO1 == "  --  " && AO2 == BATOCOLOR) {
					AO1 = p2RepColor;
				}
				break;

			case 16:
				if (AP1 == "  --  " && AP2 == "  --  ") {
					AP1 = p2RepColor;
					AP2 = p2RepColor;
				} else if (AP1 == p1RepColor && AP2 == p1RepColor) {
					AP1 = p1RepColor;
					AP2 = p2RepColor;
				} else if (AP1 == "  --  " && AP2 == BATOCOLOR) {
					AP1 = p2RepColor;
				}
				break;

			case 17:
				if (AQ1 == "  --  " && AQ2 == "  --  ") {
					AQ1 = p2RepColor;
					AQ2 = p2RepColor;
				} else if (AQ1 == p1RepColor && AQ2 == p1RepColor) {
					AQ1 = p1RepColor;
					AQ2 = p2RepColor;
				} else if (AQ1 == "  --  " && AQ2 == BATOCOLOR) {
					AQ1 = p2RepColor;
				}
				break;

			case 18:
				if (AR1 == "  --  " && AR2 == "  --  ") {
					AR1 = p2RepColor;
					AR2 = p2RepColor;
				} else if (AR1 == p1RepColor && AR2 == p1RepColor) {
					AR1 = p1RepColor;
					AR2 = p2RepColor;
				} else if (AR1 == "  --  " && AR2 == BATOCOLOR) {
					AR1 = p2RepColor;
				}
				break;

			case 19:
				if (AS1 == "  --  " && AS2 == "  --  ") {
					AS1 = p2RepColor;
					AS2 = p2RepColor;
				} else if (AS1 == p1RepColor && AS2 == p1RepColor) {
					AS1 = p1RepColor;
					AS2 = p2RepColor;
				} else if (AS1 == "  --  " && AS2 == BATOCOLOR) {
					AS1 = p2RepColor;
				}
				break;

			case 20:
				if (AT1 == "  --  " && AT2 == "  --  ") {
					AT1 = p2RepColor;
					AT2 = p2RepColor;
				} else if (AT1 == p1RepColor && AT2 == p1RepColor) {
					AT1 = p1RepColor;
					AT2 = p2RepColor;
				} else if (AT1 == "  --  " && AT2 == BATOCOLOR) {
					AT1 = p2RepColor;
				}
				break;
			case 21:
				if (AU1 == "  --  " && AU2 == "  --  ") {
					AU1 = p2RepColor;
					AU2 = p2RepColor;
				} else if (AU1 == p1RepColor && AU2 == p1RepColor) {
					AU1 = p1RepColor;
					AU2 = p2RepColor;
				} else if (AU1 == "  --  " && AU2 == BATOCOLOR) {
					AU1 = p2RepColor;
				}
				break;

			case 22:
				if (AV1 == "  --  " && AV2 == "  --  ") {
					AV1 = p2RepColor;
					AV2 = p2RepColor;
				} else if (AV1 == p1RepColor && AV2 == p1RepColor) {
					AV1 = p1RepColor;
					AV2 = p2RepColor;
				} else if (AV1 == "  --  " && AV2 == BATOCOLOR) {
					AV1 = p2RepColor;
				}
				break;

			case 23:
				if (AW1 == "  --  " && AW2 == "  --  ") {
					AW1 = p2RepColor;
					AW2 = p2RepColor;
				} else if (AW1 == p1RepColor && AW2 == p1RepColor) {
					AW1 = p1RepColor;
					AW2 = p2RepColor;
				} else if (AW1 == "  --  " && AW2 == BATOCOLOR) {
					AW1 = p2RepColor;
				}
				break;

			case 24:
				if (AX1 == "  --  " && AX2 == "  --  ") {
					AX1 = p2RepColor;
					AX2 = p2RepColor;
				} else if (AX1 == p1RepColor && AX2 == p1RepColor) {
					AX1 = p1RepColor;
					AX2 = p2RepColor;
				} else if (AX1 == "  --  " && AX2 == BATOCOLOR) {
					AX1 = p2RepColor;
				}
				break;

			case 25:
				if (AY1 == "  --  " && AY2 == "  --  ") {
					AY1 = p2RepColor;
					AY2 = p2RepColor;
				} else if (AY1 == p1RepColor && AY2 == p1RepColor) {
					AY1 = p1RepColor;
					AY2 = p2RepColor;
				} else if (AY1 == "  --  " && AY2 == BATOCOLOR) {
					AY1 = p2RepColor;
				}
				break;

			case 26:
				if (AZ1 == "  --  " && AZ2 == "  --  ") {
					AZ1 = p2RepColor;
					AZ2 = p2RepColor;
				} else if (AZ1 == p1RepColor && AZ2 == p1RepColor) {
					AZ1 = p1RepColor;
					AZ2 = p2RepColor;
				} else if (AZ1 == "  --  " && AZ2 == BATOCOLOR) {
					AZ1 = p2RepColor;
				}
				break;

			case 27:
				if (BA1 == "  --  " && BA2 == "  --  ") {
					BA1 = p2RepColor;
					BA2 = p2RepColor;
				} else if (BA1 == p1RepColor && BA2 == p1RepColor) {
					BA1 = p1RepColor;
					BA2 = p2RepColor;
				} else if (BA1 == "  --  " && BA2 == BATOCOLOR) {
					BA1 = p2RepColor;
				}
				break;

			case 28:
				if (BB1 == "  --  " && BB2 == "  --  ") {
					BB1 = p2RepColor;
					BB2 = p2RepColor;
				} else if (BB1 == p1RepColor && BB2 == p1RepColor) {
					BB1 = p1RepColor;
					BB2 = p2RepColor;
				} else if (BB1 == "  --  " && BB2 == BATOCOLOR) {
					BB1 = p2RepColor;
				}
				break;

			case 29:
				if (BC1 == "  --  " && BC2 == "  --  ") {
					BC1 = p2RepColor;
					BC2 = p2RepColor;
				} else if (BC1 == p1RepColor && BC2 == p1RepColor) {
					BC1 = p1RepColor;
					BC2 = p2RepColor;
				} else if (BC1 == "  --  " && BC2 == BATOCOLOR) {
					BC1 = p2RepColor;
				}
				break;

			case 30:
				if (BD1 == "  --  " && BD2 == "  --  ") {
					BD1 = p2RepColor;
					BD2 = p2RepColor;
				} else if (BD1 == p1RepColor && BD2 == p1RepColor) {
					BD1 = p1RepColor;
					BD2 = p2RepColor;
				} else if (BD1 == "  --  " && BD2 == BATOCOLOR) {
					BD1 = p2RepColor;
				}
				break;
			case 31:
				if (BE1 == "  --  " && BE2 == "  --  ") {
					BE1 = p2RepColor;
					BE2 = p2RepColor;
				} else if (BE1 == p1RepColor && BE2 == p1RepColor) {
					BE1 = p1RepColor;
					BE2 = p2RepColor;
				} else if (BE1 == "  --  " && BE2 == BATOCOLOR) {
					BE1 = p2RepColor;
				}
				break;

			case 32:
				if (BF1 == "  --  " && BF2 == "  --  ") {
					BF1 = p2RepColor;
					BF2 = p2RepColor;
				} else if (BF1 == p1RepColor && BF2 == p1RepColor) {
					BF1 = p1RepColor;
					BF2 = p2RepColor;
				} else if (BF1 == "  --  " && BF2 == BATOCOLOR) {
					BF1 = p2RepColor;
				}
				break;

			case 33:
				if (BG1 == "  --  " && BG2 == "  --  ") {
					BG1 = p2RepColor;
					BG2 = p2RepColor;
				} else if (BG1 == p1RepColor && BG2 == p1RepColor) {
					BG1 = p1RepColor;
					BG2 = p2RepColor;
				} else if (BG1 == "  --  " && BG2 == BATOCOLOR) {
					BG1 = p2RepColor;
				}
				break;

			case 34:
				if (BH1 == "  --  " && BH2 == "  --  ") {
					BH1 = p2RepColor;
					BH2 = p2RepColor;
				} else if (BH1 == p1RepColor && BH2 == p1RepColor) {
					BH1 = p1RepColor;
					BH2 = p2RepColor;
				} else if (BH1 == "  --  " && BH2 == BATOCOLOR) {
					BH1 = p2RepColor;
				}
				break;

			case 35:
				if (BI1 == "  --  " && BI2 == "  --  ") {
					BI1 = p2RepColor;
					BI2 = p2RepColor;
				} else if (BI1 == p1RepColor && BI2 == p1RepColor) {
					BI1 = p1RepColor;
					BI2 = p2RepColor;
				} else if (BI1 == "  --  " && BI2 == BATOCOLOR) {
					BI1 = p2RepColor;
				}
				break;

			case 36:
				if (BJ1 == "  --  " && BJ2 == "  --  ") {
					BJ1 = p2RepColor;
					BJ2 = p2RepColor;
				} else if (BJ1 == p1RepColor && BJ2 == p1RepColor) {
					BJ1 = p1RepColor;
					BJ2 = p2RepColor;
				} else if (BJ1 == "  --  " && BJ2 == BATOCOLOR) {
					BJ1 = p2RepColor;
				}
				break;

			case 37:
				if (BK1 == "  --  " && BK2 == "  --  ") {
					BK1 = p2RepColor;
					BK2 = p2RepColor;
				} else if (BK1 == p1RepColor && BK2 == p1RepColor) {
					BK1 = p1RepColor;
					BK2 = p2RepColor;
				} else if (BK1 == "  --  " && BK2 == BATOCOLOR) {
					BK1 = p2RepColor;
				}
				break;

			case 38:
				if (BL1 == "  --  " || BL1 == " "+B_WHITE+" "+B_BLACK+" "+B_WHITE+" "+B_BLACK+" "+B_WHITE+" "+ B_BLACK && BL2 == "  --  " || BL2 == B_WHITE+" "+B_BLACK+" "+B_WHITE+" "+B_BLACK+" "+B_WHITE+" "+B_BLACK+" ") {
					BL1 = p2RepColor;
					BL2 = p2RepColor;
				} else if (BL1 == p1RepColor && BL2 == p1RepColor) {
					BL1 = p1RepColor;
					BL2 = p2RepColor;
				} else if (BL1 == "  --  " || BL1 == " "+B_WHITE+" "+B_BLACK+" "+B_WHITE+" "+B_BLACK+" "+B_WHITE+" "+ B_BLACK && BL2 == BATOCOLOR) {
					BL1 = p2RepColor;
				}
				break;

			case 39:
				if (BM1 == "  --  " && BM2 == "  --  ") {
					BM1 = p2RepColor;
					BM2 = p2RepColor;
				} else if (BM1 == p1RepColor && BM2 == p1RepColor) {
					BM1 = p1RepColor;
					BM2 = p2RepColor;
				} else if (BM1 == "  --  " && BM2 == BATOCOLOR) {
					BM1 = p2RepColor;
				}
				break;

			case 40:
				if (BN1 == "  --  " && BN2 == "  --  ") {
					BN1 = p2RepColor;
					BN2 = p2RepColor;
				} else if (BN1 == p1RepColor && BN2 == p1RepColor) {
					BN1 = p1RepColor;
					BN2 = p2RepColor;
				} else if (BN1 == "  --  " && BN2 == BATOCOLOR) {
					BN1 = p2RepColor;
				}
				break;
			case 41:
				if (BO1 == "  --  " && BO2 == "  --  ") {
					BO1 = p2RepColor;
					BO2 = p2RepColor;
				} else if (BO1 == p1RepColor && BO2 == p1RepColor) {
					BO1 = p1RepColor;
					BO2 = p2RepColor;
				} else if (BO1 == "  --  " && BO2 == BATOCOLOR) {
					BO1 = p2RepColor;
				}
				break;

			case 42:
				if (BP1 == "  --  " && BP2 == "  --  ") {
					BP1 = p2RepColor;
					BP2 = p2RepColor;
				} else if (BP1 == p1RepColor && BP2 == p1RepColor) {
					BP1 = p1RepColor;
					BP2 = p2RepColor;
				} else if (BP1 == "  --  " && BP2 == BATOCOLOR) {
					BP1 = p2RepColor;
				}
				break;

			case 43:
				if (BQ1 == "  --  " && BQ2 == "  --  ") {
					BQ1 = p2RepColor;
					BQ2 = p2RepColor;
				} else if (BQ1 == p1RepColor && BQ2 == p1RepColor) {
					BQ1 = p1RepColor;
					BQ2 = p2RepColor;
				} else if (BQ1 == "  --  " && BQ2 == BATOCOLOR) {
					BQ1 = p2RepColor;
				}
				break;

			case 44:
				if (BR1 == "  --  " && BR2 == "  --  ") {
					BR1 = p2RepColor;
					BR2 = p2RepColor;
				} else if (BR1 == p1RepColor && BR2 == p1RepColor) {
					BR1 = p1RepColor;
					BR2 = p2RepColor;
				} else if (BR1 == "  --  " && BR2 == BATOCOLOR) {
					BR1 = p2RepColor;
				}
				break;

			case 45:
				if (BS1 == "  --  " && BS2 == "  --  ") {
					BS1 = p2RepColor;
					BS2 = p2RepColor;
				} else if (BS1 == p1RepColor && BS2 == p1RepColor) {
					BS1 = p1RepColor;
					BS2 = p2RepColor;
				} else if (BS1 == "  --  " && BS2 == BATOCOLOR) {
					BS1 = p2RepColor;
				}
				break;

			case 46:
				if (BT1 == "  --  " && BT2 == "  --  ") {
					BT1 = p2RepColor;
					BT2 = p2RepColor;
				} else if (BT1 == p1RepColor && BT2 == p1RepColor) {
					BT1 = p1RepColor;
					BT2 = p2RepColor;
				} else if (BT1 == "  --  " && BT2 == BATOCOLOR) {
					BT1 = p2RepColor;
				}
				break;

			case 47:
				if (BU1 == "  --  " && BU2 == "  --  ") {
					BU1 = p2RepColor;
					BU2 = p2RepColor;
				} else if (BU1 == p1RepColor && BU2 == p1RepColor) {
					BU1 = p1RepColor;
					BU2 = p2RepColor;
				} else if (BU1 == "  --  " && BU2 == BATOCOLOR) {
					BU1 = p2RepColor;
				}
				break;

			case 48:
				if (BV1 == "  --  " && BV2 == "  --  ") {
					BV1 = p2RepColor;
					BV2 = p2RepColor;
				} else if (BV1 == p1RepColor && BV2 == p1RepColor) {
					BV1 = p1RepColor;
					BV2 = p2RepColor;
				} else if (BV1 == "  --  " && BV2 == BATOCOLOR) {
					BV1 = p2RepColor;
				}
				break;

			case 49:
				if (BW1 == "  --  " && BW2 == "  --  ") {
					BW1 = p2RepColor;
					BW2 = p2RepColor;
				} else if (BW1 == p1RepColor && BW2 == p1RepColor) {
					BW1 = p1RepColor;
					BW2 = p2RepColor;
				} else if (BW1 == "  --  " && BW2 == BATOCOLOR) {
					BW1 = p2RepColor;
				}
				break;

			case 50:
				if (BX1 == "  --  " && BX2 == "  --  ") {
					BX1 = p2RepColor;
					BX2 = p2RepColor;
				} else if (BX1 == p1RepColor && BX2 == p1RepColor) {
					BX1 = p1RepColor;
					BX2 = p2RepColor;
				} else if (BX1 == "  --  " && BX2 == BATOCOLOR) {
					BX1 = p2RepColor;
				}
				break;

			case 51:
				if (BY1 == "  --  " && BY2 == "  --  ") {
					BY1 = p2RepColor;
					BY2 = p2RepColor;
				} else if (BY1 == p1RepColor && BY2 == p1RepColor) {
					BY1 = p1RepColor;
					BY2 = p2RepColor;
				} else if (BY1 == "  --  " && BY2 == BATOCOLOR) {
					BY1 = p2RepColor;
				}
				break;

			case 52:
				if (BZ1 == "  --  " && BZ2 == "  --  ") {
					BZ1 = p2RepColor;
					BZ2 = p2RepColor;
				} else if (BZ1 == p1RepColor && BZ2 == p1RepColor) {
					BZ1 = p1RepColor;
					BZ2 = p2RepColor;
				} else if (BZ1 == "  --  " && BZ2 == BATOCOLOR) {
					BZ1 = p2RepColor;
				}
				break;

			case 53:
				if (CA1 == "  --  " && CA2 == "  --  ") {
					CA1 = p2RepColor;
					CA2 = p2RepColor;
				} else if (CA1 == p1RepColor && CA2 == p1RepColor) {
					CA1 = p1RepColor;
					CA2 = p2RepColor;
				} else if (CA1 == "  --  " && CA2 == BATOCOLOR) {
					CA1 = p2RepColor;
				}
				break;

			case 54:
				if (CB1 == "  --  " && CB2 == "  --  ") {
					CB1 = p2RepColor;
					CB2 = p2RepColor;
				} else if (CB1 == p1RepColor && CB2 == p1RepColor) {
					CB1 = p1RepColor;
					CB2 = p2RepColor;
				} else if (CB1 == "  --  " && CB2 == BATOCOLOR) {
					CB1 = p2RepColor;
				}
				break;

			case 55:
				if (CC1 == "  --  " && CC2 == "  --  ") {
					CC1 = p2RepColor;
					CC2 = p2RepColor;
				} else if (CC1 == p1RepColor && CC2 == p1RepColor) {
					CC1 = p1RepColor;
					CC2 = p2RepColor;
				} else if (CC1 == "  --  " && CC2 == BATOCOLOR) {
					CC1 = p2RepColor;
				}
				break;

			case 56:
				if (CD1 == "  --  " && CD2 == "  --  ") {
					CD1 = p2RepColor;
					CD2 = p2RepColor;
				} else if (CD1 == p1RepColor && CD2 == p1RepColor) {
					CD1 = p1RepColor;
					CD2 = p2RepColor;
				} else if (CD1 == "  --  " && CD2 == BATOCOLOR) {
					CD1 = p2RepColor;
				}
				break;

			case 57:
				if (CE1 == "  --  " && CE2 == "  --  ") {
					CE1 = p2RepColor;
					CE2 = p2RepColor;
				} else if (CE1 == p1RepColor && CE2 == p1RepColor) {
					CE1 = p1RepColor;
					CE2 = p2RepColor;
				} else if (CE1 == "  --  " && CE2 == BATOCOLOR) {
					CE1 = p2RepColor;
				}
				break;

			case 58:
				if (CF1 == "  --  " && CF2 == "  --  ") {
					CF1 = p2RepColor;
					CF2 = p2RepColor;
				} else if (CF1 == p1RepColor && CF2 == p1RepColor) {
					CF1 = p1RepColor;
					CF2 = p2RepColor;
				} else if (CF1 == "  --  " && CF2 == BATOCOLOR) {
					CF1 = p2RepColor;
				}
				break;

			case 59:
				if (CG1 == "  --  " && CG2 == "  --  ") {
					CG1 = p2RepColor;
					CG2 = p2RepColor;
				} else if (CG1 == p1RepColor && CG2 == p1RepColor) {
					CG1 = p1RepColor;
					CG2 = p2RepColor;
				} else if (CG1 == "  --  " && CG2 == BATOCOLOR) {
					CG1 = p2RepColor;
				}
				break;

			case 60:
				if (CH1 == "  --  " && CH2 == "  --  ") {
					CH1 = p2RepColor;
					CH2 = p2RepColor;
				} else if (CH1 == p1RepColor && CH2 == p1RepColor) {
					CH1 = p1RepColor;
					CH2 = p2RepColor;
				} else if (CH1 == "  --  " && CH2 == BATOCOLOR) {
					CH1 = p2RepColor;
				}
				break;
			case 61:
				if (CI1 == "  --  " && CI2 == "  --  ") {
					CI1 = p2RepColor;
					CI2 = p2RepColor;
				} else if (CI1 == p1RepColor && CI2 == p1RepColor) {
					CI1 = p1RepColor;
					CI2 = p2RepColor;
				} else if (CI1 == "  --  " && CI2 == BATOCOLOR) {
					CI1 = p2RepColor;
				}
				break;

			case 62:
				if (CJ1 == "  --  " && CJ2 == "  --  ") {
					CJ1 = p2RepColor;
					CJ2 = p2RepColor;
				} else if (CJ1 == p1RepColor && CJ2 == p1RepColor) {
					CJ1 = p1RepColor;
					CJ2 = p2RepColor;
				} else if (CJ1 == "  --  " && CJ2 == BATOCOLOR) {
					CJ1 = p2RepColor;
				}
				break;

			case 63:
				if (CK1 == "  --  " && CK2 == "  --  ") {
					CK1 = p2RepColor;
					CK2 = p2RepColor;
				} else if (CK1 == p1RepColor && CK2 == p1RepColor) {
					CK1 = p1RepColor;
					CK2 = p2RepColor;
				} else if (CK1 == "  --  " && CK2 == BATOCOLOR) {
					CK1 = p2RepColor;
				}
				break;

			case 64:
				if (CL1 == "  --  " && CL2 == "  --  ") {
					CL1 = p2RepColor;
					CL2 = p2RepColor;
				} else if (CL1 == p1RepColor && CL2 == p1RepColor) {
					CL1 = p1RepColor;
					CL2 = p2RepColor;
				} else if (CL1 == "  --  " && CL2 == BATOCOLOR) {
					CL1 = p2RepColor;
				}
				break;

			case 65:
				if (CM1 == "  --  " || CM1 == " "+B_WHITE+" "+B_BLACK+" "+B_WHITE+" "+B_BLACK+" "+B_WHITE+" "+ B_BLACK && CM2 == "  --  " || CM2 == B_WHITE+" "+B_BLACK+" "+B_WHITE+" "+B_BLACK+" "+B_WHITE+" "+B_BLACK+" ") {
					CM1 = p2RepColor;
					CM2 = p2RepColor;
				} else if (CM1 == p1RepColor && CM2 == p1RepColor) {
					CM1 = p1RepColor;
					CM2 = p2RepColor;
				} else if (CM1 == "  --  " || CM1 == " "+B_WHITE+" "+B_BLACK+" "+B_WHITE+" "+B_BLACK+" "+B_WHITE+" "+ B_BLACK && CM2 == BATOCOLOR) {
					CM1 = p2RepColor;
				}
				break;
			}
			break;
		}
	}




	
	
	
	
}
