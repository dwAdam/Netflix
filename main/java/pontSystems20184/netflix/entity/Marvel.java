package pontSystems20184.netflix.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Marvel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String titleMarvel;
	
	//***************************************

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitleMarvel() {
		return titleMarvel;
	}

	public void setTitleMarvel(String titleMarvel) {
		this.titleMarvel = titleMarvel;
	}
}
