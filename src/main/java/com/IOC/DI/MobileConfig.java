package com.IOC.DI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MobileConfig {        // this class act as container

    @Bean
    public Mobiles getOnePlusObject( Color color){        // for get Color obj in onePlus obj need to inject color obj here
        return new OnePlus(color);
    }
    @Bean
    public Mobiles getIphoneObject( Color color){       // for get Color obj in Iphone obj need to inject color obj here
        return new Iphone(color);
    }
   @Bean                         // Now creating Bean for color
   public Color getColor(){
        return new Color();
   }
}
