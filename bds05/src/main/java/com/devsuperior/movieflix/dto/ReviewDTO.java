package com.devsuperior.movieflix.dto;

import com.devsuperior.movieflix.entities.Review;

import java.io.Serializable;

public class ReviewDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String text;
    private UserDTO user;
    private Long movieId;

    public ReviewDTO() {

    }

    public ReviewDTO(String text, Long id) {
        this.text = text;
        this.id = id;
    }

    public ReviewDTO(Review entity) {
        id = entity.getId();
        text = entity.getText();
        movieId = entity.getMovie().getId();
        user = new UserDTO(entity.getUser());
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public Long getMovieId() {
        return movieId;
    }
}
