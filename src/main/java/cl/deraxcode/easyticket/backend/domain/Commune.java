package cl.deraxcode.easyticket.backend.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "commune")
public class Commune {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long communeId;
	
	@NotEmpty
	private String name;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="province_id")
	private Province province;

	public Long getCommuneId() {
		return communeId;
	}

	public void setCommuneId(Long communeId) {
		this.communeId = communeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}
	
	

}
