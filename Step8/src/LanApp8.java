public class LanApp8 {

    public static void main(String args[]) {

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

        Bridge b1 = new Bridge("ksh6576");
        Bridge b2 = new Bridge("hkjh5477");

        WorkStation w3 = new WorkStation("gdh397");
        PrintServer p3 = new PrintServer("lao890");
        Node n4 = new Node("gztsg45");
        FileServer f3 = new FileServer("ejklf8897");
        TapeStreamer t3 = new TapeStreamer("589hksb");

        //Connecting the nodes...
        w1.setNextNode(p1);
        p1.setNextNode(n2);
        n2.setNextNode(f1);
        f1.setNextNode(n3);
        n3.setNextNode(w2);
        w2.setNextNode(p2);
        p2.setNextNode(f2);
        f2.setNextNode(b1);
        b1.setNextNode(t1);
        t1.setNextNode(w1);

        b2.setNextNode(w3);
        w3.setNextNode(p3);
        p3.setNextNode(n4);
        n4.setNextNode(f3);
        f3.setNextNode(t3);
        t3.setNextNode(b2);

        b1.setNextBridge(b2);
        b2.setNextBridge(b1);

        //Creating a packet...
        Packet aPacket = new Packet("Jippie, it works !!", "lao890");

        //Inserting the packet into the network...
        w3.originate(aPacket);
    }
}
