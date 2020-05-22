package org.launchcode.skillstracker.controllers;

import org.apache.coyote.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller

public class SkillsController {
    @GetMapping
    @ResponseBody
    public String possibleLanguages() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                    "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                    "<ol>" +
                        "<li>Java</li>" +
                        "<li>JavaScript</li>" +
                        "<li>Swift</li>" +
                    "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    @ResponseBody
    public String languageForm() {
        return "<html>" +
                "<body>" +
                    "<form method = 'post' action = '/languages'>" +
                        "<h2>Name:</h2>" +
                        "<input type = 'text' name = 'name'>" +
                        "<h2>My favorite language:</h2>" +
                        "<select id='firstChoice' name='firstChoice'>" +
                        "    <option value='Java'>Java</option>" +
                        "    <option value='JavaScript'>JavaScript</option>" +
                        "    <option value='Swift'>Swift</option>" +
                        "</select>" +
                    "<h2>My second favorite language:</h2> " +
                            "<select id='secondChoice' name='secondChoice'>" +
                                "<option value='Java'>Java</option>" +
                                "<option value='JavaScript'>JavaScript</option>" +
                                "<option value='Swift'>Swift</option>" +
                            "</select>" +
                    "<h2>My third favorite language:</h2>" +
                    "       <select id='thirdChoice' name='thirdChoice'>" +
                                "<option value='Java'>Java</option>" +
                                "<option value='JavaScript'>JavaScript</option>" +
                                "<option value='Swift'>Swift</option>" +
                    "       </select>" +
                    "<br><br><input type = 'submit' value = 'Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("languages")
    @ResponseBody
    public String printChoices(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                    "<li>" + firstChoice + "</li>" +
                    "<li>" + secondChoice + "</li>" +
                    "<li>" + thirdChoice + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
}
