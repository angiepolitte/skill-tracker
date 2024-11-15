package org.launchcode.skill_tracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@RequestMapping(value = "form")
@Controller
public class SkillsController {

    @GetMapping("form")
    @ResponseBody
    public String helloForm() {
        return "<form method ='post' action = '/display'>" +
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
                "<input type = 'submit' name = 'submitType' value = 'Table' />" +
                "<input type = 'submit' name = 'submitType' value = 'Ordered List' />" +
                "</form>";

    }
    @PostMapping("/display")
    @ResponseBody
    public String helloPost(@RequestParam String name,
                            @RequestParam String lang1,
                            @RequestParam String lang2,
                            @RequestParam String lang3,
                            @RequestParam String submitType) {

        if ("Table".equals(submitType)) {
            return "<h1>" + name + "'s Favorite Languages</h1>" +
                        "<table style='border: 1px solid black; border-collapse: collapse;'>" +
                            "<tr>" +
                                "<th style='border: 1px solid black; padding: 8px;'>#1 Language</th>" +
                                "<th style='border: 1px solid black; padding: 8px;'>#2 Language</th>" +
                                "<th style='border: 1px solid black; padding: 8px;'>#3 Language</th>" +
                            "</tr>" +
                            "<tr>" +
                                "<td style='border: 1px solid black; padding: 8px;'>" + lang1 + "</th>" +
                                "<td style='border: 1px solid black; padding: 8px;'>" + lang2 + "</th>" +
                                "<td style='border: 1px solid black; padding: 8px;'>" + lang3 + "</th>" +
                            "</tr>" +
                        "</table>";
        } else if ("Ordered List".equals(submitType)) {
            return "<h1>" + name + "'s Favorite Languages</h1>" +
                        "<ol>" +
                            "<li>" + lang1 + "</li>" +
                            "<li>" + lang2 + "</li>" +
                            "<li>" + lang3 + "</li>" +
                        "</ol>";
        } else {
            return "<h1>Error</h1>";
        }


    }

}
