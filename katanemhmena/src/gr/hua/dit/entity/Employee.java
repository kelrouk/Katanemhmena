package gr.hua.dit.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee extends InternalUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private int emp_id;

	@Column(name = "is_supervisor")
	private boolean is_supervisor;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "dep_id")
	private Departement departement;

	@OneToMany(mappedBy = "employee", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
			CascadeType.REFRESH })
	private List<Check> check;

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

	@Override
	public String toString() {
		return "Employee [departement=" + departement + ", check=" + check + "]";
	}

}
