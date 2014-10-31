package com.bionic.dao;

import com.bionic.domain.Merchant;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by oper4 on 31.10.2014.
 */
@Repository
public class MerchantDAOImpl implements MerchantDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Merchant findById(int id) {
        return em.find(Merchant.class, id);
    }

    @Override
    public void save(Merchant m) {
        em.persist(m);
    }

    @Override
    public List<Merchant> getAllMerchantList() {
        List<Merchant> list = null;
        TypedQuery<Merchant> query = em.createQuery("SELECT m FROM Merchant m", Merchant.class);
        list = query.getResultList();
        return list;
    }


}
