package asseco3;

import java.util.HashMap;
import java.util.Map;

public class VisitCounter {

    public Map<Long,Long> count(Map<String,UserStats> stats){
        Long counter = stats.get("Jakis klucz").visitCount.get();
        Map<Long,Long> result = new HashMap<>();
        if (stats.get("serive").visitCount.isPresent()){
        }

        for (Map.Entry<String,UserStats> entry : stats.entrySet()){
            Long userID = Long.parseLong(entry.getKey());
            Long visit = entry.getValue().visitCount.get();
            result.put(userID,visit);
        }

return result;
    }
}
