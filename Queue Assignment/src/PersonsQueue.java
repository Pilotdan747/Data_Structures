import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


/*
 * PersonQueueRunner.java 1.0 Sep 30, 2015
 *
 * Daniel Owen
 */

/**
 * @author Daniel Owen
 *
 * @version 1.0
 *
 */
public class PersonsQueue {

    /**
     * Takes an input file of males and females sorted by last name and
     * reorganizes them into females first then males into output.txt
     *
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {

        File inputFile = new File("persons3.txt");
        @SuppressWarnings("resource")
        Scanner input = new Scanner(inputFile);

        // Using Person ADT to hold name age and gender

        UnboundedQueueInterface<Person> people = new LinkedUnbndQueue<Person>(); // Master
                                                                                 // Queue
        UnboundedQueueInterface<Person> males = new LinkedUnbndQueue<Person>();
        UnboundedQueueInterface<Person> females = new LinkedUnbndQueue<Person>();

        PrintWriter output = new PrintWriter("output3.txt");

        while (input.hasNext()) { // Input loop
            String lastName = input.next();
            String firstName = input.next();
            boolean isMale;

            if (input.next().equals("M")) {
                isMale = true;
            } else {
                isMale = false;
            }

            int age = Integer.parseInt(input.next());

            Person p = new Person(lastName, firstName, age, isMale);
            people.enqueue(p);
        }

        while (!people.isEmpty()) { // Read from master queue - add males to
                                    // males queue & females to female queue
            Person p = people.dequeue();

            if (p.isMale()) {
                males.enqueue(p);
            } else {
                females.enqueue(p);
            }
        }

        while (!females.isEmpty()) { // Output loop females
            output.write(females.dequeue().toString());
        }

        while (!males.isEmpty()) { // Output loop males
            output.write(males.dequeue().toString());
        }

        output.close();
    }
}
