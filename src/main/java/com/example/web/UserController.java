package com.example.web;

import com.example.application.publication.service.impl.ServiceUserImpl;
import com.example.domain.publication.User;
import com.example.validator.UserValidator;
import com.example.web.forms.UserDTO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class UserController {
    @Autowired
    UserValidator userValidator;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true, 10);
        binder.registerCustomEditor(Date.class, editor);
        binder.setValidator(userValidator);
//        binder.addValidators(userValidator);
    }

    final static Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    protected ServiceUserImpl service;


    @RequestMapping("/lista")
    public String showIndex(Model model) {
        User contest = new User();
        model.addAttribute("element", contest);
        model.addAttribute("collection", service.findAll());
        return "lista";
    }


//    @RequestMapping("/dodaj")
//    public String addUser(Model model) {
//
//        model.addAttribute("info", "FORM");
//        return "forms/dodaj";
//    }

//    @RequestMapping("/{id}")
//    public String detailPublication(@PathVariable("id") Integer id, Model model) {
//
//        User user = new User();
//        user = service.findById(id);
//        logger.info("contestDao.getPublication(id): " + service.findById(id));
//        logger.info("contestDao.getPublication(id): " + user + user.getName() + user.getSurname() + user.getDateOfBirth() + user.getIndexNumber() + user.getEmail());
//        model.addAttribute("name", user.getName());
//        model.addAttribute("surname", user.getSurname());
//        model.addAttribute("dateOfBirth", user.getDateOfBirth());
//        model.addAttribute("indexNumber", user.getIndexNumber());
//        model.addAttribute("email", user.getEmail());
//
//        return "details/szczegoly";
//    }

    @RequestMapping("/dodaj")
    public String showFormPublication(HttpServletRequest request, @ModelAttribute("userDto") @Valid UserDTO userDTO, BindingResult result) {
        if (request.getMethod().equalsIgnoreCase("post") && !result.hasErrors()) {
            if (result.hasErrors()) {
                return "forms/contest";
            } else {
                User user = new User();
                user.setId(userDTO.getId());
                user.setName(userDTO.getName());
                user.setSurname(userDTO.getSurname());
                user.setDateOfBirth(userDTO.getDateOfBirth());
                user.setIndexNumber(userDTO.getIndexNumber());
                user.setEmail(userDTO.getEmail());
                service.save(user);

                return "redirect:/lista";
            }
        }
        return "dodaj";
    }
}
