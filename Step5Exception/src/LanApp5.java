
public class LanApp5 {

    public static void main(String[] args) {

        //Creating the nodes...
        WorkStation w1 = new WorkStation("abc123");
        PrintServer p1 = new PrintServer("fre943");
        Node n2 = new Node("jhy903");
        FileServer f1 = new FileServer("sdt287");
        Node n3 = new Node("klm009");
        WorkStation w2 = new WorkStation("gek762");
        PrintServer p2 = new PrintServer("frd555");
        FileServer f2 = new FileServer("alk309");
        TapeStreamer t1 = new TapeStreamer("jkl456");

        //Connecting the nodes...
        w1.setNextNode(p1);
        p1.setNextNode(n2);
        n2.setNextNode(f1);
        f1.setNextNode(n3);
        n3.setNextNode(w2);
        w2.setNextNode(p2);
        p2.setNextNode(f2);
        f2.setNextNode(t1);
        t1.setNextNode(w1);

        //Creating a packet...
        Packet aPacket = new Packet("Jippie, it works !!", "where?");

        //Inserting the packet into the network...
        try {
            w1.originate(aPacket);
        } catch (DestinationNotFoundException e) {
            System.out.println("Exception caught: "+e.getMessage());
        }
    }
}