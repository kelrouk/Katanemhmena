package gr.hua.dit.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee extends InternalUser {
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "dep_id")
	private Departement departement;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

}
