package com.champlain.oop2assignment3;

public class NumberOfAcesStrategy implements ScoringStrategy  {
    /*
     * loops ever card in the persons hand and add +1 to score if there is an ace
     * @param int aScore
     * */
    @Override
    public int calculateScore(CardCollection pCards) {
        int aScore = 0;
        for(Card card : pCards) {
            if (card.getRank() == Rank.ACE) {
                aScore++;
            }
        }
        return aScore;
    }
}
