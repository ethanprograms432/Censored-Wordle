import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;
public class WordManager {
   
   public static String[][] words = new String[5][5];
   KeyManager keyH;
   GamePanel gp;
   GuessManager gM;
   public static int currentRow = 0;
   public static int currentCol = 0;
   
   public WordManager(GamePanel gp,KeyManager keyH) {
   
      this.gp = gp;
      this.keyH = keyH;
      GuessManager GM = new GuessManager(this.gp,this.keyH,this);
      this.gM = GM;
   }
   
   public void drawWords(Graphics g) {
      
      updateArray();
      drawArray(g);
      
   
   }
   
   public void drawArray(Graphics g) {
   
      for (int i = 0; i < 5; i++) {
         for (int j = 0; j < 5; j++) {
        
            if (words[i][j] == "A") {
               gM.updateColour("A",i,j); 
               Word a = new Word("A",i,j);
               a.drawWord(g);
               
            } else if (words[i][j] == "B") {
               gM.updateColour("B",i,j);
               Word b = new Word("B",i,j);
               b.drawWord(g);
               
            } else if (words[i][j] == "C") {
               gM.updateColour("C",i,j);
               Word c = new Word("C",i,j);
               c.drawWord(g);
               
            } else if (words[i][j] == "D") {
               gM.updateColour("D",i,j);
               Word d = new Word("D",i,j);
               d.drawWord(g);
               
            } else if (words[i][j] == "E") {
               gM.updateColour("E",i,j);
               Word e = new Word("E",i,j);
               e.drawWord(g);
               
            } else if (words[i][j] == "F") {
               gM.updateColour("F",i,j);
               Word f = new Word("F",i,j);
               f.drawWord(g);
               
            } else if (words[i][j] == "G") {
               gM.updateColour("G",i,j);
               Word G = new Word("G",i,j);
               G.drawWord(g);
               
            } else if (words[i][j] == "H") {
               gM.updateColour("H",i,j);
               Word h = new Word("H",i,j);
               h.drawWord(g);
               
            } else if (words[i][j] == "I") {
               gM.updateColour("I",i,j);
               Word I = new Word("I",i,j);
               I.drawWord(g);
               
            } else if (words[i][j] == "J") {
               gM.updateColour("J",i,j);
               Word J = new Word("J",i,j);
               J.drawWord(g);
               
            } else if (words[i][j] == "K") {
               gM.updateColour("K",i,j);
               Word k = new Word("K",i,j);
               k.drawWord(g);
               
            } else if (words[i][j] == "L") {
               gM.updateColour("L",i,j);
               Word l = new Word("L",i,j);
               l.drawWord(g);
               
            } else if (words[i][j] == "M") {
               gM.updateColour("M",i,j);
               Word m = new Word("M",i,j);
               m.drawWord(g);
               
            } else if (words[i][j] == "N") {
               gM.updateColour("N",i,j);
               Word n = new Word("N",i,j);
               n.drawWord(g);
               
            } else if (words[i][j] == "O") {
               gM.updateColour("O",i,j);
               Word o = new Word("O",i,j);
               o.drawWord(g);
               
            } else if (words[i][j] == "P") {
               gM.updateColour("P",i,j);
               Word p = new Word("P",i,j);
               p.drawWord(g);
               
            } else if (words[i][j] == "Q") {
               gM.updateColour("Q",i,j);
               Word q = new Word("Q",i,j);
               q.drawWord(g);
               
            } else if (words[i][j] == "R") {
               gM.updateColour("R",i,j);
               Word r = new Word("R",i,j);
               r.drawWord(g);
               
            } else if (words[i][j] == "S") {
               gM.updateColour("S",i,j);
               Word s = new Word("S",i,j);
               s.drawWord(g);
               
            } else if (words[i][j] == "T") {
               gM.updateColour("T",i,j);
               Word t = new Word("T",i,j);
               t.drawWord(g);
               
            } else if (words[i][j] == "U") {
               gM.updateColour("U",i,j);
               Word u = new Word("U",i,j);
               u.drawWord(g);
               
            } else if (words[i][j] == "V") {
               gM.updateColour("V",i,j);
               Word v = new Word("V",i,j);
               v.drawWord(g);
               
            } else if (words[i][j] == "W") {
               gM.updateColour("W",i,j);
               Word w = new Word("W",i,j);
               w.drawWord(g);
               
            } else if (words[i][j] == "X") {
               gM.updateColour("X",i,j);
               Word x = new Word("X",i,j);
               x.drawWord(g);
               
            } else if (words[i][j] == "Y") {
               gM.updateColour("Y",i,j);
               Word y = new Word("Y",i,j);
               y.drawWord(g);
               
            } else if (words[i][j] == "Z") {
               gM.updateColour("Z",i,j);
               Word z = new Word("Z",i,j);
               z.drawWord(g);
               
            }  
         
         }
      }
   
   }
   
