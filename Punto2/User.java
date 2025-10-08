package Punto2;

public class User {
    private String email,contactNumber,name;
    public boolean preference;//if true the notifications will be send to email
    private float balance;

    public User (String email, String contactNumber,String name,boolean preference,float balance){
        this.contactNumber = contactNumber;
        this.email = email;
        this.name = name;
        this.balance = balance;
    }
    
    public void setBalance(float balance){
        this.balance = balance;
    }
    public void setPreferenceToSms(){
        this.preference = false;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setContactNumber(String contactNumber){
        this.contactNumber = contactNumber;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getName(){
        return name;
    }
    public String getContactumber(){
        return contactNumber;
    }
    public String getEmail(){
        return email;
    }
    public float getBalance(){
        return balance;
    }
}
