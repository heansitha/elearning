package co.istad.elearninga1m1.features.course;


import co.istad.elearninga1m1.features.course.dto.CourseResponse;
import co.istad.elearninga1m1.features.course.dto.CreateCourseRequest;

public interface CourseService {

    // Create a new course
    CourseResponse createCourse(CreateCourseRequest createCourseRequest);

}
