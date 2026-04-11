public class Referee{
   
    //ATTRIBUTES
    private int winningDistance = 0;
    private int winningScore = 0;
    private int gameRound = 1;
    private int p1Score = 0, p2Score = 0;

    //CONSTRUCTOR
    public Referee(){

    }

    //GETTERS
    public int getWinDistance(){
        return winningDistance;
    }
    public int getWinScore(){
        return winningScore;
    }
    public int getGameRound(){
        return gameRound;
    }
    public int getP1Score(){
        return p1Score;
    }
    public int getP2Score(){
        return p2Score;
    }
  

    //SETTERS
    public void setWinningDistance(int winDistance){
        winningDistance = winDistance;
    }
    public void setWinningScore(int winScore){
        winningScore = winScore;
    }


    //RESET SCORE
    public void resetScore() {
    	p1Score = 0;
    	p2Score = 0;
    }
            
        
    //Add Player Score 
    public void addP1Score(){
        this.p1Score ++;
    }
    public void addP2Score(){
        p2Score ++;
    }
    

    //Add Game Round
    public void addGameRound(){
        gameRound++;
    }
    
    //RESETALLATTRIBUTES
    public void resetAllReferee() {
        winningDistance = 0;
        winningScore = 0;
        gameRound = 1;
        p1Score = 0;
        p2Score = 0;
    }
}
