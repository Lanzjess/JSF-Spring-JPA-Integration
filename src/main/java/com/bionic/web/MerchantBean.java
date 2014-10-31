package com.bionic.web;

import com.bionic.domain.Merchant;
import com.bionic.service.MerchantService;
import org.springframework.context.annotation.Scope;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by oper4 on 31.10.2014.
 */
@Named
@Scope("request")
public class MerchantBean implements Serializable {

    private Merchant merchant;
    @Inject
    private MerchantService merchantService;

    public String saveMerchant(){
        merchantService.save(merchant);
        return "MerchantList";
    }


    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    public MerchantService getMerchantService() {
        return merchantService;
    }

    public void setMerchantService(MerchantService merchantService) {
        this.merchantService = merchantService;
    }
}
