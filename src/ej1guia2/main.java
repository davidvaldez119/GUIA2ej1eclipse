package ej1guia2;



public class main {
	public static void main(String[] args) 
	{	
	author a1=new author("joshua" ,"jhon","lolo@gmail.com",'m');
	author a2=new author("joshua" ,"jhotn","loli@gmail.com",'m');
	author[]authors=new author[1];
	authors[0]=a1;
	authors[1]=a2;
    book b1=new book("locolinux",300.56,12,authors);
	System.out.println(b1);
	}
}
