package com.karla.tapas.domain;

public class DeleteTapaUseCase {
    private TapaRepository tapaRepository;

    public DeleteTapaUseCase(TapaRepository tapaRepository) {
        this.tapaRepository = tapaRepository;
    }

    public void execute(String tapaId){
        tapaRepository.deleteTapa(tapaId);
    }
}
