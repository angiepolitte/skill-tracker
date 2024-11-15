package org.launchcode.skill_tracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "form")
@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String helloForm() {
        return "<form method ='post'>" +
                "<p>Name<br/><input type = 'text' name = 'name' /></p>" +
                "<p>My favorite language:<br/><select name = 'lang1'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select></p>" +
                "<p>My second favorite language:<br/><select name = 'lang2'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select></p>" +
                "<p>My third favorite language:<br/><select name = 'lang3'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select></p>" +
                "<input type = 'submit' value = 'Submit' />" +
                "</form>";

    }
    @PostMapping
    @ResponseBody
    public String helloPost(@RequestParam String name, @RequestParam String lang1, @RequestParam String lang2, @RequestParam String lang3) {
        return "<h1>" + name + "</h1>" +
                "<ol><li>" + lang1 + "</li>" +
                "<li>" + lang2 + "</li>" +
                "<li>" + lang3 + "</li></ol>";
    }

}
