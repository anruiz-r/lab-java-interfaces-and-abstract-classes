package src.main.java;

abstract class Video {
    private String title;
    private int duration;

    public Video(int duration, String title) {
        setTitle(title);
        setDuration(duration);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getInfo() {
        return "Title: " + getTitle() + "\nDuration: " + getDuration();
    }
}

class TvSeries1 extends Video {
    private int episodes;

    public TvSeries1(int duration, String title, int episodes) {
        super(duration, title);
        setEpisodes(episodes);
    }


    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
}

class Movie extends Video {
    private double rating;

    public Movie(int duration, String title, double rating) {
        super(duration, title);
        setRating(rating);
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}