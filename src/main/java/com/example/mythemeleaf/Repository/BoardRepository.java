package com.example.mythemeleaf.Repository;

import com.example.mythemeleaf.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long>{
    List<Board> findByTitle(String title);
    List<Board> findByTitleOrContentContaining(String title, String content);
}
