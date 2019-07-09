package com.ares.OnlineFavorites.service;

import com.ares.OnlineFavorites.domain.Favorite;

import java.util.List;

public interface FavoriteService {
    List<Favorite> getAllFavorites();

    Boolean addFavorite(Favorite favorite);
}
