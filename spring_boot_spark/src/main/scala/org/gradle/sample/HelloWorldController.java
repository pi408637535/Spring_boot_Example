package org.gradle.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class HelloWorldController {

    @RequestMapping(value="/movie", method=GET)
    @ResponseBody
    public String callScalaMovieRatingCode() {
        MovieRatings.CalculateAverageRating();
        return "Hello World!";
    }

    @RequestMapping(value="/pi", method=GET)
    @ResponseBody
    public String callScalaPiCode() {
        MovieRatings.runPi();
        return "Hello World!";
    }

    @RequestMapping(value="/textClassify", method=GET)
    @ResponseBody
    public String callScalaTextClassify() {
        MovieRatings.runNaiveBayesClassify();
        return "Hello World!";
    }
}
