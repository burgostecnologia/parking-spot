package com.burgostecnologia.parkingcontrol.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.burgostecnologia.parkingcontrol.models.ParkingSpotModel;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel,UUID>{
    boolean existsByLicensePlateCar(String LicensePlateCar);    
    boolean existsByParkingSpotNumber(String parkingSpotNumber);    
    boolean existsByApartamentAndBlock(String apartament, String block);
}