package level2;

class TryHelloWorld2 {
    public String getDayName(int a, int b) {
    	String answer = "";
        String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        int totalDays = (a - 1) * 30 + b;
        
        if(a >= 2)
        	totalDays += 1;
        if(a >= 3)
        	totalDays -= 1;
        if(a >= 4)
        	totalDays += 1;
        if(a >= 6)
        	totalDays += 1;
        if(a >= 8)
        	totalDays += 1;
        if(a >= 9)
        	totalDays += 1;
        if(a >= 11)
        	totalDays += 1;
        
        System.out.println(totalDays);
        answer = days[(totalDays - 1) % 7];
        
        return answer;
    }
    
    /* 덱스또 님 풀이
    public String getDayName(int month, int day)
    {
        Calendar cal = new Calendar.Builder().setCalendarType("iso8601")
                        .setDate(2016, month - 1, day).build();
        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, new Locale("ko-KR")).toUpperCase();
    }
    */
    
    public static void main(String[] args) {
        TryHelloWorld2 test = new TryHelloWorld2();
        int a=12, b=31;
        System.out.println(test.getDayName(a,b));
    }
}
