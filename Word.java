import javax.swing.*;
import java.awt.*;
public class Word {

   private String letter;
   private int col;
   private int row;

   public Word(String l, int c, int r) {
   
      this.letter = l;
      this.col = c;
      this.row = r;
   
   }
   
   public void drawWord(Graphics g) {
      
      Color c = this.decideColor();
      g.setFont(new Font("TimesRoman",Font.PLAIN,50));
      g.setColor(c);
      g.fillRect((this.col * 160),(this.row * 160),160,160);
      g.setColor(Color.black);
      g.drawString(this.letter,(this.col*160) + 60,(this.row*160) + 60);
   
   }
   
   public Color decideColor() {
   
      if(GuessManager.colours[this.col][this.row] == "GREEN") {
      
         return (Color.green);
      
      } else if(GuessManager.colours[this.col][this.row] == "YELLOW") {
      
         return (Color.yellow);
      
      } else {
      
         return (Color.gray);
         
      }
   
   }

}