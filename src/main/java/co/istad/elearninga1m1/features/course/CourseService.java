package co.istad.elearninga1m1.features.course;


import co.istad.elearninga1m1.features.course.dto.CourseResponse;
import co.istad.elearninga1m1.features.course.dto.CreateCourseRequest;
import org.springframework.security.oauth2.jwt.Jwt;

public interface CourseService {

    // Create a new course
    CourseResponse createCourse(CreateCourseRequest createCourseRequest);

}
