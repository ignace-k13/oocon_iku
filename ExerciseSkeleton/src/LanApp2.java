public class LanApp2 {

    public static void main(String[] args) {

        //Creating the nodes...
        WorkStation w1 = new WorkStation("abc123");
        PrintServer p1 = new PrintServer("fre943");
        Node n2 = new Node("jhy903");
        Node n3 = new Node("klm009");
        PrintServer p2 = new PrintServer("frd555");

        //Connecting the nodes...
        w1.setNextNode(p1);
        p1.setNextNode(n2);
        n2.setNextNode(n3);
        n3.setNextNode(p2);
        p2.setNextNode(w1);

        //Creating a packet...
        Packet aPacket = new Packet("Jippie, it works !!", "frd555");

        //Inserting the packet into the network...
        w1.originate(aPacket);
    }
}