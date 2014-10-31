package com.bionic.service;

import com.bionic.dao.MerchantDAO;
import com.bionic.domain.Merchant;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by oper4 on 31.10.2014.
 */
@Named
public class MerchantServiceImpl implements MerchantService {

    @Inject
    MerchantDAO merchantDAO;

    @Override
    public Merchant findById(int id) {
        return merchantDAO.findById(id);
    }

    @Override
    @Transactional
    public void save(Merchant m) {
        merchantDAO.save(m);
    }

    @Override
    public List<Merchant> getAllMerchantList(){
        return merchantDAO.getAllMerchantList();
    }


}
