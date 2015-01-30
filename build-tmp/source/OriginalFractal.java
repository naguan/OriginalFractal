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

public class OriginalFractal extends PApplet {

private double fractionLength = .8f; 
private int smallestBranch = 5; 
private double branchAngle = .5f;  
private boolean yes = true;
public void setup() 
{   
	size(640,640);    
} 
public void draw() 
{   
	background(0);   
	stroke(0,255,0);      
	drawCircles(320,320,200,200);  

} 

public void drawCircles(float x,float y, float wid, float hei) 
{  
	if(wid == 10)
	{
		ellipse(320, 320, 2, 2);
	}
	else {
		ellipse(640-mouseX, y-10, wid-10, hei-10);
		ellipse(mouseX, y+10, wid-10, hei-10);
        ellipse(x+10, 640-mouseY, wid-10, hei-10);
        ellipse(x-10, mouseY, wid-10, hei-10);

		drawCircles(x, y, wid-10, hei-10);
	}
} 
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
