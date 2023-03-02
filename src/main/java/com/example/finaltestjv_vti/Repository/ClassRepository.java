package com.example.finaltestjv_vti.Repository;

import com.example.finaltestjv_vti.modal.Entity.Class;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClassRepository extends JpaRepository<Class, Integer> {
    Optional<Class> getByClassName(String className);
}
