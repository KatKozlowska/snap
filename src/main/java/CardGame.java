import java.util.List;

public class CardGame {

  private final Deck deck;

  public CardGame() {
    this.deck = new Deck();
  }

  public Card dealCard() {
    return deck.dealCard();
  }

  public List<Card> sortDeckIntoSuits() {
    deck.sortDeckIntoSuits();
    return deck.getDeck();
  }

  public List<Card> sortDeckInNumberOrder() {
    deck.sortDeckInNumberOrder();
    return deck.getDeck();
  }

  public List<Card> shuffleDeck() {
    deck.shuffleDeck();
    return deck.getDeck();
  }
}
