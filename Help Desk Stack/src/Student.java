
/*
 * Student.java 1.0 Sep 30, 2015
 *
 * Daniel Owen
 */

/**
 * @author Daniel Owen
 *
 * @version 1.0
 *
 */
public class Student {

    /**
     * /* @author Daniel Owen
     */

    private String name;
    private int classNumber;
    private int workLoad;

    public Student(String aName, int aClassNumber, int aWorkLoad) {
        name = aName;
        classNumber = aClassNumber;
        workLoad = aWorkLoad;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public String getName() {
        return name;
    }

    public int getWorkLoad() {
        return workLoad;
    }

    public void setClassNumber(int aClassNumber) {
        classNumber = aClassNumber;
    }

    public void setName(String aName) {
        name = aName;
    }

    public void setWorkLoad(int aWorkLoad) {
        workLoad = aWorkLoad;
    }
}
