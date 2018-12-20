package gr.hua.dit.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "departement")
public class Departement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dep_id")
	private int dep_id;

	@Column(name = "limit")
	private int limit;

	@Column(name = "dep_name")
	private String dep_name;

	@OneToOne(mappedBy = "empDep", cascade = CascadeType.ALL)
	private Employee employee;

	@OneToMany(mappedBy = "departement")
	private List<Student> students;

	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDep_name() {
		return dep_name;
	}

	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

}
