package com.bionic.dao;

import com.bionic.domain.Merchant;

import java.util.List;

/**
 * Created by oper4 on 31.10.2014.
 */
public interface MerchantDAO {
    public Merchant findById(int id);

    public void save(Merchant m);

    public List<Merchant> getAllMerchantList();
}
