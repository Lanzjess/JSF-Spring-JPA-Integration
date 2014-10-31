package com.bionic.web;

import com.bionic.domain.Merchant;
import com.bionic.service.MerchantService;
import org.springframework.context.annotation.Scope;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by oper4 on 31.10.2014.
 */
@Named
@Scope("request")
public class MerchantListBean {
    private List<Merchant> merchants = null;
    @Inject
    private MerchantService merchantService;

    public MerchantListBean() {
    }

    public List<Merchant> getMerchants() {
        return merchants;
    }

    public void setMerchants(List<Merchant> merchants) {
        this.merchants = merchants;
    }

    public void refreshList() {
        merchants = merchantService.getAllMerchantList();
    }
}
