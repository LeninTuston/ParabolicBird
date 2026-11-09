package espoch.edu.ec.parabolicbird.object;

public class Match {

    private int id;
    private String date;
    private User user;
    private String mode;
    private Exercise exercise;

//constructor
    public Match(int id, String date, User user, String mode, Exercise exercise) {
        this.id = id;
        this.date = date;
        this.user = user;
        this.mode = mode;
        this.exercise = exercise;
    }
//set and get

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

}
