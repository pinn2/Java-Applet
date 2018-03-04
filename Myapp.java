import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code="Myapp.class" width=500 height=300>
</applet>
*/
public class Myapp extends Applet implements KeyListener {
     String msg="";
    
    // adding key board event
     public void init(){
          addKeyListener(this);
}
     
    public void keyPressed(KeyEvent obj){
         showStatus("Typing");
         
}
    public void keyReleased(KeyEvent obj){
         showStatus("key Released");
}
     // this function called when key pressed or u type any thing from keyboard
   public void keyTyped(KeyEvent obj){
        showStatus("input taking by keyboard");
         msg+=obj.getKeyChar();
         repaint();
}
    
     public void paint(Graphics g) {
                 g.setColor(Color.red);  
                 g.drawString("Welcome",0, 10); // welcome msg u can change this welcome string
                 g.setColor(Color.blue);  // whatever u type u can see this in blue text
                 g.drawString(msg,0,50); // your output as text shows in applet
         }
 }
