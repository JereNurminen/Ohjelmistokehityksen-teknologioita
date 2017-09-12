package com.jerenurminen.k2h2.StudentController;

import com.jerenurminen.k2h2.com.jerenurminen.k2h2.beans.Friend;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController
{

    static List<Friend> friendList = new ArrayList<>();

    @RequestMapping(value= "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("friends", friendList);
        model.addAttribute("newFriend", new Friend());
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    //public String addNewFriend(@RequestParam(value = "newFriend") Friend friend) {
    public String addNewFriend(Model model, @ModelAttribute Friend friend) {
        friendList.add(friend);
        model.addAttribute("friends", friendList);
        model.addAttribute("newFriend", new Friend());
        return "index";
    }

}
