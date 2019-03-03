package pontSystems20184.netflix.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Action {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String titleAction;
	
	//***************************************

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitleAction() {
		return titleAction;
	}

	public void setTitleAction(String titleAction) {
		this.titleAction = titleAction;
	}
}
