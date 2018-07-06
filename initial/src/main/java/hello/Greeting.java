package hello;

public class Greeting{

    private int id;
    private String content;

    public Greeting(int id, String content){
        this.id = id;
        this.content = content;
    }

    public String getContent() {
        return content;
    }
    public int getId() {
        return id;
    }


}