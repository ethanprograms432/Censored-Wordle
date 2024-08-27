import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.lang.Character;
public class GuessManager {
 
   public static String[][] colours = new String[5][5];
   public static String[] possibleWords = {"SIGMA","PUSSY","COOCH","BOOBY","MOIST","PRICK","FUCKY","MILFS","CRACK","PENIS","BOOBS","CUMIN","BALLS","SPERM","HORNY","WANKS","DADDY","COCKS","FUCKS","SHITS","SPANK","BITCH","WHORE","ASSES","DILDO","CUNTS","PORNO","DRUGS","ERECT","DICKS","SEMEN","SLUTS"};
   GamePanel gp;
   KeyManager keyH;
   WordManager wordM;
   private static int counter = 0;
   public static String word;
   public GuessManager(GamePanel gp,KeyManager keyH, WordManager wordM) {
   
      this.gp = gp;
      this.keyH = keyH;
      this.wordM = wordM;
      if(counter == 0) {
         word = pickAWORD();
         counter++;
      }
   
   }
   
   
   public void updateColour(String letter,int c,int r) {
   
      String line = (wordM.words[0][r] + wordM.words[1][r] + wordM.words[2][r] + wordM.words[3][r] + wordM.words[4][r]);
      String C = Character.toString(word.charAt(c));
      if(letter.contains(C) && line.length() == 5) {
         colours[c][r] = "GREEN";
      } else if(word.contains(letter) && line.length() == 5) {
         colours[c][r] = "YELLOW";
      } else {
         colours[c][r] = "GRAY";
      }
      
      
   
   }
   
   public static String pickAWORD() {
   
      Random rand = new Random();
      int length = possibleWords.length;
      int wordNum = rand.nextInt(0,length-1);
      return possibleWords[wordNum];
   
   }
   

}