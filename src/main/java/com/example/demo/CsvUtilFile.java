package com.example.demo;


import java.util.List;


public class CsvUtilFile {

    private CsvUtilFile() {
    }

    public PlayerRepository playerRepository;

    public CsvUtilFile(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getPlayers() {
        List<Player> list = playerRepository.findAll();
        return list;
    }
}

