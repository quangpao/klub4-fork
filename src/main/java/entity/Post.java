/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.ArrayList;
import java.sql.Date;

/**
 *
 * @author quangpao
 */

public class Post {
    
    private int postID;
    private String title;
    private String content;
    private Date time;
    private int clubID;
    private String image;
    private ArrayList<Comment> comments;
    
    // constructor with postID, title, description, content, time, clubID, userID
    public Post(int postID, String title, String content, Date time, int clubID) {
        this.postID = postID;
        this.content = content;
        this.time = time;
        this.clubID = clubID;
    }

    public Post(String title, String content, Date time, int clubID, int userID, String image) {
        this.title = title;
        this.content = content;
        this.time = time;
        this.clubID = clubID;
        this.image = image;
    }

    // constructor with postID, title, content, time, clubID, userID, image
    public Post(int postID, String title, String content, Date time, int clubID, String image) {
        this.postID = postID;
        this.title = title;
        this.content = content;
        this.time = time;
        this.clubID = clubID;
        this.image = image;
    }

    // constructor with postID, title, content, time, clubID, userID, image, comments
    public Post(int postID, String title, String content, Date time, int clubID, int userID, String image, ArrayList<Comment> comments) {
        this.postID = postID;
        this.title = title;
        this.content = content;
        this.time = time;
        this.clubID = clubID;
        this.image = image;
        this.comments = comments;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void setClubID(int clubID) {
        this.clubID = clubID;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

    public int getPostID() {
        return postID;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Date getTime() {
        return time;
    }

    public int getClubID() {
        return clubID;
    }

    public String getImage() {
        return image;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }    
    
}
