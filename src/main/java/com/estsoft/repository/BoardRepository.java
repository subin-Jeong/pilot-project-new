package com.estsoft.repository;

import org.springframework.data.jpa.datatables.repository.DataTablesRepository;

import com.estsoft.domain.Board;

public interface BoardRepository extends DataTablesRepository<Board, Integer> {} 
