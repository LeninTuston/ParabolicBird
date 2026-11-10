package espoch.edu.ec.parabolicbird;
// @author tmu12

import espoch.edu.ec.parabolicbird.Enums.TypeParabola;
import espoch.edu.ec.parabolicbird.implementation.Projectiles;
import espoch.edu.ec.parabolicbird.implementation.Simulations;
import espoch.edu.ec.parabolicbird.implementation.Users;
import espoch.edu.ec.parabolicbird.interfaz.InterfazProjectile;
import espoch.edu.ec.parabolicbird.interfaz.InterfazSimulation;
import espoch.edu.ec.parabolicbird.interfaz.InterfazUser;
import espoch.edu.ec.parabolicbird.object.Exercise;
import espoch.edu.ec.parabolicbird.object.Projectile;
import espoch.edu.ec.parabolicbird.object.Simulation;
import espoch.edu.ec.parabolicbird.object.User;

public class ParabolicBird {

    public static void main(String[] args) {

        User userOne = new User("Lenin");
        InterfazUser usersOne = new Users();
        usersOne.enterName(userOne);

        Projectile projectil = new Projectile(20, 43, 0, 0);
        InterfazProjectile projectiles = new Projectiles();
        projectiles.calcularVox(projectil);
        projectiles.calcularVoy(projectil);

        Exercise exercise = new Exercise(01, projectil, TypeParabola.COMPLETE);
        Simulation s = new Simulation(exercise);
        InterfazSimulation simulations = new Simulations();
        simulations.calculos(s, 0);

    }
}
