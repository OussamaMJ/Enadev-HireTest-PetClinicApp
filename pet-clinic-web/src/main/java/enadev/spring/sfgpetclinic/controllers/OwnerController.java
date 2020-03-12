package enadev.spring.sfgpetclinic.controllers;

import enadev.spring.sfgpetclinic.model.Owner;
import enadev.spring.sfgpetclinic.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequestMapping("/owners")
@Controller
public class OwnerController {
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder){
        dataBinder.setDisallowedFields("id");
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners(Model model){
        model.addAttribute("owners",ownerService.findAll());
        return "owners/index";
    }

    @RequestMapping("/find")
    public String findOwner(Model model){
        model.addAttribute("owner",Owner.builder().build());
        return "owners/findOwners";
    }

    @GetMapping
    public String processFindForm(Owner owner, BindingResult result, Model model){
        if(owner.getLastName() == null){
            owner.setLastName("");
        }
        List<Owner> listOwners = ownerService.findAllByLastNameLike("%"+owner.getLastName()+"%");
        if(listOwners.isEmpty()){
            result.reject("lastName", new String[]{"notFound"}, "Not Found");
            return "owners/findOwners";
        }else if(listOwners.size() == 1){
            owner = listOwners.get(0);
            return "redirect:/owners/"+owner.getId();
        }else{
            model.addAttribute("selections", listOwners);
            return "owners/ownersList";
        }
    }

    @GetMapping("/{ownerId}")
    public ModelAndView showOwner(@PathVariable("ownerId") Long ownerId){
        ModelAndView mav = new ModelAndView("owners/ownerDetails");
        mav.addObject(ownerService.findById(ownerId));
        return mav;
    }


}
