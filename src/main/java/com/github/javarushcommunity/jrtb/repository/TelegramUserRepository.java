package com.github.javarushcommunity.jrtb.repository;

import com.github.javarushcommunity.jrtb.domain.TelegramUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TelegramUserRepository extends JpaRepository<TelegramUser, String> {

    List<TelegramUser> findAllByActiveTrue();
    Optional<TelegramUser> findByChatId(String chatId);

}
