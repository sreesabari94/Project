package com.ss.donor.utils;

import com.ss.donor.model.request.DonorRequestPayload;
import com.ss.donor.model.response.DonorResponsePayload;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DonorServiceUtil {

    List<DonorResponsePayload> getDonor(String city, String bloodGroup);

    List<DonorResponsePayload> getAllDonors();

    void registerDonor(DonorRequestPayload payload);

    DonorResponsePayload updateDonor(String email);

}