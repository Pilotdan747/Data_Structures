/*
 * StringLogInterface.java 1.0 Sep 15, 2015
 *
 * Daniel Owen
 */
package inClassAssigments;


//----------------------------------------------------------------------
//StringLogInterface.java     by Dale/Joyce/Weems             Chapter 2
//
//Interface for a class that implements a log of Strings.
//A log "remembers" the elements placed into it.
//
//A log must have a "name".
//----------------------------------------------------------------------

public interface StringLogInterface {

    void clear();
    // Makes this StringLog empty.

    boolean contains(String element);
    // Returns true if element is in this StringLog,
    // otherwise returns false.
    // Ignores case differences when doing string comparison.

    String getName();
    // Returns the name of this StringLog.

    void insert(String element);
    // Precondition: This StringLog is not full.
    //
    // Places element into this StringLog.

    void insertLast(String element);
    // Precondition: This StringLog is not full.
    //
    // Places element at the end of this StringLog.

    boolean isFull();
    // Returns true if this StringLog is full, otherwise returns false.

    int size();
    // Returns the number of Strings in this StringLog.

    @Override
    String toString();
    // Returns a nicely formatted string representing this StringLog.
}