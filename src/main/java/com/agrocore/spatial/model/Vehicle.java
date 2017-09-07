package com.agrocore.spatial.model;

import com.bedatadriven.jackson.datatype.jts.serialization.GeometryDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.io.ParseException;
import com.vividsolutions.jts.io.WKTReader;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vehicle {
    @Id
    @GeneratedValue
    private Long id;
    private String name;


    @Type(type="org.hibernate.spatial.GeometryType")
    @JsonDeserialize(using = GeometryDeserializer.class)
    @Column(name = "location", nullable = false, columnDefinition = "geometry(Polygon,4326)")
    private Polygon location;



    public Vehicle() {
    }

    public Vehicle(String name, Polygon location) throws ParseException {
        WKTReader wktReader = new WKTReader();
        this.name = name;
        this.location = (Polygon) location;
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

    public Polygon getLocation() {
        return location;
    }

    public void setLocation(Polygon location) {
        this.location = location;
    }
}
