public class EasyMode extends Board{

	//Attributes
	private final int WIN_DISTANCE = 38;

	//Constructor
	public EasyMode(){

	}
	
	//OVERRIDING METHOD
	public void board(){
		System.out.println(B_BLACK + "┌─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┐" + RESET);
		System.out.println(B_BLACK + "│      " + KBLUE + "████████╗" + KYELLOW + " █████╗ " + KRED + "██╗  ██╗" + KPURPLE + "██████╗ " + KGREEN + " █████╗       " + KORANGE + "██╗  ██╗" + KBLUE + " █████╗ " + KYELLOW + "██╗   ██╗      " + KRED + "██████╗ " + KPURPLE + " █████╗ " + KGREEN + "████████╗" + KORANGE + " █████╗ " + B_BLACK + "        │" + RESET);
		System.out.println(B_BLACK + "│      " + KBLUE + "╚══██╔══╝" + KYELLOW + "██╔══██╗" + KRED + "██║ ██╔╝" + KPURPLE + "██╔══██╗" + KGREEN + "██╔══██╗      " + KORANGE + "██║ ██╔╝" + KBLUE + "██╔══██╗" + KYELLOW + "╚██╗ ██╔╝      " + KRED + "██╔══██╗" + KPURPLE + "██╔══██╗" + KGREEN + "╚══██╔══╝" + KORANGE + "██╔══██╗" + B_BLACK + "        │" + RESET);
		System.out.println(B_BLACK + "│      " + KBLUE + "   ██║   " + KYELLOW + "███████║" + KRED + "█████═╝ " + KPURPLE + "██████╦╝" + KGREEN + "██║  ██║      " + KORANGE + "█████═╝ " + KBLUE + "███████║" + KYELLOW + " ╚████╔╝       " + KRED + "██████╦╝" + KPURPLE + "███████║" + KGREEN + "   ██║   " + KORANGE + "██║  ██║" + B_BLACK + "        │" + RESET);
		System.out.println(B_BLACK + "│      " + KBLUE + "   ██║   " + KYELLOW + "██╔══██║" + KRED + "██╔═██╗ " + KPURPLE + "██╔══██╗" + KGREEN + "██║  ██║      " + KORANGE + "██╔═██╗ " + KBLUE + "██╔══██║" + KYELLOW + "  ╚██╔╝        " + KRED + "██╔══██╗" + KPURPLE + "██╔══██║" + KGREEN + "   ██║   " + KORANGE + "██║  ██║" + B_BLACK + "        │" + RESET);
		System.out.println(B_BLACK + "│      " + KBLUE + "   ██║   " + KYELLOW + "██║  ██║" + KRED + "██║ ╚██╗" + KPURPLE + "██████╦╝" + KGREEN + "╚█████╔╝      " + KORANGE + "██║ ╚██╗" + KBLUE + "██║  ██║" + KYELLOW + "   ██║         " + KRED + "██████╦╝" + KPURPLE + "██║  ██║" + KGREEN + "   ██║   " + KORANGE + "╚█████╔╝" + B_BLACK + "        │" + RESET);
		System.out.println(B_BLACK + "│      " + KBLUE + "   ╚═╝   " + KYELLOW + "╚═╝  ╚═╝" + KRED + "╚═╝  ╚═╝" + KPURPLE + "╚═════╝ " + KGREEN + " ╚════╝       " + KORANGE + "╚═╝  ╚═╝" + KBLUE + "╚═╝  ╚═╝" + KYELLOW + "    ═╝         " + KRED + "╚═════╝ " + KPURPLE + "╚═╝  ╚═╝" + KGREEN + "   ╚═╝   " + KORANGE + " ╚════╝ " + B_BLACK + "        │" + RESET);
		System.out.println(B_BLACK + "├────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬───────────────────────────────────┤" + RESET);
		System.out.println(B_BLACK + "│ "+AA1+" │ "+AB1+" │ "+AC1+" │ "+AD1+" │ "+AE1+" │ "+AF1+" │ "+AG1+" │ "+AH1+" │ "+AI1+" │ "+AJ1+" │"+p1NameBoardColor+"          " +   p1N   + "          "+B_BLACK+"│" + RESET);
		System.out.println(B_BLACK + "│ "+AA2+" │ "+AB2+" │ "+AC2+" │ "+AD2+" │ "+AE2+" │ "+AF2+" │ "+AG2+" │ "+AH2+" │ "+AI2+" │ "+AJ2+" ├───────────────────────────────────┤" + RESET);
		System.out.println(B_BLACK + "├────────┼────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┼────────┤  " +         p1S      + B_BLACK+"   │" + RESET);
		System.out.println(B_BLACK + "│"+B_WHITE+" "+RESET+BL1+" │                                                                       │ "+AK1+" │  " +         p1S    + B_BLACK+"   │" + RESET);
		System.out.println(B_BLACK + "│ "+BL2+B_WHITE+" "+B_BLACK+"│                                                                       │ "+AK2+" ├───────────────────────────────────┤" + RESET);
		System.out.println(B_BLACK + "├────────┤                                                                       ├────────┤"+p2NameBoardColor+"          " +   p2N   + "          "+B_BLACK+"│" + RESET);
		System.out.println(B_BLACK + "│ "+BK1+" │                                                                       │ "+AL1+" ├───────────────────────────────────┤" + RESET);
		System.out.println(B_BLACK + "│ "+BK2+" │                                                                       │ "+AL2+" │  " +         p2S    + B_BLACK+"   │" + RESET);
		System.out.println(B_BLACK + "├────────┤                                                                       ├────────┤  " +         p2S      + B_BLACK+"   │" + RESET);
		System.out.println(B_BLACK + "│ "+BJ1+" │                                                                       │ "+AM1+" ├───────────────────────────────────┤" + RESET);
		System.out.println(B_BLACK + "│ "+BJ2+" │                                                                       │ "+AM2+" │   G A M E  I N S T R U C T I O N  │" + RESET);
		System.out.println(B_BLACK + "├────────┤                                                                       ├────────┼───────────────────────────────────┤" + RESET);
		System.out.println(B_BLACK + "│ "+BI1+" │                                                                       │ "+AN1+" │                                   │" + RESET);
		System.out.println(B_BLACK + "│ "+BI2+" │                                                                       │ "+AN2+" │  Roll the DICE, move your piece,  │" + RESET);
		System.out.println(B_BLACK + "├────────┤                                                                       ├────────┤ take turns, reach the finish line.│" + RESET);
		System.out.println(B_BLACK + "│ "+BH1+" │                                                                       │ "+AO1+" │                                   │" + RESET);
		System.out.println(B_BLACK + "│ "+BH2+" │                                                                       │ "+AO2+" │   There's a police 'bato' rule:   │" + RESET);
		System.out.println(B_BLACK + "├────────┤                                                                       ├────────┤ if you land on their space, they  │" + RESET);
		System.out.println(B_BLACK + "│ "+BG1+" │                                                                       │ "+AP1+" │ roll dice and subtract that from  │" + RESET);
		System.out.println(B_BLACK + "│ "+BG2+" │                                                                       │ "+AP2+" │          your position.           │" + RESET);
		System.out.println(B_BLACK + "├────────┤                                                                       ├────────┤                                   │" + RESET);
		System.out.println(B_BLACK + "│ "+BF1+" │                                                                       │ "+AQ1+" │  Watch out for the "+B_CYAN+"  "+B_BLACK+"CYAN police! │" + RESET);
		System.out.println(B_BLACK + "│ "+BF2+" │                                                                       │ "+AQ1+" │                                   │" + RESET);
		System.out.println(B_BLACK + "├────────┤                                                                       ├────────┤ Get a point by reaching the finish│" + RESET);
		System.out.println(B_BLACK + "│ "+BE1+" │                                                                       │ "+AR1+" │   line. First to SCORE "+winningScore+" WINS.    │" + RESET);
		System.out.println(B_BLACK + "│ "+BE2+" │                                                                       │ "+AR2+" │            HAVE FUN!!!            │" + RESET);
		System.out.println(B_BLACK + "├────────┤                                                                       ├────────┼─────────────────┬─────────────────┤" + RESET);
		System.out.println(B_BLACK + "│ "+BD1+" │                                                                       │ "+AS1+" │     D I C E     │ R O U N D:  "+round+"  │" + RESET);
		System.out.println(B_BLACK + "│ "+BD2+" │                                                                       │ "+AS2+" │  ┌───────────┐  ├─────────────────┤" + RESET);
		System.out.println(B_BLACK + "├────────┼────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┼────────┤  │  "+diceLayer1+"  │  │    DISTANCE     │" + RESET);
		System.out.println(B_BLACK + "│ "+BC1+" │ "+BB1+" │ "+BA1+" │ "+AZ1+" │ "+AY1+" │ "+AX1+" │ "+AW1+" │ "+AV1+" │ "+AU1+" │ "+AT1+" │  │  "+diceLayer2+"  │  │   PLAYER 1:  "+boardPlayer1Distance+" │" + RESET);
		System.out.println(B_BLACK + "│ "+BC2+" │ "+BB2+" │ "+BA2+" │ "+AZ1+" │ "+AY2+" │ "+AX2+" │ "+AW2+" │ "+AV2+" │ "+AU2+" │ "+AT2+" │  └───────────┘  │   "+plyr2 +":  "+boardPlayer2Distance+" │" + RESET);
		System.out.println(B_BLACK + "├────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴─────────────────┴─────────────────┤" + RESET);
		System.out.println(B_BLACK + "│"                      + messageBoard +                                                                                     "│" + RESET);
		System.out.println(B_BLACK + "└─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘" + RESET);
	}


