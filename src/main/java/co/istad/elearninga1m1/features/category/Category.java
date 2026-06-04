package co.istad.elearninga1m1.features.category;


import co.istad.elearninga1m1.features.course.Course;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.relational.core.mapping.Table;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "categories")
public class Category {
    private static final Object GenerationType = ;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50, nullable = false, unique = true)
    private String name;
    private String icon;

    @Column(nullable = false)
    private Boolean isDeleted;


    private List<Course> courses;

}