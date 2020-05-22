package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String possibleLanguages() {
        return "<html>" +
                "<body>" +
                    "<h1>Skills Tracker</h2>" +
                    "<h2>We have a few skills we would like to learn, Here is the list!</h2>" +
                    "<ol>" +
                        "<li>Java</li>" +
                        "<li>Swift</li>" +
                        "<li>JavaScript</li>" +
                    "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String languageForm() {
        return "<html>" +
                "<body>" +
                "<form method='post' action='/languages'>" +
                    "<h2>Name:</h2>" +
                    "<input type = 'text' name = 'name' />" +
                    "<h2>My favorite language:</h2>" +
                        "<select id='firstChoice' name = 'firstChoice'>" +
                            "<option value='Java'>Java</option>" +
                            "<option value='JavaScript'>JavaScript</option>" +
                            "<option value='Swift'>Swift</option>" +
                         "</select>" +
                    "<h2>My second favorite language:</h2>" +
                         "<select id='secondChoice' name='secondChoice'>" +
                            "<option value='Java'>Java</option>" +
                            "<option value='JavaScript'>JavaScript</option>" +
                            "<option value='Swift'>Swift</option>" +
                        "</select>" +
                     "<h2>My third favorite language:</h2>" +
                        "<select id='thirdChoice' name = 'thirdChoice'>" +
                            "<option value='Java'>Java</option>" +
                            "<option value='JavaScript'>JavaScript</option>" +
                            "<option value='Swift'>Swift</option>" +
                        "</select>" +
                     "<br><br><input type = 'submit' value = 'Submit'/>" +
                    "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("languages")
    public String printChoices(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice) {
        return "<html>" +
                "<body>" +
                    "<h1 align = 'center'>" + name + "</h1>" +
                "<table width = '50%' border = '5' align = 'center' cell padding = '5' cell spacing = '0' color = '#ffffff'>" +
                    "<tr>" +
                        "<th>First Choice</th>" +
                        "<th>Second Choice</th>" +
                        "<th>Third Choice</th>" +
                    "</tr>" +
                    "<tr align = 'center'>" +
                        "<td>" + firstChoice + "</td>" +
                        "<td>" + secondChoice + "</td>" +
                        "<td>" + thirdChoice + "</td>" +
                    "</tr>" +
                "</table>" +
                "</body>" +
                "</html>";
    }
}