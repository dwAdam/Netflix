package pontSystems20184.netflix.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Horror {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String titleHorror;
	
	//***************************************

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitleHorror() {
		return titleHorror;
	}

	public void setTitleHorror(String titleHorror) {
		this.titleHorror = titleHorror;
	}
}
