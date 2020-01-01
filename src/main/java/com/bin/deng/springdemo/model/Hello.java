package com.bin.deng.springdemo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author bin
 */

@Entity
@Data
public class Hello {
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = true)
    private String name;
}
