

object Netfix_Antivirus_Activation
{
   def createUI()
   {
      final val f : JFrame = new JFrame("Netfix Activation");
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setBounds((Toolkit.getDefaultToolkit().getScreenSize().width-800)/2,
              (Toolkit.getDefaultToolkit().getScreenSize().height-600)/2, 800, 600);
      f.setUndecorated(true);
      val pane : Pane1 =  new Pane1("Netfix Antivirus Activation");
      pane.setLayout(null);
      val labt : JLabel =  new JLabel("Enter Activation Code");
      labt.setFont(new Font("Arial", Font.PLAIN, 16));
      labt.setForeground(Color.WHITE);
      labt.setBounds(36, 120, 260, 20);
      val labm : JLabel =  new JLabel("Activation code format : XXXX - XXXX - XXXX - XXXX");
      labm.setFont(new Font("Arial", Font.PLAIN, 10));
      labm.setForeground(Color.WHITE);
      labm.setBounds(36, 160, 360, 20);
      val laba : JLabel =  new JLabel();
      laba.setFont(new Font("Arial", Font.PLAIN, 12));
      laba.setForeground(Color.WHITE);
      laba.setBounds(36, 360, 360, 20);
      pane.add(laba);
      pane.add(labm);
      pane.add(labt);
      final val fd1 : JTextField  = new JTextField(6);
      final val fd2 : JTextField = new JTextField(6);
      final val fd3 : JTextField  = new JTextField(6);
      final val fd4 : JTextField = new JTextField(6);
      fd1.setBounds(36, 190, 160, 24);
      fd2.setBounds(206, 190, 160, 24);
      fd3.setBounds(376, 190, 160, 24);
      fd4.setBounds(546, 190, 160, 24);
      pane.add(fd1);
      pane.add(fd2);
      pane.add(fd3);
      pane.add(fd4);
      final val close : JLabel = new JLabel("x");
      close.setFont(new Font("Arial", Font.BOLD, 12));
      close.setForeground(Color.WHITE);
      close.setBounds(760, 12, 12, 12);
      close.addMouseListener(new MouseAdapter()
      {
       @Override
       def mouseEntered(e : MouseEvent)
       {
          super.mouseEntered(e);
          close.setFont(new Font("Arial", Font.BOLD, 14));
          close.setForeground(Color.YELLOW);
       }
       @Override
       def mouseExited(e : MouseEvent)
       {
          super.mouseExited(e);
          close.setFont(new Font("Arial", Font.BOLD, 12));
          close.setForeground(Color.WHITE);
       }
       @Override
       def mouseClicked(e : MouseEvent)
       {
           super.mouseClicked(e);
           f.dispose();
       }
      });
     val btn_activate : Button1 =  new Button1();
      btn_activate.setBounds(36, 240, 120, 24);
      btn_activate.addActionListener(new ActionListener(){
       def actionPerformed(e : ActionEvent)=
       {
           val str1 :String, str2: String, str3 :String, str4 :String;
           str1 = fd1.getText();
           str2 = fd2.getText();
           str3 = fd2.getText();
           str4 = fd2.getText();
           if(str1.equals("") || str2.equals("") || str3.equals("") || str4.equals(""))
           {
               laba.setForeground(Color.WHITE);
               laba.setText("The activation key field is empty.");
           }
           else if(str1.equals("pc007") && str2.equals("gl007") && str3.equals("mit07") && str4.equals("std07"))
           {
               laba.setForeground(Color.YELLOW);
               laba.setText("Sucesfully activated.");
           }
           else
           {
               laba.setForeground(Color.WHITE);
               laba.setText("Wrong key entered.");
           }
               
       }
      });
      pane.add(btn_activate);
      pane.add(close);
      pane.setVisible(true);
      f.add(pane);
      f.setVisible(true);
   }
  def main(args : String)
  {
     try{
      Netfix_Antivirus_Activation.createUI();
    }
    catch(e : Exception)
   {
    e.prinStackTrace();
   }
  }
}
