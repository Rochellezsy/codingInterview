import java.util.Arrays;

public class P33 {
    public boolean VerifySquenceOfBST(int[] sequence) {

        if(sequence.length<=0){
            return false;
        }
        return judge(sequence,0,sequence.length-1);

    }

    public boolean judge(int[] sequence,int start,int end){
        if(start>end){
            return true;
        }
        int i=start;
        int fen;
        int root=sequence[end];

        while(sequence[i]<root){
            i++;
        }
        fen=i;

        while(fen<end){
            if(sequence[fen]<root){
                return false;
            }
            fen++;
        }

        return judge(sequence,start,i-1)&&judge(sequence,i,end-1);


    }

    public static void main(String[] args){

        int[] e={1,2,3,4,5};
        P33 pp=new P33();
        System.out.println(pp.VerifySquenceOfBST(e));



    }




}




