package br.ce.wcaquino.tasks_backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ce.wcaquino.tasks_backend.model.Task;

public interface TaskRepo extends JpaRepository<Task, Long>{

}
