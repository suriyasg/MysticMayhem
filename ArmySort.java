import java.util.*;


public class ArmySort {
    public static ArrayList<Character> SortWarior(String basedon,ArrayList<Character> wariors) {
        Map<Character, Double> hashMap = new HashMap<>();
        List<String> customOrder;
        if(basedon.equals("speed")){
            for(Character warior:wariors){
                hashMap.put(warior,warior.getSpeed());
            }
            customOrder = Arrays.asList("Healer","Mage","MythicalCreature","Knight","Archer");

        }else{
            for(Character warior:wariors){
                hashMap.put(warior,warior.getHealth());
            }
            customOrder = Arrays.asList("Mage","Knight","Archer","MythicalCreature","Healer");
        }
        
        List<Map.Entry<Character, Double>> entryList = new ArrayList<>(hashMap.entrySet());

        Collections.sort(entryList, Map.Entry.comparingByValue());
        entryList = sorti(customOrder,entryList);
        ArrayList<Character> sortedwariors = new ArrayList<>();
        if(basedon.equals("speed")){
            for(int j = entryList.size()-1;j>=0;j--){
                sortedwariors.add(entryList.get(j).getKey());
            }
        }else{
            for(Map.Entry<Character,Double> warr : entryList){
                sortedwariors.add(warr.getKey());
            }
        }
        
        return sortedwariors;
    
    }



    private static List<Map.Entry<Character, Double>> sorti(List<String> customOrder,List<Map.Entry<Character, Double>> entryList){
        Comparator<Map.Entry<Character, Double>> customComparator = Comparator.comparingInt(entry -> customOrder.indexOf(entry.getKey().getClass().getSimpleName()));
        List<Map.Entry<Character, Double>> filteredList = new ArrayList<>();
        int l = entryList.size();
        int si=0;
        int ei=0;
        int count=0;
        for(int i=0;i<l-1;i++){
            Map.Entry<Character, Double> checkobj = entryList.get(i);
            if(checkobj.getValue().equals(entryList.get(i+1).getValue())){
                if(count==0){
                    si = i;
                    count++;
                }else{
                    count++;
                }
            }


        }
        ei=si+count;
        for(int j=si;j<=ei;j++){
            filteredList.add(entryList.get(j));
        }
        filteredList.sort(customComparator);

        if(count>0){
            for(int i = si,j = 0;i<=ei;i++,j++){
                entryList.set(i,filteredList.get(j));
            }
        }
        return entryList;
    }



}
