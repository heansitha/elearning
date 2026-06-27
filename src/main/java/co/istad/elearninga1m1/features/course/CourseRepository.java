package co.istad.elearninga1m1.features.course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

    boolean existsBySlug(String slug);

    // Use named query
    List<Course> allCourses();

//    Course byId(Integer id);

}