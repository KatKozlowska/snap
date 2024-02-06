package data;

import static data.Constants.*;

public enum Suit {
  DIAMONDS("\u2666", RED),
  HEARTS("\u2665", RED),
  CLUBS("\u2663", PURPLE),
  SPADES("\u2660", PURPLE);

  Suit(String unicode, String colour) {
    this.unicode = unicode;
    this.colour = colour;
  }

  private final String unicode;
  private final String colour;

  public String getUnicode() {
    return unicode;
  }

  public String getColour() {
    return colour;
  }

  public String getSuitString() {
    return colour + unicode + RESET;
  }
}
