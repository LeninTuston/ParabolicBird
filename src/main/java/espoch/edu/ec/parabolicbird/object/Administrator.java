package espoch.edu.ec.parabolicbird.object;

public class Administrator {
private String name;
private String pasword;
private MatchManager manager;
private Ranking ranking;

//constrcutor

    public Administrator(String name, String pasword, MatchManager manager, Ranking ranking) {
        this.name = name;
        this.pasword = pasword;
        this.manager = manager;
        this.ranking = ranking;
    }
//set and get

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public MatchManager getManager() {
        return manager;
    }

    public void setManager(MatchManager manager) {
        this.manager = manager;
    }

    public Ranking getRanking() {
        return ranking;
    }

    public void setRanking(Ranking ranking) {
        this.ranking = ranking;
    }
    

}
