import processing.core.PApplet;

public class Main extends PApplet {
    WindowDetails windowdetails = new WindowDetails(640,480,10);
    int x1,x2,x3,x4;
    public static void main(String[] args) { PApplet.main("Main",args); }
    @Override
    public void settings() {
        super.settings();
        size(windowdetails.getWIDTH(),windowdetails.getHEIGHT());
    }

    @Override
    public void draw() {
        //paintwhite();
        drawcircle();
    }

    private void drawcircle() {
        ellipse(x1,windowdetails.getHEIGHT()/5,windowdetails.getDIAME(),windowdetails.getDIAME());
        ellipse(x2,2*windowdetails.getHEIGHT()/5, windowdetails.getDIAME(),windowdetails.getDIAME());
        ellipse(x3,3*windowdetails.getHEIGHT()/5,windowdetails.getDIAME(),windowdetails.getDIAME());
        ellipse(x4,4*windowdetails.getHEIGHT()/5,windowdetails.getDIAME(),windowdetails.getDIAME());
        x1++;
        x2 = x2+2;
        x3 = x3+3;
        x4 = x4+4;

    }

    private void paintwhite() {
        background(255);
    }

    @Override
    public void setup() {
    }

}
