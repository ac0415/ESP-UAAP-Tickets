package com.ateneo.uaaptickets.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enterprise.retail.entity.Seat;

@Repository
public class SeatRepository extends JpaRepository<Seat, Integer>{

}


