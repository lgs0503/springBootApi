package com.lgs.todo.repository;

import com.lgs.todo.entitiy.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long>, TodoRepositoryCustom{
}