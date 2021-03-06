package cn.dlb.bim.dao;

import java.util.List;

import cn.dlb.bim.dao.entity.Project;

public interface ProjectDao {
	public void insertProject(Project project);
	public void deleteProject(Long pid);
	public Project queryProject(Long pid);
	public void updateProject(Project project);
	public List<Project> queryAllProject();
}
