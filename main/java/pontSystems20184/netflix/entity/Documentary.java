package pontSystems20184.netflix.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Documentary {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String titleDocumentary;
	
	//***************************************

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitleDocumentary() {
		return titleDocumentary;
	}

	public void setTitleDocumentary(String titleDocumentary) {
		this.titleDocumentary = titleDocumentary;
	}
}
