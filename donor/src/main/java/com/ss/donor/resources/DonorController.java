package com.ss.donor.resources;

import com.ss.donor.model.request.DonorRequestPayload;
import com.ss.donor.model.response.DonorResponsePayload;
import com.ss.donor.utils.DonorServiceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class DonorController {
    @Autowired
    private DonorServiceUtil donorService;

    @RequestMapping("/showRegistrationPage")
    public String index() {
        return "registrationPage";
    }

    @RequestMapping("/searchDonors")
    public String searchDonor() {
        return "searchDonors";
    }

    @RequestMapping(value="/showAllDonors", method = RequestMethod.GET)
    public ModelAndView getAllDonor() {
        return getView("showAllDonors", "listDonors", donorService.getAllDonors());
    }

    @RequestMapping(value="/donor/v1", method = RequestMethod.GET)
    public ModelAndView searchDonor(@RequestParam("city") String city,
                                    @RequestParam("bloodGroup") String bloodGroup) {
        return getView("showAllDonors", "listDonors", donorService.getDonor(city, bloodGroup));
    }

    @RequestMapping(value="/donor/v1", method = RequestMethod.POST)
    public ModelAndView registerDonor(DonorRequestPayload payload ) {
        donorService.registerDonor(payload);
        return getView("showAllDonors", "listDonors", donorService.getAllDonors());
    }

    private ModelAndView getView(String viewName, String viewObjName, List<DonorResponsePayload> respPayload) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(viewName);
        modelAndView.addObject(viewObjName, respPayload);
        return modelAndView;
    }

}
