package com.khadija.obsersvabilitydemo.post;

public record Post(
        Integer id,
        Integer userId,
        String title,
        String body
) {
}
