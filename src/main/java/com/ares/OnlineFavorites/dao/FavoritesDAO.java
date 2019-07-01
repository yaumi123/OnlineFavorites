package com.ares.OnlineFavorites.dao;

import com.ares.OnlineFavorites.domain.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FavoritesDAO extends JpaRepository<Favorite, Integer> {

    List<Favorite> listAllFavorites();

    Favorite findByFavoriteId(Integer id);
}
