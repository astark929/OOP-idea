package game;

public class deck extends card {
    card card;

    int amount_of_cards [] [] = {
            {1,2,3,4,5,6,7,8,9,10,11,12,13},
            {1,2,3,4,5,6,7,8,9,10,11,12,13},
            {1,2,3,4,5,6,7,8,9,10,11,12,13},
            {1,2,3,4,5,6,7,8,9,10,11,12,13}
    };
    boolean valid;
    boolean cardsLeft;


    public boolean CheckIfValid(){
        card = new card();
        return valid;
    }

    public boolean cardsleft() {
        return cardsLeft;
    }

}
