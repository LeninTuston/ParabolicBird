package espoch.edu.ec.parabolicbird.object;

public class Ranking {

    private User user;
    private int position;

//constructor
    public Ranking(User user, int position) {
        this.user = user;
        this.position = position;
    }

    //set and get
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

}
