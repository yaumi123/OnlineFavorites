package com.ares.OnlineFavorites.controller;

import com.ares.OnlineFavorites.api.request.AddFavoriteRequest;
import com.ares.OnlineFavorites.api.response.ListFavoritesResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@Controller
@RequestMapping("/favorite")
public class AddFavoriteController {

    @PostMapping("/favorite")
    public ResponseEntity<?> addFavorite (@RequestBody AddFavoriteRequest addFavoriteRequest){
        return null;
    }


}
