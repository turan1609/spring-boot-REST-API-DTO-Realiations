package com.yusufturan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yusufturan.entities.Home;

@Repository
public interface HomeRepository extends JpaRepository<Home, Long> {

}
