public class Node {

    // the attributes:
    String address;
    Node nextNode;

    // the constructors (do not touch!):
    public Node() { }

    public Node(String anAddress) {
        address = anAddress;
    }

    // the get & set methods:
    public String getAddress() {
        return address;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setAddress(String anAddress) {
        address = anAddress;
    }

    public void setNextNode(Node aNode) {
        nextNode = aNode;
    }


    // the other methods:
    public void receive(Packet p) {
        //this is default behaviour for all kinds of nodes;
        //subclasses will probably override this method to do something special
    }

    public void send(Packet p) {
        //this is default behaviour for all kinds of nodes.
    }


}
