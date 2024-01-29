package com.karla.tapas.domain;

import java.util.ArrayList;

public class GetTapasUseCase {

    private TapaRepository tapaRepository;

    public GetTapasUseCase(TapaRepository tapaRepository) {
        this.tapaRepository = tapaRepository;
    }

    public ArrayList<Tapa> execute(){
        return tapaRepository.obtainTapas();
    }
}
