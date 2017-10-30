package pl.pjwstk.pgmd.hearthlounge.model;

/**
 * Created by Froozy on 25.10.2017.
 */

public class User {

    private String username;
    private String email;
    private int rank;
    private String role;
    private String uid;
    private Boolean updatedProfile;

    public User(String username, String email, String password){   //Uzupełnić o dodanie reszty ze zmiennych bo auth idzie oddzielnie

        this.email = email;
        this.username = username;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Boolean getUpdatedProfile() {
        return updatedProfile;
    }

    public void setUpdatedProfile(Boolean updatedProfile) {
        this.updatedProfile = updatedProfile;
    }
}
