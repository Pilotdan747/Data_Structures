//----------------------------------------------------------------------------
// LLNode.java            by Dale/Joyce/Weems                  Chapter 3
//
// Implements <T> nodes for a Linked List.
//----------------------------------------------------------------------------

public class LLNode<T> {

    private LLNode<T> link;
    private T info;

    public LLNode(T info) {
        this.info = info;
        link = null;
    }

    public T getInfo()
    // Returns info of this LLONode.
    {
        return info;
    }

    public LLNode<T> getLink()
    // Returns link of this LLNode.
    {
        return link;
    }

    public void setInfo(T info)
    // Sets info of this LLNode.
    {
        this.info = info;
    }

    public void setLink(LLNode<T> link)
    // Sets link of this LLNode.
    {
        this.link = link;
    }
}
