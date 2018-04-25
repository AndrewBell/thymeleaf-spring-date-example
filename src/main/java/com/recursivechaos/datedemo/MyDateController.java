/**
 * Created by Andrew Bell 4/24/18
 * www.recursivechaos.com
 * andrew@recursivechaos.com
 * Licensed under MIT License 2018. See license.txt for details.
 */

package com.recursivechaos.datedemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyDateController {

    @RequestMapping
    public String showForm(Model model) {
        model.addAttribute("myDate", new MyDate());
        return "index";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String handlePost(Model model, @ModelAttribute MyDate myDate) {
        model.addAttribute("myDate", new MyDate());
        model.addAttribute("convertedDate", myDate.getDate());
        return "index";
    }

}
