/*
 * Ferris D.
 * 05/11/2018
 * Jumbles a word up
 */

package wordjumble;

import javax.swing.JOptionPane;

/**
 *
 * @author fedie2562
 */
public class WordJumble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        String word = JOptionPane.showInputDialog("Please enter your word");
        jumbler(word, "");
    }
    public static void jumbler(String w, String jumbLet){
        // The word jumble algorithm
        int pos;
        String remainingLetters;
        String origWord = w;
        String origJumbledLetters = jumbLet;
        if (w.length() == 1){
            System.out.println(jumbLet + w);
        } else {
            for (pos = 0; pos < origWord.length(); pos++) {
                remainingLetters = origWord.substring(0, pos)
                        + origWord.substring(pos + 1, origWord.length());
                jumbler(remainingLetters, origJumbledLetters + origWord.charAt(pos));
            }
        }
    }
}
