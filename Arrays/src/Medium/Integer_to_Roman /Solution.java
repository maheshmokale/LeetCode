package Medium.Integer_to_Roman;

import java.util.Map;
import java.util.TreeMap;

class Solution {
    public String intToRoman(int num) {
        Map<Integer,String> numRoman=new TreeMap<>();
        numRoman.put(1,"I");
        numRoman.put(5,"V");
        numRoman.put(10,"X");
        numRoman.put(50,"L");
        numRoman.put(100,"C");
        numRoman.put(500,"D");
        numRoman.put(1000,"M");

        String temp="";
        int multiple=1;
        int rem=0;
        int prev=0;
        while(num!=0){
            rem=num%10*multiple;
            num=num/10;
            for (int numRom:numRoman.keySet()){
                if(rem==0){
                    break;
                }
                if(rem<=5*multiple){
                    //Works for less than 4
                    if(rem<4*multiple){
                        for (int i = multiple; i <= rem; i=i+multiple) {
                            temp=numRoman.get(multiple)+temp;
                        }
                        break;
                    }
                    else if(numRom-rem==multiple){
                        temp=numRoman.get(multiple)+numRoman.get(numRom)+temp;
                        break;
                    }
                    else if(numRom-rem==0){
                        temp=numRoman.get(numRom)+temp;
                        break;
                    }
                }
                else if(rem>5*multiple){
                    String temp2="";
                    if(numRom>8*multiple && numRom-rem!=multiple){
                        temp2=temp2+numRoman.get(prev);
                        for (int i = multiple; i <= rem-prev; i+=multiple) {
                            temp=numRoman.get(multiple)+temp;
                        }
                        temp=temp2+temp;
                        break;
                    }
                    else if(numRom-rem==multiple){
                        temp=numRoman.get(multiple)+numRoman.get(numRom)+temp;
                        break;
                    }
                    else if(numRom-rem==0){
                        temp=temp+numRoman.get(numRom);
                        break;
                    }
                }
                prev=numRom;
            }

            multiple*=10;

        }
        return temp;
    }
    public static void main(String[] args){
        Solution solution=new Solution();
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i+"="+solution.intToRoman(i));
        }
        System.out.println(solution.intToRoman(66));


    }
}