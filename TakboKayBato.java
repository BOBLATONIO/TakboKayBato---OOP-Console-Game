import java.util.Scanner;

public class TakboKayBato {

	//Import Class
	Scanner scan = new Scanner(System.in);  //SCANNER
	Referee referee = new Referee();  //REFEREE
	Design design = new Design();    //DESIGN
	Player player = new Player();  //PLAYER
	Dice dice = new Dice();  //DICE
	EasyMode easy = new EasyMode();  //EASYMODE
	HardMode hard = new HardMode();  //HARDMODE

	//Attributes
	private int gameMode = 0; //GAMEMODE
	private int boardLevel = 0; //BOARDLEVEL

	//Run
	public void run() { 
		resizeConsole(); //RESICE CONSOLE
		gameLoadingAndTitle();
		run1();
	}
	
	//RUN 1
	private void run1() {   //RUN IF THE USER IS READY TO PLAY OR PLAY AGAIN
		setUpGame();
		if (gameMode == 1 || gameMode == 2) {
			giveToReferee();   
			giveToBoard();
			startGame();
		}
	}

	//StartGame
	private void startGame(){
		design.roundNumber(referee.getGameRound());
		pause(2000); //PAUSE 1000 IS EQUAL TO 1 SEC
		spacerLoop(75);
		if (boardLevel == 1) { //easyMOde
			easyModeRun();
		}else if (boardLevel == 2) { //hardMOde
			hardModeRun();
		}
	}

	private void easyModeRun(){
		do {
			do {
				if (player.getp2Position() < referee.getWinDistance()) {//For Player 1
					resetBoard(true);
					easy.setMessage(1, 1); //loading
					printBoard(); //print position
					resetBoard(true);
					easy.setMessage(1, 2);////player 1 please enter
					printBoard();
					resetBoard(true);
					scan.nextLine();
					easy.setMessage(1, 4);//player 1 rolling dice
					printBoard();
					resetBoard(true);
					player.setP1Position(dice.rollDice());
					easy.setMessage(1, 0);//MOVING
					spacerLoop(75);
					printBoardLoop(1);//PLAYER 1 BOARD LOOP
					resetBoard(true);
					checkGameWinner(1); //checkPlayer1ifwinner
					checkBato(1);//chckplayer1ifinteractwithbato
				}
				if (player.getp1Position() < referee.getWinDistance()) {//For Player 2 or Computer
					resetBoard(true);
					easy.setMessage(2, 1); //loading
					printBoard(); //print position
					resetBoard(true);
					if (gameMode == 1) {//player vs computer
						easy.setMessage(3, 6);//Computer Turn!
						printBoard();
						resetBoard(true);
						easy.setMessage(3, 7);//computer rolling dice
						printBoard();
						resetBoard(true);
						player.setP2Position(dice.rollDice());
						easy.setMessage(3, 0);//MOVING
						printBoardLoop(2);
						resetBoard(true);
					}else if (gameMode == 2) {//player vs player
						easy.setMessage(2, 3);//player 2 please enter
						printBoard();
						resetBoard(true);
						scan.nextLine();
						easy.setMessage(2, 5);//player 2 rolling dice
						printBoard();
						resetBoard(true);
						player.setP2Position(dice.rollDice());
						easy.setMessage(2, 0);//MOVING
						printBoardLoop(2);
						resetBoard(true);
					}
					checkGameWinner(2); //checkPlayer2ifwinner
					checkBato(2);//chckplayer2ifinteractwithbato
				}
			}while (player.getp1Position() < referee.getWinDistance() && player.getp2Position() < referee.getWinDistance());
		}while(referee.getP1Score() < referee.getWinScore() && referee.getP2Score() < referee.getWinScore());

	}

