public class P5169 {
    public int daysBetweenDates(String date1, String date2) {
        int[]arr={31,28,31,30,31,30,31,31,30,31,30,31};
        String[]date11=date1.split("-");
        String[]date22=date2.split("-");

        int day1=Integer.parseInt(date11[2]);
        int month1=Integer.parseInt(date11[1]);
        int year1=Integer.parseInt(date11[0]);

        int day2=Integer.parseInt(date22[2]);
        int month2=Integer.parseInt(date22[1]);
        int year2=Integer.parseInt(date22[0]);


        if(year1<year2){
            int ans=0;
            for(int i=year1;i<year2;i++){
                if(isLeapYear(i)){
                    ans=ans+366;
                }else {
                    ans=ans+365;
                }
            }
            for(int i=0;i<month1-1;i++){
                if(i==1&& isLeapYear(year1)){
                    ans=ans-arr[i]-1;
                    continue;
                }
                ans=ans-arr[i];
            }
            ans=ans-day1;
            for(int i=0;i<month2-1;i++){
                if(i==1 && isLeapYear(year2)){
                    ans=ans+arr[i]+1;
                    continue;
                }
                ans=ans+arr[i];
            }
            ans=ans+day2;
            return ans;
        }
        if(year1>year2){
            int ans=0;
            for(int i=year2;i<year1;i++){
                if(isLeapYear(i)){
                    ans=ans+366;
                }else {
                    ans=ans+365;
                }
            }
            for(int i=0;i<month2-1;i++){
                if(i==1&& isLeapYear(year2)){
                    ans=ans-arr[i]-1;
                    continue;
                }
                ans=ans-arr[i];
            }
            ans=ans-day2;
            for(int i=0;i<month1-1;i++){
                if(i==1 && isLeapYear(year1)){
                    ans=ans+arr[i]+1;
                    continue;
                }
                ans=ans+arr[i];
            }
            ans=ans+day1;
            return ans;
        }
        if(year1==year2){
            if(month1>month2){
                int ans=0;
                for(int i=0;i<month1-1;i++){
                    if(i==1&& isLeapYear(year1)){
                        ans=ans-arr[i]-1;
                        continue;
                    }
                    ans=ans-arr[i];
                }
                ans=ans-day1;
                for(int i=0;i<month2-1;i++){
                    if(i==1 && isLeapYear(year2)){
                        ans=ans+arr[i]+1;
                        continue;
                    }
                    ans=ans+arr[i];
                }
                ans=ans+day2;
                return ans;
            }
            if(month1<month2){
                int ans=0;
                for(int i=0;i<month2-1;i++){
                    if(i==1&& isLeapYear(year2)){
                        ans=ans-arr[i]-1;
                        continue;
                    }
                    ans=ans-arr[i];
                }
                ans=ans-day2;
                for(int i=0;i<month1-1;i++){
                    if(i==1 && isLeapYear(year1)){
                        ans=ans+arr[i]+1;
                        continue;
                    }
                    ans=ans+arr[i];
                }
                ans=ans+day1;
                return ans;
            }
            if(month1==month2){
                return day2-day1>=0?day2-day1:day1-day2;
            }
        }
        return 0;
    }

    private boolean isLeapYear(int year) {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }

    public static void main(String[] args) {
        P5169 test=new P5169();
        System.out.println(test.daysBetweenDates("2019-12-31","2020-01-15"));
    }
}
