public class WorkStation extends Node {

    public WorkStation() {
    }

    public WorkStation(String anAddress) {
        super(anAddress);
    }

    public void originate(Packet p) {
        p.setOriginAddress(this.address);
        System.out.println("Workstation " + this.address + " is introducing the packet in the LAN.");
        this.send(p);
    }

    public void receive(Packet p){
        if (this.address.equals(p.getOriginAddress())){
            System.out.println("Packet returned to origin, destination not found");
        } else {
            this.send(p);
        }
    }



}
