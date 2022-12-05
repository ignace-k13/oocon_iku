public class FileServer extends PacketHandler {

    public FileServer() {
    }

    public FileServer(String anAddress) {
        super(anAddress);
    }

    public void save(Packet p){
        System.out.println("I (" + address + ") SAVED your message: " + p.getContents());

    }
    public void handle(Packet p) {
       this.save(p);
    }


}
