/*
 * LLStringNode.java 1.0 Sep 15, 2015
 *
 * Daniel Owen
 */
package inClassAssigments;


//----------------------------------------------------------------------------
//LLStringNode.java            by Dale/Joyce/Weems                  Chapter 2
//
//Implements String nodes for a Linked List.
//----------------------------------------------------------------------------

public class LLStringNode {

    private String info;
    private LLStringNode link;

    public LLStringNode(String info) {
        this.info = info;
        link = null;
    }

    public String getInfo()
    // Returns info string of this LLStringNode.
    {
        return info;
    }

    public LLStringNode getLink()
    // Returns link of this LLStringNode.
    {
        return link;
    }

    public void setInfo(String info)
    // Sets info string of this LLStringNode.
    {
        this.info = info;
    }

    public void setLink(LLStringNode link)
    // Sets link of this LLStringNode.
    {
        this.link = link;
    }
}
