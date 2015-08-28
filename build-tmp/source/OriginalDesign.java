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

float x = 100;
float y = 110;
float rainbowY = y + 80;

public void setup()
{
	size(800,300);
}
public void draw()
{
    background(50,150,200);
    x = x + 1.5f;
    if (x > 880) {
        x = -80;
    }
    y -= .25f;
    if (y < 50) {
        y = 110; 
    }
    rainbowY -= .25f;
    if (rainbowY < 130) {
        rainbowY = 190; 
    }
    rainbow();
    body();
    head();
    frameRate(25);
}
public void rainbow()
{
    fill(255, 0, 0); //red
    rect(-1, rainbowY, 810, 10);
    fill(255, 165, 0); //orange
    rect(-1, rainbowY+10, 810, 10);
    fill(255, 255, 0); //yellow
    rect(-1, rainbowY+20, 810, 10);
    fill(0, 255, 0); //green
    rect(-1, rainbowY+30, 810, 10);
    fill(0, 150, 255); //blue
    rect(-1, rainbowY+40, 810, 10);
    fill(0, 0, 255); //indigo
    rect(-1, rainbowY+50, 810, 10);
    fill(76, 0, 153); //violet
    rect(-1, rainbowY+60, 810, 10);
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
        fill((int)(Math.random()*220)+25, (int)(Math.random()*220)+25, (int)(Math.random()*220)+25);
        quad(x-20, y-25, x+20, y-25, x+10, y, x-10, y);
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
