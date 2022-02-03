import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Button1 extends JButton
{
    private val font :Font=null;
    public Button1()
    {
       this.setBorderPainted(false);
       this.setContentAreaFilled(false);
       this.font= new Font("Calibri", Font.PLAIN, 12);
       this.addMouseListener(new MouseAdapter()
      {
       @Override
       def mouseEntered(e : MouseEvent)=
       {
          super.mouseEntered(e);
          font =  new Font("Calibri", Font.BOLD, 14);
          repaint();
       }
       @Override
       def mouseExited(e : MouseEvent)=
       {
          super.mouseExited(e);
          font = new Font("Arial", Font.BOLD, 12);
          repaint();
       }
    });
  }
    @Override
 def paintComponent(g : Graphics)=
 {
     val g2 : Graphica2D = (Graphics2D)g;
      g2.setPaint(new GradientPaint(getWidth(), getHeight()/2, new Color(41, 0, 0),
             getWidth(), getHeight(), new Color(81, 2, 2)));
      g2.fillRoundRect(0, 0, getWidth(), getHeight(), 16, 16);
      g2.setFont(font);
      g2.setColor(Color.YELLOW);
      g2.drawString("Activate", 26, 14);
      
 }
}