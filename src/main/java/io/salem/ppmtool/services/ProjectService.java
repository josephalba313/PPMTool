package io.salem.ppmtool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.salem.ppmtool.domain.Project;
import io.salem.ppmtool.repositories.ProjectRepository;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;
	
	public Project savedOrUpdateProject(Project project) {
		return projectRepository.save(project);
	}

}
