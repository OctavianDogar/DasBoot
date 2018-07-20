package com.dasboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Shipwreck {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	String name;
	String description;
	String condition;
	Integer depth;
	Double latitude;
	Double longitude;
	Integer yearDiscovered;

	public Shipwreck(Long id, String name, String description, String condition, Integer depth, Double latitude, Double longitude, Integer yearDiscovered) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.condition = condition;
		this.depth = depth;
		this.latitude = latitude;
		this.longitude = longitude;
		this.yearDiscovered = yearDiscovered;
	}

	public Shipwreck() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public Integer getDepth() {
		return depth;
	}

	public void setDepth(Integer depth) {
		this.depth = depth;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Integer getYearDiscovered() {
		return yearDiscovered;
	}

	public void setYearDiscovered(Integer yearDiscovered) {
		this.yearDiscovered = yearDiscovered;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Shipwreck shipwreck = (Shipwreck) o;
		return Objects.equals(id, shipwreck.id) &&
				Objects.equals(name, shipwreck.name) &&
				Objects.equals(description, shipwreck.description) &&
				Objects.equals(condition, shipwreck.condition) &&
				Objects.equals(depth, shipwreck.depth) &&
				Objects.equals(latitude, shipwreck.latitude) &&
				Objects.equals(longitude, shipwreck.longitude) &&
				Objects.equals(yearDiscovered, shipwreck.yearDiscovered);
	}

	@Override
	public int hashCode() {

		return Objects.hash(id, name, description, condition, depth, latitude, longitude, yearDiscovered);
	}

	@Override
	public String toString() {
		return "Shipwreck{" +
				"id=" + id +
				", name='" + name + '\'' +
				", description='" + description + '\'' +
				", condition='" + condition + '\'' +
				", depth=" + depth +
				", latitude=" + latitude +
				", longitude=" + longitude +
				", yearDiscovered=" + yearDiscovered +
				'}';
	}
}
