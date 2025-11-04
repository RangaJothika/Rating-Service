package com.cn.rating.dal;

import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class RatingDALImpl implements RatingDAL {
	private final Map<String, Long> ratingMap = new HashMap<>();

	public Long getRatingById(String id) {

		return ratingMap.get(id);
	}

	public void addRating(Map<String, Long> hotelRatingMap) {
		ratingMap.putAll(hotelRatingMap);// this method leads to overriting if the id already exists//but
		// overwriting is uncommon for post in real world
	}

	public Map<String, Long> getAllRating() {
		return ratingMap;
	}

	public void updateRating(Map<String, Long> hotelRatingMap) {
		ratingMap.putAll(hotelRatingMap);
	}

	public void deleteRating(String id) {

		ratingMap.remove(id);
	}
}
