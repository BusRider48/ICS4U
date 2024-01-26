/*
average calculator
Tyler Wong
11/29/2023
*/
#include <iostream>
int main() {
	//variables for total number of courses, sum of grades, grade average, grade input
	int totalCourses=0;
	int gradeSum=0;
	int gradeAve=0;
	int grade=0;
	//user input for total number of courses
	std::cout<<"enter number of courses"<<std::endl;
	std::cin>>totalCourses;
	//user input for grades
	for (int i=0; i<totalCourses; i++) {
		std::cout<<"enter your grades"<<std::endl;
		std::cin>>grade;
		gradeSum+=grade;
	}
	//gets the grade average
	gradeAve=gradeSum/totalCourses;
	std::cout<<"your grade average is "<<gradeAve<<std::endl;
	return 0;
}
