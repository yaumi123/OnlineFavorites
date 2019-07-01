package com.ares.OnlineFavorites.api.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class AddFavoriteRequest {

    private String title;

    @NotBlank
    private String url;

    @Size(max = 255)
    private String description;

}
