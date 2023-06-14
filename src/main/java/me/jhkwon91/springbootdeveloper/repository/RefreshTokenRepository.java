package me.jhkwon91.springbootdeveloper.repository;

import me.jhkwon91.springbootdeveloper.domain.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Ref;
import java.util.Optional;


public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
    Optional<RefreshToken> findByUserId(Long userId);
    Optional<RefreshToken> findByRefreshToken(String refreshToken);
}
