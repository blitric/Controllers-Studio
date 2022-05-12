package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class SkillsController {
@GetMapping
    @ResponseBody
    public String showIntro() {
   String html = "<html>" +
           "<body>" +
           "<h1>" + "Skills Tracker" + "</h1>" +
           "<h2>" + "We have a few skills we would like to learn. Here is the list!" +"</h2>" +
           "<ol>"+
           "<li>" + "Java" + "</li>" +
           "<li>" + "JavaScript" + "</li>" +
           "<li>" + "Python" + "</li>" +
            "</ol>" +
           "</body>"+
           "</html>";
           return html;
}

@GetMapping("form")
    @ResponseBody
    public String showForm() {
    String html = "<html>" +
            "<body>" +
            "<form method = 'post' action = 'form'>" +
            "<label style = 'font-weight:bold'>" + "Name:" + "<br>" +
            "<input type = 'text' name = 'inputName'>" + "</h1>" +
            "</label>" + "<br>" +
            "<label style = 'font-weight:bold'>" + "My favorite language:" + "<br>" +
            "<select name = 'language1'>"  +
            "<option value = 'Java'>" + "Java" + "</option>"+
            "<option value = 'JavaScript'>" + "JavaScript" + "</option>"+
            "<option value = 'Python'>" + "Python" + "</option>"+
            "</select>" +
            "</label>" + "<br>" +
            "<label style = 'font-weight:bold'>" + "My second favorite language:" + "<br>" +
            "<select name = 'language2'>"  +
            "<option value = 'Java'>" + "Java" + "</option>"+
            "<option value = 'JavaScript'>" + "JavaScript" + "</option>"+
            "<option value = 'Python'>" + "Python" + "</option>"+
            "</select>" +
            "</label>" + "<br>" +
            "<label style = 'font-weight:bold'>" + "My third favorite language:" + "<br>" +
            "<select name = 'language3'>"  +
            "<option value = 'Java'>" + "Java" + "</option>"+
            "<option value = 'JavaScript'>" + "JavaScript" + "</option>"+
            "<option value = 'Python'>" + "Python" + "</option>"+
            "</select>" +
            "</label>" + "<br>" +
            "<input type = 'submit'>" +
            "</form>" +
            "</body>"+
            "</html>";
            return html;
}

@PostMapping ("form")
    @ResponseBody
    public String displayResults(@RequestParam String inputName, @RequestParam String language1,
                                 @RequestParam String language2, @RequestParam String language3) {
    String html = "<html>" +
            "<body>" +
            "<h1>" + inputName + "</h1>" +
            "<ol>"+
            "<li>" + language1 + "</li>" +
            "<li>" + language2 + "</li>" +
            "<li>" + language3 + "</li>" +
            "</ol>" +
            "</body>"+
            "</html>";
    return html;
}

}
