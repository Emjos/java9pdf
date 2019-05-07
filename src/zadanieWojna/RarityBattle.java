package zadanieWojna;

import javafx.scene.Parent;

import java.util.List;

public class RarityBattle implements Battle {
    @Override
    public int checkWinner(List<Card> deck1, List<Card> deck2) {
        int rareCounterDeck1=0;
        int rareCounterDeck2=0;

        for (Card card : deck1){
            if(card.isRare()){
                rareCounterDeck1++;
            }
        }
        for (Card card : deck2){
            if (card.isRare()){
                rareCounterDeck2++;
            }
        }

        if(rareCounterDeck1 > rareCounterDeck2){
            return 1;
        }
        else if (rareCounterDeck2 > rareCounterDeck1){
            return -1;
        }
        else
            return 0;

    }
}
