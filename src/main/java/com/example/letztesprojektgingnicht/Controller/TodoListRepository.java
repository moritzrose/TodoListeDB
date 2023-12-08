package com.example.letztesprojektgingnicht.Controller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoListRepository extends JpaRepository<Long,Todo> {
}
