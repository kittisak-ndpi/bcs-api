package com.buu.bcs.entity;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tab_choice")
public class ChoiceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sbc_ans_id")
    private String sbc_ans_id;

    @Column(name = "ans_index")
    private int ans_index;

    @Column(name = "sbc_answer")
    private String answer;

    @Column(name = "ans_create_date")
    private LocalDateTime ans_create_date;

    @Column(name = "ans_create_by")
    private String ans_create_by;

    @Column(name = "ans_update_date")
    private LocalDateTime ans_update_date;

    @Column(name = "ans_update_by")
    private String ans_update_by;
}
