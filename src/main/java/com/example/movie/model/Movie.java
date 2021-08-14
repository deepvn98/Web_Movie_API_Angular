package com.example.movie.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameMovie;
    @Lob
    private String url;
    @Lob
    private String img;
    @ManyToOne
    private UserApp userApp;
    @ManyToMany
    private List<Cast> casts;
    @ManyToMany
    private List<Director> directors;

    public Movie() {
    }

    public Movie(Long id, String nameMovie, String url, String img, UserApp userApp, List<Cast> casts, List<Director> directors) {
        this.id = id;
        this.nameMovie = nameMovie;
        this.url = url;
        this.img = img;
        this.userApp = userApp;
        this.casts = casts;
        this.directors = directors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameMovie() {
        return nameMovie;
    }

    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public UserApp getUserApp() {
        return userApp;
    }

    public void setUserApp(UserApp userApp) {
        this.userApp = userApp;
    }

    public List<Cast> getCasts() {
        return casts;
    }

    public void setCasts(List<Cast> casts) {
        this.casts = casts;
    }

    public List<Director> getDirectors() {
        return directors;
    }

    public void setDirectors(List<Director> directors) {
        this.directors = directors;
    }
}
