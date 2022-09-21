//finding prime factorization

        while(n!=1) 
        {
           if(n%i==0)
           {
             System.out.print(i+" ");
               n=n/i;
           }
           else 
           i++;
        }
