/*
 * UseStringLog.java 1.0 Sep 15, 2015
 *
 * Daniel Owen
 */

package inClassAssigments;


//----------------------------------------------------------------------------
//UseStringLog.java           by Dale/Joyce/Weems                   Chapter 2
//
//Simple example of the use of a StringLog.
//----------------------------------------------------------------------------

public class UseStringLog {

    public static void main(String[] args) {
        StringLogInterface sample;
        sample = new LinkedStringLog2("Example Use");
        sample.insert("Elvis");
        sample.insert("King Louis XII");
        sample.insert("Captain Kirk");
        sample.insertLast("Daniel Owen");
        System.out.println(sample);
        System.out.println("The size of the log is " + sample.size());
        System.out.println("Elvis is in the log: " + sample.contains("Elvis"));
        System.out.println("Santa is in the log: " + sample.contains("Santa"));

        sample.clear();
        System.out.println(sample.size());
    }
}
