package com.samuelleeplus.Repository;

import com.samuelleeplus.Entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {

    Owner findByOwnerId(Long id);

    Owner deleteByOwnerId(Long id);
}
