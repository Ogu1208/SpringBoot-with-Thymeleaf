package com.example.mythemeleaf.Repository;

import com.example.mythemeleaf.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long>{
}
