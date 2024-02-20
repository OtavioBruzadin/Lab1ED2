package org.example;

public class Movie {
    private java.lang.String title;
    private int launchYear;
    private double score;

    Movie(){
        this.title = "N/A";
        this.launchYear=0;
        this.score = 0.0;
    }
    Movie(java.lang.String title, int launchYear, double score){
        this.title = title;
        this.launchYear=launchYear;
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public int getLaunchYear() {
        return launchYear;
    }

    public java.lang.String getTitle() {
        return title;
    }

    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setTitle(java.lang.String title) {
        this.title=title;
    }

    @Override
    public java.lang.String toString(){

        return java.lang.String.format("%s (%d) %2f",this.title,this.launchYear,this.score);
    }
}
