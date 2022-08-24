package com.buu.bcs.entity;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tab_question")
public class QuestionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sbc_qt_id")
    private String qt_id;

    @Column(name = "qt_index")
    private LocalDateTime qt_index;

    @Column(name = "qt_question")
    private LocalDateTime qt_question;

    @Column(name = "qt_create_date")
    private LocalDateTime create_date;

    @Column(name = "qt_create_by")
    private String create_by;

    @Column(name = "qt_update_date")
    private LocalDateTime update_date;

    @Column(name = "qt_update_by")
    private String update_by;
}
