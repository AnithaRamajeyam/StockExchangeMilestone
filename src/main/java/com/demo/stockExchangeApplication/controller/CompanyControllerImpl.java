package com.demo.stockExchangeApplication.controller;

import java.sql.SQLException;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.demo.stockExchangeApplication.model.Company;
import com.demo.stockExchangeApplication.service.CompanyService;

@Controller
public class CompanyControllerImpl implements CompanyController{
	
	@Autowired
	CompanyService service;
	
	@RequestMapping("/insertcompany")
	public String Load(Model model)
	{
		Company company=new Company();
		model.addAttribute("company", company);
		return "insertCompany";
	}
	@RequestMapping(value="/insert", method=RequestMethod.POST)
    public String insertCompany( @Valid Company company,BindingResult result,Model model) throws SQLException{
		 if (result.hasErrors()) {
	            return "insertCompany";
	      }
		 else
		 {
			 Company result1=service.insertCompany(company);
			 if(result1!=null)
			 {
				 	return "success";
			 }
			 else
			 {
				 	return "error";
			 }
		 }
	}
	public boolean updateCompany(Company company) {
        // TODO Auto-generated method stub
        return (Boolean) null;
	}
	@RequestMapping("/displaycompany")
	public ModelAndView getCompanyList() throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("displayCompany");
		mv.addObject("companyList",service.getCompanyList());
		return mv;
	}
}
