package com.arnatovich.featuresuplierms;

import lombok.Data;

@Data
public class Feature {

  private final String feature;
  
  public Feature(String feature) {
    this.feature = feature;
  }
}
