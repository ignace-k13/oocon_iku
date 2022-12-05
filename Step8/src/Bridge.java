public class Bridge extends Node{

    // the attributes:
    Bridge nextBridge;

    // the constructors (do not touch!):
    public Bridge() {
    }

    public Bridge(String anAddress) {
        address = anAddress;
    }

    // the get & set methods:
    public Bridge getNextBridge() {
        return nextBridge;
    }

    public void setNextBridge(Bridge aBridge) {
        nextBridge = aBridge;
    }

    public void originate(Packet p){
        this.send(p);
    }
    // the other methods:
    public void receive(Packet p) {
        Bridge next = this.getNextBridge();
        if (next!=null) {
            System.out.println("crossing the bridge to " + next.address);
            next.originate(p);
        } else {
            System.out.println("Next bridge not found, please fix the LAN.");
        }
    }




}
