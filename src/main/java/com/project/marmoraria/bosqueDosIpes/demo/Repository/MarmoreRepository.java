package com.project.marmoraria.bosqueDosIpes.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.marmoraria.bosqueDosIpes.demo.Model.MarmoreModel;

@Repository
public interface MarmoreRepository extends JpaRepository<MarmoreModel, Long>{
	
}
