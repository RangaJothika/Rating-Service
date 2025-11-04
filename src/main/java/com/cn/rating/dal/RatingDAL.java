package com.cn.rating.dal;

import java.util.*;

public interface RatingDAL {

	public Long getRatingById(String id);

	public void addRating(Map<String, Long> hotelRatingMap);

	public Map<String, Long> getAllRating();

	public void updateRating(Map<String, Long> hotelRatingMap);

	public void deleteRating(String id);
}
