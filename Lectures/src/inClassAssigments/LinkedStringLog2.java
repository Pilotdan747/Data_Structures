/*
 * LinkedStringLog.java 1.0 Sep 17, 2015
 *
 * Daniel Owen
 */
package inClassAssigments;


//----------------------------------------------------------------------
//LinkedStringLog.java       by Dale/Joyce/Weems              Chapter 2
//
//Implements StringLogInterface using a linked list
//of LLStringNode to hold the log strings.
//----------------------------------------------------------------------

public class LinkedStringLog2 implements StringLogInterface {

    protected LLStringNode log; // reference to first node of linked
                                // list that holds the StringLog strings
    protected String name; // name of this StringLog

    protected int size;

    public LinkedStringLog2(String name)
    // Instantiates and returns a reference to an empty StringLog object
    // with name "name".
    {
        log = null;
        this.name = name;
    }

    @Override
    public void clear()
    // Makes this StringLog empty.
    {
        log = null;

        size = 0;
    }

    @Override
    public boolean contains(String element)
    // Returns true if element is in this StringLog,
    // otherwise returns false.
    // Ignores case difference when doing string comparison.
    {
        LLStringNode node;
        node = log;

        while (node != null) {
            if (element.equalsIgnoreCase(node.getInfo())) {
                return true;
            } else {
                node = node.getLink();
            }
        }

        return false;
    }

    @Override
    public String getName()
    // Returns the name of this StringLog.
    {
        return name;
    }

    @Override
    public void insert(String element)
    // Precondition: This StringLog is not full.
    //
    // Places element into this StringLog.
    {
        LLStringNode newNode = new LLStringNode(element);
        newNode.setLink(log);
        log = newNode;

        size++;
    }

    @Override
    public void insertLast(String element)
    // Precondition: This StringLog is not full.
    //
    // Places element at the end of this StringLog.
    {
        LLStringNode node;

        if (log == null) {
            LLStringNode newNode = new LLStringNode(element);
            log = newNode;
        } else {

            node = log;

            while (node.getLink() != null) {
                node = node.getLink();
            }

            LLStringNode newNode = new LLStringNode(element);
            node.setLink(newNode);
        }

        size++;
    }

    @Override
    public boolean isFull()
    // Returns true if this StringLog is full, false otherwise.
    {
        return false;
    }

    @Override
    public int size()
    // Returns the number of Strings in this StringLog.
    {

        return size;
    }

    @Override
    public String toString()
    // Returns a nicely formatted string representing this StringLog.
    {
        String logString = "Log: " + name + "\n\n";
        LLStringNode node;
        node = log;
        int count = 0;

        while (node != null) {
            count++;
            logString = logString + count + ". " + node.getInfo() + "\n";
            node = node.getLink();
        }

        return logString;
    }
}