	//Getters
	public int getWinDistance() {
		return WIN_DISTANCE;
	}


	public void resetGameBoard(){//7, 13, 15, 24, 30, 35}; easy only
		messageBoard = "                                                                                                                             ";
		diceLayer1 = "       ";
		diceLayer2 = "       ";
		AA1 = "  --  "; AA2 = "  --  ";//1
		AB1 = "  --  "; AB2 = "  --  ";//2
		AC1 = "  --  "; AC2 = "  --  ";//3
		AD1 = "  --  "; AD2 = "  --  ";//4
		AE1 = "  --  "; AE2 = "  --  ";//5
		AF1 = "  --  "; AF2 = "  --  ";//6
		AG1 = "  --  "; AG2 = BATOCOLOR;//7
		AH1 = "  --  "; AH2 = "  --  ";//8
		AI1 = "  --  "; AI2 = "  --  ";//9
		AJ1 = "  --  "; AJ2 = "  --  ";//10
		AK1 = "  --  "; AK2 = "  --  ";//11
		AL1 = "  --  "; AL2 = "  --  ";//12
		AM1 = "  --  "; AM2 = BATOCOLOR;//13
		AN1 = "  --  "; AN2 = "  --  ";//14
		AO1 = "  --  "; AO2 = BATOCOLOR;//15
		AP1 = "  --  "; AP2 = "  --  ";//16
		AQ1 = "  --  "; AQ2 = "  --  ";//17
		AR1 = "  --  "; AR2 = "  --  ";//18
		AS1 = "  --  "; AS2 = "  --  ";//19
		AT1 = "  --  "; AT2 = "  --  ";//20
		AU1 = "  --  "; AU2 = "  --  ";//21
		AV1 = "  --  "; AV2 = "  --  ";//22
		AW1 = "  --  "; AW2 = "  --  ";//23
		AX1 = "  --  "; AX2 = BATOCOLOR;//24
		AY1 = "  --  "; AY2 = "  --  ";//25
		AZ1 = "  --  "; AZ2 = "  --  ";//26
		BA1 = "  --  "; BA2 = "  --  ";//27
		BB1 = "  --  "; BB2 = "  --  ";//28
		BC1 = "  --  "; BC2 = "  --  ";//28
		BD1 = "  --  "; BD2 = BATOCOLOR;//30
		BE1 = "  --  "; BE2 = "  --  ";//31
		BF1 = "  --  "; BF2 = "  --  ";//32
		BG1 = "  --  "; BG2 = "  --  ";//33
		BH1 = "  --  "; BH2 = "  --  ";//34
		BI1 = "  --  "; BI2 = BATOCOLOR;//35
		BJ1 = "  --  "; BJ2 = "  --  ";//36
		BK1 = "  --  "; BK2 = "  --  ";//37
		BL1 = " "+B_WHITE+" "+B_BLACK+" "+B_WHITE+" "+B_BLACK+" "+B_WHITE+" "+ B_BLACK;//38
		BL2 = B_WHITE+" "+B_BLACK+" "+B_WHITE+" "+B_BLACK+" "+B_WHITE+" "+B_BLACK+" ";//38
	}



	public boolean checkBato(int playerPosition){ 
		boolean x = false;
		switch(playerPosition){
		case 7:
			x = true;
			break;
		case 13:
			x = true;
			break;
		case 15:
			x = true;
			break;
		case 24:
			x = true;
			break;
		case 30:
			x = true;
			break;
		case 35:
			x = true;
			break;
		default:
			break;
		}return x;
	}

	

}