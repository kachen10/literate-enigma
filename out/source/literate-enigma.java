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

public class literate-enigma extends PApplet {
  public void setup() {
class Puck {
    float x = width/2;
    float y = height/2;
    float xspeed = random( -3, -3 );
    float yspeed = random( -3, -3 );

    public void show() {
        fill(255);
        ellipse( x, y, 24, 24 );
    }

}

    noLoop();
  }

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "literate-enigma" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
