import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class P5345 {
    public String rankTeams(String[] votes) {
        class People{
            char name;
            int[] votes;

            public People(char name) {
                this.name = name;
            }
        }
        List<People> peopleList = new ArrayList<>(votes[0].length());
        for (int i = 0; i < votes[0].length(); i++) {
            People people = new People(votes[0].charAt(i));
            peopleList.add(people);
        }
        for (int i = 0; i < votes.length; i++) {
            for (int j = 0; j < votes[0].length(); j++) {
                for (People people:peopleList) {
                    if(people.name == votes[i].charAt(j)){
                        if(people.votes == null){
                            people.votes = new int[votes[0].length()];
                            people.votes[j] = 1;
                        } else{
                            ++people.votes[j];
                        }
                    }
                }
            }
        }
        Comparator<People> comparator = new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                for (int i = 0; i < o1.votes.length; i++) {
                    if(o1.votes[i]>o2.votes[i])
                        return -1;
                    else if(o1.votes[i]<o2.votes[i])
                        return 1;
                }
                return o1.name - o2.name;
            }
        };
        peopleList = peopleList.stream().sorted(comparator).collect(Collectors.toList());
        StringBuilder sb = new StringBuilder();
        for (People people:peopleList) {
            sb.append(people.name);
        }
        return sb.toString();


    }

    public static void main(String[] args) {
        String[]s={"FVSHJIEMNGYPTQOURLWCZKAX","AITFQORCEHPVJMXGKSLNZWUY","OTERVXFZUMHNIYSCQAWGPKJL","VMSERIJYLZNWCPQTOKFUHAXG","VNHOZWKQCEFYPSGLAMXJIUTR","ANPHQIJMXCWOSKTYGULFVERZ","RFYUXJEWCKQOMGATHZVILNSP","SCPYUMQJTVEXKRNLIOWGHAFZ","VIKTSJCEYQGLOMPZWAHFXURN","SVJICLXKHQZTFWNPYRGMEUAO","JRCTHYKIGSXPOZLUQAVNEWFM","NGMSWJITREHFZVQCUKXYAPOL","WUXJOQKGNSYLHEZAFIPMRCVT","PKYQIOLXFCRGHZNAMJVUTWES","FERSGNMJVZXWAYLIKCPUQHTO","HPLRIUQMTSGYJVAXWNOCZEKF","JUVWPTEGCOFYSKXNRMHQALIZ","MWPIAZCNSLEYRTHFKQXUOVGJ","EZXLUNFVCMORSIWKTYHJAQPG","HRQNLTKJFIEGMCSXAZPYOVUW","LOHXVYGWRIJMCPSQENUAKTZF","XKUTWPRGHOAQFLVYMJSNEIZC","WTCRQMVKPHOSLGAXZUEFYNJI"};
        P5345 test=new P5345();
        String ans=test.rankTeams(s);
        System.out.println(ans);
    }
}