	private void hardModeRun(){
		do {
			do {
				if (player.getp2Position() < referee.getWinDistance()) {//For Player 1
					resetBoard(true);
					hard.setMessage(1, 1); //loading
					printBoard(); //print position
					resetBoard(true);
					//pause here
					hard.setMessage(1, 2);////player 1 please enter
					printBoard();
					resetBoard(true);
					scan.nextLine();
					hard.setMessage(1, 4);//player 1 rolling dice
					printBoard();
					resetBoard(true);
					//pause here
					player.setP1Position(dice.rollDice());
					hard.setMessage(1, 0);//MOVING
					printBoardLoop(1);
					resetBoard(true);
					//pause here
					checkGameWinner(1); //checkPlayer1ifwinner
					checkBato(1);//chckplayer1ifinteractwithbato
				}
				if (player.getp1Position() < referee.getWinDistance()) {//For Player 2 or Computer
					resetBoard(true);
					hard.setMessage(2, 1); //loading
					printBoard(); //print position
					resetBoard(true);
					//pause here
					if (gameMode == 1) {//player vs computer
						hard.setMessage(3, 6);//Computer Turn!
						printBoard();
						resetBoard(true);
						//pause here
						hard.setMessage(3, 7);//computer rolling dice
						printBoard();
						resetBoard(true);
						//pause here
						player.setP2Position(dice.rollDice());
						hard.setMessage(3, 0);//MOVING
						printBoardLoop(2);
						resetBoard(true);
					}else if (gameMode == 2) {//player vs player
						hard.setMessage(2, 3);//player 2 please enter
						printBoard();
						resetBoard(true);
						scan.nextLine();
						hard.setMessage(2, 5);//player 2 rolling dice
						printBoard();
						resetBoard(true);
						//pause here
						player.setP2Position(dice.rollDice());
						hard.setMessage(2, 0);//MOVING
						printBoardLoop(2);
						resetBoard(true);
					}
					//pause here
					checkGameWinner(2); //checkPlayer2ifwinner
					checkBato(2);//chckplayer2ifinteractwithbato
				}
			}while (player.getp1Position() < referee.getWinDistance() && player.getp2Position() < referee.getWinDistance());
		}while(referee.getP1Score() < referee.getWinScore() && referee.getP2Score() < referee.getWinScore());

	}

	private void printBoard(){ 
		if (boardLevel == 1) { //easyMOde
			spacerLoop(45);
			easy.printBoard(player.getp1Position(), player.getp2Position(), player.getPlayerDice(), referee.getGameRound(), referee.getP1Score(), referee.getP2Score()); //print position
			pause(2000); //PAUSE 1000 IS EQUAL TO 1 SEC
		} else if (boardLevel == 2) {//HardMode
			spacerLoop(45);
			hard.printBoard(player.getp1Position(), player.getp2Position(), player.getPlayerDice(), referee.getGameRound(), referee.getP1Score(), referee.getP2Score()); //print position
			pause(2000); //PAUSE 1000 IS EQUAL TO 1 SEC
		}
	}

	private void printBoardLoop(int plyr){ 
		spacerLoop(75);
		if (boardLevel == 1) { //EASYMODE
			if (plyr == 1) {
				int oldPlayer1Position = player.getp1Position() - player.getPlayerDice();
				for (int i = 0; i < player.getPlayerDice(); i++) {
					easy.setMessage(plyr, 0);
					easy.setRecentDice(player.getPlayerDice());
					easy.printBoard(oldPlayer1Position, player.getp2Position(), player.getPlayerDice(), referee.getGameRound(), referee.getP1Score(), referee.getP2Score()); //print position
					oldPlayer1Position ++;
					resetBoard(false);
					pause(800); //PAUSE 1000 IS EQUAL TO 1 SEC
					spacerLoop(45);
				}
			}else if (plyr == 2) {
				int oldPlayer2Position = player.getp2Position() - player.getPlayerDice();
				for (int i = 0; i < player.getPlayerDice(); i++) {
					easy.setMessage(plyr, 0);
					easy.setRecentDice(player.getPlayerDice());
					easy.printBoard(player.getp1Position(), oldPlayer2Position, player.getPlayerDice(), referee.getGameRound(), referee.getP1Score(), referee.getP2Score()); //print position
					oldPlayer2Position ++;
					resetBoard(false);
					pause(800); //PAUSE 1000 IS EQUAL TO 1 SEC
					spacerLoop(45);
				}
			}
		} 
		else if (boardLevel == 2) {//HARDMODE
			if (plyr == 1) {
				int oldPlayer1Position = player.getp1Position() - player.getPlayerDice();
				for (int i = 0; i < player.getPlayerDice(); i++) {
					easy.setMessage(plyr, 0);
					easy.setRecentDice(player.getPlayerDice());
					hard.printBoard(oldPlayer1Position, player.getp2Position(), player.getPlayerDice(), referee.getGameRound(), referee.getP1Score(), referee.getP2Score()); //print position
					oldPlayer1Position ++;
					resetBoard(false);
					pause(800); //PAUSE 1000 IS EQUAL TO 1 SEC
					spacerLoop(45);
				}
			}else if (plyr == 2) {
				int oldPlayer2Position = player.getp2Position() - player.getPlayerDice();
				for (int i = 0; i < player.getPlayerDice(); i++) {
					easy.setMessage(plyr, 0);
					easy.setRecentDice(player.getPlayerDice());
					hard.printBoard(player.getp1Position(), oldPlayer2Position, player.getPlayerDice(), referee.getGameRound(), referee.getP1Score(), referee.getP2Score()); //print position
					oldPlayer2Position ++;
					resetBoard(false);
					pause(800); //PAUSE 1000 IS EQUAL TO 1 SEC
					spacerLoop(45);
				}
			}
		}
	}

