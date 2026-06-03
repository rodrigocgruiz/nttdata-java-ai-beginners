package oopanddatastructures.inheritancepolymorphism.exercicios.exerciciotres;

public non-sealed class AmericanClock extends Clock {
    Clock clock = new AmericanClock();
    private String periodIndicator;

    public String getPeriodIndicator() {
        return periodIndicator;
    }

    public void setAfterMidday() {
        periodIndicator = "PM";
    }

    public void setBeforeMidday() {
        periodIndicator = "AM";
    }

    public void setHours(int hours) {
        setBeforeMidday();
        if (hours > 12 && hours < 24) {
            setAfterMidday();
            clock.setHours(hours - 12);
        } else if(hours >= 24){
            clock.setHours(0);
        }else{
            clock.setHours(hours);
        }
    }

    @Override
    Clock convert(final Clock clock) {
        return null;
    }
}
