public class Swap
{

public static void main(String [] args)
{
int a = 20; 
int b = 10;

a = a+b;

b= a-b;

if (b>a)

{b= b-a
;}

else
{b= a-b;

}

endif

if (b>a)

{a= b-a;
    
}

else
{a= a-b;

}

endif

a= a-b;

System.out.println(a);

System.out.println(b);
}
}
