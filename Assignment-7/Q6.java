class Movie {
    private String name;
    private String genre;
    private double rating;
    public void setData(String name,String genre,double rating){
    this.name=name;
    this.genre=genre;
    this.rating=rating;
    }
    public boolean isHit() {
        return rating >= 8.0;
    }
    public void displayMovieRate() {
        System.out.println("Movie Rating ....");
        System.out.println("Movie: " + name);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);
        System.out.println("IsHit: " + isHit());
    }
}
class Q6{
    public static void main(String[] args) {
        Movie m = new Movie();
        m.setData("Inception","Sci-Fi",8.8);
        m.displayMovieRate();
    }
}

