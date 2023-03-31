package com.example.travelagency.controller;

import com.example.travelagency.model.TravelModel;
import com.example.travelagency.service.TravelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/travel")
public class TravelController {

    private final TravelService travelService;

    ///wszytskie poniżesze należy poprawić nawet z nazwy bo są robione roboczo do sperawdzenia dodać wyjątki
    @GetMapping("/promotion")
    public ResponseEntity<List<TravelModel>> getAllTravels() {
//        return ResponseEntity
//                .status(HttpStatus.OK)
//                .body(travelService.findByPromotion());
        return ResponseEntity.ok(travelService.findByPromotion());
    }

    @GetMapping("/near")
    public ResponseEntity<List<TravelModel>> getAllTrabyDates() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(travelService.findByStartDateAfterNow());
    }



}
