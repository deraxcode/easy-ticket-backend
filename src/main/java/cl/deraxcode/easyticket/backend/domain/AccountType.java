package cl.deraxcode.easyticket.backend.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account_type")
public class AccountType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long accountTypeId;
	private String name;
	
	public Long getAccountTypeId() {
		return accountTypeId;
	}
	public void setAccountTypeId(Long accountTypeId) {
		this.accountTypeId = accountTypeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
