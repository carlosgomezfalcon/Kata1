package kata1;

import java.time.LocalDate;

public class Kata1 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1999, 10, 30);
        Person person = new Person("Carlos", date);
        System.out.println(person.getName() + " tiene " + person.getAge() 
                            + " años.");
    }
    
}       
            