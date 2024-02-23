package inheritanceandpolymorphism;

public class Instructor extends User{
    private int rating;
// id, email, password => comes from inheritance
    public Instructor(int id, String email, String password, int rating) {
        super(id, email, password);// calling the constructor of parent from here. Constructor Chaining.
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
