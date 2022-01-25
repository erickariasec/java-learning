package JavaBasics.S17_ConstructorAndMethodsOverloading.domain;

import java.util.Date;

public class Client extends Person{
    private int idClient;
    private Date registrationDate;
    private boolean vip;
    private static int counterClient;

    public Client(String name, char genre, int age, String address, Date registrationDate, boolean vip){
        super(name, genre, age, address);   // super must be always the first line for inheritance - It calls Parent Class Constructor
        idClient = ++JavaBasics.S17_ConstructorAndMethodsOverloading.domain.Client.counterClient;
        this.registrationDate = registrationDate;
        this.vip = vip;
    }

    public int getIdClient(){   // GETTER
        return idClient;
    }

    public Date getRegistrationDate(){  // GETTER
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {    // SETTER
        this.registrationDate = registrationDate;
    }

    public boolean isVip(){     // GETTER for Boolean
        return vip;
    }

    public void setVip(boolean vip){    // SETTER
        this.vip = vip;
    }

    @Override   // Overrides toString Person Parent Class
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("idClient=").append(idClient);
        sb.append(", registrationDate=").append(registrationDate);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());   // It will call what is inside toString from Person Parent Class
        sb.append('}');
        return sb.toString();
    }
}
