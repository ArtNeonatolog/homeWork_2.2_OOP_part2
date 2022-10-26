package transport;

import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String model;
    private Float engineVolume;
    private String color;
    private final Integer productionYear;
    private final String productionCountry;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final Integer numberOfSeats;
    private Boolean summerTires;

    public Car() {
        this("default", "default", 1.5f, "белый", 2000, "Россия",
                "автомат", "седан", "0xxx000x", 4, true);
    }

    public Car(String brand) {
        this(brand, "default", 1.5f, "белый", 2000, "Россия",
                "автомат", "седан", "0xxx000x", 4, true);
    }

    public Car(String brand, String model) {
        this(brand, model, 1.5f, "белый", 2000, "Россия",
                "автомат", "седан", "0xxx000x", 4, true);
    }

    public Car(String brand, String model, Float engineVolume) {
        this(brand, model, engineVolume, "белый", 2000, "Россия",
                "автомат", "седан", "0xxx000x", 4, true);
    }

    public Car(String brand, String model, Float engineVolume, String color) {
        this(brand, model, engineVolume, color, 2000, "Россия",
                "автомат", "седан", "0xxx000x", 4, true);
    }

    public Car(String brand, String model, Float engineVolume, String color, Integer productionYear) {
        this(brand, model, engineVolume, color, productionYear, "Россия",
                "автомат", "седан", "0xxx000x", 4, true);
    }

    public Car(String brand, String model, Float engineVolume, String color, Integer productionYear, String productionCountry) {
        this(brand, model, engineVolume, color, productionYear, productionCountry, "автомат", "седан", "0xxx000x", 4, true);
    }

    public Car(String brand, String model, Float engineVolume, String color, Integer productionYear, String productionCountry, String transmission) {
        this(brand, model, engineVolume, color, productionYear, productionCountry, transmission, "седан", "0xxx000x", 4, true);
    }

    public Car(String brand, String model, Float engineVolume, String color, Integer productionYear, String productionCountry, String transmission, String bodyType) {
        this(brand, model, engineVolume, color, productionYear, productionCountry, transmission, bodyType, "0xxx000x", 4, true);
    }

    public Car(String brand, String model, Float engineVolume, String color, Integer productionYear, String productionCountry, String transmission, String bodyType, String registrationNumber) {
        this(brand, model, engineVolume, color, productionYear, productionCountry, transmission, bodyType, registrationNumber, 4, true);
    }

    public Car(String brand, String model, Float engineVolume, String color, Integer productionYear, String productionCountry, String transmission, String bodyType, String registrationNumber, Integer numberOfSeats) {
        this(brand, model, engineVolume, color, productionYear, productionCountry, transmission, bodyType, registrationNumber, numberOfSeats, true);
    }

    public Car(final String brand, String model, Float engineVolume, String color, Integer productionYear, String productionCountry, String transmission, String bodyType, String registrationNumber, Integer numberOfSeats, Boolean summerTires) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume == null) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (productionYear == null) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry == null) {
            this.productionCountry = "Россия";
        } else {
            this.productionCountry = productionCountry;
        }
        if (transmission == null) {
            this.transmission = "автомат";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null) {
            this.bodyType = "седан";
        } else {
            this.bodyType = bodyType;
        }
        if (registrationNumber == null) {
            this.registrationNumber = "0xxx000x";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (numberOfSeats == null) {
            this.numberOfSeats = 4;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        if (summerTires == null) {
            this.summerTires = true;
        } else {
            this.summerTires = summerTires;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Float getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public Boolean getSummerTires() {
        return summerTires;
    }

    public void setEngineVolume(Float engineVolume) {
        if (engineVolume == null) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void setColor(String color) {
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public void setTransmission(String transmission) {
        if (transmission == null) {
            this.transmission = "автомат";
        } else {
            this.transmission = transmission;
        }
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null) {
            this.registrationNumber = "0xxx000x";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public void SummerTires(Boolean summerTires) {
        if (summerTires == null) {
            this.summerTires = true;
        } else {
            this.summerTires = summerTires;
        }
    }

    public void setSeasonTires(boolean summerTires) {
        int currentMonth = LocalDate.now().getMonthValue();
        if (this.summerTires = currentMonth >= 4 && currentMonth < 11) {
            this.summerTires = summerTires;
        }
    }

    public void informationOfTheCar() {
        System.out.println(getBrand() + " " + getModel() + ", " + getProductionYear() + " год выпуска" + ", сборка - " + getProductionCountry() + ", цвет кузова - " + getColor() + ", объем двигателя - " + getEngineVolume() + " л." +
                ", коробка передач - " + getTransmission() + ", тип кузова - " + getBodyType() + ", регистрационный номер - " + getRegistrationNumber() + ", количество мест - " + getNumberOfSeats() + ", летняя резина - " + getSummerTires());
    }
}
