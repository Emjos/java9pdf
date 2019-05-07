package zadanieWojna;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
       List<Card> deck1 = new ArrayList<>(createDeck(5,10));
       List<Card> deck2 = new ArrayList<>(createDeck(5,10));





        System.out.println(deck1);
        System.out.println(deck2);

    }

    public static List<Card> createDeck(int rareSeed,int deckSize){
        List<Card> deck = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < deckSize ; i++) {
        int cValue = random.nextInt(10)+1;
        CardColor cardColor = CardColor.values()[random.nextInt(CardColor.values().length)];
        boolean cRare = random.nextBoolean();
        deck.add(new Card(cValue,cardColor,cRare));
        }

        return deck;
    }
}
