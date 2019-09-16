package aulas.devdojo.micosservice.course.endpoint.controller;

import aulas.devdojo.micosservice.course.service.CourseService;
import course.microservice.core.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
@RequestMapping("v1/admin/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Iterable<Course>> list (){
        return ResponseEntity.ok().body(courseService.findAll());
    }
}
