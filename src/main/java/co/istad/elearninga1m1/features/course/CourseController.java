package co.istad.elearninga1m1.features.course;


import co.istad.elearninga1m1.features.course.dto.CourseResponse;
import co.istad.elearninga1m1.features.course.dto.CreateCourseRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/courses")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public CourseResponse createCourse(
            @Valid @RequestBody CreateCourseRequest createCourseRequest,
            @AuthenticationPrincipal Jwt jwt
    ) {
        System.out.print("JWT: " + jwt.getSubject());
        return courseService.createCourse(createCourseRequest);
    }

}
