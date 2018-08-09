package cl.deraxcode.easyticket.backend.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_host")
public class UserHost {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userHostId;
	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Boolean google;
	
	public Long getUserHostId() {
		return userHostId;
	}

	public void setUserHostId(Long userHostId) {
		this.userHostId = userHostId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getGoogle() {
		return google;
	}

	public void setGoogle(Boolean google) {
		this.google = google;
	}
	
	

}
