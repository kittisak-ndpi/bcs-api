package com.buu.bcs.entity;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tab_choice")
public class ChoiceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sbc_ans_id")
    private String ans_id;

    @Column(name = "answ_index")
    private LocalDateTime ans_index;

    @Column(name = "sbc_answer")
    private LocalDateTime answer;

    @Column(name = "ans_create_date")
    private LocalDateTime create_date;

    @Column(name = "ans_create_by")
    private String create_by;

    @Column(name = "ans_update_date")
    private LocalDateTime update_date;

    @Column(name = "ans_update_by")
    private String update_by;
}
