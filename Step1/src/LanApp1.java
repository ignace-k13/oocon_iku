
public class LanApp1 {

    public static void main(String[] args) {

        //Creating the nodes...
        Node n1 = new Node();
        PrintServer p1 = new PrintServer();
        Node n2 = new Node();
        Node n3 = new Node();
        PrintServer p2 = new PrintServer();

        //Giving the nodes an address....
        n1.setAddress("abc123");
        p1.setAddress("fre943");
        n2.setAddress("jhy903");
        n3.setAddress("klm009");
        p2.setAddress("frd555");

        //Connecting the nodes...
        n1.setNextNode(p1);
        p1.setNextNode(n2);
        n2.setNextNode(n3);
        n3.setNextNode(p2);
        p2.setNextNode(n1);

        //Creating a packet...
        Packet aPacket = new Packet("Jippie, it works !!", "frd555");

        //Inserting the packet into the network...
        n1.receive(aPacket);
    }
}