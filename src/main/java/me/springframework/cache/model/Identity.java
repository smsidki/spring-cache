package me.springframework.cache.model;

public class Identity {

	private String firstName;
	private String lastName;
	private Long idCard;
	private String occupation;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Long getIdCard() {
		return idCard;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setIdCard(Long idCard) {
		this.idCard = idCard;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

}
