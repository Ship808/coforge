package com.coforge.githubJavaEx.GithubJavaProject.service;
import com.coforge.githubJavaProject.dao.EmployeeDao;
import com.coforge.githubJavaProject.dao.*;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDaoImpl ed=null;
	
	public EmployeeServiceImpl()
	{
		ed=new EmployeeDaoImpl();
	}
	@Override
	public void addEmp() {
		ed.addEmp();
	}

	@Override
	public void displayEmp() {
		ed.displayEmp();
	}
	
	

}
