public class HardMode extends Board{

	//Attributes Win Distance
	private final int WIN_DISTANCE = 65;

	//Constructor
	public HardMode() {

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
		System.out.println(B_BLACK + "├────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┼────────┤  " +         p1S      + B_BLACK+"   │" + RESET);
		System.out.println(B_BLACK + "│                                                                                │ "+AK1+" │  " +         p1S    + B_BLACK+"   │" + RESET);
		System.out.println(B_BLACK + "│                                                                                │ "+AK2+" ├───────────────────────────────────┤"  + RESET);
		System.out.println(B_BLACK + "├────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐        ├────────┤"+p2NameBoardColor+"          " +   p2N   + "          "+B_BLACK+"│" + RESET);
		System.out.println(B_BLACK + "│ "+BK1+" │ "+BL1+" │ "+BM1+" │ "+BN1+" │ "+BO1+" │ "+BP1+" │ "+BQ1+" │ "+BR1+" │        │ "+AL1+" ├───────────────────────────────────┤" + RESET);
		System.out.println(B_BLACK + "│ "+BK2+" │ "+BL2+" │ "+BM2+" │ "+BN2+" │ "+BO2+" │ "+BP2+" │ "+BQ2+" │ "+BR2+" │        │ "+AL2+" │  " +         p2S    + B_BLACK+"   │" + RESET);
		System.out.println(B_BLACK + "├────────┼────────┴────────┴────────┴────────┴────────┴────────┼────────┤        ├────────┤  " +         p2S    + B_BLACK+"   │" + RESET);
		System.out.println(B_BLACK + "│ "+BJ1+" │                                                     │ "+BS1+" │        │ "+AM1+" ├───────────────────────────────────┤" + RESET);
		System.out.println(B_BLACK + "│ "+BJ2+" │                                                     │ "+BS2+" │        │ "+AM2+" │   G A M E  I N S T R U C T I O N  │" + RESET);
		System.out.println(B_BLACK + "├────────┤        ┌────────┬────────┬────────┬────────┐        ├────────┤        ├────────┼───────────────────────────────────┤" + RESET);
		System.out.println(B_BLACK + "│ "+BI1+" │        │ "+CG1+" │ "+CH1+" │ "+CI1+" │ "+CJ1+" │        │ "+BT1+" │        │ "+AN1+" │                                   │"+RESET);
		System.out.println(B_BLACK + "│ "+BI2+" │        │ "+CG2+" │ "+CH2+" │ "+CI2+" │ "+CJ2+" │        │ "+BT2+" │        │ "+AN2+" │  Roll the DICE, move your piece,  │" + RESET);
		System.out.println(B_BLACK + "├────────┤        ├────────┼────────┴────────┼────────┤        ├────────┤        ├────────┤ take turns, reach the finish line.│" + RESET);
		System.out.println(B_BLACK + "│ "+BH1+" │        │ "+CF1+" │                 │ "+CK1+" │        │ "+BU1+" │        │ "+AO1+" │                                   │" + RESET);
		System.out.println(B_BLACK + "│ "+BH2+" │        │ "+CF2+" │                 │ "+CK2+" │        │ "+BU2+" │        │ "+AO2+" │   There's a police 'bato' rule:   │" + RESET);
		System.out.println(B_BLACK + "├────────┤        ├────────┤        ┌────────┼────────┤        ├────────┤        ├────────┤ if you land on their space, they  │" + RESET);
		System.out.println(B_BLACK + "│ "+BG1+" │        │ "+CE1+" │        │"+B_WHITE+" "+RESET+CM1+" │ "+CL1+" │        │ "+BV1+" │        │ "+AP1+" │ roll dice and subtract that from  │" + RESET);
		System.out.println(B_BLACK + "│ "+BG2+" │        │ "+CE2+" │        │ "+CM2+B_WHITE+" "+B_BLACK+"│ "+CL2+" │        │ "+BV2+" │        │ "+AP2+" │          your position.           │" + RESET);
		System.out.println(B_BLACK + "├────────┤        ├────────┤        └────────┴────────┘        ├────────┤        ├────────┤                                   │" + RESET);
		System.out.println(B_BLACK + "│ "+BF1+" │        │ "+CD1+" │                                   │ "+BW1+" │        │ "+AQ1+" │  Watch out for the "+B_CYAN+"  "+B_BLACK+"CYAN police! │" + RESET);
		System.out.println(B_BLACK + "│ "+BF2+" │        │ "+CD2+" │                                   │ "+BW2+" │        │ "+AQ2+" │                                   │" + RESET);
		System.out.println(B_BLACK + "├────────┤        ├────────┼────────┬────────┬────────┬────────┼────────┤        ├────────┤ Get a point by reaching the finish│" + RESET);
		System.out.println(B_BLACK + "│ "+BE1+" │        │ "+CC1+" │ "+CB1+" │ "+CA1+" │ "+BZ1+" │ "+BY1+" │ "+BX1+" │        │ "+AR1+" │   line. First to SCORE "+winningScore+" WINS.    │" + RESET);
		System.out.println(B_BLACK + "│ "+BE2+" │        │ "+CC2+" │ "+CB2+" │ "+CA2+" │ "+BZ2+" │ "+BY2+" │ "+BX2+" │        │ "+AR2+" │            HAVE FUN!!!            │" + RESET);
		System.out.println(B_BLACK + "├────────┤        └────────┴────────┴────────┴────────┴────────┴────────┘        ├────────┼─────────────────┬─────────────────│" + RESET);
		System.out.println(B_BLACK + "│ "+BD1+" │                                                                       │ "+AS1+" │     D I C E     │ R O U N D:  "+round+"  │" + RESET);
		System.out.println(B_BLACK + "│ "+BD2+" │                                                                       │ "+AS2+" │  ┌───────────┐  ├─────────────────│" + RESET);
		System.out.println(B_BLACK + "│────────┼────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┼────────┤  │  "+diceLayer1+"  │  │    DISTANCE     │" + RESET);
		System.out.println(B_BLACK + "│ "+BC1+" │ "+BB1+" │ "+BA1+" │ "+AZ1+" │ "+AY1+" │ "+AX1+" │ "+AW1+" │ "+AV1+" │ "+AU1+" │ "+AT1+" │  │  "+diceLayer2+"  │  │   PLAYER 1:  "+boardPlayer1Distance+" │" + RESET);
		System.out.println(B_BLACK + "│ "+BC2+" │ "+BB2+" │ "+BA2+" │ "+AZ2+" │ "+AY2+" │ "+AX2+" │ "+AW2+" │ "+AV2+" │ "+AU2+" │ "+AT2+" │  └───────────┘  │   "+plyr2 +":  "+boardPlayer2Distance+" │" + RESET);
		System.out.println(B_BLACK + "├────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴─────────────────┴─────────────────┤" + RESET);
		System.out.println(B_BLACK + "│"                      + messageBoard +                                                                                     "│" + RESET);
		System.out.println(B_BLACK + "└─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘" + RESET);
	}


