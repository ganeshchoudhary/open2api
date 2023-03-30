package com.gschoudhary.open2api.utils.validator;

import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import org.springframework.stereotype.Component;

@Component
public class JsonValidator {
    public boolean isValidJson(String json) {
        try {
            JsonParser.parseString(json);
        } catch (JsonSyntaxException e) {
            return false;
        }
        return true;
    }

//    public boolean isValid(String json) {
//        try {
//            new JSONObject(json);
//        } catch (JSONException e) {
//            try {
//                new JSONArray(json);
//            } catch (JSONException ne) {
//                return false;
//            }
//        }
//        return true;
//    }
}
