public class LanApp3 {

    public static void main(String[] args) {

        //Creating the nodes...
        WorkStation w1 = new WorkStation("abc123");
        PrintServer p1 = new PrintServer("fre943");
        Node n2 = new Node("jhy903");
        FileServer f1 = new FileServer("sdt287");
        Node n3 = new Node("klm009");
        PrintServer p2 = new PrintServer("frd555");
        FileServer f2 = new FileServer("alk309");

        //Connecting the nodes...
        w1.setNextNode(p1);
        p1.setNextNode(n2);
        n2.setNextNode(f1);
        f1.setNextNode(n3);
        n3.setNextNode(p2);
        p2.setNextNode(f2);
        f2.setNextNode(w1);

        //Creating a packet...
        Packet aPacket = new Packet("Jippie, it works !!", "alk309");

        //Inserting the packet into the network...
        w1.originate(aPacket);
    }
}
