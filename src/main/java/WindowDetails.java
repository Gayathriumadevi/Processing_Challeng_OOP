public class WindowDetails {
    private int WIDTH;
    private int HEIGHT;
    private int DIAME;

    public WindowDetails(int WIDTH1, int HEIGHT1, int DIAME1) {
        this.WIDTH = WIDTH1;
        this.HEIGHT = HEIGHT1;
        this.DIAME = DIAME1;
    }

    public WindowDetails() {
        this.WIDTH =0;
        this.HEIGHT = 0;
        this.DIAME =  0;
    }

    public int getWIDTH() {

        return WIDTH;
    }

    public void setWIDTH(int WIDTH) {

        this.WIDTH = WIDTH;
    }

    public int getHEIGHT() {

        return HEIGHT;
    }

    public void setHEIGHT(int HEIGHT) {

        this.HEIGHT = HEIGHT;
    }

    public int getDIAME() {
        return DIAME;
    }

    public void setDIAME(int DIAME) {

        this.DIAME = DIAME;
    }
}
