package pweb.business;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import sun.org.mozilla.javascript.internal.ast.ForInLoop;

public class User implements Serializable {

    private String firstName;
    private String lastName;
    private String email;
    private String direccion;
    private String telefono;
    private String referido;
    

    public User() {
        firstName = "";
        lastName = "";
        email = "";
        direccion="";
        telefono="";
        referido="";
       
    }

    public User(String firstName, String lastName, String email, String direccion, String telefono, String referido) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.direccion=direccion;
        this.telefono=telefono;
        this.referido=referido;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
     public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getTelefono (){
        return telefono;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    
    public String getReferido(){
        return referido;
        
    }
    
    public void setReferido(String referido){
        this.referido=referido;
    }
    
}
