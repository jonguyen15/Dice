import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

Die neo=new Die(50, 125);
Die mrFudge=new Die(200,125);

public void setup()
{
    noLoop();
    size(300,300);
    textMode(CENTER);
    textSize(24);
}
public void draw()
{
    background(255);
    int sum=neo.dots+mrFudge.dots;
    fill(0);
    text(sum, 150, 200);
    neo.show();
    neo.roll();
    mrFudge.show();
    mrFudge.roll();
}

public void mousePressed()
{
    redraw();
}
class Die //models one single dice cube
{
    int myX, myY, dots;
    Die(int x, int y) //constructor
    {
        myX=x;
        myY=y;
    }
    public void roll()
    {
        dots=(int)(Math.random()*6+1);
    }
    public void show()
    {
        fill(125);
        rect(myX,myY,50,50,10);
        fill(0,255,255);
        if(dots==1)
        {
            ellipse(myX+25,myY+25,10,10);
            System.out.println("dots: "+dots);
        }
        else if(dots==2)
        {
            ellipse(myX+7,myY+7,10,10);
            ellipse(myX+43,myY+43,10,10);
            System.out.println("dots: "+dots);
        }
        else if(dots==3)
        {
            ellipse(myX+25,myY+25,10,10);
            ellipse(myX+7,myY+7,10,10);
            ellipse(myX+43,myY+43,10,10);
            System.out.println("dots: "+dots);
        }
        else if(dots==4)
        {
            ellipse(myX+7,myY+7,10,10);
            ellipse(myX+43,myY+43,10,10);
            ellipse(myX+7,myY+43,10,10);
            ellipse(myX+43, myY+7,10,10);
            System.out.println("dots: "+dots);
        }
        else if(dots==5) 
        {
            ellipse(myX+7,myY+7,10,10);
            ellipse(myX+43,myY+43,10,10);
            ellipse(myX+7,myY+43,10,10);
            ellipse(myX+43, myY+7,10,10);
            ellipse(myX+25,myY+25,10,10);
            System.out.println("dots: "+dots);    
        }
        else if(dots==6)
        {
            ellipse(myX+7,myY+7,10,10);
            ellipse(myX+43,myY+43,10,10);
            ellipse(myX+7,myY+43,10,10);
            ellipse(myX+43, myY+7,10,10);
            ellipse(myX+7, myY+25,10,10);
            ellipse(myX+43,myY+25,10,10);
            System.out.println("dots: "+dots);
        }    
    }
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
