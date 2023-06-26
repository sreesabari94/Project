package com.ss.donor.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ss.donor.beans.Donor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DonorRepository extends JpaRepository<Donor, Integer> {
    @Query("select d from Donor d where d.city = ?1 and d.bloodGroup = ?2 and (d.donationDate is null or d.donationDate <= CURRENT_DATE -15)")
    List<Donor> getDonorContainingIgnoreCase(String city, String bloodGroup);
}
