/**
 * Created by Andrew Bell 4/24/18
 * www.recursivechaos.com
 * andrew@recursivechaos.com
 * Licensed under MIT License 2018. See license.txt for details.
 */

package com.recursivechaos.datedemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class MyDateController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String showForm(Model model) {
        model.addAttribute("myDate", new MyDate());
        return "datepicker";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String handlePost(Model model, @ModelAttribute MyDate myDate) {
        model.addAttribute("myDate", new MyDate());
        model.addAttribute("convertedDate", myDate.getDate().toString());
        return "datepicker";
    }

}
