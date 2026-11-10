
package espoch.edu.ec.parabolicbird.implementation;

import espoch.edu.ec.parabolicbird.interfaz.InterfazSimulation;
import espoch.edu.ec.parabolicbird.object.Projectile;
import espoch.edu.ec.parabolicbird.object.Simulation;

public class Simulations implements InterfazSimulation{
    public void calculos(Simulation simulation,double instant){
        Projectile cont=simulation.getExercise().getProjectile();
        double g=cont.getGravity();
        double tv=(2*cont.getVoY())/g;
        double Hmax=(cont.getVoY()*cont.getVoY())/(2*g);
        double d=cont.getVoX()*tv;
        double ts=cont.getVoY()/g;
        simulation.setAltMax(Hmax);
        simulation.setTimeS(ts);
        simulation.setX(d);
        simulation.setTimeV(tv);
        System.out.println("Flight time= "+simulation.getTimeV()
        +"\nMaximum height= "+simulation.getAltMax()
        +"\nTime up= "+simulation.getTimeS()+"\nDintance= "+simulation.getX()
        +"\nVox= "+cont.getVoX()+"\nVoy= "+cont.getVoY()+"\nVo= "+cont.getVo());
        
    }
    public void calcularPosicion(double instant){
        
    }
}
