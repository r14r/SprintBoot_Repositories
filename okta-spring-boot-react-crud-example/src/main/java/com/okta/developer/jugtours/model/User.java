package com.okta.developer.jugtours.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

    public User(String id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
    
	@Id
    private String id;
    private String name;
    private String email;
}