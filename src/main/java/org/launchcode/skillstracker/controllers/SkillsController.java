package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody


public class SkillsController {

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String skillstracker(){
        return "<html>" +
                "<body>" +
                "<h1>SKILLS TO LEARN</h1>" +
                "<h2>Top Three Skills I'm Learning</h2>" +
                "<ol><li>Javascript</li>" +
                "<li>Java</li>" +
                "<li>SQL</li>" +
                "</ol>" +
                "</body>" +
                "</html>";


        }


    @GetMapping("form")
    public String skillsForm(){
        return "<html>" +
                "<body>" +
                "<form action = '/form' method = 'post'>" + // submit a request to /
                "<p>NAME:</p>" +
                "<input type = 'text' name = 'name' />" +
                "<p>My Favorite Skill:</p>" +
                "<select name = 'favoriteOne'><option value = 'Javascript'>Javascript</option>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'Python'>Python</option>" +
                "<option value = 'MongoDB'>MongoDB</option>" +
                "<option value = 'SQL'>SQL</option>" +
                "<option value = 'Angular'>Angular</option>" +
                "<option value = 'Vue'>Vue</option>" +
                "<option value = 'React'>React</option>" +
                "</select>" +
                "<p>My 2nd Favorite Skill:</p>" +
                "<select name = 'favoriteTwo'><option value = 'Javascript'>Javascript</option>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'Python'>Python</option>" +
                "<option value = 'MongoDB'>MongoDB</option>" +
                "<option value = 'SQL'>SQL</option>" +
                "<option value = 'Angular'>Angular</option>" +
                "<option value = 'Vue'>Vue</option>" +
                "<option value = 'React'>React</option>" +
                "</select>" +
                "<p>My 3rd Favorite Skill:</p>" +
                "<select name = 'favoriteThree'><option value = 'Javascript'>Javascript</option>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'Python'>Python</option>" +
                "<option value = 'MongoDB'>MongoDB</option>" +
                "<option value = 'SQL'>SQL</option>" +
                "<option value = 'Angular'>Angular</option>" +
                "<option value = 'Vue'>Vue</option>" +
                "<option value = 'React'>React</option>" +
                "</select>" +
                "<p></p>" +
                "<input type = 'submit' value = 'Submit' />" +
                "</form>" +
                "</body>" +
                "</html>";
    }


    @PostMapping ("{name}")
    public String skillsWithRequest(@RequestParam String name) {
        return "<html>" +
                "<body>" +
                "<h1>"+name+"</h1>" +
                "<h2>You Want To Learn: </h2>" +
                "<ol><li>"+"</li>" +
                "<li>{favoriteTwo}}</li>" +
                "<li>{favoriteThree}</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

}
