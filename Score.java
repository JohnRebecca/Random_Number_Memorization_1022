
public int[] Score(int[] leaderBoard, int score ){

    //for score - input is the current leaderBoard aswlel as the current score and returns the new leaderBoard if nececsary

        for(int i = 0; i<leaderBoard.length; i++){
        if(leaderBoard[i] < score)
            leaderBoard[i] = score ''
            i = leaderBoard.length ;
        }

        return leaderBoard;

}