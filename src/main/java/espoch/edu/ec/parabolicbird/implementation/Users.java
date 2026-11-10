package espoch.edu.ec.parabolicbird.implementation;

import espoch.edu.ec.parabolicbird.interfaz.InterfazUser;
import espoch.edu.ec.parabolicbird.object.User;

public class Users implements InterfazUser {
    public boolean enterName(User user){
        String name=user.getName();
        boolean ax=false;
        if (name!=null&&!name.trim().isEmpty()) {
            System.out.println("Bienvenido "+user.getName());
            ax=true;
        }
        
        return ax;
    }
}
