package com.arnatovich.featuresuplierms;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/features", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin("*")
public class FeatureController {
  
  @GetMapping("/all")
  List<Feature> allFeatures() {
    ArrayList<Feature> features = new ArrayList<>();
    features.add(new Feature("Intelligence"));
    return features;
  }

}
