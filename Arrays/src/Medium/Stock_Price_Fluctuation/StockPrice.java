package Medium.Stock_Price_Fluctuation;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class StockPrice {

        Map<Integer,Integer> timeStampPriceMap=null;
        TreeMap<Integer, Integer> priceFrequencyMap=null;
        int currentTimeStamp=0;


        public StockPrice() {
              timeStampPriceMap=new HashMap<>();
              priceFrequencyMap=new TreeMap<>();

        }
        
        public void update(int timestamp, int price) {
                currentTimeStamp=Math.max(currentTimeStamp,timestamp);

                if(timeStampPriceMap.containsKey(timestamp)){
                        int oldPrice=timeStampPriceMap.get(timestamp);
                        if(priceFrequencyMap.containsKey(oldPrice)){
                                if(priceFrequencyMap.get(oldPrice)==1)
                                        priceFrequencyMap.remove(oldPrice);
                                else
                                        priceFrequencyMap.put(oldPrice,priceFrequencyMap.get(oldPrice)-1);
                        }
                }
                timeStampPriceMap.put(timestamp,price);
                priceFrequencyMap.put(price,priceFrequencyMap.getOrDefault(price,0)+1);

         }
        
        public int current() {
           return timeStampPriceMap.get(currentTimeStamp);
        }
        
        public int maximum() {
                    return priceFrequencyMap.lastKey();
        }
        
        public int minimum() {
                return priceFrequencyMap.firstKey();
        }

        public static void main(String[] args){
                StockPrice stockPrice = new StockPrice();
                stockPrice.update(38,2308);
                System.out.println(stockPrice.maximum());
                System.out.println(stockPrice.current());
                System.out.println(stockPrice.minimum());
                System.out.println(stockPrice.maximum());
                System.out.println(stockPrice.maximum());
                System.out.println(stockPrice.maximum());
                System.out.println(stockPrice.minimum());
                System.out.println(stockPrice.minimum());
                System.out.println(stockPrice.maximum());
                stockPrice.update(47,7876);
                System.out.println(stockPrice.maximum());
                System.out.println(stockPrice.minimum());
                stockPrice.update(58,1866);
                System.out.println(stockPrice.maximum());
                System.out.println(stockPrice.minimum());
                System.out.println(stockPrice.current());
                System.out.println(stockPrice.maximum());
                stockPrice.update(43,121);
                System.out.println(stockPrice.minimum());
                System.out.println(stockPrice.maximum());
                stockPrice.update(40,5339);
                System.out.println(stockPrice.maximum());
                System.out.println(stockPrice.maximum());
                System.out.println(stockPrice.current());
                stockPrice.update(32,5339);
                System.out.println(stockPrice.current());
                System.out.println(stockPrice.minimum());
                stockPrice.update(43,6414);
                stockPrice.update(49,9369);
                System.out.println(stockPrice.minimum());
                System.out.println(stockPrice.minimum());
                stockPrice.update(36,3192);
                System.out.println(stockPrice.current());
                stockPrice.update(48,1006);
                System.out.println(stockPrice.maximum());
                stockPrice.update(53,8013);
                System.out.println(stockPrice.minimum());

        }
    }

