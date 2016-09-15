package kata1;

import java.util.Date;

public class Person {

    private final String name;
    private final Date birthdate;

    public Person(String name, Date birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }
    
    public String getName() {
        return name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public int getAge(){
        long year = 365*24*60*60*1000L;
        return (int) ((new Date().getTime()-birthdate.getTime())/year);
    }
    
    
}
