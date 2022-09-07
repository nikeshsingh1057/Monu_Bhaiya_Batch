public class hcf {
    public static void main(String[] args) {
        
        int divedent=60;
        int diviser=12,rem;
        while(divedent%diviser!=0)
        {
            rem=divedent%diviser;
            divedent=diviser;
            diviser=rem;
        }
        System.out.println(diviser);
    }
}
