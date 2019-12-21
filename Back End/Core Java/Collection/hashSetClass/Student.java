package com.cg.collectionInterface.hashSetClass;

public class Student {
	String studName;
	int studeAge;
	public Student(String studName, int studeAge) {
		super();
		this.studName = studName;
		this.studeAge = studeAge;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((studName == null) ? 0 : studName.hashCode());
		result = prime * result + studeAge;
		return result;
	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		if (studName == null) {
//			if (other.studName != null)
//				return false;
//		} else if (!studName.equals(other.studName))
//			return false;
//		if (studeAge != other.studeAge)
//			return false;
//		return true;
//	}
	
	@Override
	public boolean equals(Object o) {
		Student s =(Student) o;
		return this.studeAge==s.studeAge && this.studName==this.studName;
	}
	
}
