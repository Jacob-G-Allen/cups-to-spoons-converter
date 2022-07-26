package MeasurementConverter.model;

import MeasurementConverter.model.Conversions;
import MeasurementConverter.model.CupsToTablespoons;
import MeasurementConverter.model.TablespoonsToTeaspoons;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConversionMap {

    private Map<String,List<Conversions>> conversionsMap = loadConversionMap();

    public Map<String, List<Conversions>> getMap() {
        return conversionsMap;
    }

    Conversions cupsToTablespoons = new CupsToTablespoons();
    Conversions tablespoonsToTeaspoons = new TablespoonsToTeaspoons();
    Conversions teaspoonsToTeaspoons = new TablespoonsToTeaspoons();

    public Map<String,List<Conversions>> loadConversionMap() {
        Map<String,List<Conversions>> map = new HashMap<>();

        List<Conversions> cupsToSpoons = new ArrayList<>();
        cupsToSpoons.add(cupsToTablespoons);
        cupsToSpoons.add(tablespoonsToTeaspoons);
        map.put("CupsToSpoons", cupsToSpoons);




        return map;
    }



}
