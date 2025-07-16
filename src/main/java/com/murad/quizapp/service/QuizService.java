package com.murad.quizapp.service;

import com.murad.quizapp.dao.QuestionDao;
import com.murad.quizapp.dao.QuizDao;
import com.murad.quizapp.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizService {

    @Autowired
    QuizDao quizDao;

    public Quiz createQuizQuiz(String category, Integer numQ, String title) {
        return quizDao.findAll().getFirst();
    }
}
