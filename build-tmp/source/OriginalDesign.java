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

public class OriginalDesign extends PApplet {

public void setup()
{
	size(220,350);
}
public void draw()
{
	body();
	head();
}
public void body()
{
	int x = 100;
	//body
    fill(255);
    ellipse(x+10,215,90,140);
	//legs
    fill(255, 145, 213);
    ellipse(75, 210, 35, 35);
    ellipse(145, 210, 35, 35);
    ellipse(75,265,35,35);
    ellipse(145,265,35,35);
}
public void head()
{
	//head
	fill(255);
    ellipse(110,140,60,100);
    //eyes
    ellipse(90,120,20,20);
    ellipse(130,120,20,20);
    //pupils
    fill(0);
    ellipse(100-10,100+20,2,2);
    ellipse(100+30,100+20,2,2);
    //pupils
    ellipse(100-10,100+75,2,2);
    ellipse(100+30,100+75,2,2);
    //horn
    fill(196, 170, 0);
    triangle(100,100,100+10,100-50,100+20,100);
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
