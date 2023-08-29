package dev.moon.record.Controller;

public class RecordRequest {

    public RecordRequest(String id,String watchkey){
        this.id = id;
        this.watchkey = watchkey;
    }

    private String id;

    private String watchkey;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWatchkey() {
        return watchkey;
    }

    public void setWatchkey(String watchkey) {
        this.watchkey = watchkey;
    }

    @Override
    public String toString() {
        return "RecordRequest{" +
                "id='" + id + '\'' +
                ", watchkey='" + watchkey + '\'' +
                '}';
    }
}
