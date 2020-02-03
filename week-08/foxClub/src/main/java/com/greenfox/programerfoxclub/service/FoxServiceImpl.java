package com.greenfox.programerfoxclub.service;

import com.greenfox.programerfoxclub.model.Fox;
import com.greenfox.programerfoxclub.repository.FoxClubRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoxServiceImpl implements FoxService {
   FoxClubRepo foxClubRepo;

   @Autowired
    public FoxServiceImpl(FoxClubRepo foxClubRepo) {
        this.foxClubRepo = foxClubRepo;
    }

    @Override
    public void addFox(String name) {
       foxClubRepo.addNewFox(name);
    }

    @Override
    public List<Fox> foxList() {
        return null;
    }

    @Override
    public String showInfo(Fox fox) {
        return null;
    }

    @Override
    public Fox findFoxByName(String name) {
        return foxClubRepo.findFoxByName(name);
    }

    @Override
    public boolean isFoxPresent(String name) {
        return foxClubRepo.isFoxPresent(name);
    }

    @Override
    public void changeFox(Fox fox) {
       foxClubRepo.changeFox(fox);
    }
}
