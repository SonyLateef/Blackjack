package BlackJack;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    /*3 Instance Fields.
    A deck of cards.
    The player should have an ArrayList<Card> to hold their hand of cards.
    The dealer should have an ArrayList<Card> to hold their hand of cards. */

    private Deck deck;
    private ArrayList<Card> player, dealer;

    //Constructor.
    public Game(){
        //Initialize each of the three instance fields.
        deck = new Deck();
        this.player = player;
        this.dealer = dealer;
    }

    /*Methods.  Details to follow.
        1. void dealCards()
        2. int scoreHand(ArrayList<Card> hand)
        3. int playerTurn()
        4. int dealerTurn()
        5. void playRound()
     */

    public void dealCards(){
        //TODO Shuffle the deck, deal each player 2 cards.
            deck.shuffle();
            player.add(deck.dealCard());
            }



    public int scoreHand(ArrayList<Card> hand){
        //add up the ranks of each card in the hand.
        //10's and face cards are worth 10.  (rank >= 10 -> 10 points)
        //Aces (rank 1) are worth 11.
        //Update an aceCount variable each time you find an Ace.
        Card c = hand.get();

        int score = 0;
        int aceCount = 0;


        //TODO While the score is over 21, if there are Aces worth 11, take 10 away
        while(score > 21 && aceCount > 0)
            score -= 10;
            aceCount -= 1;
        //so the ace is worth 1 instead of 11. (take 10 away from score, 1 away from aceCount


        return score;
    }

    public void playerTurn(){
        Scanner input = new Scanner(System.in);
        System.out.println("1 for HIT, 2 for STAY.");

        while(scoreHand(player) < 21) {
            int choice = input.nextInt();
            if (choice == 2) {
                System.out.println("Player stays.");
                return;
            }else{
                //TODO: hit! deal a card from the deck to the player.
                return deck.dealCard(0);

            }
            printState();
        }
    }

    public void dealerTurn(){
        //TODO: same as player except...
        //no user input.  The dealer keeps hitting until the score is 17 or more.
        //ie the dealer keeps hitting as long as the score is 16 or less.
        while(dealerTurn(); <= 16)

    }

    public void playRound() {
        dealCards();
        printState();

        //if player is dealt 21, game is over! Winner!
        if (scoreHand(player) == 21) {
            System.out.println("YOU WIN!");
            return;    //note you can return; in a void method to exit the method immediately.
        }
        playerTurn();
        //TODO if player has more than 21, game over! Loser! Print, then return to exit.
//        if( ){
//
//    }
        dealerTurn();

        //TODO if dealer has more than 21, game over!  Winner!  Print, then return to exit.
//        if(scoreHand(dealer) > 21){
//
//        }

        //TODO if the player has more than the dealer, game over! Winner!
        //TODO if the dealer has more than the player, game over! Loser!
        //TODO if the dealer and the player have the same score, game over! Tie!
    }

    public void printState(){
        System.out.println();
        System.out.println("Dealer hand: " + dealer.get(0) + " *");
        System.out.println("Player hand: " + player);
    }

    public void printEndState(){
        System.out.println();
        System.out.println("Dealer hand: " + dealer);
        System.out.println("Player hand: " + player);
    }


}