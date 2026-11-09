package espoch.edu.ec.parabolicbird.object;

public class Simulation {

    private Exercise exercise;
    private double altMax = 0.00;
    private double timeS = 0.00;
    private double timeV = 0.00;
    private double X = 0.00;
    private double vf = 0.00;
    private double instant = 0.00;
    private double currentPositionX = 0.00;
    private double currentPositionY = 0.00;

//constrcutor
    public Simulation(Exercise exercise) {
        this.exercise = exercise;
    }

    //set and get
    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public double getAltMax() {
        return altMax;
    }

    public void setAltMax(double altMax) {
        this.altMax = altMax;
    }

    public double getTimeS() {
        return timeS;
    }

    public void setTimeS(double timeS) {
        this.timeS = timeS;
    }

    public double getTimeV() {
        return timeV;
    }

    public void setTimeV(double timeV) {
        this.timeV = timeV;
    }

    public double getX() {
        return X;
    }

    public void setX(double X) {
        this.X = X;
    }

    public double getVf() {
        return vf;
    }

    public void setVf(double vf) {
        this.vf = vf;
    }

    public double getInstant() {
        return instant;
    }

    public void setInstant(double instant) {
        this.instant = instant;
    }

    public double getCurrentPositionX() {
        return currentPositionX;
    }

    public void setCurrentPositionX(double currentPositionX) {
        this.currentPositionX = currentPositionX;
    }

    public double getCurrentPositionY() {
        return currentPositionY;
    }

    public void setCurrentPositionY(double currentPositionY) {
        this.currentPositionY = currentPositionY;
    }

}
