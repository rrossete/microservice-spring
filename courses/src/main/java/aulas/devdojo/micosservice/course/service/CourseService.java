package aulas.devdojo.micosservice.course.service;

import course.microservice.core.model.Course;
import course.microservice.core.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public Iterable<Course> findAll (){
        return courseRepository.findAll();
    }
}
