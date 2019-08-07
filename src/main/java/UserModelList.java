import java.util.List;


public class UserModelList {

    @Override
      public String toString() {
          return "Album= " + Album +
                  '}';
      }

    private List<SaveModel> Album;
    public List<SaveModel> getAlbum() {
        return Album;
    }

    public void setAlbum(List<SaveModel> album) {
        this.Album = album;
    }
}
