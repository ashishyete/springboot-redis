/**
 * 
 */
package com.example.model;

import java.io.Serializable;

/**
 * @author AC03582
 *
 */

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String userName;
	private String userCountry;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserCountry() {
		return userCountry;
	}

	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}

	public User(int id, String userName, String userCountry) {
		super();
		this.id = id;
		this.userName = userName;
		this.userCountry = userCountry;
	}

	public User() {
	}

	
}
