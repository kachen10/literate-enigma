class Puck {
    float x = width/2;
    float y = height/2;
    float xspeed = 1;
    float yspeed = 3;

    void update() {
        x += xspeed;
        y += yspeed;
    }

    void edges() {
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

    void reset() {
        x = width/2;
        y = height/2; 
    }

    void show() {
        fill(255);
        ellipse( x, y, 24, 24 );
    }

}
