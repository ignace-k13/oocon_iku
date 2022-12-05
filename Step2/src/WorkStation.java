public class WorkStation extends Node {

    public WorkStation() { }

    public WorkStation(String anAddress) {
        super(anAddress);
    }

    public void originate(Packet p) {
        System.out.println("Workstation " + this.address + " is introducing the packet in the LAN.");
        this.send(p);
    }

}
