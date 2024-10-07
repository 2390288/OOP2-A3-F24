package com.champlain.oop2assignment3;

import java.util.Comparator;

/**
 * Comparator implementation that compares cards by their rank first.
 * <p>
 * If two cards have the same rank, their suits are compared as a secondary criterion.
 * </p>
 */
public class RankFirstComparator implements Comparator<Card> {

    /**
     * Compares two cards, prioritizing the rank of the cards.
     * <p>
     * If the ranks of the cards are equal, the suits are compared as a tiebreaker.
     * </p>
     *
     * @param card1 the first card to compare
     * @param card2 the second card to compare
     * @return a negative integer, zero, or a positive integer as the first card is
     *         less than, equal to, or greater than the second card
     */
    @Override
    public int compare(Card card1, Card card2) {
        int rankComparison = card1.getRank().ordinal() - card2.getRank().ordinal();
        if (rankComparison != 0) {
            return rankComparison;
        }
        return card1.getSuit().ordinal() - card2.getSuit().ordinal();
    }
}
