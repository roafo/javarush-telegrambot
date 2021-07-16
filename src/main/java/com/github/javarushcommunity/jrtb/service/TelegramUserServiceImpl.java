package com.github.javarushcommunity.jrtb.service;

import com.github.javarushcommunity.jrtb.domain.TelegramUser;
import com.github.javarushcommunity.jrtb.repository.TelegramUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TelegramUserServiceImpl implements TelegramUserService {

    private final TelegramUserRepository telegramUserRepository;

    @Autowired
    public TelegramUserServiceImpl(TelegramUserRepository telegramUserRepository) {
        this.telegramUserRepository = telegramUserRepository;
    }

    @Override
    public void save(TelegramUser telegramUser) {
        this.telegramUserRepository.save(telegramUser);
    }

    @Override
    public List<TelegramUser> retrieveAllActiveUsers() {
        return this.telegramUserRepository.findAllByActiveTrue();
    }

    @Override
    public Optional<TelegramUser> findByChatId(String chatId) {
        return this.telegramUserRepository.findByChatId(chatId);
    }

    @Override
    public long countAllByActiveTrue() {
        return this.telegramUserRepository.countAllByActiveTrue();
    }
}
