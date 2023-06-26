package com.ss.donor.logic;

import com.ss.donor.beans.Donor;
import com.ss.donor.model.response.DonorResponsePayload;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class DonorServiceUtilHelper {
    public DonorResponsePayload entityToResponseMapper(Donor donor) {
        DonorResponsePayload respDonor = new DonorResponsePayload();
        BeanUtils.copyProperties(donor, respDonor);
        return respDonor;
    }
}
