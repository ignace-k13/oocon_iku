public abstract class PacketHandler extends Node {

    public PacketHandler() {
    }

    public PacketHandler(String anAddress) {
    	super(anAddress);
    }

    public void receive(Packet p) {
		if (this.address.equals(p.getDestinationAddress())) {
			this.handle(p);
			Packet confirmation = new Packet("Packet was processed ok.",p.originAddress);
			confirmation.setOriginAddress(this.address);
			this.send(confirmation);
		} else {
			System.out.println("I am not the destination, sending the packet further");
			this.send(p);
		}
    }

    public abstract void handle(Packet p);


}
