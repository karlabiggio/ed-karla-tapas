package com.karla.tapas.domain;

public class Tapa {
    private String id;
    private String name;
    private String establishment;
    private String totalPoints;
    private double averageVotes;
    private String numberParticipants;
    private String totalVotes;
    private String ingredients;

    public Tapa(String id, String name, String establishment, String totalPoints, double averageVotes, String numberParticipants, String totalVotes, String ingredients) {
        this.id = id;
        this.name = name;
        this.establishment = establishment;
        this.totalPoints = totalPoints;
        this.averageVotes = averageVotes;
        this.numberParticipants = numberParticipants;
        this.totalVotes = totalVotes;
        this.ingredients = ingredients;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Tapa{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
