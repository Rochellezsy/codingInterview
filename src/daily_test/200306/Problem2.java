import java.util.ArrayList;
import java.util.List;

public class Problem2 {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean>list=new ArrayList<>();
        for(int i=0;i<queries.length;i++){
            list.add(judge(queries[i],pattern));
        }
        return list;

    }

    public Boolean judge(String qu,String pattern){

        if(qu.length()<pattern.length()){
            return false;
        }
        int i=0;
        int j=0;
        while(i<qu.length()){
            if(qu.charAt(i)==pattern.charAt(j)){
                i++;
                j++;
                if(j==pattern.length()){
                    while(i<qu.length()){
                        if(qu.charAt(i)>='A' && qu.charAt(i)<='Z'){
                            return false;
                        }
                        i++;
                    }
                    return true;
                }
            }
            else if(qu.charAt(i)>='A' && qu.charAt(i)<='Z'){
                return false;
            }
            else{
                i++;
            }
        }
        return false;


    }
}
