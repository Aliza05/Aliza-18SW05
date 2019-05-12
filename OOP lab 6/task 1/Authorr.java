class Authorr
{
 public static void main(String args[])
 { 
  Author a1= new Author("ALiza", "aliza.zia@gamil.com", 'f');
  String email=a1.getName();
  a1.setEmail("aLiza.zia@gamil.com");
  char gen=a1.getGender();
  String a=a1.toString();
  System.out.println(a);
 }
}
