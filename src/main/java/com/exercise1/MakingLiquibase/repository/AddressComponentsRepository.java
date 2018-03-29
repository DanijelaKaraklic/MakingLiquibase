package com.exercise1.MakingLiquibase.repository;

import com.exercise1.MakingLiquibase.model.AddressComponents;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressComponentsRepository extends JpaRepository<AddressComponents,Integer> {
}
