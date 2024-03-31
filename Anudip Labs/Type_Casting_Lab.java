
public class Type_Casting_Lab {
	
	public static void main(String[]args) {
			
		//Convert all the integer type data(byte,short,int,long) to floating point(float,double) type data and vice versa.

       byte a=127;
       float fa=(float)(a);
       double da=(double)(a);
       System.out.println(fa);
       System.out.println(da);
       
       short b=485;
       float fb=(float)(b);
       double db=(double)(b);
       System.out.println(fb);
       System.out.println(db);
       
       int c=74785455;
       float fc=(float)(c);
       double dc=(double)(c);
       System.out.println(fc);
       System.out.println(dc);
       
       long d=86544664648984555l;
       float fd=(float)(d);
       double dd=(double)(d);
       System.out.println(fd);
       System.out.println(dd);
       
       float f=485.548f;
       byte bf=(byte)(f);
       short sf=(short)(f);
       int inf=(int)(f);
       long lf=(long)(f);
       System.out.println(bf);
       System.out.println(sf);
       System.out.println(inf);
       System.out.println(lf);
       
       double e=4984656.51984984984;
       byte be=(byte)(e);
       short se=(short)(e);
       int ine=(int)(e);
       long le=(long)(e);
       System.out.println(be);
       System.out.println(se);
       System.out.println(ine);
       System.out.println(le);
       
       
       //Convert the character type data into int , float and tell the difference in both.
       
       char ch='A';
       int i=(int)(ch);
       float fl=(float)(ch);
       System.out.println(i);
       System.out.println(fl);
       
       //Print alphabets Uppercase and lowercase using loops and casting
       
       char uc='A';
       char lc='a';
       int iuc=65;
       int ilc=97;
       
       char uci=(char)(iuc);
       char lci=(char)(ilc);
       
       for(uci=uc;uci<=90;uci++) {
    	   System.out.print(uci+" ");
       }
       
       System.out.println();
       for(lci=lc;lci<=122;lci++) {
    	   System.out.print(lci+" ");
       }
       
       System.out.println();
       
       for(uc='A';uc<='Z';uc++) {
    	   System.out.print(uc+" ");
       }
       
       System.out.println();
       
       for(lc='a';lc<='z';lc++) {
    	   System.out.print(lc+" ");
       }
	}
	
}
