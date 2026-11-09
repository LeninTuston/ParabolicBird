package espoch.edu.ec.parabolicbird.implementation;

import espoch.edu.ec.parabolicbird.object.User;

public class Users {
    public boolean enterName(User user){
        String name=user.getName();
        boolean ax=false;
        if (name!=null&&!name.trim().isEmpty()) {
            System.out.println("bienvenido "+user.getName());
            ax=true;
        }
        
        return ax;
    }
}
