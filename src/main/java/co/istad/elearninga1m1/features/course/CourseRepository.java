package co.istad.elearninga1m1.features.course;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {

    boolean existsBySlug(String slug);

}
