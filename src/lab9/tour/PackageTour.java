package lab9.tour;

import java.util.Arrays;
import java.util.List;

public class PackageTour implements Tour {
    private String name;
    private List<Tour> tours;

    public PackageTour(String name, Tour... tours) {
        this.name = name;
        this.tours = Arrays.asList(tours);
    }

    public void addTour(Tour... tours) {
        this.tours.addAll(Arrays.asList(tours));
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (Tour t : tours) {
            total += t.getPrice();
        }
        return total * 0.9;
    }

    @Override
    public int getAvailableSeats() {
        return tours.isEmpty() ? 0 : tours.stream().mapToInt(Tour::getAvailableSeats).min().getAsInt();
    }
}