   public void updateArray() {
   
      if(keyH.a == true) {
         words[currentCol][currentRow] = "A";
         if(currentCol == 4 && currentRow != 4) {
            currentCol = 0;
            currentRow += 1;
         } else {
            currentCol += 1;
         }
      } else if(keyH.b == true) {
         words[currentCol][currentRow] = "B";
         if(currentCol == 4 && currentRow != 4) {
            currentCol = 0;
            currentRow += 1;
         } else {
            currentCol += 1;
         }
      } else if(keyH.c == true) {
         words[currentCol][currentRow] = "C";
         if(currentCol == 4 && currentRow != 4) {
            currentCol = 0;
            currentRow += 1;
         } else {
            currentCol += 1;
         }
      } else if(keyH.d == true) {
         words[currentCol][currentRow] = "D";
         if(currentCol == 4 && currentRow != 4) {
            currentCol = 0;
            currentRow += 1;
         } else {
            currentCol += 1;
         }
      } else if(keyH.E == true) {
         words[currentCol][currentRow] = "E";
         if(currentCol == 4 && currentRow != 4) {
            currentCol = 0;
            currentRow += 1;
         } else {
            currentCol += 1;
         }
      } else if(keyH.f == true) {
         words[currentCol][currentRow] = "F";
         if(currentCol == 4 && currentRow != 4) {
            currentCol = 0;
            currentRow += 1;
         } else {
            currentCol += 1;
         }
      } else if(keyH.g == true) {
         words[currentCol][currentRow] = "G";
         if(currentCol == 4 && currentRow != 4) {
            currentCol = 0;
            currentRow += 1;
         } else {
            currentCol += 1;
         }
      } else if(keyH.h == true) {
         words[currentCol][currentRow] = "H";
         if(currentCol == 4 && currentRow != 4) {
            currentCol = 0;
            currentRow += 1;
         } else {
            currentCol += 1;
         }
      } else if(keyH.i == true) {
         words[currentCol][currentRow] = "I";
         if(currentCol == 4 && currentRow != 4) {
            currentCol = 0;
            currentRow += 1;
         } else {
            currentCol += 1;
         }
      } else if(keyH.j == true) {
         words[currentCol][currentRow] = "J";
         if(currentCol == 4 && currentRow != 4) {
            currentCol = 0;
            currentRow += 1;
         } else {
            currentCol += 1;
         }
      } else if(keyH.k == true) {
         words[currentCol][currentRow] = "K";
         if(currentCol == 4 && currentRow != 4) {
            currentCol = 0;
            currentRow += 1;
         } else {
            currentCol += 1;
         }
      } else if(keyH.l == true) {
         words[currentCol][currentRow] = "L";
         if(currentCol == 4 && currentRow != 4) {
            currentCol = 0;
            currentRow += 1;
         } else {
            currentCol += 1;
         }
      } else if(keyH.m == true) {
         words[currentCol][currentRow] = "M";
         if(currentCol == 4 && currentRow != 4) {
            currentCol = 0;
            currentRow += 1;
         } else {
            currentCol += 1;
         }
      } else if(keyH.n == true) {
         words[currentCol][currentRow] = "N";
         if(currentCol == 4 && currentRow != 4) {
            currentCol = 0;
            currentRow += 1;
         } else {
            currentCol += 1;
         }
      } else if(keyH.o == true) {
         words[currentCol][currentRow] = "O";
         if(currentCol == 4 && currentRow != 4) {
            currentCol = 0;
            currentRow += 1;
         } else {
            currentCol += 1;
         }
      } else if(keyH.p == true) {
         words[currentCol][currentRow] = "P";
         if(currentCol == 4 && currentRow != 4) {
            currentCol = 0;
            currentRow += 1;
         } else {
            currentCol += 1;
         }
      } else if(keyH.q == true) {
         words[currentCol][currentRow] = "Q";
         if(currentCol == 4 && currentRow != 4) {
            currentCol = 0;
            currentRow += 1;
         } else {
            currentCol += 1;
         }
      } else if(keyH.r == true) {
         words[currentCol][currentRow] = "R";
         if(currentCol == 4 && currentRow != 4) {
            currentCol = 0;
            currentRow += 1;
         } else {
            currentCol += 1;
         }
      } else if(keyH.s == true) {
         words[currentCol][currentRow] = "S";
         if(currentCol == 4 && currentRow != 4) {
            currentCol = 0;
            currentRow += 1;
         } else {
            currentCol += 1;
         }
      } else if(keyH.t == true) {
         words[currentCol][currentRow] = "T";
         if(currentCol == 4 && currentRow != 4) {
            currentCol = 0;
            currentRow += 1;
         } else {
            currentCol += 1;
         }
      } else if(keyH.u == true) {
         words[currentCol][currentRow] = "U";
         if(currentCol == 4 && currentRow != 4) {
            currentCol = 0;
            currentRow += 1;
         } else {
            currentCol += 1;
         }
      } else if(keyH.v == true) {
         words[currentCol][currentRow] = "V";
         if(currentCol == 4 && currentRow != 4) {
            currentCol = 0;
            currentRow += 1;
         } else {
            currentCol += 1;
         }
      } else if(keyH.w == true) {
         words[currentCol][currentRow] = "W";
         if(currentCol == 4 && currentRow != 4) {
            currentCol = 0;
            currentRow += 1;
         } else {
            currentCol += 1;
         }
      } else if(keyH.x == true) {
         words[currentCol][currentRow] = "X";
         if(currentCol == 4 && currentRow != 4) {
            currentCol = 0;
            currentRow += 1;
         } else {
            currentCol += 1;
         }
      } else if(keyH.y == true) {
         words[currentCol][currentRow] = "Y";
         if(currentCol == 4 && currentRow != 4) {
            currentCol = 0;
            currentRow += 1;
         } else {
            currentCol += 1;
         }
      } else if(keyH.z == true) {
         words[currentCol][currentRow] = "Z";
         if(currentCol == 4 && currentRow != 4) {
            currentCol = 0;
            currentRow += 1;
         } else {
            currentCol += 1;
         }
      } else if(keyH.bs == true) {
         if(currentCol != 0) {

            currentCol -= 1;
         }
         words[currentCol][currentRow] = "";
         
            
      }
   
   }
   

}