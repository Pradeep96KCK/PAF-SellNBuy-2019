package com.paf;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.stereotype.Component;
@XmlRootElement
@Entity
@Table(name = "item")
@EntityListeners(AuditingEntityListener.class)
@Component
public class Item implements Serializable{
	
	private static final long serialVersionUID = 1143993377101043360L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int itemId;
	private String itemName;
	private String description;
	private double price;
	
	protected Item() {
		
	}
	

	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
