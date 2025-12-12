public class _5_BreakVsContinue {
    public static void main(String[] args) {
        for(int i=1;i<11;i++){
            // System.out.println(i);
            if(i==1 || i==3 || i==5){
                continue;
            }
            if(i==7){
                break;
            }
            System.out.println(i);
        }
    }
}
