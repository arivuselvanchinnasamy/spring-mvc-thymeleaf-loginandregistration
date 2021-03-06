package com.arivu.login.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ROLE")
public class Role extends AbstractDatabaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 537979293404832176L;

	@Column(name = "ROLE_NAME")
	private String name;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Role [name=%s, description=%s]", name, description);
	}   
}
