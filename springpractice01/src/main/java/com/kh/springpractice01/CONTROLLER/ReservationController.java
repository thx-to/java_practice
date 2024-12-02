package com.kh.springpractice01.CONTROLLER;

import com.kh.springpractice01.DAO.ReservationDAO;
import com.kh.springpractice01.VO.ReservationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

    @Autowired
    private ReservationDAO reservationDAO;

    @GetMapping("/{storeName}")
    public List<ReservationVO> getReservations(@PathVariable String storeName) {
        return reservationDAO.getReservationsByStore(storeName);
    }

    @PostMapping
    public String createReservation(@RequestBody ReservationVO reservationVO) {
        int result = reservationDAO.createReservation(reservationVO);
        return result > 0 ? "예약 성공" : "예약 실패";
    }

    @DeleteMapping("/{rNo")
    public String deleteReservation(@PathVariable int rNo) {
        int result = reservationDAO.deleteReservation(rNo);
        return result > 0 ? "삭제 성공" : "삭제 실패";
    }

}
