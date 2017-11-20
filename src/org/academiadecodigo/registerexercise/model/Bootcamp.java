package org.academiadecodigo.registerexercise.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

/**
 * RegisterExercise Created by BrunoM24 on 10/11/2017.
 */

public class Bootcamp {

    private Integer id;
    private String name;
    private String cityLocation;
    private LocalDate start;
    private LocalDate end;
    private Set<CodeCadet> cadets;

    public Bootcamp(Integer id, String location, LocalDate start, LocalDate end) {
        this.id = id;
        this.cityLocation = location;
        this.start = start;
        this.end = end;
        this.cadets = cadets;
    }

    public void addCadet(CodeCadet codeCadet) {
        this.cadets.add(codeCadet);
    }

    public void removeCadet(CodeCadet codeCadet) {
        this.cadets.remove(codeCadet);
    }

    @Override
    public String toString(){
        return "#" + this.id + "_" + this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCityLocation() {
        return cityLocation;
    }

    public LocalDate getStart() {
        return start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public Set<CodeCadet> getCadets() {
        return cadets;
    }
}
