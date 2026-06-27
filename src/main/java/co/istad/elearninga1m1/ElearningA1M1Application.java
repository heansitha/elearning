package co.istad.elearninga1m1;

import co.istad.elearninga1m1.features.course.Course;
import co.istad.elearninga1m1.features.course.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.List;

@SpringBootApplication
@EnableJpaAuditing
public class ElearningA1M1Application implements CommandLineRunner {

//    private static final GlobalMetrics IO = ;

    public static void main(String[] args) {
        SpringApplication.run(ElearningA1M1Application.class, args);
    }

    private CourseRepository courseRepository;
    @Autowired
    public void setCourseRepository(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<Course> courses = courseRepository.allCourses();
//        Course course = courseRepository.byId(2);
        courses.forEach(course -> System.out.println(course.getTitle()));
    }


}
