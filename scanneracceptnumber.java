inputjava.util.scanner
public class scanneracceptnumber {
    public static void main(String args{})
    {
        Scanner sc = new Scanner(System.in)
        {
            if(x<=10)
            {System.out.println("Single")}
            else if(x<100)
            {System.out.println("Double")}
            else if(x>100)
            {System.out.println("multiple")}
            else 
            {System.out.println("error")}
            sc.close();
        
        
    }
}
}