import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {
    private String id;
    private String text;
    private String type;
    private String user;
    private String upvotes;

    public Response(@JsonProperty("id") String id,
                    @JsonProperty("text") String text,
                    @JsonProperty("type") String type,
                    @JsonProperty("user") String user,
                    @JsonProperty("upvotes") String upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public String  getId() {
        return id;
    }

    public Response setId(String id) {
        this.id = id;
        return this;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public Response setText(String text) {
        this.text = text;
        return this;
    }

    public String getUser() {
        return user;
    }

    public String getUpvotes() {
        return upvotes;
    }

    public Response setType(String type) {
        this.type = type;
        return this;
    }

    public Response setUser(String user) {
        this.user = user;
        return this;
    }

    public Response setUpvotes(String upvotes) {
        this.upvotes = upvotes;
        return this;
    }

    @Override
    public String toString() {
        return "<" + id + ", " + text + ", " + type + ", " + user + ", " + upvotes + ".>";
    }
}
