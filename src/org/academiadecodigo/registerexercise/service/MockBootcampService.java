package org.academiadecodigo.registerexercise.service;

import org.academiadecodigo.registerexercise.model.Bootcamp;
import org.academiadecodigo.registerexercise.model.CodeCadet;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;

/**
 * RegisterExercise Created by BrunoM24 on 10/11/2017.
 */

public class MockBootcampService implements BootcampService{

    private int bootcampCount = 0;
    private int codeCadetCount = 0;
    private HashSet<Bootcamp> bootcamps = new HashSet<>();
    //private HashSet<CodeCadet> codeCadets = new HashSet<>();

    @Override
    public void createBootcamp(String location, LocalDate start, LocalDate end) {
        //createBootcamp(location, start, end, null);
        bootcamps.add(new Bootcamp(++bootcampCount,location, start, end));
    }

    /*
    @Override
    public void createBootcamp(String location, Date start, Date end, Set<CodeCadet> cadets) {
        new Bootcamp(++bootcampCount,location, start, end, cadets);
    }
    */

    @Override
    public void addCodeCadetToBootcamp(CodeCadet codeCadet, Bootcamp bootcamp) {
        //this.codeCadets.add(codeCadet);
        bootcamp.addCadet(codeCadet);
    }

    @Override
    public void removeCodeCadet(CodeCadet codeCadet, Bootcamp bootcamp) {
        //this.codeCadets.remove(codeCadet);
        bootcamp.removeCadet(codeCadet);
    }

    @Override
    public HashSet<Bootcamp> listBootcamps() {
        return this.bootcamps;
    }

    /*
    @Override
    public HashSet<CodeCadet> listCodeCadets() {
        return this.codeCadets;
    }
    */
}
