package com.agrocore.spatial.model;

import com.bedatadriven.jackson.datatype.jts.serialization.GeometryDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vividsolutions.jts.geom.Point;
import org.hibernate.annotations.Type;

;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Driver {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String lastName;


//    @Type(type="org.hibernate.spatial.GeometryType")
//    @Column(name = "location", nullable = false, columnDefinition = "geometry(Point,4326)")
//    @JsonDeserialize(using = GeometryDeserializer.class)
    private Point location;

    public Driver() {
    }

    public Driver(String name, String lastName, Point location) {
        this.name = name;
        this.lastName = lastName;
        this.location = location;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }
}
