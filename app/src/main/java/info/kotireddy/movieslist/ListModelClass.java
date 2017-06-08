package info.kotireddy.movieslist;



public class ListModelClass {
    private String moviename, moviedistributor , moviegross;

    public ListModelClass() {
    }

    public ListModelClass(String moviename, String moviedistributor, String moviegross) {
        this.moviename = moviename;
        this.moviedistributor = moviedistributor;
        this.moviegross = moviegross;
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public String getMoviedistributor() {
        return moviedistributor;
    }

    public void setMoviedistributor(String moviedistributor) {
        this.moviedistributor = moviedistributor;
    }

    public String getMoviegross() {
        return moviegross;
    }

    public void setMoviegross(String moviegross) {
        this.moviegross = moviegross;
    }
}
