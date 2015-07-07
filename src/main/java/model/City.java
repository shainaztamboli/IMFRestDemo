package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "city")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class City implements Serializable {

 private static final long serialVersionUID = 1L;

 @Id
 @GeneratedValue
 @Column(name = "id")
 private long id;

 @Column(name = "name")
 private String name;

 @Column(name = "status")
 private Integer status;

/**
 * @return the id
 */
public long getId() {
	return id;
}

/**
 * @param id the id to set
 */
public void setId(long id) {
	this.id = id;
}

/**
 * @return the name
 */
public String getName() {
	return name;
}

/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}

/**
 * @return the status
 */
public Integer getStatus() {
	return status;
}

/**
 * @param status the status to set
 */
public void setStatus(Integer status) {
	this.status = status;
}

}


