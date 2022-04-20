package com.edu;




		import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


		@Entity  //create table Student
	@Table(name="employeedetails")
		public class employee {
			@Id   //primary key
		
	@GeneratedValue(strategy=GenerationType.AUTO)
			@Column (name="empid") 
		    private int eid;
			@Column (name="empname") 
			private String ename;
			@Column (name="empsalary") 
			private String esalary;
			@Column (name="empemail") 
			private String email;
			@Column (name="edept") 
			private String edept;
			@Column (name="egen") 
			private String egen;
			
		//generate setter and getter method 
		//generate toString
		public int getEid() {
			return eid;
		}
		public void setEid(int eid) {
			this.eid = eid;
		}
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public String getEsalary() {
			return esalary;
		}
		public void setEsalary(String string) {
			this.esalary =  esalary;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getEdept() {
			return edept;
		}
		public void setEdept(String edept) {
			this.edept = edept;
		}
		public String getEgen() {
			return egen;
		}
		public void setEgen(String egen) {
			this.egen = egen;
		}



		@Override
		public String toString() {
			return "employee [eid=" + eid + ", ename=" + ename + ",esalary="+ esalary +", email="+email+",edept="+edept+",egen="+egen+"]";
		

	}
		}
		