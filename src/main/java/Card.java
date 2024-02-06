import data.Face;
import data.Suit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Card implements Comparable<Card> {

  private final Face face;
  private final Suit suit;

  public Card(Face face, Suit suit) {
    this.face = face;
    this.suit = suit;
  }

  public Face getFace() {
    return face;
  }

  public Suit getSuit() {
    return suit;
  }

  public String toString() {
    return String.format("%s%s", face.getValue(), suit.getSuitString());
  }

  @Override
  public int compareTo(Card card) {
    // Making a List of all suits as it is easier to find indexes this way
    List<Suit> suitList = Arrays.asList(Suit.values());

    // Comparing index positions of suits
    int suitPosition = suitList.indexOf(this.suit) - suitList.indexOf(card.getSuit());

    // If same suits return normal face comparison
    return (suitPosition != 0) ? suitPosition : this.face.getValue() - card.getFace().getValue();
  }
}
