Puck puck;
Paddle left;
Paddle right;
int p1;
int p2;


void setup() {
    size( 600, 400 );
    puck = new Puck();
    left = new Paddle(true);
    right = new Paddle(false);
   
}

void draw() {
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

void keyPressed() {
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

void keyReleased() {
    left.move(0);
    right.move(0);
}