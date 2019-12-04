package com.example.nrgy.Collections;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document(collection = "user")
public class UserCollection {
    @Id
    private String id;
    private String username;
    private String password;
    private String email;
    private String companyName;


    public UserCollection(){}

    public UserCollection(String username, String password, String email, String companyName) {
        this.id = new ObjectId().toString();
        this.username = username;
        this.password = password;
        this.email = email;
        this.companyName = companyName;
    }

    public String getId() {
        return id.toString();
    }

    public void setId(ObjectId id) {
        this.id = id.toString();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
