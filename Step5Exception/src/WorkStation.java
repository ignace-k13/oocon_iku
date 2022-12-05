public class WorkStation extends Node {

    public WorkStation() {
    }

    public WorkStation(String anAddress) {
        super(anAddress);
    }

    public void originate(Packet p) throws DestinationNotFoundException {
        p.setOriginAddress(this.address);
        System.out.println("Workstation " + this.address + " is introducing the packet in the LAN.");
        this.send(p);
    }

    public void receive(Packet p) throws DestinationNotFoundException {
        if (this.address.equals(p.getOriginAddress())){
            throw new DestinationNotFoundException("Packet returned to origin, destination not found");
        } else {
            this.send(p);
        }
    }



}
