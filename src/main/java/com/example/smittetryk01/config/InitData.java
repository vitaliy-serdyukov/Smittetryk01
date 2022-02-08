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
    County roskilde = new County();
    roskilde.setCountyCode("0265");
    roskilde.setName("Roskilde");
    roskilde.setHref("https://api.dataforsyningen.dk/kommuner/0265");
    countyRepository.save(roskilde);

    roskilde.setCountyCode("0259");
    roskilde.setName("Køge");
    roskilde.setHref("https://api.dataforsyningen.dk/kommuner/0259");
    countyRepository.save(roskilde);

    roskilde.setCountyCode("0259");
    roskilde.setName("Køge");
    roskilde.setHref("https://api.dataforsyningen.dk/kommuner/0259");
    countyRepository.save(roskilde);

    roskilde.setCountyCode("0169");
    roskilde.setName("Høje-Taastrup");
    roskilde.setHref("https://api.dataforsyningen.dk/kommuner/0169");
    countyRepository.save(roskilde);
  }


}
