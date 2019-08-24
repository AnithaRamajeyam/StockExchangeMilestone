package com.demo.stockExchangeApplication.controller;

import java.sql.SQLException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.demo.stockExchangeApplication.model.Company;
import com.demo.stockExchangeApplication.model.IPODetail;
import com.demo.stockExchangeApplication.service.CompanyService;
import com.demo.stockExchangeApplication.service.IPODetailService;

@Controller
public class IPODetailControllerImpl implements IPODetailController {
	
	@Autowired
	IPODetailService iposervice;
	
	@RequestMapping("/insertipodetail")
	public String insertipodetail(Model model)
	{
		IPODetail ipodetail=new IPODetail();
		model.addAttribute("ipodetail", ipodetail);
		return "insert_ipodetail";
	}
	@RequestMapping(value="/insertipo", method=RequestMethod.POST)
    public String insertIpodetail( @Valid IPODetail ipodetail,Model model) throws SQLException{
		
			 IPODetail result1=iposervice.insertIPODetail(ipodetail);
			 if(result1!=null)
			 {
				 	return "success";
			 }
			 else
			 {
				 	return "error";
			 }
	}
	@Override
	public IPODetail insertIPODetail(IPODetail ipodetail) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@RequestMapping("/displayipo")
	public ModelAndView getAllIPOPLanned() throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("displayIpodetails");
		mv.addObject("ipoList",iposervice.getAllIPOPLanned());
		return mv;
	}
	

	
	
}
