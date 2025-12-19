package practicesPOO.practice6.exercise4;

public class Room {
    private String temporaryOwner;
    private String ownerEmail;

    //Constructor
    public Room(String temporaryOwner, String ownerEmail) {
        this.temporaryOwner = temporaryOwner;
        this.ownerEmail = ownerEmail;
    }

    //Getters
    public String getTemporaryOwner() {return temporaryOwner;}
    public void setOwnerEmail(String ownerEmail) {this.ownerEmail = ownerEmail;}

    //Setters
    public void setTemporaryOwner(String temporaryOwner) {this.temporaryOwner = temporaryOwner;}
    public String getOwnerEmail() {return ownerEmail;}
}
