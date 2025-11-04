package com.cn.rating.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.rating.dal.RatingDAL;

import java.util.*;

@Service
public class RatingService {
	@Autowired
	RatingDAL ratingDAL;

	public Long getRatingById(String id) {
		return ratingDAL.getRatingById(id);
	}

	public void addRating(Map<String, Long> hotelRatingMap) {
		ratingDAL.addRating(hotelRatingMap);
	}

	public Map<String, Long> getAllRating() {
		return ratingDAL.getAllRating();
	}

	public void updateRating(Map<String, Long> hotelRatingMap) {
		ratingDAL.updateRating(hotelRatingMap);
	}

	public void deleteRating(String id) {
		ratingDAL.deleteRating(id);
	}
}
