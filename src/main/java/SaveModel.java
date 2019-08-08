import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)

public class SaveModel {

    @JsonProperty("NameOfArtist")
    private String NameOfArtist;

    @JsonProperty("SongName")
    private String SongName;

    @JsonProperty("Minutes")
    private int Minutes;


    public String getNameOfArtist() {
        return NameOfArtist;
    }

    public void setNameOfArtist(String nameOfArtist) {
        NameOfArtist = nameOfArtist;
    }

    public String getSongName() {
        return SongName;
    }

    public void setSongName(String songName) {
        SongName = songName;
    }

    public int getMinutes() {
        return Minutes;
    }

    public void setMinutes(int minutes) {
        Minutes = minutes;
    }

    @Override
    public String toString() {
        return "SaveModel{" +
                "NameOfArtist='" + NameOfArtist + '\'' +
                ", SongName='" + SongName + '\'' +
                ", Minutes=" + Minutes +
                '}';
    }


}
