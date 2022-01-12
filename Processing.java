import processing.core.PApplet;
public class Processing extends PApplet {
    public static void main(String[] args){
        PApplet.main("Processing");

    }
    int x;
    int y;
    int z;
    int k;
    public void settings(){
        size(500,500);
        x=0;
        y=0;
        z=0;
        k=0;


    }
    public void draw(){
        ellipse(x,500/5,25,25);
        x=x+1;
        ellipse(y,500*2/5,25,25);
        y=y+2;
        ellipse(z,500*3/5,25,25);
        z=z+3;
        ellipse(k,500*4/5,25,25);
        k=k+4;


    }


}
