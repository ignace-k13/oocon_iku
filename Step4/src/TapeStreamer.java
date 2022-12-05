public class TapeStreamer extends PacketHandler {

    public TapeStreamer() {
    }

    public TapeStreamer(String anAddress) {
        super(anAddress);
    }


    public void handle(Packet p) {
        System.out.println("I (" + address + ") STREAMED your message TO TAPE: " + p.getContents());
    }

}
