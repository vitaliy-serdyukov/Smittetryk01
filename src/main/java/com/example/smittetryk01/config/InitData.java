package com.example.smittetryk01.config;

import com.example.smittetryk01.model.County;
import com.example.smittetryk01.repository.CountyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class InitData implements CommandLineRunner {

  @Autowired
  CountyRepository countyRepository;

  @Override
  public void run(String... args) throws Exception {
    County county = new County();
    county.setCountyCode("0265");
    county.setName("Roskilde");
    county.setHref("https://api.dataforsyningen.dk/kommuner/0265");
    countyRepository.save(county);

    county.setCountyCode("0259");
    county.setName("Køge");
    county.setHref("https://api.dataforsyningen.dk/kommuner/0259");
    countyRepository.save(county);

    county.setCountyCode("0259");
    county.setName("Køge");
    county.setHref("https://api.dataforsyningen.dk/kommuner/0259");
    countyRepository.save(county);

    county.setCountyCode("0169");
    county.setName("Høje-Taastrup");
    county.setHref("https://api.dataforsyningen.dk/kommuner/0169");
    countyRepository.save(county);
  }


}
