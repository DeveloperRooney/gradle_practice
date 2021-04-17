package com.sh.board.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BoardEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String subject;

    @Column
    private String contents;

    public BoardEntity() {
        this.id = id;
    }

    public BoardEntity(Long id, String subject, String contents) {
        this.subject = subject;
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "BoardEntity{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                ", contents='" + contents + '\'' +
                '}';
    }
}
