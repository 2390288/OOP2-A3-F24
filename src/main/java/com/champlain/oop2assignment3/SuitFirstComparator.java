package com.champlain.oop2assignment3;

import java.util.Comparator;

/**
 * A comparator for comparing cards with suit priority.
 * <p>
 * The SuitFirstComparator compares two cards primarily by their suit. If the suits
 * are the same, it then compares them by rank.
 * </p>
 * <p>
 * This comparator implements the {@link Comparator} interface and is intended to be used
 * for sorting cards with suit as the primary sorting key and rank as the secondary key.
 * </p>
 */
public class SuitFirstComparator implements Comparator<Card> {

    /**
     * Compares two cards by suit first, then by rank if the suits are equal.
     *
     * @param card1 the first card to be compared
     * @param card2 the second card to be compared
     * @return a negative integer, zero, or a positive integer if the first card is less than,
     *         equal to, or greater than the second card, respectively
     */
    @Override
    public int compare(Card card1, Card card2) {
        // Compare the suits first
        int suitComparison = card1.getSuit().ordinal() - card2.getSuit().ordinal();

        // If suits are different, return the comparison result
        if (suitComparison != 0) {
            return suitComparison;
        }

        // If suits are the same, compare by rank
        return card1.getRank().ordinal() - card2.getRank().ordinal();
    }
}

