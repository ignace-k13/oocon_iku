public class Packet {

    // the attributes:
    String destinationAddress = "";
    String contents = "";


    // the constructors (do not touch!):
    public Packet(String aContents, String aDestination) {
        contents = aContents;
        destinationAddress = aDestination;
    }

    // the get & set methods:
    public String getContents() {
        return contents;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setContents(String aString) {
        contents = aString;
    }

    public void setDestinationAddress(String anAddress) {
        destinationAddress = anAddress;
    }



}
