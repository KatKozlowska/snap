import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.Scanner;

public class Snap extends CardGame {

  private Deck deck;
  private Player player1;
  private Player player2;
  private Scanner scanner;

  public Snap() {
    super();
  }

  public Deck getDeck() {
    return deck;
  }

  public void play() {
    if (scanner == null) {
      this.scanner = new Scanner(System.in);
    }
    System.out.println("Player 1 enter your name: ");
    this.player1 = new Player(scanner.next());
    System.out.println("Player 2 enter your name: ");
    this.player2 = new Player(scanner.next());

    int turn = 0;

    this.deck = new Deck();
    this.deck.shuffleDeck();
    Card card = this.deck.dealCard();
    System.out.println(card);
    scanner.nextLine();

    while (deck.hasCardsLeft()) {
      turn++;
      scanner.nextLine();
      Card newCard = this.deck.dealCard();
      System.out.println(newCard);

      if (card.getFace().getValue() == newCard.getFace().getValue()) {
        if (turn % 2 == 1) {
          System.out.println(player1 + " won the game!");
        } else {
          System.out.println(player2 + " won the game!");
        }
        break;
      } else {
        card = newCard;
      }
      if (!deck.hasCardsLeft()) {
        System.out.println("Whomp Whomp! You ran out of cards.");
      }
    }

    System.out.println("Press 1 to play again");
    System.out.println("Press 2 to exit game");
    int input = scanner.nextInt();
    if (input == 1) {
      play();
    }
  }
}
