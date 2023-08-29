package dev.moon.record.Entity;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;


@Entity
public class Record {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "id")
    private String id;

    @Column(name = "watchkey")
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


}
