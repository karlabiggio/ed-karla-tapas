package com.karla.tapas.presentation;

import com.karla.tapas.data.TapaDataRepository;
import com.karla.tapas.domain.*;

import java.util.ArrayList;

public class MainTapa {
    public static void printTapas() {
        GetTapasUseCase getTapasUseCase = new GetTapasUseCase(TapaDataRepository.newInstance());
        ArrayList<Tapa> tapas = getTapasUseCase.execute();
        System.out.println(tapas.toString());
    }

    public static void printTapa(String tapaId) {
        GetTapaUseCase getTapaUseCase = new GetTapaUseCase(TapaDataRepository.newInstance());
        Tapa tapa = getTapaUseCase.execute(tapaId);
        System.out.println(tapa.toString());
    }

    public static void deleteTapa(String tapaId) {
        DeleteTapaUseCase deleteTapaUseCase = new DeleteTapaUseCase(TapaDataRepository.newInstance());
        deleteTapaUseCase.execute(tapaId);
    }

    public static void createTapa(Tapa tapa) {
        SaveTapaUseCase saveTapaUseCase = new SaveTapaUseCase(TapaDataRepository.newInstance());
        saveTapaUseCase.execute(tapa);
    }

    public static void updateTapa(Tapa tapa) {
        UpdateTapaUseCase updateTapaUseCase = new UpdateTapaUseCase(TapaDataRepository.newInstance());
        updateTapaUseCase.execute(tapa);
    }
}
