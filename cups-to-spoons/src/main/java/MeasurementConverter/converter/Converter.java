package MeasurementConverter.converter;

import MeasurementConverter.model.ConversionMap;
import MeasurementConverter.model.ConversionMapKeys;
import MeasurementConverter.model.Conversions;

import java.util.List;

public class Converter {

    private final ConversionMapKeys conversionMapKeys = new ConversionMapKeys();
    private final ConversionMap conversionMap = new ConversionMap();


    public String conversion(int startingUnit, int endingUnit, int quantity){
        String key = conversionMapKey(startingUnit, endingUnit);
        List<Conversions> conversionList = conversionMap.getMap().get(key);
        String result ="";

        for(int i = 0; i < conversionList.size(); i++){

        }
        return result;
    }


    public String conversionMapKey(int startingUnit, int endingUnit){
        String key = conversionMapKeys.getKeys()[startingUnit - 1] + "to" + conversionMapKeys.getKeys()[endingUnit - 1];
        return key;
    }




}
