package com.champlain.oop2assignment3;

public class SimpleCountStrategy implements ScoringStrategy  {
    /*
    * loops ever card in the persons hand and add +1 to score
    * @param int aScore
    * */
    @Override
    public int calculateScore(CardCollection pCards) {
        int aScore = 0;
        for(Card card : pCards) {
            aScore++;
        }
        return aScore;
    }
}
