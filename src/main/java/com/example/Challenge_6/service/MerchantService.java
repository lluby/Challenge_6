package com.example.Challenge_6.service;

import com.example.Challenge_6.model.Merchant;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MerchantService {
    Merchant addMerchant(Merchant merchant);
    Merchant updateMerchant(Merchant merchant);
    void deleteMerchant(String MerchantCode);
    List<Merchant> getAllMerchant();
    Merchant getMerchantDetail(String selectedMerchantCode);
}
