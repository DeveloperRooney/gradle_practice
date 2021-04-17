package com.sh.board.controller;


import com.sh.board.domain.BoardVO;
import com.sh.board.entity.BoardEntity;
import com.sh.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {

    @Autowired
    private BoardRepository boardRepository;

    @GetMapping("/BoardWrite")
    public String boardWrite() { return "board_write"; }

    @PostMapping("BoardWritePro")
    public String boardWritePro(BoardVO vo) {
        System.out.println(vo.toString());

        // VO를 Entity로 변환
        BoardEntity board = vo.toEntity();
        System.out.println(board.toString());

        // Repository에게 Entity를 DB 안에 저장
        BoardEntity saved = boardRepository.save(board);
        System.out.println(saved.toString());
        return "";
    }
}
