package com.brainysoon.zkeps.service.Impl;

import com.brainysoon.zkeps.bean.Kep;
import com.brainysoon.zkeps.dao.KepsRepository;
import com.brainysoon.zkeps.service.KepsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by brainy on 16-11-20.
 */
@Service
public class KepsServiceImpl implements KepsService {

    private KepsRepository kepsRepository;

    @Autowired
    public void setKepsRepository(KepsRepository kepsRepository) {
        this.kepsRepository = kepsRepository;
    }

    @Override
    public List<Kep> showPopKeps(int pageIndex) {

        List<Kep> keps = kepsRepository.findPopKeps();

        int pageSize = keps.size();

        int preFix = pageSize > 0 && pageSize % PAGE_MAX_NUM == 0 ? -1 : 0;

        int pagaMax = pageSize / PAGE_MAX_NUM;

        pagaMax += preFix;

        List<Kep> mKeps = new ArrayList<>();

        if (pageIndex > pagaMax) {

            return mKeps;
        }

        int tempIndex = PAGE_MAX_NUM * pageIndex;

        for (int i = tempIndex; i < tempIndex + PAGE_MAX_NUM && i < pageSize; i++) {

            mKeps.add(keps.get(i));
        }

        return mKeps;
    }

    @Override
    public int getPopKepsPageMax() {

        List<Kep> keps = kepsRepository.findPopKeps();

        int pageSize = keps.size();

        int preFix = pageSize > 0 && pageSize % PAGE_MAX_NUM == 0 ? -1 : 0;

        int pagaMax = pageSize / PAGE_MAX_NUM;

        System.out.println((37 / 5 + 37 > 0 && 37 % 5 == 0 ? -1 : 0));

        return pagaMax + preFix;
    }
}