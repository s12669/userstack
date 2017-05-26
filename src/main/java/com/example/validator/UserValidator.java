package com.example.validator;


import com.example.application.publication.service.ServiceUser;
import com.example.domain.publication.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

//http://docs.spring.io/spring/docs/current/spring-framework-reference/html/validation.html#validation-mvc-configuring
@Component
public class UserValidator implements Validator {

    @Autowired
    ServiceUser serviceUser;

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

        User user = (User) target;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "NotEmpty.userForm.name");
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "NotEmpty.userForm.email");
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address", "NotEmpty.userForm.address");
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty.userForm.password");
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPassword","NotEmpty.userForm.confirmPassword");
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "sex", "NotEmpty.userForm.sex");
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "country", "NotEmpty.userForm.country");
//
//        if(!emailValidator.valid(user.getEmail())){
//            errors.rejectValue("email", "Pattern.userForm.email");
//        }
//
//        if(user.getNumber()==null || user.getNumber()<=0){
//            errors.rejectValue("number", "NotEmpty.userForm.number");
//        }
//
//        if(user.getCountry().equalsIgnoreCase("none")){
//            errors.rejectValue("country", "NotEmpty.userForm.country");
//        }
//
//        if (!user.getPassword().equals(user.getConfirmPassword())) {
//            errors.rejectValue("confirmPassword", "Diff.userform.confirmPassword");
//        }
//
//        if (user.getFramework() == null || user.getFramework().size() < 2) {
//            errors.rejectValue("framework", "Valid.userForm.framework");
//        }
//
//        if (user.getSkill() == null || user.getSkill().size() < 3) {
//            errors.rejectValue("skill", "Valid.userForm.skill");
//        }

    }

}