	private void resetBoard(boolean resetDice) {
		if (resetDice) {
			player.resetDice();
		}
		if (boardLevel == 1) { //Easy Mode
			easy.resetGameBoard();
		}else if (boardLevel == 2) {  //Hard Mode
			hard.resetGameBoard();
		}


	}

	private void batoTurn(int plyr){ 
		if (boardLevel == 1) {//Easy Mode
			resetBoard(true);
			printBoard();
			pause(1000);
			spacerLoop(75);
			batoPictureLoop();
			pause(2000); //PAUSE 1000 IS EQUAL TO 1 SEC
			if (gameMode == 1) {
				if (plyr == 1) {/////////////////////////////////////////////////////////////
					easy.setMessage(1, 9);//YOU INTERACT WITH BATO
				}else if (plyr == 2) {
					easy.setMessage(0, 13);//COMPUTER INTERACT WITH BATO
				}
			}else if (gameMode == 2) {
				easy.setMessage(1, 9);//YOU INTERACT WITH BATO
			}
			printBoard();
			resetBoard(true);
			//add pause
			easy.setMessage(0, 10); //bato rolling dice
			printBoard();
			resetBoard(true);
			//add pause
			player.setDice(dice.rollDice());
			easy.setRecentDice(player.getPlayerDice());
			if (plyr == 1) {
				easy.setMessage(1, 11);  //Player 1 Minus Dice
			}else if(plyr == 2){
				if (gameMode == 1) { //Player Vs Computer
					easy.setMessage(3, 11);   //Computer Minus Dice
				}else if (gameMode == 2) {//Player Vs Player
					easy.setMessage(2, 11);  //Player 2 Minus Dice
				}
			}
			printBoard();
			resetBoard(false);
			easy.setMessage(0, 12); //BATO HAHAHAH
			spacerLoop(75);
			if (plyr == 1) {
				int x = player.getPlayerDice();
				for (int i = 0; i < x; i++) {
					easy.setMessage(0, 12); //BATO HAHAHAH
					easy.printBoard(player.getp1Position(), player.getp2Position(), x, referee.getGameRound(), referee.getP1Score(), referee.getP2Score()); //print position
					player.getBack(1, 1);
					resetBoard(false);
					pause(800); //PAUSE 1000 IS EQUAL TO 1 SEC
					spacerLoop(45);
				}
			}else if (plyr == 2) {
				int x = player.getPlayerDice();
				for (int i = 0; i < x; i++) {
					easy.setMessage(0, 12); //BATO HAHAHAH
					easy.printBoard(player.getp1Position(), player.getp2Position(), x, referee.getGameRound(), referee.getP1Score(), referee.getP2Score()); //print position
					player.getBack(2, 1);
					resetBoard(false);
					pause(800); //PAUSE 1000 IS EQUAL TO 1 SEC
					spacerLoop(45);
				}
			}
			resetBoard(true);
			checkBato(plyr); //CHECK AGAIN IF A PLAYER INTERACT WITH BATO
		}

		else if (boardLevel == 2) { //HARDMODE
			resetBoard(true);
			printBoard();
			pause(1000);
			spacerLoop(75);
			batoPictureLoop();
			pause(2000); //PAUSE 1000 IS EQUAL TO 1 SEC
			if (gameMode == 1) {
				if (plyr == 1) {
					hard.setMessage(1, 9);//YOU INTERACT WITH BATO
				}else if (plyr == 2) {
					hard.setMessage(0, 13);//COMPUTER INTERACT WITH BATO
				}
			}else if (gameMode == 2) {
				hard.setMessage(1, 9);//YOU INTERACT WITH BATO
			}
			printBoard();
			resetBoard(true);
			//add pause
			hard.setMessage(0, 10); //BATO ROLLING DICE
			printBoard();
			resetBoard(true);
			//add pause
			player.setDice(dice.rollDice());
			hard.setRecentDice(player.getPlayerDice());
			if (plyr == 1) {
				easy.setMessage(1, 11);  //PLAYER 1 MINUS DICE
			}else if(plyr == 2){
				if (gameMode == 1) { //PLAYER VS COMPUTER
					hard.setMessage(3, 11);   //COMPUTER MINUS DICE
				}else if (gameMode == 2) {//PLAYER VS PLAYER
					hard.setMessage(2, 11);  //PLAYER 2 MINUS DICE
				}
			}
			printBoard();
			resetBoard(false);
			hard.setMessage(0, 12); //Bato hahahah
			spacerLoop(75);
			if (plyr == 1) {
				int x = player.getPlayerDice();
				for (int i = 0; i < x; i++) {
					hard.setMessage(0, 12); //Bato hahahah
					hard.printBoard(player.getp1Position(), player.getp2Position(), x, referee.getGameRound(), referee.getP1Score(), referee.getP2Score()); //print position
					player.getBack(1, 1);
					resetBoard(false);
					pause(800); //PAUSE 1000 IS EQUAL TO 1 SEC
					spacerLoop(45);
				}
			}else if (plyr == 2) {
				int x = player.getPlayerDice();
				for (int i = 0; i < x; i++) {
					hard.setMessage(0, 12); //Bato hahahah
					hard.printBoard(player.getp1Position(), player.getp2Position(), x, referee.getGameRound(), referee.getP1Score(), referee.getP2Score()); //print position
					player.getBack(2, 1);
					resetBoard(false);
					pause(800); //PAUSE 1000 IS EQUAL TO 1 SEC
					spacerLoop(45);
				}
			}
			resetBoard(true);
			checkBato(plyr); //check Again
			//pause here
		}
	}
	
