package com.brainysoon.zkeps.service.ServiceImp;

import com.brainysoon.zkeps.bean.Kep;
import com.brainysoon.zkeps.dao.KepsRepository;
import com.brainysoon.zkeps.service.KepsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by brainy on 16-11-9.
 */
@Service
public class KepsServiceImp implements KepsService {

    private KepsRepository kepsRepository;

    @Autowired
    public void setKepsRepository(KepsRepository kepsRepository) {
        this.kepsRepository = kepsRepository;
    }

    @Override
    public List<Kep> showPopKeps() {

        List<Kep> keps = kepsRepository.findPopKeps();

        return keps;
    }

    @Override
    public boolean addKep(Kep kep) {
        return false;
    }

    @Override
    public Kep showKepByKepId(String kepId) {
        return null;
    }
}
