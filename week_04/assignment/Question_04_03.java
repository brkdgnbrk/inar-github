package week_04.assignment;

public class Question_04_03 {
    public static void main(String[] args) {

        double atlantaGeorgiay = -84.3879824;
        double atlantaGeorgiax = 33.7489954;
        double orlandoFloriday = -81.3792364999;
        double orlandoFloridax = 28.5383355;
        double savannahGeorgiay = -81.09983419999998;
        double savannahGeorgiax = 32.0835407;
        double charlotteNorthCarolinay = -80.84312669999997;
        double charlotteNorthCarolinax = 35.2270869;

        final double AVERAGE_EARTH_RADIUS = 6371.01;

        double distance1 = AVERAGE_EARTH_RADIUS * (Math.acos(Math.sin(atlantaGeorgiax) * Math.sin(orlandoFloridax) + Math.cos(atlantaGeorgiax) * Math.cos(orlandoFloridax) * Math.cos(atlantaGeorgiay - orlandoFloriday)));
        double distance2 = AVERAGE_EARTH_RADIUS * (Math.acos(Math.sin(atlantaGeorgiax) * Math.sin(charlotteNorthCarolinax) + Math.cos(atlantaGeorgiax) * Math.cos(charlotteNorthCarolinax) * Math.cos(atlantaGeorgiay - charlotteNorthCarolinay)));
        double distance3 = AVERAGE_EARTH_RADIUS * (Math.acos(Math.sin(charlotteNorthCarolinax) * Math.sin(savannahGeorgiax) + Math.cos(charlotteNorthCarolinax) * Math.cos(savannahGeorgiax) * Math.cos(charlotteNorthCarolinay - savannahGeorgiay)));
        double distance4 = AVERAGE_EARTH_RADIUS * (Math.acos(Math.sin(savannahGeorgiax) * Math.sin(orlandoFloridax) + Math.cos(savannahGeorgiax) * Math.cos(orlandoFloridax) * Math.cos(savannahGeorgiay - orlandoFloriday)));

        double s1 = (distance1 + distance2 + distance4) / 2;
        double area1 = Math.sqrt(s1 * (s1 - distance1) * (s1 - distance2) * (s1 - distance4));

        double s2 = (distance2 + distance3 + distance4) / 2;
        double area2 = Math.sqrt(s2 * (s2 - distance2) * (s2 - distance3) * (s2 - distance4));

        double totalArea = area1 + area2;

        System.out.println("Estimated area enclosed by the four cities: " + totalArea);
    }
}