	private void batoPictureLoop(){
		for (int i = 0; i < 4; i++) {
			spacerLoop(75);
			design.batoPicture(design.BATOCYAN);
			pause(100);
			spacerLoop(75);
			design.batoPicture(design.BATOBLACK);
			pause(100);
			spacerLoop(75);
			design.batoPicture(design.BATOWHITE);
			pause(100);
			spacerLoop(75);
			design.batoPicture(design.BATORED);
			pause(100);
		}
	}

	private void checkGameWinner(int plyr){ //1 - player 1  |  2 - player 2 
		if (plyr == 1) { //Player 1
			if (player.getp1Position() >= referee.getWinDistance()) {
				referee.addP1Score(); //Add Player 1 Score
				if (referee.getP1Score() >= referee.getWinScore()) {
					if (boardLevel == 1) {////////////////////////////////
						player.setP1Position(38);
					}else if (boardLevel == 2) {
						player.setP1Position(65);
					}
					printBoard(); //PRINT BOARD
					pause(2000);
					spacerLoop(75);
					design.winner(1);//PLAYER 1 WINNER
					pause(2500); //PAUSE 1000 IS EQUAL TO 1 SEC
					spacerLoop(45);
					resetAll(); //RESET ALL
					spacerLoop(75);
					run1();//RUN HOMEPAGE
				}
				if (referee.getP1Score() < referee.getWinScore() && referee.getP2Score() < referee.getWinScore()) {//Check if Player Score is Less Than Winning Score
					player.resetPlayerPosition();
					referee.addGameRound();
					design.roundNumber(referee.getGameRound());
					pause(3000); //PAUSE 1000 IS EQUAL TO 1 SEC
					spacerLoop(45);
				}
			}
		}


		else if(plyr == 2) { //Player 1 or Computer
			if (player.getp2Position() >= referee.getWinDistance()) {
				referee.addP2Score(); //Add Player 2 or Computer Score
				if (boardLevel == 1) {////////////////////////////////
					player.setP1Position(38);
				}else if (boardLevel == 2) {
					player.setP1Position(65);
				}
				if (referee.getP2Score() >= referee.getWinScore()) { 
					printBoard(); //PRINT BOARD
					pause(2000);///////////////////////////////////////////////
					spacerLoop(75);
					if (gameMode == 1) {//PLAYER VS COMPUTER
						design.winner(3);//COMPUTER WINNER
					}else if (gameMode == 2) {//PLAYER VS PLAYER
						design.winner(2); //PLAYER 2 WINNER
					}
					pause(2500); //PAUSE 1000 IS EQUAL TO 1 SEC
					spacerLoop(45);
					resetAll();
					spacerLoop(75);
					run1(); //run HomePage
				}
				if (referee.getP1Score() < referee.getWinScore() && referee.getP2Score() < referee.getWinScore()) {//Check if Player Score is Less Than Winning Score
					if (gameMode == 1) { //Player Vs Computer
						player.resetPlayerPosition();
						referee.addGameRound();
						design.roundNumber(referee.getGameRound());
						pause(3000); //PAUSE 1000 IS EQUAL TO 1 SEC
						spacerLoop(45);
					}else if (gameMode == 2) {//Player Vs Computer
						player.resetPlayerPosition();
						referee.addGameRound();
						design.roundNumber(referee.getGameRound());
						pause(3000); //PAUSE 1000 IS EQUAL TO 1 SEC
						spacerLoop(45);
					}
				}
			}
		}
	}



