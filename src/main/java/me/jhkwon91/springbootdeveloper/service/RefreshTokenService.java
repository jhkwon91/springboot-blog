package me.jhkwon91.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.jhkwon91.springbootdeveloper.domain.RefreshToken;
import me.jhkwon91.springbootdeveloper.repository.RefreshTokenRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RefreshTokenService {

    private final RefreshTokenRepository refreshTokenRepository;

    public RefreshToken findByRefreshToken(String refreshToken) {
        return refreshTokenRepository.findByRefreshToken(refreshToken)
                .orElseThrow(() -> new IllegalArgumentException("Unexprected token"));
    }
}
