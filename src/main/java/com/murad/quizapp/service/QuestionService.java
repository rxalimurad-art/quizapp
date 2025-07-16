package com.murad.quizapp.service;


import com.murad.quizapp.dao.QuestionDao;
import com.murad.quizapp.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestions() {
        questionDao.findAll().forEach(question -> System.out.println(question.getQuestionTitle()));
        return questionDao.findAll();
    }

    public List<Question> getQuestionsByCategory(String category) {
        return questionDao.findByCategoryIgnoreCase(category);
    }
}
