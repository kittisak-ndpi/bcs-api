package com.buu.bcs.entity;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tab_question_topic")
public class QuestionTopicEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sbc_ex_id")
    private String ex_id;

    @Column(name = "sbc_title")
    private LocalDateTime title;

    @Column(name = "sbc_create_date")
    private LocalDateTime create_date;

    @Column(name = "sbc_create_by")
    private String create_by;

    @Column(name = "sbc_update_date")
    private LocalDateTime update_date;

    @Column(name = "sbc_update_by")
    private String update_by;
}
