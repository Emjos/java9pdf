package zadanieWojna;

public class Card {
private int value;
private CardColor cardColor;
private boolean rare;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public CardColor getCardColor() {
        return cardColor;
    }

    public void setCardColor(CardColor cardColor) {
        this.cardColor = cardColor;
    }

    public boolean isRare() {
        return rare;
    }

    public void setRare(boolean rare) {
        this.rare = rare;
    }

    public Card(int value, CardColor cardColor, boolean rare) {
        this.value = value;
        this.cardColor = cardColor;
        this.rare = rare;
    }

    @Override
    public String toString() {
        return ""
                 + value +
                ", " + cardColor.getValues() +
                ", " + rare +
                '}';
    }
}
