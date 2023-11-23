package com.project.weatherservice.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Coord {

        private String lon;
        private String lat;

        public Coord(String lon, String lat) {
            this.lon = lon;
            this.lat = lat;
        }


}

