package oopanddatastructures.inheritancepolymorphism.exercicios.exerciciotres;

public sealed abstract class Clock permits BrazilianClock, AmericanClock {
    private int hours;
    private int minutes;
    private int seconds;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours > 24){
            this.hours = 24;
            return;
        }
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes > 60){
            this.minutes = 60;
            return;
        }
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds > 60){
            this.seconds = 60;
            return;
        }
        this.seconds = seconds;
    }

    abstract Clock convert(Clock clock);
}
