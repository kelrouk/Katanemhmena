package gr.hua.dit.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "accommodation")
public class Accommodation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "acc_id")
	private int acc_id;

	@Column(name = "has_acc")
	private boolean has_acc;

	@OneToOne(mappedBy = "accomodation", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
			CascadeType.REFRESH })
	private Student student;

	public boolean isHas_acc() {
		return has_acc;
	}

	public void setHas_acc(boolean has_acc) {
		this.has_acc = has_acc;
	}

	public Accommodation() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Accommodation [has_acc=" + has_acc + "]";
	}

}
