package com.example.assignmet_2;
import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cast_Details implements Serializable
{

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("cast")
    @Expose
    private List<CastActivity> cast = null;
    @SerializedName("crew")
    @Expose
    private List<CastActivity> crew = null;
    private final static long serialVersionUID = 1227730618350775398L;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<CastActivity> getCast() {
        return cast;
    }

    public void setCast(List<CastActivity> cast) {
        this.cast = cast;
    }

    public List<CastActivity> getCrew() {
        return crew;
    }

    public void setCrew(List<CastActivity> crew) {
        this.crew = crew;
    }

}
