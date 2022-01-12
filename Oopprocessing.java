import processing.core.PApplet;
public class Oopprocessing extends PApplet {
    public static void main(String[] args){
        PApplet.main("Oopprocessing");
    }
    public void settings(){
        size(500,500);
    }
    Ball b,b1,b2,b3;
    public void setup(){
        b=new Ball(0,500/5,25,1);
        b1=new Ball(0,500*2/5,25,2);
        b2= new Ball(0,500*3/5,25,3);
        b3= new Ball(0,500*4/5,25,4);
    }
    public void draw(){
        b.circle();
        b1.circle();
        b2.circle();
        b3.circle();
    }
    class Ball {
        int x;
        float y;
        int z;
        int m;
        Ball(int x, float y, int z,int m){
            this.x=x;
            this.y=y;
            this.z=z;
            this.m=m;
        }
        public void circle(){
            ellipse(x,y,z,z);
            x = x+m;
        }
    }
}




