public class ConferenceRoom extends Room{
    private String suiteName;

    public ConferenceRoom(String suiteName, int capacity){
        super(capacity);
        this.suiteName = suiteName;

    }
    public String getName() {
        return suiteName;
    }

}
