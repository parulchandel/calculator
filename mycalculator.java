import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class mycalculator extends WindowAdapter implements ActionListener 
{
Frame f;
Label l1;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,badd,bsub,bmul,bdiv,bmod,bequal,bclr,bback;
double num1,num2,ans,xd;
mycalculator()
{
    f = new Frame(" CALCULATOR ");
    l1=new Label();
    l1.setBounds(50,50,260,60);
    b1 = new Button("1");
    b1.setBounds(50,340,50,50);
    b2 = new Button("2");
    b2.setBounds(120, 340, 50, 50);
    b3 = new Button("3");
    b3.setBounds(190, 340, 50, 50);
    b4 = new Button("4");
    b4.setBounds(50,270,50,50);
    b5 = new Button("5");
    b5.setBounds(120, 270, 50, 50);
    b6 = new Button("6");
    b6.setBounds(190, 270, 50, 50);
    b7= new Button("7");
    b7.setBounds(50, 200, 50, 50);
    b8 = new Button("8");
    b8.setBounds(120,200,50,50);
    b9 = new Button("9");
    b9.setBounds(190, 200, 50, 50);
    b10 = new Button("0");
    b10.setBounds(120, 410, 50, 50);
    b11 = new Button("+/-");
    b11.setBounds(50, 410, 50, 50);
    b12 = new Button(".");
    b12.setBounds(190, 410, 50, 50);
    badd = new Button("+");
    badd.setBounds(260, 340, 50, 50);
    bsub = new Button("-");
    bsub.setBounds(260,270, 50, 50);
    bmul = new Button("x");
    bmul.setBounds(260, 200, 50, 50);
    bdiv = new Button("/");
    bdiv.setBounds(260, 130, 50, 50);
    bclr = new Button("CLR");
    bclr.setBounds(50,130,50,50);
    bmod = new Button("%");
    bmod.setBounds(120, 130, 50, 50);
    bback = new Button("BACK");
    bback.setBounds(190, 130, 50, 50);
    bequal = new Button("=");
    bequal.setBounds(260, 410, 50, 50);
    
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);
    b10.addActionListener(this);
    b11.addActionListener(this);
    b12.addActionListener(this);
    badd.addActionListener(this);
    bsub.addActionListener(this);
    bmul.addActionListener(this);
    bdiv.addActionListener(this);
    bmod.addActionListener(this);
    bclr.addActionListener(this);
    bback.addActionListener(this);
    bequal.addActionListener(this);
    
    f.addWindowListener(this);
    f.add(l1);f.add(b1);f.add(b2);
    f.add(b3);f.add(b4);f.add(b5);
    f.add(b6);f.add(b7);f.add(b8);
    f.add(b9);f.add(b10);f.add(b11);f.add(b12);
    f.add(badd);f.add(bsub);f.add(bmul);
    f.add(bdiv);
    f.add(bmod);
    f.add(bclr);f.add(bback);f.add(bequal);
    f.setSize(400,500);
    f.setLayout(null);
    f.setVisible(true);
}
    public void windowClosing(WindowEvent e)
    {
       f.dispose();
     }
    

public void actionPerformed(ActionEvent e)
{
   String u,uv;
   if(e.getSource()==b1)
   {
       uv=l1.getText();
       u=uv+"1";
       l1.setText(u);
   }
   if(e.getSource()==b2)
   {
       uv=l1.getText();
       u=uv+"2";
       l1.setText(u);
   }
   if(e.getSource()==b3)
   {
       uv=l1.getText();
       u=uv+"3";
       l1.setText(u);
   }
   if(e.getSource()==b4)
   {
       uv=l1.getText();
       u=uv+"4";
       l1.setText(u);
   }
   if(e.getSource()==b5)
   {
       uv=l1.getText();
       u=uv+"5";
       l1.setText(u);
   }
   if(e.getSource()==b6)
   {
       uv=l1.getText();
       u=uv+"6";
       l1.setText(u);
   }
   if(e.getSource()==b7)
   {
       uv=l1.getText();
       u=uv+"7";
       l1.setText(u);
   }
   if(e.getSource()==b8)
   {
       uv=l1.getText();
       u=uv+"8";
       l1.setText(u);
   }
   if(e.getSource()==b9)
   {
       uv=l1.getText();
       u=uv+"9";
       l1.setText(u);
   }
   if(e.getSource()==b10)
   {
       uv=l1.getText();
       u=uv+"0";
       l1.setText(u);
   }
   if(e.getSource()==b11)
   {
       uv=l1.getText();
       u=uv+"+/-";
       l1.setText(u);
   }
   if(e.getSource()==b11)
   {
       uv=l1.getText();
       u=uv+".";
       l1.setText(u);
   }
   if(e.getSource()==badd)
   {
     try
     {
         num1=Double.parseDouble(l1.getText());
     }
         catch(NumberFormatException f)
          {
            l1.setText("Invalid Formate");
            return;
          }
     u=" ";
     l1.setText(u);
     ans=1;
   }
   if(e.getSource()==bsub)
   {
     try
     {
         num1=Double.parseDouble(l1.getText());
     }
       catch(NumberFormatException f)
       {
           l1.setText("Invalid Formate");
           return;
          
       }
     u=" ";
     l1.setText(u);
     ans=2;
     }
   if(e.getSource()==bmul)
   {
      try
      {
          num1=Double.parseDouble(l1.getText());
      }
      catch(NumberFormatException f)
      {
          l1.setText("Invalid Format");
          return;
      }
       u=" ";
     l1.setText(u);
     ans=3;
   }
   if(e.getSource()==bdiv)
   {
     try
     {
         num1=Double.parseDouble(l1.getText());
     }
     catch(NumberFormatException f)
     {
         l1.setText("Invalid Formate");
         return;
     }
      u=" ";
     l1.setText(u);
     ans=4;
   }
   if(e.getSource()==bback)
   {
       uv=l1.getText();
       try
       {
           u=uv.substring(0,uv.length()-1);
       }
       catch(StringIndexOutOfBoundsException f)
       {
           return;
       }
           l1.setText(u);
       
   }
   if(e.getSource()==bmod)
   {
      try
      {
          num1=Double.parseDouble(l1.getText());
      }
      catch(NumberFormatException f)
      {
          l1.setText("Invalid formate");
          return;
      }
      u=" ";
      l1.setText(u);
      ans=5;
   }
   if(e.getSource()==bequal)
   {
       try
       {
           num2=Double.parseDouble(l1.getText());
       }
       catch(Exception f)
       {
           l1.setText("Enter the number first");
           return;
       }
       if(ans==1)
           xd=num1+num2;
       if(ans==2)
           xd=num1-num2;
       if(ans==3)
           xd=num1*num2;
       if(ans==4)
           xd=num1/num2;
       if(ans==5)
           xd=num1%num2;
       l1.setText(String.valueOf(xd));
   }
   if(e.getSource()==bclr)
   {
       num1=0;
       num2=0;
       ans=0;
       xd=0;
       u=" ";
       l1.setText(u);
   }
   
   }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        new mycalculator();
    }
    
}
