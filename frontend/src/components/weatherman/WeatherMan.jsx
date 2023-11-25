import React, { useState } from 'react';
import './WeatherMan.css';
import axios from 'axios';



import Search1 from '../assets/Search1.png'
import Humidity_icon from '../assets/Humidity.png'
import Wind_Speed from '../assets/WindSpeed.png'
import clear from '../assets/clear.png'
import clear_day from '../assets/clr_d.png'
import clear_night from '../assets/clr_n.png'
import fc_day from '../assets/fc_d.png'
import fc_night from '../assets/fc_n.png'
import scat_cld from '../assets/scd.png'
import brk_cld from '../assets/bcd.png'
import sh_rn from '../assets/shr.png'
import rn_day from '../assets/r_d.png'
import rn_night from '../assets/r_n.png'
import thunderst from '../assets/ths.png'
import snow from '../assets/snd.png'
import mist from '../assets/mist.png'



export const WeatherMan = () => {
  const[weatherData, setWeatherData]= useState({});

  const[weatherLocation, setWeatherLocation]= useState('');
  
  let url=`http://localhost:8080/weather/${weatherLocation}`;
  
  const getWeatherData = async () => {

      await axios.get(url).then((response) => {
        setWeatherData(response.data);
        console.log(response.data);
      }).catch((error) => {
        console.log(error);
        setWeatherData({})
      });
      setWeatherLocation('');
    
  }

  const weatherIcon = () => {
    let weatherCode = '';
    if (weatherData.weather && weatherData.weather.length > 0) {
      weatherCode = weatherData.weather[0].id;
    }

    if (weatherCode >= 200 && weatherCode <= 232) {
      return thunderst;
    }
    else if (weatherCode >= 300 && weatherCode <= 321) {
      return sh_rn;
    }
    else if (weatherCode >= 500 && weatherCode <= 504) {
      if (weatherCode === 500) {
        return rn_day;
      }
      else {
        return rn_night;
      }
    }
    else if (weatherCode === 511) {
      return snow;
    }
    else if (weatherCode >= 520 && weatherCode <= 531) {
      return sh_rn;
    }
    else if (weatherCode >= 600 && weatherCode <= 622) {
      return snow;
    }
    else if (weatherCode >= 701 && weatherCode <= 781) {
      return mist;
    }
    else if (weatherCode === 800) {
      if (weatherCode === 800) {
        return clear_day;
      }
      else {
        return clear_night;
      }
    }
    else if (weatherCode === 801) {
      if (weatherCode === 801) {
        return fc_day;
      }
      else {
        return fc_night;
      }
    }
    else if (weatherCode === 802) {
      return scat_cld;
    }
    else if (weatherCode === 803 || weatherCode === 804) {
      return brk_cld;
    }
    else {
      return clear_day ;
    }
  }

  return (
    <div className='container'>

        <div className ='top'>
        
          <div className="top-bar">
            
            <input value={weatherLocation}
              onChange={event => setWeatherLocation(event.target.value)}  placeholder="Enter location" />
              <div className="search-icon" >
                <img src={Search1} alt="search" onClick={getWeatherData} />
              </div>
          </div> 
          <h1>WeatherMan Reporter</h1>
          
        </div> 
         

      { weatherData.name !== undefined &&
        <div className="mid-bottom">
          <div className="middle">
            <div className="weather--description-location">
              <p>{weatherData.weather[0].description} in {weatherData.name}</p>
          

              <div className="weather_icon">
                <img src={weatherIcon()} alt="clear day"/>
              </div>

              <div className="weather_desc">
                {weatherData.weather ? <p>{weatherData.weather[0].main}</p> : null}
              </div>
          
              <div className="weather_temp">
                <div className="temperature">
                  {weatherData.main ? <p>{weatherData.main.temp}ºC</p> : null}
                </div>
              </div>
            </div>
          </div>
          <div className='bottom'>
          
            <div className="Humidity_element">
              <img src={Humidity_icon} alt="Humidity" className="humid_icon" />
                <div className="humidity-perc">
                  {weatherData.main ? <p>{weatherData.main.humidity}%</p> : null}
                </div>
                <div className="label">Humidity</div>
            </div>

            <div className="Wind_Element">
                  <img src={Wind_Speed} alt="Wind Speed" className="ws_icon"/>
                  <div className="wind-speed">
                    {weatherData.wind ? <p>{weatherData.wind.speed} km/h</p> : null}
                  </div>
                  <div className="label">Wind Speed</div>

            </div>

        </div>
      </div>
      }
      
    </div>
  )
}


export default WeatherMan