	//Getters
	public int getWinDistance() {
		return WIN_DISTANCE;
	}


	public void resetGameBoard(){//8, 16, 22, 24, 33, 38, 41, 48, 51, 58, 61}; HARD ONLY
		messageBoard = "                                                                                                                             ";
		diceLayer1 = "       ";
		diceLayer2 = "       ";
		AA1 = "  --  "; AA2 = "  --  ";//1
		AB1 = "  --  "; AB2 = "  --  ";//2
		AC1 = "  --  "; AC2 = "  --  ";//3
		AD1 = "  --  "; AD2 = "  --  ";//4
		AE1 = "  --  "; AE2 = "  --  ";//5
		AF1 = "  --  "; AF2 = "  --  ";//6
		AG1 = "  --  "; AG2 = "  --  ";//7
		AH1 = "  --  "; AH2 = BATOCOLOR;//8
		AI1 = "  --  "; AI2 = "  --  ";//9
		AJ1 = "  --  "; AJ2 = "  --  ";//10
		AK1 = "  --  "; AK2 = "  --  ";//11
		AL1 = "  --  "; AL2 = "  --  ";//12
		AM1 = "  --  "; AM2 = "  --  ";//13
		AN1 = "  --  "; AN2 = "  --  ";//14
		AO1 = "  --  "; AO2 = "  --  ";//15
		AP1 = "  --  "; AP2 = BATOCOLOR;//16
		AQ1 = "  --  "; AQ2 = "  --  ";//17
		AR1 = "  --  "; AR2 = "  --  ";//18
		AS1 = "  --  "; AS2 = "  --  ";//19
		AT1 = "  --  "; AT2 = "  --  ";//20
		AU1 = "  --  "; AU2 = "  --  ";//21
		AV1 = "  --  "; AV2 = BATOCOLOR;//22
		AW1 = "  --  "; AW2 = "  --  ";//23
		AX1 = "  --  "; AX2 = BATOCOLOR;//24
		AY1 = "  --  "; AY2 = "  --  ";//25
		AZ1 = "  --  "; AZ2 = "  --  ";//26
		BA1 = "  --  "; BA2 = "  --  ";//27
		BB1 = "  --  "; BB2 = "  --  ";//28
		BC1 = "  --  "; BC2 = "  --  ";//29
		BD1 = "  --  "; BD2 = "  --  ";//30
		BE1 = "  --  "; BE2 = "  --  ";//31
		BF1 = "  --  "; BF2 = "  --  ";//32
		BG1 = "  --  "; BG2 = BATOCOLOR;//33
		BH1 = "  --  "; BH2 = "  --  ";//34
		BI1 = "  --  "; BI2 = "  --  ";//35
		BJ1 = "  --  "; BJ2 = "  --  ";//36
		BK1 = "  --  "; BK2 = "  --  ";//37
		BL1 = "  --  "; BL2 = BATOCOLOR;//38
		BM1 = "  --  "; BM2 = "  --  ";//39
		BN1 = "  --  "; BN2 = "  --  ";//40
		BO1 = "  --  "; BO2 = BATOCOLOR;//41
		BP1 = "  --  "; BP2 = "  --  ";//42
		BQ1 = "  --  "; BQ2 = "  --  ";//43
		BR1 = "  --  "; BR2 = "  --  ";//44
		BS1 = "  --  "; BS2 = "  --  ";//45
		BT1 = "  --  "; BT2 = "  --  ";//46
		BU1 = "  --  "; BU2 = "  --  ";//47
		BV1 = "  --  "; BV2 = BATOCOLOR;//48
		BW1 = "  --  "; BW2 = "  --  ";//49
		BX1 = "  --  "; BX2 = "  --  ";//50
		BY1 = "  --  "; BY2 = BATOCOLOR;//51
		BZ1 = "  --  "; BZ2 = "  --  ";//52
		CA1 = "  --  "; CA2 = "  --  ";//53
		CB1 = "  --  "; CB2 = "  --  ";//54
		CC1 = "  --  "; CC2 = "  --  ";//55
		CD1 = "  --  "; CD2 = "  --  ";//56
		CE1 = "  --  "; CE2 = "  --  ";//57
		CF1 = "  --  "; CF2 = BATOCOLOR;//58
		CG1 = "  --  "; CG2 = "  --  ";//59
		CH1 = "  --  "; CH2 = "  --  ";//60
		CI1 = "  --  "; CI2 = BATOCOLOR;//61
		CJ1 = "  --  "; CJ2 = "  --  ";//62
		CK1 = "  --  "; CK2 = "  --  ";//63
		CL1 = "  --  "; CL2 = "  --  ";//64
		CM1 = " "+B_WHITE+" "+B_BLACK+" "+B_WHITE+" "+B_BLACK+" "+B_WHITE+" "+ B_BLACK;//65
		CM2 = B_WHITE+" "+B_BLACK+" "+B_WHITE+" "+B_BLACK+" "+B_WHITE+" "+B_BLACK+" ";//65
	}



	public boolean checkBato(int playerPosition){ //8, 16, 22, 24, 33, 38, 41, 48, 51, 58, 61}; HARD ONLY
		boolean x = false;
		switch(playerPosition){
		case 8:
			x = true;
			break;
		case 16:
			x = true;
			break;
		case 22:
			x = true;
			break;
		case 24:
			x = true;
			break;
		case 33:
			x = true;
			break;
		case 38:
			x = true;
			break;
		case 48:
			x = true;
			break;
		case 51:
			x = true;
			break;
		case 58:
			x = true;
			break;
		case 61:
			x = true;
			break;
		case 41:
			x = true;
			break;
		default:
			break;
		}
		return x;
	}

}
