package espoch.edu.ec.parabolicbird.implementation;

import espoch.edu.ec.parabolicbird.interfaz.InterfazProjectile;
import espoch.edu.ec.parabolicbird.object.Projectile;

public class Projectiles implements InterfazProjectile {
    public boolean calcularVox(Projectile projectile){
        double vx=projectile.getVo()*Math.cos(Math.toRadians(projectile.getAngle()));
        projectile.setVoX(vx);
        return true;
    }
    
    public boolean calcularVoy(Projectile projectile){
        double vy=projectile.getVo()*Math.sin(Math.toRadians(projectile.getAngle()));
        projectile.setVoY(vy);
        return true;
    }
}
