package tr.org.liderahenk.service.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "P_Service")
public class ServiceEntity {
	
	// This class is auto-generated.
	// Please follow the (table and column) naming conventions.
	
	@Id
	@GeneratedValue
	@Column(name = "${entity}_ID")
	private Long id;
	
	// Other database columns...
	
	// Getter setters
	
}
