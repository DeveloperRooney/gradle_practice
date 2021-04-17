package com.sh.board.domain;

import com.sh.board.entity.BoardEntity;

public class BoardVO {

    private String subject;
    private String contents;

    public BoardVO(String subject, String contents) {
        this.subject = subject;
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "BoardVO{" +
                "subject='" + subject + '\'' +
                ", contents='" + contents + '\'' +
                '}';
    }

    public BoardEntity toEntity() {
        return new BoardEntity(null, subject, contents);
    }
}
