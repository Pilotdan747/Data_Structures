import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/*
 * HelpDesk.java 1.0 Sep 29, 2015
 *
 * Daniel Owen
 */

/**
 * @author Daniel Owen
 *
 * @version 1.0
 *
 */
public class HelpDesk {

    /**
     * /* @author Daniel Owen
     */

    private int time;

    Scanner reader;
    File input = new File("input.txt");

    public HelpDesk() throws FileNotFoundException {
        reader = new Scanner(input);
        time = 0;
    }

    public void addStudent(String name, int course, int workload) {

    }

    public String getLog() {
        return "";
    }

    public int getTime() {
        return time;
    }

    public void step() {
        if (time == reader.nextInt()) {
            String name = reader.next();
            int classNumber = Integer.parseInt(reader.next());
            int workLoad = Integer.parseInt(reader.next());
        }
    }

    @Override
    public String toString() {
        return "";
    }
}
