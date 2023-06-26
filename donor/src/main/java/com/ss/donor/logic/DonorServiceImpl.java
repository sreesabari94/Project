package com.ss.donor.logic;

import com.ss.donor.beans.Donor;
import com.ss.donor.model.request.DonorRequestPayload;
import com.ss.donor.model.response.DonorResponsePayload;
import com.ss.donor.persistance.DonorRepository;
import com.ss.donor.utils.DonorServiceUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DonorServiceImpl implements DonorServiceUtil {

    @Autowired
    private DonorRepository donorRepo;
    @Autowired
    private DonorServiceUtilHelper donorMapper;

    @Override
    public List<DonorResponsePayload> getDonor(String city, String bloodGroup) {
        return donorRepo.getDonorContainingIgnoreCase(city, bloodGroup).stream().map(donorMapper::entityToResponseMapper).collect(Collectors.toList());
    }

    @Override
    public List<DonorResponsePayload> getAllDonors() {
        return donorRepo.findAll().stream().map(donorMapper::entityToResponseMapper).collect(Collectors.toList());
    }

    @Override
    public void registerDonor(DonorRequestPayload payload) {
        Donor d = new Donor();
        BeanUtils.copyProperties(payload, d);
        donorRepo.saveAndFlush(d);
    }

    @Override
    public DonorResponsePayload updateDonor(String email) {
        return null;
    }
}
