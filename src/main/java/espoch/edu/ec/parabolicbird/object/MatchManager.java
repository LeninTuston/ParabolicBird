package espoch.edu.ec.parabolicbird.object;

import java.util.ArrayList;
import java.util.List;

public class MatchManager {

    private List<Match> matchies;
    private String filePath;

//constrcutor
    public MatchManager(String filePath) {
        this.matchies = new ArrayList<>();
        this.filePath = filePath;
    }
//set and get

    public List<Match> getMatchies() {
        return matchies;
    }

    public void setMatchies(List<Match> matchies) {
        this.matchies = matchies;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

}
