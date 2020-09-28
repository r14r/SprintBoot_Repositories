package com.okta.developer.jugtours.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "user_group")
public class Group {

    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String name;
    private String address;
    private String city;
    private String stateOrProvince;
    private String country;
    private String postalCode;
    
    @ManyToOne(cascade=CascadeType.PERSIST)
    private User user;

    @OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    private Set<Event> events;

	public Group(String name) {
		this.name = name;
		this.address = "";
		this.city = "";
		this.stateOrProvince = "";
		this.postalCode = "";
	}

	
	// TODO Auto-generated method stub
	public void setUser(User user) {
		//this.name = user.name;
	}

	public Long getId() {
		return this.id;
	}

	// TODO Auto-generated method stub
	public void setEvents(Set<Event> singleton) {
		
	}
}