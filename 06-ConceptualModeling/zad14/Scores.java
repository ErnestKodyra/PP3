import java.util.Arrays;
public class Scores
{
    //mozna to tez static metodami zrobic samymi bez tych atrybutow przechowujacych wynik
    private int[] partialScores;
    private double finalScore;
    
    public void setPartialScores(int[] ps){
        if(ps.length > 5){
            return;
        }
        else partialScores = ps;
    }
    public void calculateFinalScore(){
        java.util.Arrays.sort(partialScores);
        double[] tempScores = {partialScores[1], partialScores[2], partialScores[3]};
        finalScore = (tempScores[0] + tempScores[1] + tempScores[2])/3;
    }
    public double returnFinalScore(){
        return finalScore;
    }
    public static void main(String[] args){
        Scores player1 = new Scores();
        player1.setPartialScores(new int[]{5,5,1,2,1});
        player1.calculateFinalScore();
        player1.returnFinalScore();
        Scores player2 = new Scores();
        player2.setPartialScores(new int[]{4,4,4,5,3});
        player2.calculateFinalScore();
        player2.returnFinalScore();
        Scores player3 = new Scores();
        player3.setPartialScores(new int[]{1,2,1,3,1});
        player3.calculateFinalScore();
        player3.returnFinalScore();
    }
}
