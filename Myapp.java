import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code="Myapp.class" width=500 height=300>
</applet>
*/
public class Myapp extends Applet implements KeyListener {
     String msg="";
    
    
     public void init(){
          addKeyListener(this);
}
     
    public void keyPressed(KeyEvent obj){
         showStatus("Typing");
         
}
    public void keyReleased(KeyEvent obj){
         showStatus("key Released");
}
   public void keyTyped(KeyEvent obj){
        showStatus("input taking by keyboard");
         msg+=obj.getKeyChar();
         repaint();
}
    
     public void paint(Graphics g) {
                 g.setColor(Color.red);  
                 g.drawString("Welcome",0, 10); 
                 g.setColor(Color.blue);
                 g.drawString(msg,0,50); 
         }
 }
