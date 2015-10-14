import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/*
 * HelpDeskRunner.java 1.0 Sep 29, 2015
 *
 * Daniel Owen
 */

/**
 * @author Daniel Owen
 *
 * @version 1.0
 *
 */
public class HelpDeskRunner {

    /**
     * Description...
     *
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO Auto-generated method stub

        File input = new File("input.txt");
        Scanner reader = new Scanner(input);

        HelpDesk desk = new HelpDesk();

        int runTime = reader.nextInt();

        reader.close();

        for (int i = 0; i < runTime; i++) {
            desk.step();
        }

    }
}
