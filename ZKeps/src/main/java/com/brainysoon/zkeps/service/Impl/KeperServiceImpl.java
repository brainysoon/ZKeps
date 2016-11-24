package com.brainysoon.zkeps.service.Impl;

import com.brainysoon.zkeps.bean.Keper;
import com.brainysoon.zkeps.dao.KeperRepository;
import com.brainysoon.zkeps.service.KeperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by brainy on 16-11-20.
 */
@Service
public class KeperServiceImpl implements KeperService {

    private KeperRepository keperRepository;

    @Autowired
    public void setKeperRepository(KeperRepository keperRepository) {
        this.keperRepository = keperRepository;
    }

    @Override
    public Keper findKeperByKeperName(String keperName) {

        return keperRepository.findKeperByKeperName(keperName);
    }

    @Override
    public int addKeper(String keperName, String password, String email) {

        Keper keper = new Keper();

        keper.setKeperName(keperName);
        keper.setPassword(password);
        keper.setEmail(email);
        keper.setNickName(keperName);
        keper.setMotto("主人很懒，还没有来得及设置！");
        keper.setAvator("/resources/images/avators/default.jpg");
        keper.setStars(0);
        keper.setSlead(1);

        return keperRepository.addKeper(keper);
    }

    @Override
    public int addKeper(String keperName, String password, String email, String nickName, String motto) {

        Keper keper = new Keper();

        keper.setKeperName(keperName);
        keper.setPassword(password);
        keper.setEmail(email);
        keper.setNickName(nickName);
        keper.setMotto(motto);
        keper.setAvator("/resources/images/avators/default.jpg");
        keper.setStars(0);
        keper.setSlead(1);

        return keperRepository.addKeper(keper);
    }

    @Override
    public List<Keper> findAllKepers() {
        return keperRepository.findAllKepers();
    }
}
