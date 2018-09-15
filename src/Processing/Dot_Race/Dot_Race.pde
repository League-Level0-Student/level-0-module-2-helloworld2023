int x = 100;
void setup(){
  size (800, 200);
 background (0);
}
void draw(){
ellipse(x, 100, 100, 100);
fill(47, 245, 180);
if(mousePressed){
background(0);
ellipse(x, 100, 100, 100);
x = x+10;
}
if(x==800){
 playSound();
}
}
import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
    if (!soundPlayed) {
        Minim minim = new Minim(this);
        AudioSample sound = minim.loadSample("ding.wav");
        sound.trigger();
        soundPlayed = true;
    
}
}