package iki_basamakli_oyunu;



import java.awt.*;
import java.applet.*;

public class string extends Applet
{
       TextField Ts1,Ts2;

       public void init(){
            Ts1 = new TextField(10);
            Ts2 = new TextField(10);
            add(Ts1);
            add(Ts2);
            Ts1.setText("");
            Ts2.setText("");
        }

        public void paint(Graphics g){
            String str1,str2;

            g.drawString("Enter Two String to Concat Them ",10,50);

            str1=Ts1.getText();
            str2=Ts2.getText();
            g.setColor(Color.red);
            g.drawString(str1+" "+str2,10,70);
            showStatus("Concatination of 2 String");
     }

     public boolean action(Event e, Object o){
           repaint();
           return true;
    }

}