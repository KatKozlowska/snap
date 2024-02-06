import data.Face;
import data.Suit;

import java.util.*;

public class Deck {
  private final List<Card> deck;

  public Deck() {
    this.deck = new ArrayList<>();
    for (Suit suit : Suit.values()) {
      for (Face face : Face.values()) {
        deck.add(new Card(face, suit));
      }
    }
  }

  public List<Card> getDeck() {
    return deck;
  }

  public void shuffleDeck() {
    Collections.shuffle(deck);
  }

  public void sortDeckInNumberOrder() {
    deck.sort(
        // Comparator.comparingInt will compare integers
        // I need to tell the code how to get int from object
        Comparator.comparingInt(card -> card.getFace().getValue()));
  }

  public void sortDeckIntoSuits() {
    deck.sort(Card::compareTo);
  }

  public Card dealCard() {
    if (hasCardsLeft()) {
      Card first = deck.get(0);
      deck.remove(0);
      return first;
    }
    return null;
  }

  public boolean hasCardsLeft() {
    return !deck.isEmpty();
  }

  @Override
  public String toString() {
    return "deck = " + deck;
  }
}
