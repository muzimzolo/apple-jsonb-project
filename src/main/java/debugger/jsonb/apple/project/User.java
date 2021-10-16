package debugger.jsonb.apple.project;

import java.util.Date;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

public class User {
    
    private int id;
    private String name;
    private String email;
    private Date dateOfBirth;
    public long creditCardNumber;
    public final String USER_TYPE = "admin";
    public static int counter = 0;
    public transient boolean isMember=false;
    

    public User(int id, String name, String email, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public User() {
    }

    private long getCreditCardNumber() {
        return creditCardNumber;
    }

    private void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", email=" + email + ", dateOfBirth=" + dateOfBirth + '}';
    }
    
    
    
    public static void main(String[] args) {
        User user = new User(123, "jsontester", "test@gmail.com", new Date(23423));
        user.creditCardNumber=324334532;
        user.setDateOfBirth(new Date(435434));
        Jsonb jsonb = JsonbBuilder.create();
       String result =   jsonb.toJson(user);
        System.out.println("result:  "+result);
    }
    
}