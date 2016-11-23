package com.brainysoon.zkeps.service.Impl;

import com.brainysoon.zkeps.bean.Keper;
import com.brainysoon.zkeps.dao.KeperRepository;
import com.brainysoon.zkeps.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by brainy on 16-11-22.
 */
@Service
public class StatusServiceImpl implements StatusService {

    private KeperRepository keperRepository;

    @Autowired
    public void setKeperRepository(KeperRepository keperRepository) {
        this.keperRepository = keperRepository;
    }

    @Override
    public int processLogin(String keperName, String password) {

        Keper keper = keperRepository.findKeperByKeperName(keperName);

        if (keper == null) {

            return -1;
        } else if (keper.getPassword().equals(password)) {

            return 1;
        } else {

            return -2;
        }
    }

    @Override
    public Keper findKeperByKeperName(String keperName) {

        return keperRepository.findKeperByKeperName(keperName);
    }
}
