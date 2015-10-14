package emailProblem;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


/**
 * A class to take names, ages, and genders from a data file and write them into
 * an email using a template.
 *
 * @author Daniel Owen
 *
 */
public class EmailMerge {

    /**
     * Main test method - all program executions are done inside this method
     *
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {

        String name;
        String emailTemplateStr = "";
        String outputString = "";
        String nameTarget = "<<N>>";
        String ageTarget = "<<A>>";
        String genderTarget = "<<G>>";
        String age;
        String gender;

        int count;
        boolean canFileGo = false;

        File inputFile = new File("Email_Files/Test_3/Input_Data.txt");
        File emailTemplate = new File("Email_Template.txt");
        File outputFile;

        Scanner reader = new Scanner(inputFile);
        Scanner templateReader = new Scanner(emailTemplate);

        PrintWriter outputStream;

        while (templateReader.hasNext()) {
            emailTemplateStr = emailTemplateStr + templateReader.nextLine() + "\n";
        }

        while (reader.hasNext()) {
            count = 1;

            outputString = emailTemplateStr;

            name = reader.next();
            age = reader.next();
            gender = reader.next();

            outputFile = new File("Email_Files/Test_3/" + name + ".txt");

            do {
                if (outputFile.isFile()) {
                    canFileGo = false;
                    outputFile = new File("Email_Files/Test_3/" + name + "-" + count + ".txt");
                    count++;
                } else {
                    canFileGo = true;
                    break;
                }
            } while (!canFileGo);

            outputStream = new PrintWriter(outputFile);

            outputString = outputString.replace(nameTarget, name);
            outputString = outputString.replace(ageTarget, age);
            outputString = outputString.replace(genderTarget, gender);

            outputStream.write(outputString);

            outputStream.close();

            outputFile = null;
        }

        reader.close();
        templateReader.close();
    }
}
