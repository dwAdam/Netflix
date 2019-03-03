package pontSystems20184.netflix.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fantasy {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String titleFantasy;
	
	//***************************************

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitleFantasy() {
		return titleFantasy;
	}

	public void setTitleFantasy(String titleFantasy) {
		this.titleFantasy = titleFantasy;
	}
}
