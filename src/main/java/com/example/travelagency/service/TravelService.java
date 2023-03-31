package com.example.travelagency.service;

import com.example.travelagency.model.TravelModel;
import com.example.travelagency.model.Type;
import com.example.travelagency.repository.TravelRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Slf4j
@Service
public class TravelService {
    private final TravelRepository travelRepository;

    public TravelService(final TravelRepository travelRepository) {
        this.travelRepository = travelRepository;
    }

    public List<TravelModel> findByPromotion() {
        List<TravelModel> allByPromotionIsTrue = travelRepository.findAllByPromotionIsTrue();
        return allByPromotionIsTrue;
    }

    public List<TravelModel> findByStartDateAfterNow() {
        Date aktualDate = new Date();
        return travelRepository.findAllByStartDateIsAfterOrderByStartDate(aktualDate);
    }

    public List<TravelModel> findByStartDateAfterNowOrderByContinent() {
        Date aktualDate = new Date();
        return travelRepository.findAllByStartDateIsAfterOrderByContinentModelId(aktualDate);
    }

    public List<TravelModel> findByStartDateAfterNowOrderByCountry() {
        Date aktualDate = new Date();
        return travelRepository.findAllByStartDateIsAfterOrderByCountryModelId(aktualDate);
    }

    public List<TravelModel> findTravelsByAirportName(String airportName) {
        return travelRepository.findAllByStart_AirPortName(airportName);
    }

    public List<TravelModel> findTravelsByHotelName(String hotelName) {
        return travelRepository.findAllByHotelModel_HotelName(hotelName);
    }

    public List<TravelModel> findTravelsByStartDate(Date date) {
        return travelRepository.findAllByStartDateIs(date);
    }

    public List<TravelModel> findTravelsByEndDate(Date date) {
        return travelRepository.findAllByEndDateIs(date);
    }

    public List<TravelModel> findTravelsByHotelType(Type type) {  //czy dobry typ przekazany do metody
        return travelRepository.findAllByHotelTypeIs(type);
    }

    public List<TravelModel> findTravelsByHotelStars(Integer hotelStars) {
        return travelRepository.findAllByHotelModel_StarsNumber(hotelStars);
    }


}
