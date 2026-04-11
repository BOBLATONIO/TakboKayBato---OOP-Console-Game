public class Design {

	//RESET
	public final String RESET = "\033[0m";

	//BACKGROUND COLOR
	public final String B_BLACK = RESET + "\033[40m";
	public final String B_RED = RESET + "\033[41m";
	public final String B_BLUE = RESET + "\033[44m";
	public final String B_GREEN = RESET + "\033[42m";  
	public final String B_YELLOW = RESET + "\033[43m";
	public final String B_PURPLE = RESET + "\033[45m"; 
	public final String B_CYAN = RESET + "\033[46m";   
	public final String B_WHITE = RESET + "\033[47m";
	public final String B_ORANGE = RESET + "\033[48;2;255;165;0m"; 
	
	//BLACK BACKGOUND + COLOR TEXT
	public final String KBLUE = RESET +   "\033[0;94m" +  "\033[40m"; 
	public final String KRED = RESET +    "\033[0;91m" +  "\033[40m";     
	public final String KGREEN = RESET + "\033[0;92m" +  "\033[40m";  
	public final String KYELLOW = RESET +  "\033[0;93m" +  "\033[40m"; 
	public final String KPURPLE = RESET +   "\033[0;95m" +  "\033[40m";  
	public final String KCYAN = RESET +   "\033[0;96m" +  "\033[40m";  
	public final String KORANGE = RESET + "\033[38;2;255;165;0m" + "\033[40m";

	//COLOR TEXT
	public final String BLUE = RESET +  "\033[0;94m";
	public final String RED = RESET +  "\033[0;91m";    
	public final String GREEN = RESET + "\033[0;92m";  
	public final String YELLOW = RESET +  "\033[0;93m"; 
	public final String PURPLE = RESET + "\033[0;95m"; 
	public final String CYAN = RESET + "\033[0;96m";   
	public final String WHITE = RESET + "\033[0;37m";   

	//BLACK TEXT + COLOR BACKGROUND + BOLD TEXT
	public final String PORANGE = RESET +  "\033[1m" + "\033[48;2;255;165;0m" + "\033[38;2;255;255;255m";
	public final String PRED = RESET +  "\033[1m" + "\033[41m" + "\033[38;2;255;255;255m";
	public final String PYELLOW = RESET +  "\033[1m" + "\033[43m" + "\033[38;2;255;255;255m";
	public final String PPURPLE = RESET +  "\033[1m" + "\033[45m" + "\033[38;2;255;255;255m";
	public final String PGREEN = RESET +  "\033[1m" + "\033[42m" + "\033[38;2;255;255;255m";
	public final String PBLUE = RESET +  "\033[1m" + "\033[44m" + "\033[38;2;255;255;255m";
	
	//BATO PICTURE COLOR

	public final String BATOCYAN = RESET + "\u001B[30;46m";
	public final String BATOBLACK = B_BLACK;
	public final String BATOWHITE = RESET + "\033[47m" + "\033[0;30m";
	public final String BATORED = RESET + "\033[41m" + "\033[0;37m";

	//TEXT
	public String BOLD = "\033[0;1m";
	
	//LOADING
	private final String GREENLOADING = "\033[40m" + "\033[0;32m";

	//BOARD DICE
	public final String DICE1 = "•  •  •";
	public final String DICE2 = "•  •   ";
	public final String DICE3 = " •   • ";  
	public final String DICE4 = "   •   ";
	public final String DICE5 = "       ";

	//CONSTRUCTOR
	public Design(){

	}


	public void resizeConsole(){
		System.out.println(B_BLACK + "┌──────────────────────────                    ─────────────────────────────────                    ──────────────────────────┐" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "                                                                                                                               " + RESET);
		System.out.println(B_BLACK + "                                                                                                                               " + RESET);
		System.out.println(B_BLACK + "                                                                                                                               " + RESET);
		System.out.println(B_BLACK + "                                                                                                                               " + RESET);
		System.out.println(B_BLACK + "                                                                                                                               " + RESET);
		System.out.println(B_BLACK + "                                                                                                                               " + RESET);
		System.out.println(B_BLACK + "                                                                                                                               " + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                         RESIZE YOUR CONSOLE/TERMINAL TO THIS FRAME                                          │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                ---PRESS ENTER TO CONTINUE---                                                │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "                                                                                                                               " + RESET);
		System.out.println(B_BLACK + "                                                                                                                               " + RESET);
		System.out.println(B_BLACK + "                                                                                                                               " + RESET);
		System.out.println(B_BLACK + "                                                                                                                               " + RESET);
		System.out.println(B_BLACK + "                                                                                                                               " + RESET);
		System.out.println(B_BLACK + "                                                                                                                               " + RESET);
		System.out.println(B_BLACK + "                                                                                                                               " + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "└──────────────────────────                    ─────────────────────────────────                    ──────────────────────────┘" + RESET);
	}

	//////////////////////////LOADING ANIMATION//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	private void introLoading() {
		System.out.println(B_BLACK + "┌─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┐" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                      " + KBLUE + "████████╗  " + KYELLOW + " █████╗   " + KRED + "██╗  ██╗  " + KPURPLE + "██████╗   " + KGREEN + " █████╗ " + B_BLACK + "                                      │" + RESET);
		System.out.println(B_BLACK + "│                                      " + KBLUE + "╚══██╔══╝  " + KYELLOW + "██╔══██╗  " + KRED + "██║ ██╔╝  " + KPURPLE + "██╔══██╗  " + KGREEN + "██╔══██╗" + B_BLACK + "                                      │" + RESET);
		System.out.println(B_BLACK + "│                                      " + KBLUE + "   ██║     " + KYELLOW + "███████║  " + KRED + "█████═╝   " + KPURPLE + "██████╦╝  " + KGREEN + "██║  ██║" + B_BLACK + "                                      │" + RESET);
		System.out.println(B_BLACK + "│                                      " + KBLUE + "   ██║     " + KYELLOW + "██╔══██║  " + KRED + "██╔═██╗   " + KPURPLE + "██╔══██╗  " + KGREEN + "██║  ██║" + B_BLACK + "                                      │" + RESET);
		System.out.println(B_BLACK + "│                                      " + KBLUE + "   ██║     " + KYELLOW + "██║  ██║  " + KRED + "██║ ╚██╗  " + KPURPLE + "██████╦╝  " + KGREEN + "╚█████╔╝" + B_BLACK + "                                      │" + RESET);
		System.out.println(B_BLACK + "│                                      " + KBLUE + "   ╚═╝     " + KYELLOW + "╚═╝  ╚═╝  " + KRED + "╚═╝  ╚═╝  " + KPURPLE + "╚═════╝   " + KGREEN + " ╚════╝ " + B_BLACK + "                                      │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                 " + KORANGE + "██╗  ██╗  " + KBLUE + " █████╗   " + KYELLOW + "██╗   ██╗" + B_BLACK + "                                               │" + RESET);
		System.out.println(B_BLACK + "│                                                 " + KORANGE + "██║ ██╔╝  " + KBLUE + "██╔══██╗  " + KYELLOW + "╚██╗ ██╔╝" + B_BLACK + "                                               │" + RESET);
		System.out.println(B_BLACK + "│                                                 " + KORANGE + "█████═╝   " + KBLUE + "███████║  " + KYELLOW + " ╚████╔╝ " + B_BLACK + "                                               │" + RESET);
		System.out.println(B_BLACK + "│                                                 " + KORANGE + "██╔═██╗   " + KBLUE + "██╔══██║  " + KYELLOW + "  ╚██╔╝  " + B_BLACK + "                                               │" + RESET);
		System.out.println(B_BLACK + "│                                                 " + KORANGE + "██║ ╚██╗  " + KBLUE + "██║  ██║  " + KYELLOW + "   ██║   " + B_BLACK + "                                               │" + RESET);
		System.out.println(B_BLACK + "│                                                 " + KORANGE + "╚═╝  ╚═╝  " + KBLUE + "╚═╝  ╚═╝  " + KYELLOW + "   ╚═╝   " + B_BLACK + "                                               │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                            " + KRED + "██████╗   " + KPURPLE + " █████╗   " + KGREEN + "████████╗  " + KORANGE + " █████╗ " + B_BLACK + "                                          │" + RESET);
		System.out.println(B_BLACK + "│                                            " + KRED + "██╔══██╗  " + KPURPLE + "██╔══██╗  " + KGREEN + "╚══██╔══╝  " + KORANGE + "██╔══██╗" + B_BLACK + "                                          │" + RESET);
		System.out.println(B_BLACK + "│                                            " + KRED + "██████╦╝  " + KPURPLE + "███████║  " + KGREEN + "   ██║     " + KORANGE + "██║  ██║" + B_BLACK + "                                          │" + RESET);
		System.out.println(B_BLACK + "│                                            " + KRED + "██╔══██╗  " + KPURPLE + "██╔══██║  " + KGREEN + "   ██║     " + KORANGE + "██║  ██║" + B_BLACK + "                                          │" + RESET);
		System.out.println(B_BLACK + "│                                            " + KRED + "██████╦╝  " + KPURPLE + "██║  ██║  " + KGREEN + "   ██║     " + KORANGE + "╚█████╔╝" + B_BLACK + "                                          │" + RESET);
		System.out.println(B_BLACK + "│                                            " + KRED + "╚═════╝   " + KPURPLE + "╚═╝  ╚═╝  " + KGREEN + "   ╚═╝     " + KORANGE + " ╚════╝ " + B_BLACK + "                                          │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                    GAME DEVELOPER: GROUP B                                                  │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
	}

	public void loadingAnim7(){
		introLoading();
		System.out.println(B_BLACK + "│     "+GREENLOADING+"▬▬▬▬"+RESET+B_BLACK+"▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬      │" + RESET);
		System.out.println(B_BLACK + "│                                 [ ] By playing this game you agree to bound Terms And Condition.                            │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "└─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘" + RESET);
	}
	public void loadingAnim6(){
		introLoading();
		System.out.println(B_BLACK + "│     "+GREENLOADING+"▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬"+RESET+B_BLACK+"▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬      │" + RESET);
		System.out.println(B_BLACK + "│                                 [ ] By playing this game you agree to bound Terms And Condition.                            │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "└─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘" + RESET);
	}
	public void loadingAnim5(){
		introLoading();
		System.out.println(B_BLACK + "│     "+GREENLOADING+"▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬"+RESET+B_BLACK+"▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬      │" + RESET);
		System.out.println(B_BLACK + "│                                 ["+GREENLOADING+"✔"+B_BLACK+"] By playing this game you agree to bound Terms And Condition.                            │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "└─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘" + RESET);
	}
	public void loadingAnim4(){
		introLoading();
		System.out.println(B_BLACK + "│     "+GREENLOADING+"▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬"+RESET+B_BLACK+"▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬      │" + RESET);
		System.out.println(B_BLACK + "│                                 ["+GREENLOADING+"✔"+B_BLACK+"] By playing this game you agree to bound Terms And Condition.                            │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "└─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘" + RESET);
	}
	public void loadingAnim3(){
		introLoading();
		System.out.println(B_BLACK + "│     "+GREENLOADING+"▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬"+RESET+B_BLACK+"▬▬▬▬▬▬▬▬▬      │" + RESET);
		System.out.println(B_BLACK + "│                                 ["+GREENLOADING+"✔"+B_BLACK+"] By playing this game you agree to bound Terms And Condition.                            │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "└─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘" + RESET);
	}
	public void loadingAnim2(){
		introLoading();
		System.out.println(B_BLACK + "│     "+GREENLOADING+"▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬"+RESET+B_BLACK+"▬▬▬      │" + RESET);
		System.out.println(B_BLACK + "│                                 ["+GREENLOADING+"✔"+B_BLACK+"] By playing this game you agree to bound Terms And Condition.                            │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "└─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘" + RESET);
	}
	public void loadingAnim1(){
		introLoading();
		System.out.println(B_BLACK + "│     "+GREENLOADING+"▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬"+RESET+B_BLACK+"      │" + RESET);
		System.out.println(B_BLACK + "│                                 ["+GREENLOADING+"✔"+B_BLACK+"] By playing this game you agree to bound Terms And Condition.                            │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "└─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘" + RESET);
	}

	////////////GAME SETUP////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	private void gameSetUp(){
		System.out.println(B_BLACK + "┌─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┐" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                      " + KBLUE + "████████╗  " + KYELLOW + " █████╗   " + KRED + "██╗  ██╗  " + KPURPLE + "██████╗   " + KGREEN + " █████╗ " + B_BLACK + "                                      │" + RESET);
		System.out.println(B_BLACK + "│                                      " + KBLUE + "╚══██╔══╝  " + KYELLOW + "██╔══██╗  " + KRED + "██║ ██╔╝  " + KPURPLE + "██╔══██╗  " + KGREEN + "██╔══██╗" + B_BLACK + "                                      │" + RESET);
		System.out.println(B_BLACK + "│                                      " + KBLUE + "   ██║     " + KYELLOW + "███████║  " + KRED + "█████═╝   " + KPURPLE + "██████╦╝  " + KGREEN + "██║  ██║" + B_BLACK + "                                      │" + RESET);
		System.out.println(B_BLACK + "│                                      " + KBLUE + "   ██║     " + KYELLOW + "██╔══██║  " + KRED + "██╔═██╗   " + KPURPLE + "██╔══██╗  " + KGREEN + "██║  ██║" + B_BLACK + "                                      │" + RESET);
		System.out.println(B_BLACK + "│                                      " + KBLUE + "   ██║     " + KYELLOW + "██║  ██║  " + KRED + "██║ ╚██╗  " + KPURPLE + "██████╦╝  " + KGREEN + "╚█████╔╝" + B_BLACK + "                                      │" + RESET);
		System.out.println(B_BLACK + "│                                      " + KBLUE + "   ╚═╝     " + KYELLOW + "╚═╝  ╚═╝  " + KRED + "╚═╝  ╚═╝  " + KPURPLE + "╚═════╝   " + KGREEN + " ╚════╝ " + B_BLACK + "                                      │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                 " + KORANGE + "██╗  ██╗  " + KBLUE + " █████╗   " + KYELLOW + "██╗   ██╗" + B_BLACK + "                                               │" + RESET);
		System.out.println(B_BLACK + "│                                                 " + KORANGE + "██║ ██╔╝  " + KBLUE + "██╔══██╗  " + KYELLOW + "╚██╗ ██╔╝" + B_BLACK + "                                               │" + RESET);
		System.out.println(B_BLACK + "│                                                 " + KORANGE + "█████═╝   " + KBLUE + "███████║  " + KYELLOW + " ╚████╔╝ " + B_BLACK + "                                               │" + RESET);
		System.out.println(B_BLACK + "│                                                 " + KORANGE + "██╔═██╗   " + KBLUE + "██╔══██║  " + KYELLOW + "  ╚██╔╝  " + B_BLACK + "                                               │" + RESET);
		System.out.println(B_BLACK + "│                                                 " + KORANGE + "██║ ╚██╗  " + KBLUE + "██║  ██║  " + KYELLOW + "   ██║   " + B_BLACK + "                                               │" + RESET);
		System.out.println(B_BLACK + "│                                                 " + KORANGE + "╚═╝  ╚═╝  " + KBLUE + "╚═╝  ╚═╝  " + KYELLOW + "   ╚═╝   " + B_BLACK + "                                               │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                            " + KRED + "██████╗   " + KPURPLE + " █████╗   " + KGREEN + "████████╗  " + KORANGE + " █████╗ " + B_BLACK + "                                          │" + RESET);
		System.out.println(B_BLACK + "│                                            " + KRED + "██╔══██╗  " + KPURPLE + "██╔══██╗  " + KGREEN + "╚══██╔══╝  " + KORANGE + "██╔══██╗" + B_BLACK + "                                          │" + RESET);
		System.out.println(B_BLACK + "│                                            " + KRED + "██████╦╝  " + KPURPLE + "███████║  " + KGREEN + "   ██║     " + KORANGE + "██║  ██║" + B_BLACK + "                                          │" + RESET);
		System.out.println(B_BLACK + "│                                            " + KRED + "██╔══██╗  " + KPURPLE + "██╔══██║  " + KGREEN + "   ██║     " + KORANGE + "██║  ██║" + B_BLACK + "                                          │" + RESET);
		System.out.println(B_BLACK + "│                                            " + KRED + "██████╦╝  " + KPURPLE + "██║  ██║  " + KGREEN + "   ██║     " + KORANGE + "╚█████╔╝" + B_BLACK + "                                          │" + RESET);
		System.out.println(B_BLACK + "│                                            " + KRED + "╚═════╝   " + KPURPLE + "╚═╝  ╚═╝  " + KGREEN + "   ╚═╝     " + KORANGE + " ╚════╝ " + B_BLACK + "                                          │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "├─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┤" + RESET);
	}

	public void askGameMode() {
		gameSetUp();
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                               ▶▶▶   S T A R T   G A M E   ◀◀◀                                               │" + RESET); 
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                         [1] PLAYER VS COMPUTER    [2] PLAYER VS PLAYER                                      │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                           [0] QUIT                                                          │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                         G R O U P  B                                                        │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "└─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘" + RESET);
	}

	public void askBoardLevel() {
		gameSetUp();
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                              ▶▶▶   B O A R D   L E V E L   ◀◀◀                                              │" + RESET); 
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                 [1] EASY MODE    [2] HARD MODE    [3] PRO MODE(COMING SOON)                                 │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                           [0] BACK                                                          │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                         G R O U P  B                                                        │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "└─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘" + RESET);
	}

	public void askWinningScore() {
		gameSetUp();
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                            ▶▶▶   W I N N I N G   S C O R E   ◀◀◀                                            │" + RESET); 
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                     [1] ONE    [2] TWO    [3] THERE   [4] FOUR    [5] FIVE                                  │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                           [0] BACK                                                          │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                         G R O U P  B                                                        │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "└─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘" + RESET);
	}

	public void askPlayer1Color() {
		gameSetUp();
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                              ▶▶▶   C H O O S E   C O L O R   ◀◀◀                                            │" + RESET); 
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│            PLAYER 1 :  [1] "+B_BLUE+"  "+B_BLACK+"BLUE     [2] "+B_YELLOW+"  "+B_BLACK+"YELLOW     [3] "+B_PURPLE+"  "+B_BLACK+"PURPLE    [4] "+B_GREEN+"  "+B_BLACK+"GREEN    [5] "+B_ORANGE+"  "+B_BLACK+"ORANGE    [6] "+B_RED+"  "+B_BLACK+"RED             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                           [0] BACK                                                          │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                         G R O U P  B                                                        │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "└─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘" + RESET);
	}

	public void askPlayer2Color() {
		gameSetUp();
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                              ▶▶▶   C H O O S E   C O L O R   ◀◀◀                                            │" + RESET); 
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│            PLAYER 2 :  [1] "+B_BLUE+"  "+B_BLACK+"BLUE     [2] "+B_YELLOW+"  "+B_BLACK+"YELLOW     [3] "+B_PURPLE+"  "+B_BLACK+"PURPLE    [4] "+B_GREEN+"  "+B_BLACK+"GREEN    [5] "+B_ORANGE+"  "+B_BLACK+"ORANGE    [6] "+B_RED+"  "+B_BLACK+"RED             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                           [0] BACK                                                          │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                         G R O U P  B                                                        │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "└─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘" + RESET);
	}



	////////SCORE BOARD///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	//SCORE = 5
	public String sc5A0(){
		String x = score5Red(5);
		return x;
	}
	public String sc5A1(){
		String x = score5Green(1) + score5Red(4);
		return x;
	}
	public String sc5A2(){
		String x = score5Green(2) + score5Red(3);
		return x;
	}
	public String sc5A3(){
		String x = score5Green(3) + score5Red(2);
		return x;
	}
	public String sc5A4(){
		String x = score5Green(4) + score5Red(1);
		return x;
	}
	public String sc5A5(){
		String x = score5Green(5);
		return x;
	}

	private String score5Green(int x){
		String green = "";
		for (int i = 0; i < x; i++){
			green = green + B_GREEN + "     " + RESET + B_BLACK + " ";
		}
		return green;
	}

	private String score5Red(int x){
		String red = "";
		for (int i = 0; i < x; i++){
			red = red + B_RED + "     " + RESET + B_BLACK + " ";
		}
		return red;
	}


	//SCORE = 4

	public String sc4A0(){
		String x = "  " + score4Red(4);
		return x;
	}
	public String sc4A1(){
		String x = "  " + score4Green(1) + score4Red(3);
		return x;
	}
	public String sc4A2(){
		String x = "  " + score4Green(2) + score4Red(2);
		return x;
	}
	public String sc4A3(){
		String x = "  " + score4Green(3) + score4Red(1);
		return x;
	}
	public String sc4A4(){
		String x = "  " + score4Green(4);
		return x;
	}


	private String score4Green(int x){
		String green = "";
		for (int i = 0; i < x; i++){
			green = green + B_GREEN + "      " + RESET + B_BLACK + " ";
		}
		return green;
	}

	private String score4Red(int x){
		String red = "";
		for (int i = 0; i < x; i++){
			red = red + B_RED + "      " + RESET + B_BLACK + " ";
		}
		return red;
	}


	//SCORE = 3

	public String sc3A0(){
		String x = score3Red(3);
		return x;
	}
	public String sc3A1(){
		String x = score3Green(1) + score3Red(2);
		return x;
	}
	public String sc3A2(){
		String x = score3Green(2) + score3Red(1);
		return x;
	}
	public String sc3A3(){
		String x = score3Green(3);
		return x;
	}

	private String score3Green(int x){
		String green = "";
		for (int i = 0; i < x; i++){
			green = green + B_GREEN + "         " + RESET + B_BLACK + " ";
		}
		return green;
	}

	private String score3Red(int x){
		String red = "";
		for (int i = 0; i < x; i++){
			red = red + B_RED + "         " + RESET + B_BLACK + " ";
		}
		return red;
	}



	//SCORE = 2

	public String sc2A0(){
		String x = score2Red(2);
		return x;
	}
	public String sc2A1(){
		String x = score2Green(1) + score2Red(1);
		return x;
	}
	public String sc2A2(){
		String x = score2Green(2);
		return x;
	}

	private String score2Green(int x){
		String green = "";
		for (int i = 0; i < x; i++){
			green = green + B_GREEN + "              " + RESET + B_BLACK + " ";
		}
		return green;
	}

	private String score2Red(int x){
		String red = "";
		for (int i = 0; i < x; i++){
			red = red + B_RED + "              " + RESET + B_BLACK + " ";
		}
		return red;
	}


	//SCORE = 1

	public String sc1A0(){
		String x = score1Red(1);
		return x;
	}
	public String sc1A1(){
		String x = score1Green(1);
		return x;
	}

	private String score1Green(int x){
		String green = "";
		for (int i = 0; i < x; i++){
			green = green + B_GREEN + "                              " + RESET ;
		}
		return green;
	}

	private String score1Red(int x){
		String red = "";
		for (int i = 0; i < x; i++){
			red = red + B_RED + "                              " + RESET;
		}
		return red;
	}


	////////////ROUND NUMBER///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void roundNumber(int roundNumber) {
		switch(roundNumber) {
		case 1: 
			round1();
			break;
		case 2: 
			round2();
			break;
		case 3: 
			round3();
			break;
		case 4: 
			round4();
			break;
		case 5: 
			round5();
			break;
		case 6: 
			round6();
			break;
		case 7: 
			round7();
			break;
		case 8: 
			round8();
			break;
		case 9: 
			round9();
			break;
		case 10: 
			round10();
			break;
		}
	}

	private void round1() {
		gameSetUp();
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                       ██████╗  █████╗ ██╗   ██╗███╗  ██╗██████╗     ███╗                                    │" + RESET);
		System.out.println(B_BLACK + "│                                       ██╔══██╗██╔══██╗██║   ██║████╗ ██║██╔══██╗   ████║                                    │" + RESET);
		System.out.println(B_BLACK + "│                                       ██████╔╝██║  ██║██║   ██║██╔██╗██║██║  ██║  ██╔██║                                    │" + RESET);
		System.out.println(B_BLACK + "│                                       ██╔══██╗██║  ██║██║   ██║██║╚████║██║  ██║  ╚═╝██║                                    │" + RESET);
		System.out.println(B_BLACK + "│                                       ██║  ██║╚█████╔╝╚██████╔╝██║ ╚███║██████╔╝  ███████╗                                  │" + RESET);
		System.out.println(B_BLACK + "│                                       ╚═╝  ╚═╝ ╚════╝  ╚═════╝ ╚═╝  ╚══╝╚═════╝   ╚══════╝                                  │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                         G R O U P  B                                                        │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "└─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘" + RESET);
	}
	private void round2() {
		gameSetUp();
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                       ██████╗  █████╗ ██╗   ██╗███╗  ██╗██████╗   ██████╗                                   │" + RESET);
		System.out.println(B_BLACK + "│                                       ██╔══██╗██╔══██╗██║   ██║████╗ ██║██╔══██╗  ╚════██╗                                  │" + RESET);
		System.out.println(B_BLACK + "│                                       ██████╔╝██║  ██║██║   ██║██╔██╗██║██║  ██║    ███╔═╝                                  │" + RESET);
		System.out.println(B_BLACK + "│                                       ██╔══██╗██║  ██║██║   ██║██║╚████║██║  ██║  ██╔══╝                                    │" + RESET);
		System.out.println(B_BLACK + "│                                       ██║  ██║╚█████╔╝╚██████╔╝██║ ╚███║██████╔╝  ███████╗                                  │" + RESET);
		System.out.println(B_BLACK + "│                                       ╚═╝  ╚═╝ ╚════╝  ╚═════╝ ╚═╝  ╚══╝╚═════╝   ╚══════╝                                  │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                         G R O U P  B                                                        │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "└─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘" + RESET);
	}
	private void round3() {
		gameSetUp();
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                       ██████╗  █████╗ ██╗   ██╗███╗  ██╗██████╗   ██████╗                                   │" + RESET);
		System.out.println(B_BLACK + "│                                       ██╔══██╗██╔══██╗██║   ██║████╗ ██║██╔══██╗  ╚════██╗                                  │" + RESET);
		System.out.println(B_BLACK + "│                                       ██████╔╝██║  ██║██║   ██║██╔██╗██║██║  ██║   █████╔╝                                  │" + RESET);
		System.out.println(B_BLACK + "│                                       ██╔══██╗██║  ██║██║   ██║██║╚████║██║  ██║   ╚═══██╗                                  │" + RESET);
		System.out.println(B_BLACK + "│                                       ██║  ██║╚█████╔╝╚██████╔╝██║ ╚███║██████╔╝  ██████╔╝                                  │" + RESET);
		System.out.println(B_BLACK + "│                                       ╚═╝  ╚═╝ ╚════╝  ╚═════╝ ╚═╝  ╚══╝╚═════╝   ╚═════╝                                   │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                         G R O U P  B                                                        │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "└─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘" + RESET);
	}
	private void round4() {
		gameSetUp();
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                       ██████╗  █████╗ ██╗   ██╗███╗  ██╗██████╗     ██╗██╗                                  │" + RESET);
		System.out.println(B_BLACK + "│                                       ██╔══██╗██╔══██╗██║   ██║████╗ ██║██╔══██╗   ██╔╝██║                                  │" + RESET);
		System.out.println(B_BLACK + "│                                       ██████╔╝██║  ██║██║   ██║██╔██╗██║██║  ██║  ██╔╝ ██║                                  │" + RESET);
		System.out.println(B_BLACK + "│                                       ██╔══██╗██║  ██║██║   ██║██║╚████║██║  ██║  ███████║                                  │" + RESET);
		System.out.println(B_BLACK + "│                                       ██║  ██║╚█████╔╝╚██████╔╝██║ ╚███║██████╔╝  ╚════██║                                  │" + RESET);
		System.out.println(B_BLACK + "│                                       ╚═╝  ╚═╝ ╚════╝  ╚═════╝ ╚═╝  ╚══╝╚═════╝        ╚═╝                                  │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                         G R O U P  B                                                        │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "└─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘" + RESET);
	}
	private void round5() {
		gameSetUp();
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                       ██████╗  █████╗ ██╗   ██╗███╗  ██╗██████╗   ███████╗                                  │" + RESET);
		System.out.println(B_BLACK + "│                                       ██╔══██╗██╔══██╗██║   ██║████╗ ██║██╔══██╗  ██╔════╝                                  │" + RESET);
		System.out.println(B_BLACK + "│                                       ██████╔╝██║  ██║██║   ██║██╔██╗██║██║  ██║  ██████╗                                   │" + RESET);
		System.out.println(B_BLACK + "│                                       ██╔══██╗██║  ██║██║   ██║██║╚████║██║  ██║  ╚════██╗                                  │" + RESET);
		System.out.println(B_BLACK + "│                                       ██║  ██║╚█████╔╝╚██████╔╝██║ ╚███║██████╔╝  ██████╔╝                                  │" + RESET);
		System.out.println(B_BLACK + "│                                       ╚═╝  ╚═╝ ╚════╝  ╚═════╝ ╚═╝  ╚══╝╚═════╝   ╚═════╝                                   │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                         G R O U P  B                                                        │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "└─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘" + RESET);
	}
	private void round6() {
		gameSetUp();
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                       ██████╗  █████╗ ██╗   ██╗███╗  ██╗██████╗    █████╗                                   │" + RESET);
		System.out.println(B_BLACK + "│                                       ██╔══██╗██╔══██╗██║   ██║████╗ ██║██╔══██╗  ██╔═══╝                                   │" + RESET);
		System.out.println(B_BLACK + "│                                       ██████╔╝██║  ██║██║   ██║██╔██╗██║██║  ██║  ██████╗                                   │" + RESET);
		System.out.println(B_BLACK + "│                                       ██╔══██╗██║  ██║██║   ██║██║╚████║██║  ██║  ██╔══██╗                                  │" + RESET);
		System.out.println(B_BLACK + "│                                       ██║  ██║╚█████╔╝╚██████╔╝██║ ╚███║██████╔╝  ╚█████╔╝                                  │" + RESET);
		System.out.println(B_BLACK + "│                                       ╚═╝  ╚═╝ ╚════╝  ╚═════╝ ╚═╝  ╚══╝╚═════╝    ╚════╝                                   │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                         G R O U P  B                                                        │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "└─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘" + RESET);
	}
	private void round7() {
		gameSetUp();
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                       ██████╗  █████╗ ██╗   ██╗███╗  ██╗██████╗   ███████╗                                  │" + RESET);
		System.out.println(B_BLACK + "│                                       ██╔══██╗██╔══██╗██║   ██║████╗ ██║██╔══██╗  ╚════██║                                  │" + RESET);
		System.out.println(B_BLACK + "│                                       ██████╔╝██║  ██║██║   ██║██╔██╗██║██║  ██║      ██╔╝                                  │" + RESET);
		System.out.println(B_BLACK + "│                                       ██╔══██╗██║  ██║██║   ██║██║╚████║██║  ██║     ██╔╝                                   │" + RESET);
		System.out.println(B_BLACK + "│                                       ██║  ██║╚█████╔╝╚██████╔╝██║ ╚███║██████╔╝    ██╔╝                                    │" + RESET);
		System.out.println(B_BLACK + "│                                       ╚═╝  ╚═╝ ╚════╝  ╚═════╝ ╚═╝  ╚══╝╚═════╝     ╚═╝                                     │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                         G R O U P  B                                                        │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "└─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘" + RESET);
	}
	private void round8() {
		gameSetUp();
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                       ██████╗  █████╗ ██╗   ██╗███╗  ██╗██████╗    █████╗                                   │" + RESET);
		System.out.println(B_BLACK + "│                                       ██╔══██╗██╔══██╗██║   ██║████╗ ██║██╔══██╗  ██╔══██╗                                  │" + RESET);
		System.out.println(B_BLACK + "│                                       ██████╔╝██║  ██║██║   ██║██╔██╗██║██║  ██║  ╚█████╔╝                                  │" + RESET);
		System.out.println(B_BLACK + "│                                       ██╔══██╗██║  ██║██║   ██║██║╚████║██║  ██║  ██╔══██╗                                  │" + RESET);
		System.out.println(B_BLACK + "│                                       ██║  ██║╚█████╔╝╚██████╔╝██║ ╚███║██████╔╝  ╚█████╔╝                                  │" + RESET);
		System.out.println(B_BLACK + "│                                       ╚═╝  ╚═╝ ╚════╝  ╚═════╝ ╚═╝  ╚══╝╚═════╝    ╚════╝                                   │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                         G R O U P  B                                                        │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "└─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘" + RESET);
	}
	private void round9() {
		gameSetUp();
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                       ██████╗  █████╗ ██╗   ██╗███╗  ██╗██████╗    █████╗                                   │" + RESET);
		System.out.println(B_BLACK + "│                                       ██╔══██╗██╔══██╗██║   ██║████╗ ██║██╔══██╗  ██╔══██╗                                  │" + RESET);
		System.out.println(B_BLACK + "│                                       ██████╔╝██║  ██║██║   ██║██╔██╗██║██║  ██║  ╚██████║                                  │" + RESET);
		System.out.println(B_BLACK + "│                                       ██╔══██╗██║  ██║██║   ██║██║╚████║██║  ██║   ╚═══██║                                  │" + RESET);
		System.out.println(B_BLACK + "│                                       ██║  ██║╚█████╔╝╚██████╔╝██║ ╚███║██████╔╝   █████╔╝                                  │" + RESET);
		System.out.println(B_BLACK + "│                                       ╚═╝  ╚═╝ ╚════╝  ╚═════╝ ╚═╝  ╚══╝╚═════╝    ╚════╝                                   │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                         G R O U P  B                                                        │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "└─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘" + RESET);
	}
	private void round10() {
		gameSetUp();
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                  ██████╗  █████╗ ██╗   ██╗███╗  ██╗██████╗     ███╗   █████╗                                │" + RESET);
		System.out.println(B_BLACK + "│                                  ██╔══██╗██╔══██╗██║   ██║████╗ ██║██╔══██╗   ████║  ██╔══██╗                               │" + RESET);
		System.out.println(B_BLACK + "│                                  ██████╔╝██║  ██║██║   ██║██╔██╗██║██║  ██║  ██╔██║  ██║  ██║                               │" + RESET);
		System.out.println(B_BLACK + "│                                  ██╔══██╗██║  ██║██║   ██║██║╚████║██║  ██║  ╚═╝██║  ██║  ██║                               │" + RESET);
		System.out.println(B_BLACK + "│                                  ██║  ██║╚█████╔╝╚██████╔╝██║ ╚███║██████╔╝  ███████╗╚█████╔╝                               │" + RESET);
		System.out.println(B_BLACK + "│                                  ╚═╝  ╚═╝ ╚════╝  ╚═════╝ ╚═╝  ╚══╝╚═════╝   ╚══════╝ ╚════╝                                │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                         G R O U P  B                                                        │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "└─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘" + RESET);
	}

	//////////WINNER//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void winner(int winner) {
		switch (winner) {
		case 1: 
			winnerPlayer1();
			break;
		case 2: 
			winnerPlayer2();
			break;
		case 3:
			winnerComputer();
			break;
		}
	}

	private void winnerPlayer1(){
		gameSetUp();
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│      ██████╗ ██╗      █████╗ ██╗   ██╗███████╗██████╗     ███╗     ██╗       ██╗██╗███╗  ██╗███╗  ██╗███████╗██████╗        │" + RESET);
		System.out.println(B_BLACK + "│      ██╔══██╗██║     ██╔══██╗╚██╗ ██╔╝██╔════╝██╔══██╗   ████║     ██║  ██╗  ██║██║████╗ ██║████╗ ██║██╔════╝██╔══██╗       │" + RESET);
		System.out.println(B_BLACK + "│      ██████╔╝██║     ███████║ ╚████╔╝ █████╗  ██████╔╝  ██╔██║     ╚██╗████╗██╔╝██║██╔██╗██║██╔██╗██║█████╗  ██████╔╝       │" + RESET);
		System.out.println(B_BLACK + "│      ██╔═══╝ ██║     ██╔══██║  ╚██╔╝  ██╔══╝  ██╔══██╗  ╚═╝██║      ████╔═████║ ██║██║╚████║██║╚████║██╔══╝  ██╔══██╗       │" + RESET);
		System.out.println(B_BLACK + "│      ██║     ███████╗██║  ██║   ██║   ███████╗██║  ██║  ███████╗    ╚██╔╝ ╚██╔╝ ██║██║ ╚███║██║ ╚███║███████╗██║  ██║       │" + RESET);
		System.out.println(B_BLACK + "│      ╚═╝     ╚══════╝╚═╝  ╚═╝   ╚═╝   ╚══════╝╚═╝  ╚═╝  ╚══════╝     ╚═╝   ╚═╝  ╚═╝╚═╝  ╚══╝╚═╝  ╚══╝╚══════╝╚═╝  ╚═╝       │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                         G R O U P  B                                                        │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "└─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘" + RESET);
	}
	private void winnerPlayer2(){
		gameSetUp();
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│      ██████╗ ██╗      █████╗ ██╗   ██╗███████╗██████╗   ██████╗    ██╗       ██╗██╗███╗  ██╗███╗  ██╗███████╗██████╗        │" + RESET);
		System.out.println(B_BLACK + "│      ██╔══██╗██║     ██╔══██╗╚██╗ ██╔╝██╔════╝██╔══██╗  ╚════██╗   ██║  ██╗  ██║██║████╗ ██║████╗ ██║██╔════╝██╔══██╗       │" + RESET);
		System.out.println(B_BLACK + "│      ██████╔╝██║     ███████║ ╚████╔╝ █████╗  ██████╔╝    ███╔═╝   ╚██╗████╗██╔╝██║██╔██╗██║██╔██╗██║█████╗  ██████╔╝       │" + RESET);
		System.out.println(B_BLACK + "│      ██╔═══╝ ██║     ██╔══██║  ╚██╔╝  ██╔══╝  ██╔══██╗  ██╔══╝      ████╔═████║ ██║██║╚████║██║╚████║██╔══╝  ██╔══██╗       │" + RESET);
		System.out.println(B_BLACK + "│      ██║     ███████╗██║  ██║   ██║   ███████╗██║  ██║  ███████╗    ╚██╔╝ ╚██╔╝ ██║██║ ╚███║██║ ╚███║███████╗██║  ██║       │" + RESET);
		System.out.println(B_BLACK + "│      ╚═╝     ╚══════╝╚═╝  ╚═╝   ╚═╝   ╚══════╝╚═╝  ╚═╝  ╚══════╝     ╚═╝   ╚═╝  ╚═╝╚═╝  ╚══╝╚═╝  ╚══╝╚══════╝╚═╝  ╚═╝       │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                         G R O U P  B                                                        │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "└─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘" + RESET);
	}
	private void winnerComputer(){
		gameSetUp();
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│   █████╗  █████╗ ███╗   ███╗██████╗ ██╗   ██╗████████╗███████╗██████╗    ██╗       ██╗██╗███╗  ██╗███╗  ██╗███████╗██████╗  │" + RESET);
		System.out.println(B_BLACK + "│  ██╔══██╗██╔══██╗████╗ ████║██╔══██╗██║   ██║╚══██╔══╝██╔════╝██╔══██╗   ██║  ██╗  ██║██║████╗ ██║████╗ ██║██╔════╝██╔══██╗ │" + RESET);
		System.out.println(B_BLACK + "│  ██║  ╚═╝██║  ██║██╔████╔██║██████╔╝██║   ██║   ██║   █████╗  ██████╔╝   ╚██╗████╗██╔╝██║██╔██╗██║██╔██╗██║█████╗  ██████╔╝ │" + RESET);
		System.out.println(B_BLACK + "│  ██║  ██╗██║  ██║██║╚██╔╝██║██╔═══╝ ██║   ██║   ██║   ██╔══╝  ██╔══██╗    ████╔═████║ ██║██║╚████║██║╚████║██╔══╝  ██╔══██╗ │" + RESET);
		System.out.println(B_BLACK + "│  ╚█████╔╝╚█████╔╝██║ ╚═╝ ██║██║     ╚██████╔╝   ██║   ███████╗██║  ██║    ╚██╔╝ ╚██╔╝ ██║██║ ╚███║██║ ╚███║███████╗██║  ██║ │" + RESET);
		System.out.println(B_BLACK + "│   ╚════╝  ╚════╝ ╚═╝     ╚═╝╚═╝      ╚═════╝    ╚═╝   ╚══════╝╚═╝  ╚═╝     ╚═╝   ╚═╝  ╚═╝╚═╝  ╚══╝╚═╝  ╚══╝╚══════╝╚═╝  ╚═╝ │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                         G R O U P  B                                                        │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "└─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘" + RESET);
	}
	////////BATO////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void batoPicture(String color) {  
		System.out.println(color + "┌─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┐" + RESET);
		System.out.println(color + "│                                                                                                                             │" + RESET);
		System.out.println(color + "│                                                                                                                             │" + RESET);
		System.out.println(color + "│                                                                                                                             │" + RESET);
		System.out.println(color + "│                                                      .   ,▄▄▌▄▓▓▄▄▄▄,                                                       │" + RESET);
		System.out.println(color + "│                                                      ▄▓███╬╣▓▓▓▓▓▓▓╬▓██▓▄,                                                  │" + RESET);
		System.out.println(color + "│                                                   ,▄██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▌,                                              │" + RESET);
		System.out.println(color + "│                                                 ▄██╬╬╬╬╠▒▒╠▒▒▒▒▒▒▒▒╠▒╠╬╣▓▓▓▓▓██▓▄                                           │" + RESET);
		System.out.println(color + "│                                               ▓█╫▓▓▓╬▒╠╠╠╠▒▒▒▒▒▒▒▒▒╠▒▒▒▒╠╠╠▓▓▓▓▓██▌                                         │" + RESET);
		System.out.println(color + "│                                             ╓██▓▓▓▒╠╠▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒╠▒╠╠╠╠▓▓▓▓▓█▄                                       │" + RESET);
		System.out.println(color + "│                                            ╓█▓▓▓▓▓╠╠▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒╠╬╠╟▓▓▓▓██                                      │" + RESET);
		System.out.println(color + "│                                           )█▓▓▓▓▓▓▒╠╠▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒╠╟▓▓▓▓▓██                                     │" + RESET);
		System.out.println(color + "│                                           █╣▓▓▓▓▓▓▓▒╠▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒╠╠╟▓▓▓▓▓▓▓▓█▌                                    │" + RESET);
		System.out.println(color + "│                                          ╫█▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒╟▓▓▓▓▓▓▓▓▓▓█                                    │" + RESET);
		System.out.println(color + "│                                         :█▓▓▓▓▓▓▓▓▓╬╠▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒╠▒╟▓▓▓▓▓▓▓▓▓█▌                                   │" + RESET);
		System.out.println(color + "│                                         ╟█▓▓▓▓▓▓▓╬▒╠╠▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒╟▓▓▓▓▓▓▓▓╣█                                   │" + RESET);
		System.out.println(color + "│                                         █▓▓▓▓▓▓▓▀╬▒╠╠▒╠▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒╠╠▓▓▓▓▓▓▓▓█                                   │" + RESET);
		System.out.println(color + "│                                        ▐█▓▓▓▓▓▒▓███████████▌▒▒▒▒▒▒╠╠▒▄▓████████▄╠▓▓▓▓▓▓▓█                                   │" + RESET);
		System.out.println(color + "│                                       ,▐█▓▓▓▓▓██╬╠╬╬╬▒▒▒╠╬╠╠█▒╠╠▒▒╠╬▀▀╬╬╠╬╬╬╬▀██▌╟▓▓▓▓▓▓█                                   │" + RESET);
		System.out.println(color + "│                                     ]████▓▓▓╬╬╬▒▒╫▓███████▄▒▒╬▓▓╬╠╟▌╬▓▓████▓▓▄▒▒╬╬▓▓▓▓▓▓█                                   │" + RESET);
		System.out.println(color + "│                                     ╟╬███▓▓╟▓▓██▀╬▀╬█▓██╬██▌╬▒▒▒▒╠╫╬▓██╬█▄█▌╬▀▓▓███▒╠╟▓▓█▀▓█▓ '                             │" + RESET);
		System.out.println(color + "│                                     ▐█▌██▓▓▒╬╠╬▀▀▓▓▓▓▓▓▓▓▓█▓▌╠▒▒╠▒╠▒╬█▓▄▒╠▒▄▓▓▀▀╬▀▀▀▒▓▓▓███▓▌█                              │" + RESET);
		System.out.println(color + "│                                      ▌▒█▓╬╬▓▌╠╠▒╠▒▒▒╠▒╠╠╠╠▓▓╬▒▒▒▒▒▒▒▒▒╠╬╬╬╬▒╠╠╠╠╠╠▒╠╬╟▓█▌▒╫▌█▀                              │" + RESET);
		System.out.println(color + "│                                     ▐▌▒█╬╣▓╬╠╠▒▒▒▒▒▒▒▒▒╠▒╠▓▓╩▒▒▒▒▒▒▒▒▒▒▒╠▒▒▒▒▒▒▒▒▒▒╠▒╠▓▓▌╠█╬▌                               │" + RESET);
		System.out.println(color + "│                                     ▐▓██▓▓▒╠▒▒▒▒▒▒▒▒▒▒▒╠█▒╠▒╠▒▒▒╠▒▒▒▒╠█╬▓▒╩▒▒▒▒▒▒▒▒▒╠▒╬██╬╠█                                │" + RESET);
		System.out.println(color + "│                                      ███▓▓╠▒▒▒▒▒▒╠▒▒╠╣▒█╬▒▒▒▒╠▒╠╠╬╠▒▒╠███▓▒▒▒▒▒▒▒▒▒▒▒▒╟█▌█╫b                                │" + RESET);
		System.out.println(color + "│                                      █╠██▌╠▒▒▒▒╠╠▒▄▓▓▒╠╠╬▀╬╬╬█▓▓▓█╬╠╬╠▒╠╠██▓╬╬▒▒▒▒▒▒╠▒╟█╬╠█                                 │" + RESET);
		System.out.println(color + "│                                      ╝▓╟█▓▒▒╠╠╠╠██▓▒╠▒▒▒▒╠▒╠╠╠╠╠▒╠╠▒▒▒▒▒╠╠╩▀█╟▒╠▒▒▒▒╠▒╟█▒╠█                                 │" + RESET);
		System.out.println(color + "│                                        └█▓╬╠▓╠▒╝╬▓╬▓█▄▄▄╬▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒╠▄▓▒█▒╠▒▒▒▒▒▒╠╠█▓▀'                                 │" + RESET);
		System.out.println(color + "│                                         ╙█▓╠▌╠▒▒╩╬▒▒╠╬██▓▓▓╫▀▀▀▀▀▀▀╢████╬╬╠╠╬╠╠▒▒╠▒▒╠▓█▀                                    │" + RESET);
		System.out.println(color + "│                                          ╟█╬╬╠▒╠▒╠▒▒▒▒╠▒╠▒╬╠╠▀█▀▀╬▀╩╠▒╠▒▒╠╠▒▒▒▒▒▒╠╠╟▓▓▌                                     │" + RESET);
		System.out.println(color + "│                                           ╨█╬╬▒╠▒╬▒▒▒▒▒▒▒▒╠╬▀▀▓▓▓▀▀▀▒╠▒▒▒▒▒▒▒▒▒▒▒╠╟▓▓▌                                      │" + RESET);
		System.out.println(color + "│                                             ██▒╠╟▓▒▒▒▒▒▒▒▒╠▒╠╠╠▒╠╠╠▒▒▒▒▒▒▒▒╠╠╠▒╠▒▓▓█▀                                       │" + RESET);
		System.out.println(color + "│                                             ╙█▓▒▓▓▒╠▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒╠╠▒▒╣╬█▀                                          │" + RESET);
		System.out.println(color + "│                                                ╙██╬▓▒╠╠▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒╠╩▒▓╬▒╣▓╬█▀                                           │" + RESET);
		System.out.println(color + "│                                                    ▀██▓╬▒╠▒▒▒▒▒▒▒▒▒▒╠╠╠▒▓▓╬╣▓█▀╙                                            │" + RESET);
		System.out.println(color + "│                                                      ▀██▓╣▒▒╠╠╠▒▒▒▄╣▓▓▓╬▓█▀╙                                                │" + RESET);
		System.out.println(color + "│                                                         ╨▀▀██████████▀▀╨                                                    │" + RESET);
		System.out.println(color + "│                                                                                                                             │" + RESET);
		System.out.println(color + "│                                                                                                                             │" + RESET);
		System.out.println(color + "│                                                                                                                             │" + RESET);
		System.out.println(color + "└─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘" + RESET);
	}

	//QUIT GAME
	public void quitGame(){  
		System.out.println(B_BLACK + "┌─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┐" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│      " + KBLUE + "████████╗" + KYELLOW + " █████╗ " + KRED + "██╗  ██╗" + KPURPLE + "██████╗ " + KGREEN + " █████╗       " + KORANGE + "██╗  ██╗" + KBLUE + " █████╗ " + KYELLOW + "██╗   ██╗      " + KRED + "██████╗ " + KPURPLE + " █████╗ " + KGREEN + "████████╗" + KORANGE + " █████╗ " + B_BLACK + "        │" + RESET);
		System.out.println(B_BLACK + "│      " + KBLUE + "╚══██╔══╝" + KYELLOW + "██╔══██╗" + KRED + "██║ ██╔╝" + KPURPLE + "██╔══██╗" + KGREEN + "██╔══██╗      " + KORANGE + "██║ ██╔╝" + KBLUE + "██╔══██╗" + KYELLOW + "╚██╗ ██╔╝      " + KRED + "██╔══██╗" + KPURPLE + "██╔══██╗" + KGREEN + "╚══██╔══╝" + KORANGE + "██╔══██╗" + B_BLACK + "        │" + RESET);
		System.out.println(B_BLACK + "│      " + KBLUE + "   ██║   " + KYELLOW + "███████║" + KRED + "█████═╝ " + KPURPLE + "██████╦╝" + KGREEN + "██║  ██║      " + KORANGE + "█████═╝ " + KBLUE + "███████║" + KYELLOW + " ╚████╔╝       " + KRED + "██████╦╝" + KPURPLE + "███████║" + KGREEN + "   ██║   " + KORANGE + "██║  ██║" + B_BLACK + "        │" + RESET);
		System.out.println(B_BLACK + "│      " + KBLUE + "   ██║   " + KYELLOW + "██╔══██║" + KRED + "██╔═██╗ " + KPURPLE + "██╔══██╗" + KGREEN + "██║  ██║      " + KORANGE + "██╔═██╗ " + KBLUE + "██╔══██║" + KYELLOW + "  ╚██╔╝        " + KRED + "██╔══██╗" + KPURPLE + "██╔══██║" + KGREEN + "   ██║   " + KORANGE + "██║  ██║" + B_BLACK + "        │" + RESET);
		System.out.println(B_BLACK + "│      " + KBLUE + "   ██║   " + KYELLOW + "██║  ██║" + KRED + "██║ ╚██╗" + KPURPLE + "██████╦╝" + KGREEN + "╚█████╔╝      " + KORANGE + "██║ ╚██╗" + KBLUE + "██║  ██║" + KYELLOW + "   ██║         " + KRED + "██████╦╝" + KPURPLE + "██║  ██║" + KGREEN + "   ██║   " + KORANGE + "╚█████╔╝" + B_BLACK + "        │" + RESET);
		System.out.println(B_BLACK + "│      " + KBLUE + "   ╚═╝   " + KYELLOW + "╚═╝  ╚═╝" + KRED + "╚═╝  ╚═╝" + KPURPLE + "╚═════╝ " + KGREEN + " ╚════╝       " + KORANGE + "╚═╝  ╚═╝" + KBLUE + "╚═╝  ╚═╝" + KYELLOW + "    ═╝         " + KRED + "╚═════╝ " + KPURPLE + "╚═╝  ╚═╝" + KGREEN + "   ╚═╝   " + KORANGE + " ╚════╝ " + B_BLACK + "        │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                  GAME DEVELOPED BY GROUP B                                                  │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                        "+BLUE+B_BLACK+"     LEADER            "+RESET+B_BLACK+"                                              │" + RESET);
		System.out.println(B_BLACK + "│                                                         BOBSON LATONIO                                                      │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                  "+BLUE+B_BLACK+"           MEMBER                "+RESET+B_BLACK+"                                          │" + RESET);
		System.out.println(B_BLACK + "│                                                         HARVEY LACSINA                                                      │" + RESET);
		System.out.println(B_BLACK + "│                                                        RANDY ESTANISLAO                                                     │" + RESET);
		System.out.println(B_BLACK + "│                                                         JANNA MARCELO                                                       │" + RESET);
		System.out.println(B_BLACK + "│                                                         JERICHO FLORES                                                      │" + RESET);
		System.out.println(B_BLACK + "│                                                            RIA RAMOS                                                        │" + RESET);
		System.out.println(B_BLACK + "│                                                        MERIT JUDE GALLANO                                                   │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "│                                                                                                                             │" + RESET);
		System.out.println(B_BLACK + "└─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘" + RESET);
	}

}

