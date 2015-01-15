/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1;

/**
 * This controls how bets and totals are calculated after submit
 * @author stephenthoen
 */
public class Bet {

    private int newtotal = 0;
    private String outcome = "";

    /**
     * Receives multiple parameters and determines of the best was a win or loss
     * @param bet
     * @param bettype
     * @param total
     * @param dicetotal 
     */
    public void bet(int bet, int bettype, int total, int dicetotal) {
        newtotal = total;

        if (bet != 0) {

            if (dicetotal <= bettype && bettype < 7) {
                newtotal += (bet * 2);
                outcome = "YOU WIN!";
            } else if (dicetotal == bettype && bettype == 7) {
                newtotal += (bet * 4);
                outcome = "YOU WIN!";
            } else if (dicetotal >= bettype && bettype > 7) {
                newtotal += (bet * 2);
                outcome = "YOU WIN!";
            } else {
                newtotal -= bet;
                outcome = "You lose...";
            }

        } else {
            newtotal = total;
            outcome = "You didn't bet!";
        }
    }
    
    /**
     * returns the new total 
     * @return 
     */
    public int gettotal() {
        return newtotal;
    }
    /**
     * returns a string value of what the outcome is.
     * @return 
     */
    public String getoutcome()
    {
        return outcome;
    }
}
