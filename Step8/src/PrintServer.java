public class PrintServer extends PacketHandler {

    public PrintServer() {
    }

    public PrintServer(String anAddress) {
        super(anAddress);
    }

    public void handle(Packet p) {
        System.out.println("I (" + address + ") PRINTED your message: " + p.getContents());
    }

}
