package com.springturor.springtutor.repository;

import com.springturor.springtutor.model.Eyo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EyoRepository extends JpaRepository<Eyo, Long> {
}
