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

int x = 400;
int y = 70;
float rainbowY = 120;

public void setup()
{
	size(800,300);
}
public void draw()
{
    background(50,150,200);
    x = x + 2;
    if (x > 880) {
        x = -80;
    }
    rainbowY+= .5f;
    if (rainbowY > 150) {
        rainbowY = 120; 
    }
    println(rainbowY);
    rainbow();
	body();
	head();
}
public void rainbow()
{
    fill(255, 0, 0); //red
    rect(0, rainbowY, 800, 10);
    fill(255, 165, 0); //orange
    rect(0, rainbowY+10, 800, 10);
    fill(255, 255, 0); //yellow
    rect(0, rainbowY+20, 800, 10);
    fill(0, 255, 0); //green
    rect(0, rainbowY+30, 800, 10);
    fill(0, 150, 255); //blue
    rect(0, rainbowY+40, 800, 10);
    fill(0, 0, 255); //indigo
    rect(0, rainbowY+50, 800, 10);
    fill(76, 0, 153); //violet
    rect(0, rainbowY+60, 800, 10);
}
public void body()
{
	//body
        fill(255);
        ellipse(x,y+110,90,140);
	//legs
        fill(255, 145, 213);
        ellipse(x-35, y+110, 35, 35);
        ellipse(x+35, y+110, 35, 35);
        ellipse(x-35,y+160,35,35);
        ellipse(x+35,y+160,35,35);
}
public void head()
{
    //mane
        fill((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
        quad(x-15, y-25, x+15, y-25, x+10, y, x-10, y);
    //head
    	fill(255);
        ellipse(x,y+40,60,100);
    //eyes
        ellipse(x-20,y+20,20,20);
        ellipse(x+20,y+20,20,20);
    //pupils
        fill(0);
        ellipse(x-20,y+20,2,2);
        ellipse(x+20,y+20,2,2);
    //nostrils
        ellipse(x-20,y+75,2,2);
        ellipse(x+20,y+75,2,2);
    //horn
        fill(196, 170, 0);
        triangle(x-10, y, x, y-50, x+10, y);
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
