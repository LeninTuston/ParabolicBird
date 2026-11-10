package espoch.edu.ec.parabolicbird.interfaz;

import espoch.edu.ec.parabolicbird.object.Projectile;
import espoch.edu.ec.parabolicbird.object.Simulation;

public interface InterfazSimulation {

    public void calculos(Simulation simulation, double instant);

    public void calcularPosicion(double instant);
}
