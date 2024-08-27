import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class GamePanel extends JPanel implements Runnable {

   public final int tileWidth = 160;
   public final int tileHeight = 160;
   public static Random rand = new Random();
   int counter = 0;
   Thread gameThread;
   KeyManager keyH = new KeyManager();
   WordManager wordM = new WordManager(this,keyH);
   GuessManager gM = new GuessManager(this,keyH,wordM);
   
   public GamePanel() {
   
      this.setPreferredSize(new Dimension(800,800));
      this.setFocusable(true);
      this.addKeyListener(keyH);
      this.setBackground(Color.white);
   
   }
   
   public void startGameThread() {
   
      gameThread = new Thread(this);
      gameThread.start();
   
   }
   
   @Override
   public void run() {

      while(gameThread != null) {
      
         try {
            TimeUnit.MILLISECONDS.sleep(150);
            repaint();
         } catch(InterruptedException i) {
         
            i.printStackTrace();
         }
      }
   
   }
   
   public void paintComponent(Graphics g) {
      
      super.paintComponent(g);
      drawBackground(g);
      wordM.drawWords(g);
      checkFinished(g);
   
   }
   
   public void checkFinished(Graphics g) {
   
      
      int overallCounter = 0;
      int nullCounter = 0;
      
      for (int h = 0; h < 5; h++) {
         int counter = 0;
         for (int i = 0; i < 5; i++) {
         
            if(gM.colours[i][h] != null) {
            
               if((gM.colours[i][h]).equals("GREEN")) {
            
                  counter++;
                  
               }
               
            } else {
            
               nullCounter++;
            
            }
            
          
            
         }
         
         if(counter < 5 && nullCounter == 0) {
            
            overallCounter += 5;
               
         }
         
         if(counter == 5) {
         
            // WIN
            g.setColor(Color.black);
            g.fillRect(0,0,800,800);
            g.setColor(Color.green);
            g.drawString("Congrats, You Win!",200,400);
            
         }
      
      }
      
      if(overallCounter >= 25) {
      
         StringBuilder sb = new StringBuilder();
         g.setColor(Color.black);
         g.fillRect(0,0,800,800);
         g.setColor(Color.red);
         g.drawString("You lose!",0,400);
         String correctWord = gM.word;
         sb.append(correctWord);
         int censorIndex = 0;
         
         for (int i = 1; i < correctWord.length(); i++) {
         
            if(correctWord.charAt(i) == 'A' || correctWord.charAt(i) == 'E' || 
            correctWord.charAt(i) == 'I' || correctWord.charAt(i) == 'O' || correctWord.charAt(i) == 'U') {
            
               censorIndex = i;
               break;
            
            }
            
         
         }
         
         if(censorIndex == 0) {
         
            censorIndex = rand.nextInt(0,correctWord.length());
         
         }
         
         sb.setCharAt(censorIndex,'#');
         correctWord = sb.toString();
         
         g.drawString("The correct word was " + correctWord + "!",0,500);
      
      }
      
  }
   
   
   public void drawBackground(Graphics g) {
   
      g.setColor(Color.black);
      g.drawLine(160,0,160,1000);
      g.drawLine(320,0,320,1000);
      g.drawLine(480,0,480,1000);
      g.drawLine(640,0,640,1000);
      
      g.drawLine(0,160,1000,160);
      g.drawLine(0,320,1000,320);
      g.drawLine(0,480,1000,480);
      g.drawLine(0,640,1000,640);
      
   
   }
   
   

}