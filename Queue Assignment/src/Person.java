
/*
 * Person.java 1.0 Sep 30, 2015
 *
 * Daniel Owen
 */

/**
 * @author Daniel Owen
 *
 * @version 1.0
 *
 */

// ADT to hold name, age, and gender
public class Person {

    /**
     * /* @author Daniel Owen
     */

    private String lastName;
    private String firstName;
    private int age;
    private boolean isMale;

    public Person(String aLastName, String aFirstName, int aAge, boolean aIsMale) {
        lastName = aLastName;
        firstName = aFirstName;
        age = aAge;
        isMale = aIsMale;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setAge(int aAge) {
        age = aAge;
    }

    public void setFirstName(String aFirstName) {
        firstName = aFirstName;
    }

    public void setLastName(String aLastName) {
        lastName = aLastName;
    }

    public void setMale(boolean aIsMale) {
        isMale = aIsMale;
    }

    @Override
    public String toString() {
        String gender;

        if (isMale) {
            gender = "M";
        } else {
            gender = "F";
        }

        return "" + lastName + " " + firstName + " " + age + " " + gender + "\n";
    }

}
