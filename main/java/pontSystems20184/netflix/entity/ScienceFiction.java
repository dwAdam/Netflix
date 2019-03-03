package pontSystems20184.netflix.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ScienceFiction {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String titleScienceFiction;
	
	//***************************************

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitleScienceFiction() {
		return titleScienceFiction;
	}

	public void setTitleScienceFiction(String titleScienceFiction) {
		this.titleScienceFiction = titleScienceFiction;
	}
}
