package org.o7planning.sbcrudrestful;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;



@XmlRootElement
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "feedback")

public class feedBack implements Serializable{
	
	private static final long serialVersionUID = 12345 ;
	@Id
			
	
	private String cusID;
	private String cusName;
	private String description;
	public feedBack() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	public String getCusID() {
		return cusID;
	}
	public void setCusID(String cusID) {
		this.cusID = cusID;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}  
	
	  
	

}