	private void resetAll(){
		player.resetAllPlayer();
		referee.resetAllReferee();
		resetBoard(true);
		gameMode = 0;
		boardLevel = 0;
	}


	private void checkBato(int plyr) {  
		if (boardLevel == 1) {
			if (plyr == 1) {
				boolean ifTrue = easy.checkBato(player.getp1Position());
				if (ifTrue) {
					batoTurn(plyr);
				}
			}else if (plyr == 2){
				boolean ifTrue = easy.checkBato(player.getp2Position());
				if (ifTrue) {
					batoTurn(plyr);
				}
			}
		}else if (boardLevel == 2) {//Hard Mode
			if (plyr == 1) {
				boolean ifTrue = hard.checkBato(player.getp1Position());
				if (ifTrue) {
					batoTurn(plyr);
				}
			}else if (plyr == 2){
				boolean ifTrue = hard.checkBato(player.getp2Position());
				if (ifTrue) {
					batoTurn(plyr);
				}
			}
		}
	}
	

	//GiveToReferee
	private void giveToReferee(){
		if (boardLevel == 1){//Easy Mode
			referee.setWinningDistance(easy.getWinDistance());
		} else if (boardLevel == 2) { //Hard Mode
			referee.setWinningDistance(hard.getWinDistance());
		}
	}

	//GiveToBoard
	private void giveToBoard(){
		if (boardLevel == 1){
			easy.setBoard(gameMode, player.getPlayer1Color(), player.getPlayer2Color(), referee.getWinScore());
		}else if (boardLevel == 2) {
			hard.setBoard(gameMode, player.getPlayer1Color(), player.getPlayer2Color(), referee.getWinScore());
		}
	}


	//Spacer For-Loop
	private void spacerLoop(int spaceNum){
		for (int i = 0; i < spaceNum; i++) {
			System.out.println();
		}
	}

	


	//Pause
	private void pause(int speed){
		try {
			Thread.sleep(speed);
		} catch (InterruptedException ex) {
			System.out.println("There is an error in this line of code!");
		}
	}

	//Setup Game
	private void setUpGame() {
		//GetGameMode and Home Page
		gameMode = 99;
		while (gameMode < 0 || gameMode > 2) { //GAME MODE
			spacerLoop(75);
			design.askGameMode();
			gameMode = scan.nextInt();
			scan.nextLine();
		}
		if (gameMode == 1 || gameMode == 2) {
			spacerLoop(75);
			setUpGame1();
		}else if (gameMode == 0) { //QUIT
			spacerLoop(75);
			design.quitGame();
		}
		
	}

