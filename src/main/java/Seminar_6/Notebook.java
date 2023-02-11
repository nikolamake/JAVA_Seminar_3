package Seminar_6;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Notebook {
    double price; // цена тыс руб
    String firm; //фирма сборщик
    double screenDiagonal; // размер диагонали дюймы
    String displayResolution; // разрешение экрана
    String matrixType; // тип матрицы
    String processorManufacturer; // производитель процессора
    double clockFrequency; //Тактовая частота процессора ГГц
    int numberOfCores; //Количество ядер
    String videoManufacturer; //производитель видеокарты
    int videoCardCapacity; //объем видеокарты Гб
    int amountRAM; // объем оперативной памяти Гб
    String mapGeneration; // поколение карты DDR2 - DDR5
    int numberSlots; // кол-во слотов
    String hardDrive; // жесткий диск HDD SSD SSHD
    int diskSize; // объем диска Гб
    String connectorsVideo; // видеоразъемы HDMI DisplayPort DVI VGA

    public Notebook(double price, String firm, double screenDiagonal, String displayResolution, String matrixType, String processorManufacturer, double clockFrequency, int numberOfCores, String videoManufacturer, int videoCardCapacity, int amountRAM, String mapGeneration, int numberSlots, String hardDrive, int diskSize, String connectorsVideo) {
        this.price = price;
        this.firm = firm;
        this.screenDiagonal = screenDiagonal;
        this.displayResolution = displayResolution;
        this.matrixType = matrixType;
        this.processorManufacturer = processorManufacturer;
        this.clockFrequency = clockFrequency;
        this.numberOfCores = numberOfCores;
        this.videoManufacturer = videoManufacturer;
        this.videoCardCapacity = videoCardCapacity;
        this.amountRAM = amountRAM;
        this.mapGeneration = mapGeneration;
        this.numberSlots = numberSlots;
        this.hardDrive = hardDrive;
        this.diskSize = diskSize;
        this.connectorsVideo = connectorsVideo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public String getDisplayResolution() {
        return displayResolution;
    }

    public void setDisplayResolution(String displayResolution) {
        this.displayResolution = displayResolution;
    }

    public String getMatrixType() {
        return matrixType;
    }

    public void setMatrixType(String matrixType) {
        this.matrixType = matrixType;
    }

    public String getProcessorManufacturer() {
        return processorManufacturer;
    }

    public void setProcessorManufacturer(String processorManufacturer) {
        this.processorManufacturer = processorManufacturer;
    }

    public double getClockFrequency() {
        return clockFrequency;
    }

    public void setClockFrequency(double clockFrequency) {
        this.clockFrequency = clockFrequency;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public String getVideoManufacturer() {
        return videoManufacturer;
    }

    public void setVideoManufacturer(String videoManufacturer) {
        this.videoManufacturer = videoManufacturer;
    }

    public int getVideoCardCapacity() {
        return videoCardCapacity;
    }

    public void setVideoCardCapacity(int videoCardCapacity) {
        this.videoCardCapacity = videoCardCapacity;
    }

    public int getAmountRAM() {
        return amountRAM;
    }

    public void setAmountRAM(int amountRAM) {
        this.amountRAM = amountRAM;
    }

    public String getMapGeneration() {
        return mapGeneration;
    }

    public void setMapGeneration(String mapGeneration) {
        this.mapGeneration = mapGeneration;
    }

    public int getNumberSlots() {
        return numberSlots;
    }

    public void setNumberSlots(int numberSlots) {
        this.numberSlots = numberSlots;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }

    public int getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(int diskSize) {
        this.diskSize = diskSize;
    }

    public String getConnectorsVideo() {
        return connectorsVideo;
    }

    public void setConnectorsVideo() {
        this.connectorsVideo = connectorsVideo;
    }


    public String printInfo() {
        System.out.println("Цена: " + price + " тыс.руб");
        System.out.println("Фирма сборщик: " + firm);
        System.out.println("Размер диагоналиж: " + screenDiagonal + " см");
        System.out.println("Разрешение экрана: " + displayResolution);
        System.out.println("Тип матрицы: " + matrixType);
        System.out.println("Фирма-производитель процессора: " + processorManufacturer);
        System.out.println("Тактовая частота прцессора: " + clockFrequency + " ГГц");
        System.out.println("Количество ядер процессора: " + numberOfCores);
        System.out.println("Фирма-производитель видеокарты: " + videoManufacturer);
        System.out.println("Объём памяти видеокарты: " + videoCardCapacity + " Гб");
        System.out.println("Объем оперативной памяти: " + amountRAM + " Гб");
        System.out.println("Поколение карты: " + mapGeneration);
        System.out.println("Количество слотов для карт памяти: " + numberSlots);
        System.out.println("Тип жесткого диска: " + hardDrive);
        System.out.println("Объём жесткого диска: " + diskSize + " Гб");
        System.out.println("Видео разъёмы: " + connectorsVideo);
        System.out.println();
        return null;
    }

}





