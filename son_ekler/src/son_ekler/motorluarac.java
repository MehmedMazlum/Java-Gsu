package son_ekler;


public class motorluarac {




	public void yazdir()

{

	System.out.println("Bu bir motorlu aractir");



}

}


public class otomobil extends motorluarac 

{

	public void yazdir()

{

	System.out.println("Bu bir otomobildir");



}





}


public class motosiklet extends motorluarac

{

	public void yazdir()

{

	System.out.println("Bu bir motosiklettir");

}

}


public class deneme129

{

	public static void benneyim(motorluarac d )

{

d.yazdir();

}

	public static void main(String args[])

{

	motorluarac a = new motorluarac() ;

	otomobil b = new otomobil() ;

	motosiklet c = new motosiklet() ;

	int k = (int)(3*Math.random());

	if(k == 0 )

benneyim(a);

	if(k == 1)

benneyim(b);

	if(k == 2)

benneyim(c);

}

}

public class motorluarac {











	public void yazdir()




{



	System.out.println("Bu bir motorlu aractir");








}



}






public class otomobil extends motorluarac 




{



	public void yazdir()




{



	System.out.println("Bu bir otomobildir");








}











}






public class motosiklet extends motorluarac




{



	public void yazdir()




{



	System.out.println("Bu bir motosiklettir");




}



}






public class deneme129




{



	public static void benneyim(motorluarac d )




{



d.yazdir();



}



	public static void main(String args[])




{



	motorluarac a = new motorluarac() ;



	otomobil b = new otomobil() ;



	motosiklet c = new motosiklet() ;



int k = (int)(3*Math.random());



if(k == 0 )




benneyim(a);



	if(k == 1)




benneyim(b);



	if(k == 2)




benneyim(c);



}



}