	private void setUpGame1(){  //GetBoardLevel
		boardLevel = 99;
		System.out.println(); //spacer
		while (boardLevel < 0 || boardLevel > 2) { //BoardLevel
			spacerLoop(75);
			design.askBoardLevel();
			boardLevel = scan.nextInt();
			scan.nextLine();
		}
		if (boardLevel == 1 || boardLevel == 2) {
			spacerLoop(75);
			setUpGame2();
		}else if (boardLevel == 0) { //BACK
			spacerLoop(75);
			setUpGame(); //BACK AND GO TO HOME PAGE OR GET GAMEMODE
		}
	}

	private void setUpGame2(){ //GetWinningScore
		referee.setWinningScore(99);
		System.out.println(); //spacer
		while (referee.getWinScore() < 0 || referee.getWinScore() > 5) { //Winning Score
			spacerLoop(75);
			design.askWinningScore();
			referee.setWinningScore(scan.nextInt());
			scan.nextLine(); //para d malagpasan yun susunod na user input
		}
		if (referee.getWinScore() >= 1 && referee.getWinScore() <= 5) {
			spacerLoop(75);
			setUpGame3(); //GO TO SETUP3 OR GET PLAYER 1 REPRESENTATIVE COLOR
		}else if (referee.getWinScore() == 0) { //BACK
			spacerLoop(75);
			setUpGame1(); //BACK AND GO TO SETUP1 AND GET BOARD LEVEL
		}
	}

	private void setUpGame3(){ //GetPlayer1RepresentativeColor
		player.setPlayer1Color(99);
		System.out.println();
		//Player1Color
		while (player.getPlayer1Color() < 0 || player.getPlayer1Color() > 6) {   
			spacerLoop(75);
			design.askPlayer1Color();
			player.setPlayer1Color(scan.nextInt());
			scan.nextLine();
		}
		if (player.getPlayer1Color() >= 1 && player.getPlayer1Color() <= 6) {
			spacerLoop(75);
			setUpGame4(); //GO TO SETUP4 OR GET PLAYER 2 REPRESENTATICVE COLOR
		}else if (player.getPlayer1Color() == 0) {//BACK
			spacerLoop(75);
			setUpGame2(); //BACK AND GO TO SETUP2 AND GET WINNING SCORE
		}
	}


	private void setUpGame4(){
		player.setPlayer2Color(99);
		if (gameMode == 1) {  ///player vs computer mode
			//ComputerColor
			player.setPlayer2Color(dice.rollDice()); 
			while(player.getPlayer1Color() == player.getPlayer2Color()){
				player.setPlayer2Color(dice.rollDice()); 
			}
		}else if (gameMode == 2) { //player vs player
			System.out.println(); //spacer
			//Player2Color
			while (player.getPlayer2Color() < 0 || player.getPlayer2Color() > 6) {
				design.askPlayer2Color();
				player.setPlayer2Color(scan.nextInt());
				scan.nextLine();
				while(player.getPlayer1Color() == player.getPlayer2Color()){
					spacerLoop(75);
					design.askPlayer2Color();
					player.setPlayer2Color(scan.nextInt());
					scan.nextLine();
				}
			}
			if (player.getPlayer2Color() == 0) { //BACK
				spacerLoop(75);
				setUpGame3(); //BACK AND GO TO SETUP3 OR GET PLAYER 1 COLOR
			}
		}
		spacerLoop(75);
	}


	//GameLoading
	private void gameLoadingAndTitle(){
		pause(1000); spacerLoop(75);
		design.loadingAnim7();
		pause(1000); spacerLoop(75);
		design.loadingAnim6();
		pause(1000); spacerLoop(75);
		design.loadingAnim5();
		pause(1100); spacerLoop(75);
		design.loadingAnim4();
		pause(1200); spacerLoop(75);
		design.loadingAnim3();
		pause(1500); spacerLoop(75);
		design.loadingAnim2();
		pause(4000); spacerLoop(75);
		design.loadingAnim1();
		pause(2000); spacerLoop(75); 
	}

	//ResizeConsole
	private void resizeConsole(){
		design.resizeConsole();
		scan.nextLine();
		spacerLoop(75);
	}



}
