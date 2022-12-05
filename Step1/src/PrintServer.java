public class PrintServer extends Node {

	// the attributes:


    // the constructors (do not touch!):
    public PrintServer() {
        super();
    }

    public PrintServer(String anAddress) {
        super(anAddress);
    }

	// the get & set methods:

	// the other methods:

    public void print(Packet p) {
        System.out.println("I (" + address + ") PRINTED your message: " + p.getContents());
    }

    public void receive(Packet p) {
        if (this.address.equals(p.getDestinationAddress())) {
            this.print(p);
        } else {
			System.out.println("I am not the destination, sending the packet further");
            this.send(p);
        }
    }

}
