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

public class literate_enigma extends PApplet {

Puck puck;
Paddle left;
Paddle right;
int p1;
int p2;


public void setup() {
    
    puck = new Puck();
    left = new Paddle(true);
    right = new Paddle(false);
   
}

public void draw() {
    background(0);
    textAlign(CENTER);
    // string s = ("%i:%i" % (p1, p2));
    // text(s , width/2, 10);   

    left.show();
    right.show();
    left.update();
    right.update();
    
    puck.update();
    puck.edges();
    puck.show();
    
}

public void keyPressed() {
    if ( key == 'w' ) {
        left.move( -10 );
    } else if ( key == 's' ) {
        left.move( 10 );
    }
    if ( key == 'i' ) {
        right.move( -10 );
    } else if ( key == 'k' ) {
        right.move( 10 );
    }
}

public void keyReleased() {
    left.move(0);
    right.move(0);
}

class Paddle {
    float x;
    float y = height/2;    
    float w = 10;    
    float h = 100;  

    float ychange = 0;

    Paddle( boolean left ) {
        if (left) {
            x = w/2;
        } else {
            x = width - w/2;
        }
        
    }

    public void update() {
        y += ychange;
        y = constrain( y, h/2, height-h/2 );
    }

    public void move( float steps ) {
        ychange += steps;
    }  

    public void show() {
        fill(255);
        rectMode(CENTER);
        rect( x, y, w, h );
    }

}
class Puck {
    float x = width/2;
    float y = height/2;
    float xspeed = 1;
    float yspeed = 3;

    public void update() {
        x += xspeed;
        y += yspeed;
    }

    public void edges() {
        if ( y < 0 || y > height ) {
            yspeed *= -1;
        }
        if ( x < 0 ) {
            reset();
        }
        if ( x > width ) {
            reset();
        }
    }

    public void reset() {
        x = width/2;
        y = height/2; 
    }

    public void show() {
        fill(255);
        ellipse( x, y, 24, 24 );
    }

}
  public void settings() {  size( 600, 400 ); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "literate_enigma" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
