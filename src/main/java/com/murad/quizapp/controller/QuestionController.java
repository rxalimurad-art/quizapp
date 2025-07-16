package com.murad.quizapp.controller;


import com.murad.quizapp.model.Question;
import com.murad.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuestionService questionService;


    @GetMapping("allQuestions")
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable("category") String category) {
        System.out.println(category);
        return questionService.getQuestionsByCategory(category);
    }

    @PostMapping("add")
    public Question addQuestion(@RequestBody  Question question) {
        return questionService.addQuestion(question);
    }

}
