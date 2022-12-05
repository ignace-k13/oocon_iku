public class PrintServer extends PacketHandler {

    public PrintServer() {
    }

    public PrintServer(String anAddress) {
        super(anAddress);
    }

    public void print(Packet p){
        System.out.println("I (" + address + ") PRINTED your message: " + p.getContents());
    }

    public void handle(Packet p) {
       this.print(p);
    }

}
