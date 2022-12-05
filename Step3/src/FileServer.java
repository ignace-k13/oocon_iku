public class FileServer extends Node {

    public FileServer() {
    }

    public FileServer(String anAddress) {
        super(anAddress);
    }

    public void save(Packet p) {
        System.out.println("I (" + address + ") SAVED your message: "
                + p.getContents());
    }

    public void receive(Packet p) {
        if (this.address.equals(p.getDestinationAddress())) {
            this.save(p);
        } else {
            System.out.println("I am not the destination, sending the packet further");
            this.send(p);
        }
    }


}
