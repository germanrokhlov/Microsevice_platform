package german.ms.movieinfoservice.model;

public class MovieInfo {

    private int movieId;
    private String name;
    private String desc;

    public MovieInfo(int movieId, String name, String desc) {
        this.movieId = movieId;
        this.name = name;
        this.desc = desc;
    }

    public MovieInfo(){}

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String toString(){
        return movieId + " : " + name + " : " + desc;
    }
}
