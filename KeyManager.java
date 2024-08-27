import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
public class KeyManager implements KeyListener {

   boolean a,b,c,d,E,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,bs;
   
   public void keyTyped(KeyEvent e) {
   
   
   }
   
   public void keyPressed(KeyEvent e) {
   
      int code = e.getKeyCode();
      switch(code) {
         case(KeyEvent.VK_A):
            a = true;
            break;
         case(KeyEvent.VK_B):
            b = true;
            break;
         case(KeyEvent.VK_C):
            c = true;
            break;
         case(KeyEvent.VK_D):
            d = true;
            break;
         case(KeyEvent.VK_E):
            E = true;
            break;
         case(KeyEvent.VK_F):
            f = true;
            break;
         case(KeyEvent.VK_G):
            g = true;
            break;
         case(KeyEvent.VK_H):
            h = true;
            break;
         case(KeyEvent.VK_I):
            i = true;
            break;
         case(KeyEvent.VK_J):
            j = true;
            break;
         case(KeyEvent.VK_K):
            k = true;
            break;
         case(KeyEvent.VK_L):
            l = true;
            break;
         case(KeyEvent.VK_M):
            m = true;
            break;
         case(KeyEvent.VK_N):
            n = true;
            break;
         case(KeyEvent.VK_O):
            o = true;
            break;
         case(KeyEvent.VK_P):
            p = true;
            break;
         case(KeyEvent.VK_Q):
            q = true;
            break;
         case(KeyEvent.VK_R):
            r = true;
            break;
         case(KeyEvent.VK_S):
            s = true;
            break;
         case(KeyEvent.VK_T):
            t = true;
            break;
         case(KeyEvent.VK_U):
            u = true;
            break;
         case(KeyEvent.VK_V):
            v = true;
            break;
         case(KeyEvent.VK_W):
            w = true;
            break;
         case(KeyEvent.VK_X):
            x = true;
            break;
         case(KeyEvent.VK_Y):
            y = true;
            break;
         case(KeyEvent.VK_Z):
            z = true;
            break;
         case(8):
            bs = true;
            break;
         }
            
   }
   
   public void keyReleased(KeyEvent e) {
   
      int code = e.getKeyCode();
      switch(code) {
         case(KeyEvent.VK_A):
            a = false;
         case(KeyEvent.VK_B):
            b = false;
         case(KeyEvent.VK_C):
            c = false;
         case(KeyEvent.VK_D):
            d = false;
         case(KeyEvent.VK_E):
            E = false;
         case(KeyEvent.VK_F):
            f = false;
         case(KeyEvent.VK_G):
            g = false;
         case(KeyEvent.VK_H):
            h = false;
         case(KeyEvent.VK_I):
            i = false;
         case(KeyEvent.VK_J):
            j = false;
         case(KeyEvent.VK_K):
            k = false;
         case(KeyEvent.VK_L):
            l = false;
         case(KeyEvent.VK_M):
            m = false;
         case(KeyEvent.VK_N):
            n = false;
         case(KeyEvent.VK_O):
            o = false;
         case(KeyEvent.VK_P):
            p = false;
         case(KeyEvent.VK_Q):
            q = false;
         case(KeyEvent.VK_R):
            r = false;
         case(KeyEvent.VK_S):
            s = false;
         case(KeyEvent.VK_T):
            t = false;
         case(KeyEvent.VK_U):
            u = false;
         case(KeyEvent.VK_V):
            v = false;
         case(KeyEvent.VK_W):
            w = false;
         case(KeyEvent.VK_X):
            x = false;
         case(KeyEvent.VK_Y):
            y = false;
         case(KeyEvent.VK_Z):
            z = false;
         case(8):
            bs = false;
         }
   }


}