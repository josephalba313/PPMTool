 package io.salem.ppmtool.repositories;

import org.springframework.data.repository.CrudRepository;

import io.salem.ppmtool.domain.Project;

public interface ProjectRepository extends CrudRepository<Project, Long> {
	Project findByProjectIdentifier(String projectId);
	Iterable<Project> findAll();
}
