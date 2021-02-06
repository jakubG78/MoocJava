
public class Film {

    private final String name;
    private final int ageRating;

    public Film(String name, int filmAgeRating) {
        this.name = name;
        this.ageRating = filmAgeRating;
    }

    public String name() {
        return this.name;
    }

    public int ageRating() {
        return this.ageRating;
    }
}
