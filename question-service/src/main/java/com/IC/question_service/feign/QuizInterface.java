//package com.IC.question_service.feign;
//
//import com.IC.quizapp.model.QuestionWrapper;
//import com.IC.quizapp.model.Response;
//import org.springframework.cloud.netflix.feign.FeignClient;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.List;
//
//@FeignClient("QUESTION-SERVICE")
//public interface QuizInterface {
//    @GetMapping("question/generate")
//    public ResponseEntity<List<Integer>> getQuestionsForQuiz
//            (@RequestParam String categoryName, @RequestParam Integer numQuestions );
//
//    @PostMapping("question/getQuestions")
//    public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(@RequestBody List<Integer> questionIds);
//
//    @PostMapping("question/getScore")
//    public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses);
//
//}
