package espoch.edu.ec.parabolicbird.object;

import espoch.edu.ec.parabolicbird.Enums.TypeParabola;

public class ProposedExercise extends Exercise {

    private String statement;
    private double[] userResponses;

//constrcutor
    public ProposedExercise(String statement, double[] userResponses, int id, Projectile projectile, TypeParabola typeParabola) {
        super(id, projectile, typeParabola);
        this.statement = statement;
        this.userResponses = userResponses;
    }
//set and get

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public double[] getUserResponses() {
        return userResponses;
    }

    public void setUserResponses(double[] userResponses) {
        this.userResponses = userResponses;
    }

}
