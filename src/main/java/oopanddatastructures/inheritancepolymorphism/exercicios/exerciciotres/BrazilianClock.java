package oopanddatastructures.inheritancepolymorphism.exercicios.exerciciotres;

public non-sealed class BrazilianClock extends Clock {
    Clock clock = new BrazilianClock();

    @Override
    public Clock convert(final Clock clock) {
        clock.setSeconds(clock.getSeconds());
        clock.setMinutes(clock.getMinutes());

        switch (clock){
            case AmericanClock americanClock -> clock.setHours((americanClock.getPeriodIndicator().equals("PM")) ?
                    americanClock.getHours() + 12 : americanClock.getHours());

            case BrazilianClock brazilianClock -> clock.setHours(brazilianClock.getHours());

            default -> throw new IllegalStateException("Unexpected value: " + clock);
        }
        return this;
    }
}
