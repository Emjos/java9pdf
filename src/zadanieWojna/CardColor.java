package zadanieWojna;

public enum CardColor {


    CLUBS(1),
    DIAMONDS(2),
    HEARTS(3),
    SPADES(4);

    private int values;

    public int getValues() {
        return values;
    }

    CardColor(int values){
        this.values = values;
    }


}
