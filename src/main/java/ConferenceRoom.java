public class ConferenceRoom extends Room{

    private String name;
    private int capacity;

    public ConferenceRoom(String name, int capacity){
        super(capacity);
        this.name = name;
    }

    public String getName (){
        return name;
    }
}
