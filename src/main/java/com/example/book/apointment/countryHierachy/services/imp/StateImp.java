package com.example.book.apointment.countryHierachy.services.imp;

import com.example.book.apointment.countryHierachy.entity.State;
import com.example.book.apointment.countryHierachy.repository.StateRepo;
import com.example.book.apointment.countryHierachy.services.StateServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StateImp implements StateServ {

    @Autowired
    private StateRepo stateRepo;

    @Override
    public String saveState(State state) {
        stateRepo.save(state);
        return "state saved";
    }
}
