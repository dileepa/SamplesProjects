package com.dileepa.controller;

import com.dileepa.domain.PersonBean;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

/**
 * USER : Dileepa
 * DATE : 5/17/15
 * TIME : 11:51 AM
 */
@Controller
public class PersonController
{
    @RequestMapping(value = "/RegisterPerson", method = RequestMethod.GET)
    public ModelAndView index()
    {
        ModelAndView modelAndView = new ModelAndView();
        PersonBean personBean = new PersonBean();
        modelAndView.getModel().put("person",personBean);
        modelAndView.setViewName("person/person");
        return modelAndView;

    }

    @RequestMapping(value = "/saveNewPerson", method = RequestMethod.POST)
    public ModelAndView saveNewPerson(@Valid @ModelAttribute("person") PersonBean personBean,BindingResult bindingResult)
    {
        if( bindingResult.hasErrors() )
        {
            ModelAndView registerFormView = index();
            registerFormView.getModel().remove("person");
            registerFormView.addObject(bindingResult);
            return registerFormView;
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("person/personSuccess");
        return modelAndView;

    }

}
