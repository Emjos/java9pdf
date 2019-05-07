package zadanieWojna;

import java.util.List;

public class ColorBattle implements Battle {

    @Override
    public int checkWinner(List<Card> deck1, List<Card> deck2) {
        int deck1ColorValues = 0;
        int deck2ColorValues = 0;
        for(Card card :deck1){
           deck1ColorValues += card.getCardColor().getValues();
        }
       for (Card card :deck2){
           deck2ColorValues += card.getCardColor().getValues();
       }

       if(deck1ColorValues > deck2ColorValues ){
           return 1;
       }
       else if (deck2ColorValues > deck1ColorValues){
           return -1;
       }
       else
           return 0;
    }

}
