package org.launchcode.skill_tracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@RequestMapping(value = "form")
@Controller
public class SkillsController {

    @GetMapping("form")
    @ResponseBody
    public String helloForm() {
        return "<form method ='post' action = '/table'>" +
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
    @PostMapping("/table")
    @ResponseBody
    public String helloPost(@RequestParam String name, @RequestParam String lang1, @RequestParam String lang2, @RequestParam String lang3) {
//        return "<h1>" + name + "</h1>" +
//                "<ol><li>" + lang1 + "</li>" +
//                "<li>" + lang2 + "</li>" +
//                "<li>" + lang3 + "</li></ol>";
        return "<h1>" + name + "'s Favorite Languages</h1>" +
                "<table>" +
                    "<tr>" +
                        "<th>#1 Language</th>" +
                        "<th>#2 Language</th>" +
                        "<th>#3 Language</th>" +
                    "</tr>" +
                    "<tr>" +
                    "<th>" + lang1 + "</th>" +
                    "<th>" + lang2 + "</th>" +
                    "<th>" + lang3 + "</th>" +
                    "</tr>" +
                "</table>";


    }

}
