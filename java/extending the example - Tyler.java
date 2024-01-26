/*
extending the example
Tyler Wong
11/15/2023
*/
public class Main {
    public static void main(String[] args) {
        Ball ball1=new Ball();
        ball1.posx=10;
        ball1.posy=5;
        ball1.posz=9;
        ball1.velx=5;
        ball1.vely=8;
        ball1.velz=7;
        System.out.println("pos x "+ball1.posx+"\npos y "+ball1.posy+"\npos z "+ball1.posz+"\nvel x "+ball1.velx+"\nvel y "+ball1.vely+"\nvel z "+ball1.velz);
    }
}
class Ball {
    int posx;
    int posy;
    int posz;
    int velx;
    int vely;
    int velz;
}
