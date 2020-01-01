package com.bin.deng.springdemo.dao;

import com.bin.deng.springdemo.model.Hello;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloMapper extends JpaRepository<Hello,Long> {
}
