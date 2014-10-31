package com.bionic.service;

import com.bionic.domain.Merchant;

import java.util.List;

/**
 * Created by oper4 on 31.10.2014.
 */
public interface MerchantService {
    public Merchant findById(int id);

    public void save(Merchant m);

    List<Merchant> getAllMerchantList();
}
