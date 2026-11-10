package espoch.edu.ec.parabolicbird.object;

public class Projectile {

    private double vo;
    private double angle;
    private double gravity=9.8;
    private double voX=0;
    private double voY=0;
    private double initialPositionX;
    private double initialPositionY;

//constructor
    public Projectile(double vo, double angle,  double initialPositionX, double initialPositionY) {
        this.vo = vo;
        this.angle = angle;
        this.initialPositionX = initialPositionX;
        this.initialPositionY = initialPositionY;
    }

    //set y get
    public double getVo() {
        return vo;
    }

    public void setVo(double vo) {
        this.vo = vo;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public double getGravity() {
        return gravity;
    }

    public void setGravity(double gravity) {
        this.gravity = gravity;
    }

    public double getVoX() {
        return voX;
    }

    public void setVoX(double voX) {
        this.voX = voX;
    }

    public double getVoY() {
        return voY;
    }

    public void setVoY(double voY) {
        this.voY = voY;
    }

    public double getInitialPositionX() {
        return initialPositionX;
    }

    public void setInitialPositionX(double initialPositionX) {
        this.initialPositionX = initialPositionX;
    }

    public double getInitialPositionY() {
        return initialPositionY;
    }

    public void setInitialPositionY(double initialPositionY) {
        this.initialPositionY = initialPositionY;
    }

}
