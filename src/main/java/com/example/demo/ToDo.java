package com.example.demo;

import lombok.Data;

import javax.persistence.*;

@Data
@Table
@Entity
public class ToDo {

    @Column
    private String content;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
}
