package EncapsuLateCollection;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public class Person {
	private Set _courses;
	
	public void addCourse(Course arg){
		_courses.add(arg);
	}
	public void removeCourse(Course arg){
		_courses.remove(arg);		
	}
	public Set getCourses(){
		return Collections.unmodifiableSet(_courses);
	}
	public void initializeCourse(Set arg){
		_courses.addAll(arg);
		//Iterator iter = arg.iterator();
		//while(iter.hasNext()){
		//	addCourse((Course) iter.next());
		//}
	}
	public int NumberOfAdvancedCourses(){
		Iterator iter = getCourses().iterator();
		int count = 0;
		while(iter.hasNext()){
			Course each = (Course)iter.next();
			if(each.isAdvanced){
				count++;
			}
		}
		return count;
	}
	public int numberOfcourses(){
		return _courses.size();
	}
}
