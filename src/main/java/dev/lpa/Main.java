package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Mappable> mappables = new ArrayList<>();
        mappables.add(new Building("Sydney Town Hall", UsageType.GOVERNMENT));
        mappables.add(new Building("Sydney opera House", UsageType.ENTERTAINMENT));
        mappables.add(new Building("Stadium Australia", UsageType.SPORTS));

        mappables.add(new UtilityLine("College St", UtilityType.FIBER_OPTIC));
        mappables.add(new UtilityLine("Olympic Blvd", UtilityType.WATER));

        for (var m : mappables) {
            Mappable.mapIt(m);
        }
    }

//      "properties": {"type": "POINT",
//            "label": "Sydney Town Hall (GOVERNMENT)",
//            "marker": "RED STAR", "name": "Sydney Town Hall", "usage":"GOVERNMENT"}
//      "properties": {"type": "POINT",
//            "label": "Sydney opera House (ENTERTAINMENT)",
//            "marker": "GREEN TRIANGLE", "name": "Sydney opera House", "usage":"ENTERTAINMENT"}
//      "properties": {"type": "POINT",
//            "label": "Stadium Australia (SPORTS)",
//            "marker": "ORANGE PUSH_PIN", "name": "Stadium Australia", "usage":"SPORTS"}
//      "properties": {"type": "LINE",
//            "label": "College St (FIBER_OPTIC)",
//            "marker": "GREEN DOTTED", "name"; "College St", "utility": "FIBER_OPTIC"}
//      "properties": {"type": "LINE",
//            "label": "Olympic Blvd (WATER)",
//            "marker": "BLUE SOLID", "name"; "Olympic Blvd", "utility": "WATER"}
}
