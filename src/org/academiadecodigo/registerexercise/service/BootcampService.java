package org.academiadecodigo.registerexercise.service;

import org.academiadecodigo.registerexercise.model.Bootcamp;
import org.academiadecodigo.registerexercise.model.CodeCadet;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;

/**
 * RegisterExercise Created by BrunoM24 on 10/11/2017.
 */


public interface BootcampService extends Service{

    void createBootcamp(String location, LocalDate start, LocalDate end);

    //void createBootcamp(String location, Date start, Date end, Set<CodeCadet> cadets);

    void addCodeCadetToBootcamp(CodeCadet codeCadet, Bootcamp bootcamp);

    void removeCodeCadet(CodeCadet codeCadet, Bootcamp bootcamp);

    HashSet<Bootcamp> listBootcamps();

    //HashSet<CodeCadet> listCodeCadets();
}
