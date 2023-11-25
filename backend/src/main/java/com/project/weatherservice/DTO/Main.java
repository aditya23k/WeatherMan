package com.project.weatherservice.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Main {

        private String temp;
        private String temp_min;
        private String temp_max;
        private String pressure;
        private String humidity;

        public Main(String temp, String temp_min, String temp_max, String pressure, String humidity) {
            this.temp = temp;
            this.temp_min = temp_min;
            this.temp_max = temp_max;
            this.pressure = pressure;
            this.humidity = humidity;
        }

}

