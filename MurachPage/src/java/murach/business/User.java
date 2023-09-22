package murach.business;
import java.io.Serializable;
/**
 *
 * @author admin
 */
public class User implements Serializable{
    private String firstName;
    private String lastName; 
    private String email;
    private String dateOfbirth;
    
    public User(){
        firstName="";
        lastName="";
        email="";
        dateOfbirth="";
    }
    
    public User(String firstName, String lastName, String email, String dateOfbirth){
        this.firstName = firstName;
        this.lastName=lastName;
        this.email=email;
        this.dateOfbirth = dateOfbirth;
    }
    
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    
        
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    
        
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    
    public String getDateOfbirth(){
        return dateOfbirth;
    }
    public void setDateOfbirth(String dateOfbirth)
    {
        this.dateOfbirth=dateOfbirth;
    }        
}