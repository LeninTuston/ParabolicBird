package espoch.edu.ec.parabolicbird.object;

import espoch.edu.ec.parabolicbird.Enums.TypeParabola;

public class Exercise {

    private int id;
    private Projectile projectile;
    private TypeParabola typeParabola;
    
    //constrcutor

    public Exercise(int id, Projectile projectile, TypeParabola typeParabola) {
        this.id = id;
        this.projectile = projectile;
        this.typeParabola = typeParabola;
    }
    //set and get

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Projectile getProjectile() {
        return projectile;
    }

    public void setProjectile(Projectile projectile) {
        this.projectile = projectile;
    }

    public TypeParabola getTypeParabola() {
        return typeParabola;
    }

    public void setTypeParabola(TypeParabola typeParabola) {
        this.typeParabola = typeParabola;
    }
    
}
