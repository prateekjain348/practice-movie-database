package com.movie.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import static com.movie.utils.MetadataService.getResource;

@Controller
@RequestMapping("bankdetails")
public class RazorpayController {

    Map<String, Object> IFCSList = new HashMap<>();

    RazorpayController() {
        Map<String, Object> codeProperties = new HashMap<>();
        Properties props = new Properties();
        props = getResource("defaultCodes/ifsc.properties");
        for (Iterator<Object> iterator = props.keySet().iterator(); iterator.hasNext(); ) {
            String key = (String) iterator.next();
            String value = props.getProperty(key);
            IFCSList.put(key, value);
        }
    }

    @GetMapping("ifsc/{ifscCode}")
    public ResponseEntity<Object> getMovie(@PathVariable("ifscCode") Integer ifscCode) {
        String url = "https://ifsc.razorpay.com/" + IFCSList.get(ifscCode.toString());
        RestTemplate restTemplate = new RestTemplate();
        Object resp = restTemplate.getForObject(url, Object.class);
        return new ResponseEntity<Object>(resp, HttpStatus.OK);
    }
}
